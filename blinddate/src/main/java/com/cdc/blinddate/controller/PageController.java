package com.cdc.blinddate.controller;

import com.cdc.blinddate.entity.User;
import com.cdc.blinddate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class PageController {
    @Autowired
    private UserService userService;

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
    public String otheruserpage(HttpServletRequest request) {
        String username=request.getParameter("username");
        request.getSession().setAttribute("otherUsername",username);
        return "/otheruser-page";
    }

    @RequestMapping("/fixuserpage")
    public String fixpage() {
        return "/fix-userpage";
    }

    @RequestMapping("/testUploadPage")//测试上传图片用
    public String testUploadPage() {
        return "/testUpload";
    }

    @RequestMapping(value="/uploadHeadImg",method= RequestMethod.POST)//好像文件不能超过1M
    public String uploadHeadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        String uploadHeadImgResult=null;
        User user=(User)request.getSession().getAttribute("user");
        if(null!=user){
            String baseDir= ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/";
            String relativeDir="images/headPicture/";
            String saveResult=this.userService.uploadHeadImg(file,user,baseDir,relativeDir);
            if(null!=saveResult){
                request.getSession().setAttribute("user",user);
            }
        }

        return "/userpage";
    }

}
