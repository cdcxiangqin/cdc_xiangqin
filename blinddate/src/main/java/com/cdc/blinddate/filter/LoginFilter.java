package com.cdc.blinddate.filter;

import com.cdc.blinddate.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @name: LoginFilter
 * @description: 登录验证过滤器
 * @author: 纪佳鸿
 * @time: 2018/8/6 15:49
 */
@WebFilter(filterName="LoginFilter",urlPatterns={"/*"})
public class LoginFilter implements Filter {

    private static List<String> unFilterList=null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        unFilterList=new ArrayList<String>();
        unFilterList.add("/user/registerPage");
        unFilterList.add("/user/register");
        unFilterList.add("/user/loginPage");
        unFilterList.add("/user/login");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        String uri=request.getRequestURI();
//        unFilterList.add("");
        if(-1==unFilterList.indexOf(uri)){
            User user=(User)request.getSession().getAttribute("user");
            if(false){//如果null==user需要跳转去登录页面
                response.sendRedirect(request.getContextPath()+"/user/loginPage");
            }else{
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
