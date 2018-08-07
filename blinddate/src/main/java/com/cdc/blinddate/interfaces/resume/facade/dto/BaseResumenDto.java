package com.cdc.blinddate.interfaces.resume.facade.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Program: blinddate
 * @Description: 返回给前端的数据封装
 * @Author: Mr.Hogan
 * @Create: 2018-08-06 16:37
 **/
public class BaseResumenDto {
    @ApiModelProperty(value = "用户姓名")
    /** 用户名 */
    private String username;
    /** 密码 */
    private String password;
    /** 姓名 */
    private String name;
    /** 性别 */
    private String sex;
    /** 手机号 */
    private String mobile;
    /** 出生日期 */
    private Date birthday;
    /** 民族 */
    private String folk;
    /** 身高 */
    private double height;
    /** 体重 */
    private double weight;
    /** 学历 */
    private String education;
    /** 毕业院校 */
    private String university;
    /** 住房条件 */
    private String housing_conditions;
    /** 子女 */
    private int child;
    /** 部门 */
    private String department;
    /** 籍贯省 */
    private String originalProvince;
    /** 籍贯市 */
    private String originalCity;
    /** 当前省 */
    private String currentProvince;
    /** 当前市 */
    private String currentCity;
    /** 兴趣爱好 */
    private String hobby;
    /** 生活态度 */
    private String lifeAttitude;
    /** 注册时间 */
    private Date createTime;
    /** 最后登录时间 */

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getHousing_conditions() {
        return housing_conditions;
    }

    public void setHousing_conditions(String housing_conditions) {
        this.housing_conditions = housing_conditions;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOriginalProvince() {
        return originalProvince;
    }

    public void setOriginalProvince(String originalProvince) {
        this.originalProvince = originalProvince;
    }

    public String getOriginalCity() {
        return originalCity;
    }

    public void setOriginalCity(String originalCity) {
        this.originalCity = originalCity;
    }

    public String getCurrentProvince() {
        return currentProvince;
    }

    public void setCurrentProvince(String currentProvince) {
        this.currentProvince = currentProvince;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getLifeAttitude() {
        return lifeAttitude;
    }

    public void setLifeAttitude(String lifeAttitude) {
        this.lifeAttitude = lifeAttitude;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
