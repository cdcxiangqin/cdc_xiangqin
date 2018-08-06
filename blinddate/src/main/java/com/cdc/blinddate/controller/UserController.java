package com.cdc.blinddate.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cdc.blinddate.entity.User;
import com.cdc.blinddate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author 纪佳鸿
 * @since 2018-08-03
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getList")
    public String getList() {
        return userService.selectList(null).toString();
    }

    /**
     * @name: register
     * @description: 注册接口
     * @author: 纪佳鸿
     * @time: 2018/8/6 15:09
     */
    @RequestMapping("/register")//HttpServletRequest request,HttpServletResponse response
    public String register(@RequestBody Map<String,String> params){
        String registerResult=null;
        registerResult="register";
        String username=params.get("username");
        String password=params.get("password");
        String name=params.get("name");
        String sex=params.get("sex");
        String uuid = UUID.randomUUID().toString().replace("-", "");
        User user=new User();
        user.setId(uuid);
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setSex(sex);
        user.setCreateTime(new Date());
        user.setStatus("1");
        userService.insert(user);
        registerResult=user.toString();
        return registerResult;
    }

    /**
     * @name: login
     * @description: 登录接口
     * @author: 纪佳鸿
     * @time: 2018/8/6 15:10
     */
    @RequestMapping("/login")
    public String login(@RequestBody Map<String,String> params,HttpServletRequest request){
        String loginResult=null;
        String username=params.get("username");
        String password=params.get("password");
        Wrapper<User> wapper=new EntityWrapper<User>();
        wapper.eq("username",username);
        wapper.eq("password",password);
        User user=userService.selectOne(wapper);
        if(null!=user){
            request.getSession().setAttribute("user",user);
            user.setLastLoginTime(new Date());
            userService.updateById(user);
            loginResult="{\"result\":\"success\"}";
        }else{
            loginResult="{\"result\":\"fail\"}";
        }
        return loginResult;
    }

    @RequestMapping("/unlogin")
    public String unlogin(@RequestBody Map<String,String> params,HttpServletRequest request){
        String loginResult=null;
        User user=(User)request.getSession().getAttribute("user");
        if(null!=user){
            request.getSession().setAttribute("user",null);
            loginResult="{\"result\":\"success\"}";
        }else{
            loginResult="{\"result\":\"fail\"}";
        }
        return loginResult;
    }

}
