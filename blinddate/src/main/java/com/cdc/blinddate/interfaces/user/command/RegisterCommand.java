package com.cdc.blinddate.interfaces.user.command;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @Program: cdc_xiangqin
 * @Description: 注册接口接受的参数
 * @Author: Mr.Hogan
 * @Create: 2018-08-07 20:42
 **/
public class RegisterCommand {
    @NotBlank(message = "baseuser.username.required")
    @ApiModelProperty(name = "登录名", required = true)
    private String name;

    @NotBlank(message = "baseuser.password.required")
    @ApiModelProperty(name = "密码", required = true)
    private String password;

    @NotBlank(message = "baseuser.email.required")
    @ApiModelProperty(name = "邮箱", required = true)
    private String email;

    @NotBlank(message = "baseuser.sex.required")
    @ApiModelProperty(name = "性别", required = true)
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
