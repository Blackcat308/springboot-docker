/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.1.98
 Source Server Type    : MySQL
 Source Server Version : 80000 (8.0.0-dmr)
 Source Host           : 192.168.1.98:3306
 Source Schema         : sbd

 Target Server Type    : MySQL
 Target Server Version : 80000 (8.0.0-dmr)
 File Encoding         : 65001

 Date: 14/02/2023 15:07:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL,
  `nick_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
  `real_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '性别 0 保密 1 男 2女',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1000001, '张二', '张一一', 1);
INSERT INTO `user` VALUES (1000002, '理理', '王理', 2);

SET FOREIGN_KEY_CHECKS = 1;
