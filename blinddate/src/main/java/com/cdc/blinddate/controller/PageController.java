package com.cdc.blinddate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/registerPage")
    public String registerPage(){
        System.out.println("registerPage");
        return "/registerPage";
    }

    @RequestMapping("/testPage")
    public String testPage(){
        System.out.println("testPage");
        return "/testPage";
    }

    @RequestMapping("/successPage")
    public String successPage(){
        System.out.println("successPage");
        return "/success";
    }

    @RequestMapping("/getText")
    @ResponseBody
    public String getText(){return "/resultText";}

    @RequestMapping("/userpage")
    public String userPage(){
        System.out.println("userPage");
        return "/user-page";
    }
}
