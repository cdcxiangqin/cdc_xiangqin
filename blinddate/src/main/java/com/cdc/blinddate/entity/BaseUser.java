package com.cdc.blinddate.entity;

import com.cdc.blinddate.util.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Program: blinddate
 * @Description: 用户基本资料
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 02:32
 **/
@Entity
@Table(name = "base_user")
public class BaseUser extends IdEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    /** 用户名 */
    @Column
    private String username;
    /** 密码 */
    @Column
    private String password;
    /** 姓名 */
    @Column
    private String name;
    /** 性别 */
    @Column
    private String sex;
    /** 手机号 */
    @Column
    private String mobile;
    /** 出生日期 */
    @Column
    private Date birthday;
    /** 民族 */
    @Column
    private String folk;
    /** 身高 */
    @Column
    private double height;
    /** 体重 */
    @Column
    private double weight;
    /** 学历 */
    @Column
    private String education;
    /** 毕业院校 */
    @Column
    private String university;
    /** 住房条件 */
    @Column
    private String housing_conditions;
    /** 子女 */
    @Column
    private int child;
    /** 部门 */
    @Column
    private String department;
    /** 籍贯省 */
    @Column
    private String originalProvince;
    /** 籍贯市 */
    @Column
    private String originalCity;
    /** 当前省 */
    @Column
    private String currentProvince;
    /** 当前市 */
    @Column
    private String currentCity;
    /** 兴趣爱好 */
    @Column
    private String hobby;
    /** 生活态度 */
    @Column
    private String lifeAttitude;
    /** 注册时间 */
    @Column
    private Date createTime;
    /** 最后登录时间 */
    @Column
    private Date lastLoginTime;
    /** 邮箱 */
    @Column
    private String email;
    /** 状态 */
    @Column
    private int isStatus;

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

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(int isStatus) {
        this.isStatus = isStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BaseUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birthday=" + birthday +
                ", folk='" + folk + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", university='" + university + '\'' +
                ", housing_conditions='" + housing_conditions + '\'' +
                ", child=" + child +
                ", department='" + department + '\'' +
                ", originalProvince='" + originalProvince + '\'' +
                ", originalCity='" + originalCity + '\'' +
                ", currentProvince='" + currentProvince + '\'' +
                ", currentCity='" + currentCity + '\'' +
                ", hobby='" + hobby + '\'' +
                ", lifeAttitude='" + lifeAttitude + '\'' +
                ", createTime=" + createTime +
                ", lastLoginTime=" + lastLoginTime +
                ", email='" + email + '\'' +
                ", isStatus=" + isStatus +
                '}';
    }
}

