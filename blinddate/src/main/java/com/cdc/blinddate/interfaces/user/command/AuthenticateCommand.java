package com.cdc.blinddate.interfaces.command;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @Program: blinddate
 * @Description: 用户登录的实例
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 16:51
 **/
public class AuthenticateCommand {
    @NotBlank(message = "user.username.required")
    @ApiModelProperty(name = "登录名或手机号", required = true)
    private String username;

    @NotBlank(message = "user.password.required")
    @ApiModelProperty(value = "密码", required = true)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
