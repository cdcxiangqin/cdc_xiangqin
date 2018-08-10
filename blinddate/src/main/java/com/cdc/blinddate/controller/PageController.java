package com.cdc.blinddate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class PageController {

    @RequestMapping("/registerPage")
    public String registerPage(){
        System.out.println("registerPage");
        return "/registerPage";
    }

    @RequestMapping("/testPage")//无用
    public String testPage(){
        System.out.println("testPage");
        return "/testPage";
    }

    @RequestMapping("/successPage")//无用
    public String successPage(){
        System.out.println("successPage");
        return "/success";
    }

    @RequestMapping("/userpage")
    public String userPage(){
        System.out.println("userPage");
        return "/user-page";
    }

    @RequestMapping("/signin")
    public String signIn() {
        return "/sign_in";
    }

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }

    @RequestMapping(value="/otheruserpage",produces="application/json;charset=UTF-8")
    public String otheruserpage(@RequestBody Map<String,String> params, HttpServletRequest request) {
        String username=request.getParameter("username");
        request.getSession().setAttribute("otherUsername",username);
        return "/otheruser-page";
    }
}
