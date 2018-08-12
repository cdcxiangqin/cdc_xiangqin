package com.cdc.blinddate.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cdc.blinddate.entity.User;
import com.cdc.blinddate.interfaces.user.command.RegisterCommand;
import com.cdc.blinddate.interfaces.user.facede.UserServiceFaced;
import com.cdc.blinddate.interfaces.user.facede.dto.RegisterDto;
import com.cdc.blinddate.interfaces.user.facede.dto.TokenDTO;
import com.cdc.blinddate.service.UserService;
import com.cdc.blinddate.util.JsonUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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

    private final UserServiceFaced userServiceFaced;

    @Autowired
    public UserController(UserServiceFaced userServiceFaced) {
        this.userServiceFaced = userServiceFaced;
    }

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
    @RequestMapping(value="/register",produces="application/json;charset=UTF-8")//HttpServletRequest request,HttpServletResponse response
    public String register(@RequestBody Map<String,String> params,HttpServletRequest request){
        String registerResult=null;
        User user=userService.register(params);
        Map resultMap=new HashMap();
        if(null!=user){
            resultMap.put("result","success");
            resultMap.put("user",user);
            request.getSession().setAttribute("user",user);
        }else{
            resultMap.put("result","fail");
        }
        registerResult=JsonUtil.toJSONString(resultMap);
        return registerResult;
    }

//    @ApiOperation(value = "注册", notes = "", response = RegisterDto.class, httpMethod = "POST")
//    @RequestMapping(value = "/register", method = POST, produces = APPLICATION_JSON_VALUE)
//    public RegisterDto signUp(@Valid @RequestBody RegisterCommand registerCommand) {
////        userServiceFaced.signUp(registerCommand);
//        return userServiceFaced.signUp(registerCommand);
//    }

    /**
     * @name: login
     * @description: 登录接口
     * @author: 纪佳鸿
     * @time: 2018/8/6 15:10
     */
    @RequestMapping(value="/login",produces="application/json;charset=UTF-8")
    public String login(@RequestBody Map<String,String> params,HttpServletRequest request){
        String loginResult=null;
        User user=userService.login(params);
        if(null!=user){
            request.getSession().setAttribute("user",user);
//            loginResult="{\"result\":\"success\",user:"+JsonUtil.toJSONString(user)+"}";
            Map resultMap=new HashMap();
            resultMap.put("result","success");
            resultMap.put("user",user);
            loginResult=JsonUtil.toJSONString(resultMap);
        }else{
            loginResult="{\"result\":\"fail\"}";
        }
        return loginResult;
    }
    
    /**
     * @name: unlogin
     * @description: 退出登录接口
     * @author: 纪佳鸿
     * @time: 2018/8/9 14:12
     */
    @RequestMapping(value="/unlogin",produces="application/json;charset=UTF-8")
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

    /**
     * @name: getUserList
     * @description: 获取首页用户列表
     * @author: 纪佳鸿
     * @time: 2018/8/9 14:13
     */
    @RequestMapping(value="/getUserList",produces="application/json;charset=UTF-8")
    public String getUserList(@RequestBody Map<String,String> params,HttpServletRequest request){
        String getUserListResult=null;
        User user=(User)request.getSession().getAttribute("user");
        List<User> list=userService.getUserList(user);
        Map resultMap=new HashMap();
        resultMap.put("result","success");
        resultMap.put("list",list);
        getUserListResult=JsonUtil.toJSONString(resultMap);
        return getUserListResult;
    }

    /**
     * @name: getUser
     * @description: 获取用户资料
     * @author: 纪佳鸿
     * @time: 2018/8/9 14:13
     */
    @RequestMapping(value="/getUser",produces="application/json;charset=UTF-8")
    public String getUser(@RequestBody Map<String,String> params,HttpServletRequest request){
        String getUserResult=null;
        User user=null;
        user=userService.getUser(params);
        Map resultMap=new HashMap();
        resultMap.put("result","success");
        resultMap.put("user",user);
        getUserResult=JsonUtil.toJSONString(resultMap);
        return getUserResult;
    }

    /**
     * @name: getSelf
     * @description: 获取当前登录的账户资料
     * @author: 纪佳鸿
     * @time: 2018/8/9 14:30
     */
    @RequestMapping(value="/getSelf",produces="application/json;charset=UTF-8")
    public String getSelf(@RequestBody Map<String,String> params,HttpServletRequest request){
        String getUserResult=null;
        User user=null;
        user=(User)request.getSession().getAttribute("user");
        Map resultMap=new HashMap();
        if(null!=user){
            resultMap.put("result","success");
            resultMap.put("user",user);
        }else{
            resultMap.put("result","fail");
        }
        getUserResult=JsonUtil.toJSONString(resultMap);
        return getUserResult;
    }

    /**
     * @name: getOtherUser
     * @description: 获取其他用户信息，搭配访问otheruserpage接口中使用
     * @author: 纪佳鸿
     * @time: 2018/8/10 17:44
     */
    @RequestMapping(value="/getOtherUser",produces="application/json;charset=UTF-8")
    public String getOtherUser(@RequestBody Map<String,String> params,HttpServletRequest request){
        String getUserResult=null;
        User user=null;
        String otherUsername=(String)request.getSession().getAttribute("otherUsername");
        Map<String,String> inputMap=new HashMap<String,String>();
        inputMap.put("username",otherUsername);
        user=userService.getUser(inputMap);
        Map resultMap=new HashMap();
        if(null!=user){
            resultMap.put("result","success");
            resultMap.put("user",user);
        }else{
            resultMap.put("result","fail");
        }
        getUserResult=JsonUtil.toJSONString(resultMap);
        return getUserResult;
    }

    /**
     * @name: modifyUser
     * @description: 修改用户信息
     * @author: 纪佳鸿
     * @time: 2018/8/11 17:19
     */
    @RequestMapping(value="/modifyUser",produces="application/json;charset=UTF-8")
    public String modifyUser(@RequestBody Map<String,String> params,HttpServletRequest request){
        String modifyUserResult=null;
        Map resultMap=new HashMap();
        User user=(User)request.getSession().getAttribute("user");
        if(null!=user){
            if(user.getUsername().equals(params.get("username"))){
                params.put("id",user.getId());
                params.put("username",user.getUsername());//防止什么都不传导致sql错误
                user=userService.modifyUser(params);
                if(null!=user){
                    resultMap.put("result","success");
                    request.getSession().setAttribute("user",user);
                }else
                    resultMap.put("result","fail");
            }else{
                resultMap.put("result","fail");
            }
        }else{
            resultMap.put("result","fail");
        }
        modifyUserResult=JsonUtil.toJSONString(resultMap);
        return modifyUserResult;
    }

    /**
     * @name: uploadHeadImg
     * @description: 上传头像 返回新地址
     * @author: 纪佳鸿
     * @time: 2018/8/12 17:07
     */
    @RequestMapping(value="/uploadHeadImg",method=RequestMethod.POST)//好像文件不能超过1M
    public String uploadHeadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        String uploadHeadImgResult=null;
        User user=(User)request.getSession().getAttribute("user");
        if(null!=user){
            String baseDir=ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/";
            String relativeDir="images/headPicture/";
            String saveResult=this.userService.uploadHeadImg(file,user,baseDir,relativeDir);
            uploadHeadImgResult=saveResult;
            if(null!=saveResult){
                request.getSession().setAttribute("user",user);
            }
        }else{
        }
        return uploadHeadImgResult;
    }
}
