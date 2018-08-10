/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : 127.0.0.1:3306
Source Database       : xiangqin2018

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2018-08-10 16:25:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `name` varchar(32) NOT NULL COMMENT '姓名',
  `sex` varchar(6) NOT NULL COMMENT '性别',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
  `QQ` varchar(32) DEFAULT NULL COMMENT 'QQ号',
  `WeChat` varchar(32) DEFAULT NULL COMMENT '微信号',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `birthday` datetime DEFAULT NULL COMMENT '出生日期',
  `age` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `zodiac` varchar(20) DEFAULT NULL COMMENT '生肖',
  `constellation` varchar(20) DEFAULT NULL COMMENT '星座',
  `folk` varchar(20) DEFAULT NULL COMMENT '民族',
  `height` double DEFAULT NULL COMMENT '身高',
  `weight` double DEFAULT NULL COMMENT '体重',
  `education` varchar(20) DEFAULT NULL COMMENT '学历',
  `university` varchar(32) DEFAULT NULL COMMENT '毕业院校',
  `housing_conditions` varchar(32) DEFAULT NULL COMMENT '住房条件',
  `child` tinyint(4) DEFAULT NULL COMMENT '子女',
  `department` varchar(32) DEFAULT NULL COMMENT '部门',
  `employee_number` varchar(20) DEFAULT NULL COMMENT '员工编号',
  `original_province` varchar(32) DEFAULT NULL COMMENT '籍贯省',
  `original_city` varchar(32) DEFAULT NULL COMMENT '籍贯市',
  `current_province` varchar(32) DEFAULT NULL COMMENT '当前省',
  `current_city` varchar(32) DEFAULT NULL COMMENT '当前城市',
  `hobby` varchar(255) DEFAULT NULL COMMENT '兴趣爱好',
  `life_attitude` varchar(255) DEFAULT NULL COMMENT '生活态度',
  `head_address` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` varchar(20) DEFAULT NULL COMMENT '状态',
  `activity` bigint(20) DEFAULT NULL COMMENT '活跃度',
  `popularity` bigint(20) DEFAULT NULL COMMENT '热门度',
  `hobby_sport` varchar(255) DEFAULT NULL COMMENT '喜欢的运动',
  `hobby_music` varchar(255) DEFAULT NULL COMMENT '喜欢的音乐',
  `hobby_video` varchar(255) DEFAULT NULL COMMENT '喜欢的影视作品',
  `hobby_food` varchar(255) DEFAULT NULL COMMENT '喜欢的食物',
  `hobby_place` varchar(255) DEFAULT NULL COMMENT '喜欢的地方',
  `hobby_idol` varchar(255) DEFAULT NULL COMMENT '喜欢的偶像',
  `hobby_pet` varchar(255) DEFAULT NULL COMMENT '喜欢的宠物',
  `life_smoke` varchar(255) DEFAULT NULL COMMENT '是否吸烟',
  `life_cook` varchar(255) DEFAULT NULL COMMENT '厨艺',
  `life_drink` varchar(255) DEFAULT NULL COMMENT '是否喝酒',
  `life_housework` varchar(255) DEFAULT NULL COMMENT '家务',
  `life_deposit` varchar(255) DEFAULT NULL COMMENT '存款',
  `life_car` varchar(255) DEFAULT NULL COMMENT '购车',
  `life_busy` varchar(255) DEFAULT NULL COMMENT '是否繁忙',
  `marriage_zodiac_taboo` varchar(255) DEFAULT NULL COMMENT '生肖忌讳',
  `marriage_constellation_taboo` varchar(255) DEFAULT NULL COMMENT '星座忌讳',
  `marriage_marry_time` varchar(255) DEFAULT NULL COMMENT '何时结婚',
  `marriage_want_child` varchar(255) DEFAULT NULL COMMENT '想要小孩',
  `marriage_dating_site` varchar(255) DEFAULT NULL COMMENT '约会地点',
  `marriage_emotional_experience` varchar(255) DEFAULT NULL COMMENT '情感经历',
  `marriage_family_status` varchar(255) DEFAULT NULL COMMENT 'j家庭情况',
  `marriage_parents_condition` varchar(255) DEFAULT NULL COMMENT '父母情况',
  `marriage_parental_economic_status` varchar(255) DEFAULT NULL COMMENT '父母经济情况',
  `marriage_siblings` varchar(255) DEFAULT NULL COMMENT '兄弟姐妹',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('5977f9e0ff3a48f4b30b49e511b84490', 'user2', '222222', '用户2', '女', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-08-06 14:48:42', '2018-08-09 08:57:39', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('7034226842ab4452a71f9bd1e1601e57', 'user1', '111111', '用户1', '男', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-08-06 14:40:51', '2018-08-09 15:07:19', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
