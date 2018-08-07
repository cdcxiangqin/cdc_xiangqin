package com.cdc.blinddate.interfaces.user.facede.dto;

/**
 * @Program: cdc_xiangqin
 * @Description: 注册后返回给前端的值
 * @Author: Mr.Hogan
 * @Create: 2018-08-07 20:59
 **/
public class RegisterDto {

    private String username;
    private String sex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
