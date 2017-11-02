/*
Navicat MySQL Data Transfer

Source Server         : 192.168.28.194(hd3_dev)
Source Server Version : 50624
Source Host           : 192.168.28.194:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-11-02 08:58:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of game
-- ----------------------------
INSERT INTO `game` VALUES ('2', '2016-04-21 14:42:18', 'bbb');
INSERT INTO `game` VALUES ('4', '2016-07-05 10:35:37', '1111');
