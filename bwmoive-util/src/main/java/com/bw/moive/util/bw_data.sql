/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : bw_moive

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-01-29 18:12:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bw_area
-- ----------------------------
DROP TABLE IF EXISTS `bw_area`;
CREATE TABLE `bw_area` (
  `a_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '地区ID',
  `a_name` varchar(25) DEFAULT NULL,
  `a_enname` varchar(25) DEFAULT NULL COMMENT '英文名',
  `a_order` int(2) DEFAULT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bw_content
-- ----------------------------
DROP TABLE IF EXISTS `bw_content`;
CREATE TABLE `bw_content` (
  `c_id` int(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '内容ID',
  `c_body` text COMMENT '内容',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bw_data
-- ----------------------------
DROP TABLE IF EXISTS `bw_data`;
CREATE TABLE `bw_data` (
  `v_id` int(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tid` int(8) unsigned zerofill DEFAULT NULL COMMENT '类型ID',
  `aid` int(8) unsigned zerofill DEFAULT NULL COMMENT '所属地区',
  `v_year` int(10) unsigned zerofill DEFAULT NULL COMMENT '年代',
  `v_pic` varchar(125) DEFAULT NULL COMMENT '海报路径',
  `v_name` varchar(60) DEFAULT NULL COMMENT '名称',
  `v_spell` varchar(30) DEFAULT NULL COMMENT '中文拼音',
  `v_letter` varchar(3) DEFAULT NULL COMMENT '首字母',
  `v_nickname` varchar(60) DEFAULT NULL COMMENT '别名',
  `v_enname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `v_publishyear` int(4) unsigned DEFAULT '0' COMMENT '出品时间',
  `v_publishcompany` varchar(60) DEFAULT NULL COMMENT '出品公司',
  `v_showbox` varchar(60) DEFAULT NULL COMMENT '发行公司',
  `v_publisharea` varchar(20) DEFAULT NULL COMMENT '制片地区',
  `v_videoarea` varchar(60) DEFAULT NULL COMMENT '拍摄地点',
  `v_videotime` int(4) unsigned DEFAULT '0' COMMENT '拍摄日期',
  `v_ontime` varchar(60) DEFAULT '0' COMMENT '首播时间，上映时间',
  `v_offtime` varchar(60) DEFAULT '0' COMMENT '下映时间',
  `v_director` varchar(20) DEFAULT NULL COMMENT '导演',
  `v_writer` varchar(20) DEFAULT NULL COMMENT '编剧',
  `v_producer` varchar(20) DEFAULT NULL COMMENT '制片人',
  `v_type` varchar(60) DEFAULT NULL COMMENT '类型',
  `v_actor` varchar(255) DEFAULT NULL COMMENT '主演',
  `v_total` varchar(6) DEFAULT NULL COMMENT '集数',
  `v_length` varchar(6) DEFAULT NULL COMMENT '片长',
  `v_boxoffice` varchar(30) DEFAULT NULL COMMENT '票房',
  `v_language` varchar(60) DEFAULT NULL COMMENT '语言',
  `v_color` varchar(20) DEFAULT NULL COMMENT '色彩',
  `v_imdb` varchar(20) DEFAULT NULL COMMENT 'imdb编码',
  `v_perlength` varchar(20) DEFAULT NULL COMMENT '每集长度',
  `v_presenter` varchar(60) DEFAULT NULL COMMENT '出品人',
  `v_onlineshow` varchar(60) DEFAULT NULL COMMENT '在线播放平台',
  `v_tvshow` varchar(60) DEFAULT NULL COMMENT '播出平台',
  `v_drama` text COMMENT '概要剧情',
  `v_description` text COMMENT '详细描述',
  `v_state` int(10) DEFAULT '0' COMMENT '状态',
  `v_score` decimal(5,2) unsigned zerofill DEFAULT '000.00' COMMENT '站内评分',
  `v_scorenum` int(5) unsigned DEFAULT '0' COMMENT '评分次数',
  `v_doubanscore` decimal(5,2) unsigned zerofill DEFAULT NULL COMMENT '豆瓣评分',
  `v_mtimescore` decimal(5,2) unsigned zerofill DEFAULT NULL COMMENT '时光评分',
  `v_imdbscore` decimal(5,2) unsigned zerofill DEFAULT NULL COMMENT 'IMDB评分',
  `v_meituanscore` decimal(5,0) unsigned zerofill DEFAULT NULL COMMENT '美团评分',
  `v_note` varchar(30) DEFAULT NULL COMMENT '备注',
  `v_tags` varchar(30) DEFAULT NULL COMMENT '标签',
  `v_isunion` int(6) DEFAULT '0' COMMENT '是否连载',
  `v_ver` varchar(60) DEFAULT NULL COMMENT '版本',
  `v_remark` varchar(30) DEFAULT NULL COMMENT '备用说明',
  `v_digg` int(8) unsigned DEFAULT NULL COMMENT '用户推荐',
  `v_rank` int(8) unsigned DEFAULT NULL COMMENT '等级',
  `v_hit` int(10) unsigned DEFAULT '0' COMMENT '总点击',
  `v_dayhit` int(10) unsigned DEFAULT '0' COMMENT '日点击',
  `v_weekhit` int(10) unsigned DEFAULT '0' COMMENT '周点击',
  `v_monthhit` int(10) unsigned DEFAULT '0' COMMENT '月点击',
  `v_hittime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '总点击统计时间',
  `v_daytime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '天点击统计时间',
  `v_weektime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '周点击统计时间',
  `v_monthtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '周点击统计时间',
  `v_createtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `v_updatetime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `v_source` varchar(255) DEFAULT NULL COMMENT '资料来源',
  PRIMARY KEY (`v_id`)
) ENGINE=InnoDB AUTO_INCREMENT=100004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bw_playdata
-- ----------------------------
DROP TABLE IF EXISTS `bw_playdata`;
CREATE TABLE `bw_playdata` (
  `p_id` int(8) NOT NULL,
  `vid` int(8) NOT NULL,
  `p_name` varchar(60) DEFAULT NULL,
  `p_link` varchar(255) DEFAULT NULL,
  `p_type` varchar(2) DEFAULT NULL,
  `p_createtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `p_updatetime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bw_type
-- ----------------------------
DROP TABLE IF EXISTS `bw_type`;
CREATE TABLE `bw_type` (
  `t_id` smallint(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '类型ID',
  `upid` tinyint(5) unsigned NOT NULL COMMENT '父类型',
  `t_name` char(30) DEFAULT NULL COMMENT '类型中文名称',
  `t_enname` char(60) DEFAULT NULL COMMENT '类型英文名称',
  `t_order` int(255) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
