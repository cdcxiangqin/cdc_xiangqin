package com.cdc.blinddate.controller;

import com.cdc.blinddate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }


    @Autowired
    private UserService userService;

    @RequestMapping("/getList")
    public String getList() {//测试mybatisplus取数据 2018-08-04 09:39:17
        return userService.selectList(null).toString();
    }
}
