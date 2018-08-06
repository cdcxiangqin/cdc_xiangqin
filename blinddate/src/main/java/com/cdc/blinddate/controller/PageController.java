package com.cdc.blinddate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/registerPage")
    public String registerPage(){
        System.out.println("registerPage");
        return "registerPage";
    }

    @RequestMapping("/testPage")
    public String testPage(){
        System.out.println("testPage");
        return "testPage";
    }

    @RequestMapping("/getText")
    @ResponseBody
    public String getText(){return "resultText";}
}
