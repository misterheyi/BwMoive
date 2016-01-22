/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : bw_moive

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-01-22 20:13:03
*/

SET FOREIGN_KEY_CHECKS=0;

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
  `v_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tid` smallint(8) DEFAULT NULL COMMENT '类型ID',
  `cid` smallint(8) DEFAULT NULL,
  `v_name` char(60) DEFAULT NULL COMMENT '名称',
  `v_spell` char(30) DEFAULT NULL COMMENT '中文拼音',
  `v_state` int(10) DEFAULT NULL COMMENT '状态',
  `v_pic` char(255) DEFAULT NULL COMMENT '海报路径',
  `v_actor` varchar(255) DEFAULT '' COMMENT '演员',
  `v_publishyear` char(20) DEFAULT NULL COMMENT '发行年份',
  `v_publisharea` char(20) DEFAULT NULL COMMENT '发行地区',
  `v_digg` smallint(8) DEFAULT NULL COMMENT '用户推荐',
  `v_rank` smallint(8) DEFAULT NULL COMMENT '等级',
  `v_note` char(30) DEFAULT NULL COMMENT '备注',
  `v_tags` char(30) DEFAULT NULL COMMENT '标签',
  `v_letter` char(3) DEFAULT NULL COMMENT '首字母',
  `v_isunion` smallint(6) DEFAULT NULL COMMENT '是否连载',
  `v_director` varchar(60) DEFAULT NULL COMMENT '导演',
  `v_enname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `v_lang` varchar(60) DEFAULT NULL COMMENT '语言',
  `v_score` bigint(10) DEFAULT NULL COMMENT '站内评分',
  `v_scorenum` int(5) DEFAULT NULL COMMENT '评分次数',
  `v_drama` text COMMENT '剧情',
  `v_nickname` char(60) DEFAULT NULL COMMENT '别名',
  `v_douban` decimal(3,0) DEFAULT NULL COMMENT '豆瓣评分',
  `v_mtime` decimal(3,0) DEFAULT NULL COMMENT '时光评分',
  `v_imdb` decimal(3,0) DEFAULT NULL COMMENT 'IMDB评分',
  `v_meituan` decimal(3,0) DEFAULT NULL COMMENT '美团评分',
  `v_tvs` varchar(60) DEFAULT NULL COMMENT '播出平台',
  `v_pcompany` varchar(60) DEFAULT NULL COMMENT '制作公司',
  `v_showcompany` varchar(60) DEFAULT NULL COMMENT '发行公司',
  `v_hit` int(10) DEFAULT NULL COMMENT '总点击',
  `v_dayhit` int(10) DEFAULT NULL COMMENT '日点击',
  `v_weekhit` int(10) DEFAULT NULL COMMENT '周点击',
  `v_monthhit` int(10) DEFAULT NULL COMMENT '月点击',
  `v_hittime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '总点击统计时间',
  `v_daytime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '天点击统计时间',
  `v_weektime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '周点击统计时间',
  `v_monthtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '周点击统计时间',
  `v_len` varchar(6) DEFAULT NULL COMMENT '片长',
  `v_total` varchar(6) DEFAULT NULL COMMENT '集数',
  `v_ver` varchar(60) DEFAULT NULL COMMENT '版本',
  `v_remark` varchar(30) DEFAULT NULL COMMENT '备用说明',
  `v_createtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `v_updatetime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `v_source` varchar(255) DEFAULT NULL COMMENT '资料来源',
  PRIMARY KEY (`v_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
