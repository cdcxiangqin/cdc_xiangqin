package com.cdc.blinddate.controller;

import com.cdc.blinddate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
