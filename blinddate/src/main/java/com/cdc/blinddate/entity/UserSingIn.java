package com.cdc.blinddate.entity;

import com.cdc.blinddate.util.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Program: 登录
 * @Description: 男性用户
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 02:14
 **/
@Entity
@Table(name = "user_sign_in")
public class UserSingIn extends IdEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    /** 登录名 */
    @Column
    private String username;
    /** 登录成功跳转链接 */
    @Column
    private String targetUrl;
    /** 是否存储账户密码（用于自动登录） */
    @Column
    private Boolean isStorage;
    /** 密码 */
    @Column
    private String password;
    /** 用户ID */
    @Column
    private String userId;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public Boolean getStorage() {
        return isStorage;
    }

    public void setStorage(Boolean storage) {
        isStorage = storage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserSingIn{" +
                "username='" + username + '\'' +
                ", targetUrl='" + targetUrl + '\'' +
                ", isStorage=" + isStorage +
                ", password='" + password + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
