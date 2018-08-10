package com.cdc.blinddate.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author 纪佳鸿
 * @since 2018-08-10 15:51:40
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
	private Integer age;
    /**
     * 生肖
     */
	private String zodiac;
    /**
     * 星座
     */
	private String constellation;
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
     * 头像地址
     */
	@TableField("head_address")
	private String headAddress;
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
    /**
     * 活跃度
     */
	private Long activity;
    /**
     * 热门度
     */
	private Long popularity;
    /**
     * 喜欢的运动
     */
	@TableField("hobby_sport")
	private String hobbySport;
    /**
     * 喜欢的音乐
     */
	@TableField("hobby_music")
	private String hobbyMusic;
    /**
     * 喜欢的影视作品
     */
	@TableField("hobby_video")
	private String hobbyVideo;
    /**
     * 喜欢的食物
     */
	@TableField("hobby_food")
	private String hobbyFood;
    /**
     * 喜欢的地方
     */
	@TableField("hobby_place")
	private String hobbyPlace;
    /**
     * 喜欢的偶像
     */
	@TableField("hobby_idol")
	private String hobbyIdol;
    /**
     * 喜欢的宠物
     */
	@TableField("hobby_pet")
	private String hobbyPet;
    /**
     * 是否吸烟
     */
	@TableField("life_smoke")
	private String lifeSmoke;
    /**
     * 厨艺
     */
	@TableField("life_cook")
	private String lifeCook;
    /**
     * 是否喝酒
     */
	@TableField("life_drink")
	private String lifeDrink;
    /**
     * 家务
     */
	@TableField("life_housework")
	private String lifeHousework;
    /**
     * 存款
     */
	@TableField("life_deposit")
	private String lifeDeposit;
    /**
     * 购车
     */
	@TableField("life_car")
	private String lifeCar;
    /**
     * 是否繁忙
     */
	@TableField("life_busy")
	private String lifeBusy;
    /**
     * 生肖忌讳
     */
	@TableField("marriage_zodiac_taboo")
	private String marriageZodiacTaboo;
    /**
     * 星座忌讳
     */
	@TableField("marriage_constellation_taboo")
	private String marriageConstellationTaboo;
    /**
     * 何时结婚
     */
	@TableField("marriage_marry_time")
	private String marriageMarryTime;
    /**
     * 想要小孩
     */
	@TableField("marriage_want_child")
	private String marriageWantChild;
    /**
     * 约会地点
     */
	@TableField("marriage_dating_site")
	private String marriageDatingSite;
    /**
     * 情感经历
     */
	@TableField("marriage_emotional_experience")
	private String marriageEmotionalExperience;
    /**
     * j家庭情况
     */
	@TableField("marriage_family_status")
	private String marriageFamilyStatus;
    /**
     * 父母情况
     */
	@TableField("marriage_parents_condition")
	private String marriageParentsCondition;
    /**
     * 父母经济情况
     */
	@TableField("marriage_parental_economic_status")
	private String marriageParentalEconomicStatus;
    /**
     * 兄弟姐妹
     */
	@TableField("marriage_siblings")
	private String marriageSiblings;


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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getZodiac() {
		return zodiac;
	}

	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
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

	public String getHeadAddress() {
		return headAddress;
	}

	public void setHeadAddress(String headAddress) {
		this.headAddress = headAddress;
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

	public Long getActivity() {
		return activity;
	}

	public void setActivity(Long activity) {
		this.activity = activity;
	}

	public Long getPopularity() {
		return popularity;
	}

	public void setPopularity(Long popularity) {
		this.popularity = popularity;
	}

	public String getHobbySport() {
		return hobbySport;
	}

	public void setHobbySport(String hobbySport) {
		this.hobbySport = hobbySport;
	}

	public String getHobbyMusic() {
		return hobbyMusic;
	}

	public void setHobbyMusic(String hobbyMusic) {
		this.hobbyMusic = hobbyMusic;
	}

	public String getHobbyVideo() {
		return hobbyVideo;
	}

	public void setHobbyVideo(String hobbyVideo) {
		this.hobbyVideo = hobbyVideo;
	}

	public String getHobbyFood() {
		return hobbyFood;
	}

	public void setHobbyFood(String hobbyFood) {
		this.hobbyFood = hobbyFood;
	}

	public String getHobbyPlace() {
		return hobbyPlace;
	}

	public void setHobbyPlace(String hobbyPlace) {
		this.hobbyPlace = hobbyPlace;
	}

	public String getHobbyIdol() {
		return hobbyIdol;
	}

	public void setHobbyIdol(String hobbyIdol) {
		this.hobbyIdol = hobbyIdol;
	}

	public String getHobbyPet() {
		return hobbyPet;
	}

	public void setHobbyPet(String hobbyPet) {
		this.hobbyPet = hobbyPet;
	}

	public String getLifeSmoke() {
		return lifeSmoke;
	}

	public void setLifeSmoke(String lifeSmoke) {
		this.lifeSmoke = lifeSmoke;
	}

	public String getLifeCook() {
		return lifeCook;
	}

	public void setLifeCook(String lifeCook) {
		this.lifeCook = lifeCook;
	}

	public String getLifeDrink() {
		return lifeDrink;
	}

	public void setLifeDrink(String lifeDrink) {
		this.lifeDrink = lifeDrink;
	}

	public String getLifeHousework() {
		return lifeHousework;
	}

	public void setLifeHousework(String lifeHousework) {
		this.lifeHousework = lifeHousework;
	}

	public String getLifeDeposit() {
		return lifeDeposit;
	}

	public void setLifeDeposit(String lifeDeposit) {
		this.lifeDeposit = lifeDeposit;
	}

	public String getLifeCar() {
		return lifeCar;
	}

	public void setLifeCar(String lifeCar) {
		this.lifeCar = lifeCar;
	}

	public String getLifeBusy() {
		return lifeBusy;
	}

	public void setLifeBusy(String lifeBusy) {
		this.lifeBusy = lifeBusy;
	}

	public String getMarriageZodiacTaboo() {
		return marriageZodiacTaboo;
	}

	public void setMarriageZodiacTaboo(String marriageZodiacTaboo) {
		this.marriageZodiacTaboo = marriageZodiacTaboo;
	}

	public String getMarriageConstellationTaboo() {
		return marriageConstellationTaboo;
	}

	public void setMarriageConstellationTaboo(String marriageConstellationTaboo) {
		this.marriageConstellationTaboo = marriageConstellationTaboo;
	}

	public String getMarriageMarryTime() {
		return marriageMarryTime;
	}

	public void setMarriageMarryTime(String marriageMarryTime) {
		this.marriageMarryTime = marriageMarryTime;
	}

	public String getMarriageWantChild() {
		return marriageWantChild;
	}

	public void setMarriageWantChild(String marriageWantChild) {
		this.marriageWantChild = marriageWantChild;
	}

	public String getMarriageDatingSite() {
		return marriageDatingSite;
	}

	public void setMarriageDatingSite(String marriageDatingSite) {
		this.marriageDatingSite = marriageDatingSite;
	}

	public String getMarriageEmotionalExperience() {
		return marriageEmotionalExperience;
	}

	public void setMarriageEmotionalExperience(String marriageEmotionalExperience) {
		this.marriageEmotionalExperience = marriageEmotionalExperience;
	}

	public String getMarriageFamilyStatus() {
		return marriageFamilyStatus;
	}

	public void setMarriageFamilyStatus(String marriageFamilyStatus) {
		this.marriageFamilyStatus = marriageFamilyStatus;
	}

	public String getMarriageParentsCondition() {
		return marriageParentsCondition;
	}

	public void setMarriageParentsCondition(String marriageParentsCondition) {
		this.marriageParentsCondition = marriageParentsCondition;
	}

	public String getMarriageParentalEconomicStatus() {
		return marriageParentalEconomicStatus;
	}

	public void setMarriageParentalEconomicStatus(String marriageParentalEconomicStatus) {
		this.marriageParentalEconomicStatus = marriageParentalEconomicStatus;
	}

	public String getMarriageSiblings() {
		return marriageSiblings;
	}

	public void setMarriageSiblings(String marriageSiblings) {
		this.marriageSiblings = marriageSiblings;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
