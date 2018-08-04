/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : 127.0.0.1:3306
Source Database       : xiangqin2018

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2018-08-04 10:44:41
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
  `sex` varchar(2) NOT NULL COMMENT '性别',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
  `birthday` datetime DEFAULT NULL COMMENT '出生日期',
  `folk` varchar(20) DEFAULT NULL COMMENT '民族',
  `height` double DEFAULT NULL COMMENT '身高',
  `weight` double DEFAULT NULL COMMENT '体重',
  `education` varchar(20) DEFAULT NULL COMMENT '学历',
  `university` varchar(32) DEFAULT NULL COMMENT '毕业院校',
  `housing_conditions` varchar(32) DEFAULT NULL COMMENT '住房条件',
  `child` tinyint(4) DEFAULT NULL COMMENT '子女',
  `department` varchar(32) DEFAULT NULL COMMENT '部门',
  `original_province` varchar(32) DEFAULT NULL COMMENT '籍贯省',
  `original_city` varchar(32) DEFAULT NULL COMMENT '籍贯市',
  `current_province` varchar(32) DEFAULT NULL COMMENT '当前省',
  `current_city` varchar(32) DEFAULT NULL COMMENT '当前城市',
  `hobby` varchar(255) DEFAULT NULL COMMENT '兴趣爱好',
  `life_attitude` varchar(255) DEFAULT NULL COMMENT '生活态度',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_login_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `status` varchar(20) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('user1', 'user1', '111', '用户1', '1', '18811111111', '2018-08-04 09:29:02', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
