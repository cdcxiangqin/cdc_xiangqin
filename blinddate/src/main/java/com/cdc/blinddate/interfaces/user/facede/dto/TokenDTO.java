package com.cdc.blinddate.interfaces.user.facede.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Program: blinddate
 * @Description: 传给前端的数据
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 17:07
 **/
public class TokenDTO {
    @ApiModelProperty(value = "用户姓名")
    private String name;
    @ApiModelProperty(value = "userID")
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
