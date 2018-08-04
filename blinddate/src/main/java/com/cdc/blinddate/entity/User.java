package com.cdc.blinddate.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.cdc.blinddate.util.TimeUtil;

import java.io.Serializable;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author 纪佳鸿
 * @since 2018-08-03
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
	private String id;
    /**
     * 用户名
     */
	private String username;
    /**
     * 密码
     */
	private String password;
    /**
     * 姓名
     */
	private String name;
    /**
     * 性别
     */
	private String sex;
    /**
     * 手机号
     */
	private String mobile;
    /**
     * 出生日期
     */
	private Date birthday;
    /**
     * 民族
     */
	private String folk;
    /**
     * 身高
     */
	private Double height;
    /**
     * 体重
     */
	private Double weight;
    /**
     * 学历
     */
	private String education;
    /**
     * 毕业院校
     */
	private String university;
    /**
     * 住房条件
     */
	@TableField("housing_conditions")
	private String housingConditions;
    /**
     * 子女
     */
	private Integer child;
    /**
     * 部门
     */
	private String department;
    /**
     * 籍贯省
     */
	@TableField("original_province")
	private String originalProvince;
    /**
     * 籍贯市
     */
	@TableField("original_city")
	private String originalCity;
    /**
     * 当前省
     */
	@TableField("current_province")
	private String currentProvince;
    /**
     * 当前城市
     */
	@TableField("current_city")
	private String currentCity;
    /**
     * 兴趣爱好
     */
	private String hobby;
    /**
     * 生活态度
     */
	@TableField("life_attitude")
	private String lifeAttitude;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 最后登录时间
     */
	@TableField("last_login_time")
	private Date lastLoginTime;
    /**
     * 状态
     */
	private String status;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
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

	public String getHousingConditions() {
		return housingConditions;
	}

	public void setHousingConditions(String housingConditions) {
		this.housingConditions = housingConditions;
	}

	public Integer getChild() {
		return child;
	}

	public void setChild(Integer child) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", mobile='" + mobile + '\'' +
				", birthday=" + TimeUtil.getTimeString(birthday) +
				", folk='" + folk + '\'' +
				", height=" + height +
				", weight=" + weight +
				", education='" + education + '\'' +
				", university='" + university + '\'' +
				", housingConditions='" + housingConditions + '\'' +
				", child=" + child +
				", department='" + department + '\'' +
				", originalProvince='" + originalProvince + '\'' +
				", originalCity='" + originalCity + '\'' +
				", currentProvince='" + currentProvince + '\'' +
				", currentCity='" + currentCity + '\'' +
				", hobby='" + hobby + '\'' +
				", lifeAttitude='" + lifeAttitude + '\'' +
				", createTime=" + TimeUtil.getTimeString(createTime) +
				", lastLoginTime=" + TimeUtil.getTimeString(lastLoginTime) +
				", status='" + status + '\'' +
				'}';
	}
}
