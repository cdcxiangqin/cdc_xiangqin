package com.cdc.blinddate.controller;

import com.cdc.blinddate.entity.User;
import com.cdc.blinddate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        user.setSex("1");
        userService.insert(user);
        registerResult=user.toString();
        return registerResult;
    }

}
