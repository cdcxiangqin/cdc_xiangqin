package com.cdc.blinddate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: blinddate
 * @Description: 测试用例
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 01:57
 **/
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "/sign_in";
    }
}