/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : db_gaoshu_plus

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-03-14 19:38:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_attachs`
-- ----------------------------
DROP TABLE IF EXISTS `tb_attachs`;
CREATE TABLE `tb_attachs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `height` int(11) NOT NULL,
  `m_id` varchar(255) DEFAULT NULL,
  `original` varchar(255) DEFAULT NULL,
  `preview` varchar(255) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `width` int(11) NOT NULL,
  `pid` bigint(20) DEFAULT NULL,
  `cid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhoob6vqr9mcg3jb43xucbu751` (`cid`),
  KEY `FKbvmd7yqne1lwjcp2yim265ajr` (`pid`),
  CONSTRAINT `FK7negacasxqm7rxk8ulutt4gfb` FOREIGN KEY (`pid`) REFERENCES `tb_post_attribute` (`id`),
  CONSTRAINT `FKbvmd7yqne1lwjcp2yim265ajr` FOREIGN KEY (`pid`) REFERENCES `tb_posts` (`id`),
  CONSTRAINT `FKhoob6vqr9mcg3jb43xucbu751` FOREIGN KEY (`cid`) REFERENCES `tb_comments` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_attachs
-- ----------------------------
INSERT INTO `tb_attachs` VALUES ('1', '246', null, '/store/orig/2018/0312/12140914g60x.gif', '/store/thumbs/2018/0312/12140914g60x.gif', '0', '277', null, '101');
INSERT INTO `tb_attachs` VALUES ('2', '246', null, '/store/orig/2018/0312/12140915r2at.gif', '/store/thumbs/2018/0312/12140915r2at.gif', '0', '277', null, '102');
INSERT INTO `tb_attachs` VALUES ('3', '246', null, '/store/orig/2018/0312/121409152iv1.gif', '/store/thumbs/2018/0312/121409152iv1.gif', '0', '277', null, '103');
INSERT INTO `tb_attachs` VALUES ('4', '246', null, '/store/orig/2018/0312/12140915s41t.gif', '/store/thumbs/2018/0312/12140915s41t.gif', '0', '277', null, '104');
INSERT INTO `tb_attachs` VALUES ('5', '246', null, '/store/orig/2018/0312/1214091675be.gif', '/store/thumbs/2018/0312/1214091675be.gif', '0', '277', null, '105');
INSERT INTO `tb_attachs` VALUES ('6', '246', null, '/store/orig/2018/0312/12140916pbpg.gif', '/store/thumbs/2018/0312/12140916pbpg.gif', '0', '277', null, '106');
INSERT INTO `tb_attachs` VALUES ('7', '246', null, '/store/orig/2018/0312/12140916n39m.gif', '/store/thumbs/2018/0312/12140916n39m.gif', '0', '277', null, '107');
INSERT INTO `tb_attachs` VALUES ('8', '246', null, '/store/orig/2018/0312/1214091670tu.gif', '/store/thumbs/2018/0312/1214091670tu.gif', '0', '277', null, '108');
INSERT INTO `tb_attachs` VALUES ('9', '246', null, '/store/orig/2018/0312/1214091680a6.gif', '/store/thumbs/2018/0312/1214091680a6.gif', '0', '277', null, '109');
INSERT INTO `tb_attachs` VALUES ('10', '246', null, '/store/orig/2018/0312/12140916w065.gif', '/store/thumbs/2018/0312/12140916w065.gif', '0', '277', null, '110');
INSERT INTO `tb_attachs` VALUES ('11', '246', null, '/store/orig/2018/0312/12140916q860.gif', '/store/thumbs/2018/0312/12140916q860.gif', '0', '277', null, '111');
INSERT INTO `tb_attachs` VALUES ('12', '246', null, '/store/orig/2018/0312/12140916y6pj.gif', '/store/thumbs/2018/0312/12140916y6pj.gif', '0', '277', null, '112');
INSERT INTO `tb_attachs` VALUES ('13', '246', null, '/store/orig/2018/0312/12140916qzl0.gif', '/store/thumbs/2018/0312/12140916qzl0.gif', '0', '277', null, '113');
INSERT INTO `tb_attachs` VALUES ('14', '246', null, '/store/orig/2018/0312/12140916ac70.gif', '/store/thumbs/2018/0312/12140916ac70.gif', '0', '277', null, '114');
INSERT INTO `tb_attachs` VALUES ('15', '246', null, '/store/orig/2018/0312/12140916kqzm.gif', '/store/thumbs/2018/0312/12140916kqzm.gif', '0', '277', null, '115');
INSERT INTO `tb_attachs` VALUES ('16', '246', null, '/store/orig/2018/0312/12140916vdn2.gif', '/store/thumbs/2018/0312/12140916vdn2.gif', '0', '277', null, '116');
INSERT INTO `tb_attachs` VALUES ('17', '246', null, '/store/orig/2018/0312/12140916rf9y.gif', '/store/thumbs/2018/0312/12140916rf9y.gif', '0', '277', null, '117');
INSERT INTO `tb_attachs` VALUES ('18', '246', null, '/store/orig/2018/0312/12140917upkr.gif', '/store/thumbs/2018/0312/12140917upkr.gif', '0', '277', null, '118');
INSERT INTO `tb_attachs` VALUES ('19', '246', null, '/store/orig/2018/0312/121409171xai.gif', '/store/thumbs/2018/0312/121409171xai.gif', '0', '277', null, '119');
INSERT INTO `tb_attachs` VALUES ('20', '246', null, '/store/orig/2018/0312/12140917pumq.gif', '/store/thumbs/2018/0312/12140917pumq.gif', '0', '277', null, '120');
INSERT INTO `tb_attachs` VALUES ('21', '246', null, '/store/orig/2018/0312/12140917p5sr.gif', '/store/thumbs/2018/0312/12140917p5sr.gif', '0', '277', null, '121');
INSERT INTO `tb_attachs` VALUES ('22', '246', null, '/store/orig/2018/0312/12140917e1fa.gif', '/store/thumbs/2018/0312/12140917e1fa.gif', '0', '277', null, '122');
INSERT INTO `tb_attachs` VALUES ('23', '246', null, '/store/orig/2018/0312/12140917u9bv.gif', '/store/thumbs/2018/0312/12140917u9bv.gif', '0', '277', null, '123');
INSERT INTO `tb_attachs` VALUES ('24', '246', null, '/store/orig/2018/0312/12140917ubr9.gif', '/store/thumbs/2018/0312/12140917ubr9.gif', '0', '277', null, '124');
INSERT INTO `tb_attachs` VALUES ('25', '246', null, '/store/orig/2018/0312/12140917vxz4.gif', '/store/thumbs/2018/0312/12140917vxz4.gif', '0', '277', null, '125');
INSERT INTO `tb_attachs` VALUES ('26', '246', null, '/store/orig/2018/0312/1214091708l9.gif', '/store/thumbs/2018/0312/1214091708l9.gif', '0', '277', null, '126');
INSERT INTO `tb_attachs` VALUES ('27', '246', null, '/store/orig/2018/0312/12140917fczj.gif', '/store/thumbs/2018/0312/12140917fczj.gif', '0', '277', null, '127');
INSERT INTO `tb_attachs` VALUES ('28', '246', null, '/store/orig/2018/0312/121409175qp9.gif', '/store/thumbs/2018/0312/121409175qp9.gif', '0', '277', null, '128');
INSERT INTO `tb_attachs` VALUES ('29', '246', null, '/store/orig/2018/0312/12140917on22.gif', '/store/thumbs/2018/0312/12140917on22.gif', '0', '277', null, '129');
INSERT INTO `tb_attachs` VALUES ('30', '246', null, '/store/orig/2018/0312/12140917gmew.gif', '/store/thumbs/2018/0312/12140917gmew.gif', '0', '277', null, '130');
INSERT INTO `tb_attachs` VALUES ('31', '246', null, '/store/orig/2018/0312/12140918yqq6.gif', '/store/thumbs/2018/0312/12140918yqq6.gif', '0', '277', null, '131');
INSERT INTO `tb_attachs` VALUES ('32', '246', null, '/store/orig/2018/0312/1214091852c9.gif', '/store/thumbs/2018/0312/1214091852c9.gif', '0', '277', null, '132');
INSERT INTO `tb_attachs` VALUES ('33', '246', null, '/store/orig/2018/0312/12140918y44t.gif', '/store/thumbs/2018/0312/12140918y44t.gif', '0', '277', null, '133');
INSERT INTO `tb_attachs` VALUES ('34', '246', null, '/store/orig/2018/0312/12140918rt0h.gif', '/store/thumbs/2018/0312/12140918rt0h.gif', '0', '277', null, '134');
INSERT INTO `tb_attachs` VALUES ('35', '246', null, '/store/orig/2018/0312/12140918s6tc.gif', '/store/thumbs/2018/0312/12140918s6tc.gif', '0', '277', null, '135');
INSERT INTO `tb_attachs` VALUES ('36', '246', null, '/store/orig/2018/0312/12140918kx0g.gif', '/store/thumbs/2018/0312/12140918kx0g.gif', '0', '277', null, '136');
INSERT INTO `tb_attachs` VALUES ('37', '246', null, '/store/orig/2018/0312/12140918f0ld.gif', '/store/thumbs/2018/0312/12140918f0ld.gif', '0', '277', null, '137');
INSERT INTO `tb_attachs` VALUES ('38', '246', null, '/store/orig/2018/0312/121409181cmk.gif', '/store/thumbs/2018/0312/121409181cmk.gif', '0', '277', null, '138');
INSERT INTO `tb_attachs` VALUES ('39', '246', null, '/store/orig/2018/0312/12140918y3c2.gif', '/store/thumbs/2018/0312/12140918y3c2.gif', '0', '277', null, '139');
INSERT INTO `tb_attachs` VALUES ('40', '246', null, '/store/orig/2018/0312/12140918cu6s.gif', '/store/thumbs/2018/0312/12140918cu6s.gif', '0', '277', null, '140');
INSERT INTO `tb_attachs` VALUES ('41', '246', null, '/store/orig/2018/0312/121409183dqk.gif', '/store/thumbs/2018/0312/121409183dqk.gif', '0', '277', null, '141');
INSERT INTO `tb_attachs` VALUES ('42', '246', null, '/store/orig/2018/0312/12140918bc2d.gif', '/store/thumbs/2018/0312/12140918bc2d.gif', '0', '277', null, '142');
INSERT INTO `tb_attachs` VALUES ('43', '246', null, '/store/orig/2018/0312/12140918hfol.gif', '/store/thumbs/2018/0312/12140918hfol.gif', '0', '277', null, '143');
INSERT INTO `tb_attachs` VALUES ('44', '246', null, '/store/orig/2018/0312/12140919c4rr.gif', '/store/thumbs/2018/0312/12140919c4rr.gif', '0', '277', null, '144');
INSERT INTO `tb_attachs` VALUES ('45', '246', null, '/store/orig/2018/0312/12140919fpeh.gif', '/store/thumbs/2018/0312/12140919fpeh.gif', '0', '277', null, '145');
INSERT INTO `tb_attachs` VALUES ('46', '246', null, '/store/orig/2018/0312/12140919oa35.gif', '/store/thumbs/2018/0312/12140919oa35.gif', '0', '277', null, '146');
INSERT INTO `tb_attachs` VALUES ('47', '246', null, '/store/orig/2018/0312/12140919fod0.gif', '/store/thumbs/2018/0312/12140919fod0.gif', '0', '277', null, '147');
INSERT INTO `tb_attachs` VALUES ('48', '246', null, '/store/orig/2018/0312/12140919q0yc.gif', '/store/thumbs/2018/0312/12140919q0yc.gif', '0', '277', null, '148');
INSERT INTO `tb_attachs` VALUES ('49', '246', null, '/store/orig/2018/0312/12140919m7ce.gif', '/store/thumbs/2018/0312/12140919m7ce.gif', '0', '277', null, '149');
INSERT INTO `tb_attachs` VALUES ('50', '246', null, '/store/orig/2018/0312/12140919juq0.gif', '/store/thumbs/2018/0312/12140919juq0.gif', '0', '277', null, '150');
INSERT INTO `tb_attachs` VALUES ('51', '246', '1zl2P9Pyam3bH6tODTp5ZXApn2zUWJl4CF0KtELzRU2-Rc393WzEExw4vQSp5Cvy', '/store/orig/2018/0312/12162812yob3.gif', '/store/temp/2018/0312/12162812yob3.gif', '0', '277', '103', null);
INSERT INTO `tb_attachs` VALUES ('52', '246', '6kD5LuWi8a_CCm_y8qtgWqrhWo4ARBQRW0_stW9KVJCZB8rkZsZQH67nUQeModyG', '/store/orig/2018/0312/12163237si67.gif', '/store/temp/2018/0312/12163237si67.gif', '0', '277', '104', null);
INSERT INTO `tb_attachs` VALUES ('53', '246', 'mUkds1FNBDkHsqZ0GUAYRp5tTS7Ullf8G6vtldDdC4TH8f2irDrE42B9HoKDNTVv', '/store/orig/2018/0312/12163606k2pr.gif', '/store/temp/2018/0312/12163606k2pr.gif', '0', '277', '105', null);
INSERT INTO `tb_attachs` VALUES ('54', '246', '6kD5LuWi8a_CCm_y8qtgWn1hHqAWsIHVRCggowcbwxT5SLtmFcKsXfFLB4miNnbs', '/store/orig/2018/0312/12163858ew92.gif', '/store/temp/2018/0312/12163858ew92.gif', '0', '277', '106', null);
INSERT INTO `tb_attachs` VALUES ('55', '246', 'VPNbgsLqLZtMimvBZW3KP1V2AM3JzmBp9DoJ4DX543fiHhHtBz81t786PQj1Dr8m', '/store/orig/2018/0312/12164047wart.gif', '/store/temp/2018/0312/12164047wart.gif', '0', '277', '107', null);

-- ----------------------------
-- Table structure for `tb_college`
-- ----------------------------
DROP TABLE IF EXISTS `tb_college`;
CREATE TABLE `tb_college` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `college_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_5068ec34jjh3i8xlmoot2hild` (`college_name`)
) ENGINE=InnoDB AUTO_INCREMENT=50140 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_college
-- ----------------------------
INSERT INTO `tb_college` VALUES ('13892', '三亚学院');
INSERT INTO `tb_college` VALUES ('11075', '三峡大学');
INSERT INTO `tb_college` VALUES ('13236', '三峡大学科技学院');
INSERT INTO `tb_college` VALUES ('14258', '三峡旅游职业技术学院');
INSERT INTO `tb_college` VALUES ('14061', '三峡电力职业学院');
INSERT INTO `tb_college` VALUES ('11311', '三明学院');
INSERT INTO `tb_college` VALUES ('11913', '三江学院');
INSERT INTO `tb_college` VALUES ('10268', '上海中医药大学');
INSERT INTO `tb_college` VALUES ('10248', '上海交通大学');
INSERT INTO `tb_college` VALUES ('10277', '上海体育学院');
INSERT INTO `tb_college` VALUES ('10283', '上海公安高等专科学校');
INSERT INTO `tb_college` VALUES ('11733', '上海出版印刷高等专科学校');
INSERT INTO `tb_college` VALUES ('10262', '上海医疗器械高等专科学校');
INSERT INTO `tb_college` VALUES ('10271', '上海外国语大学');
INSERT INTO `tb_college` VALUES ('10280', '上海大学');
INSERT INTO `tb_college` VALUES ('10273', '上海对外贸易学院');
INSERT INTO `tb_college` VALUES ('10856', '上海工程技术大学');
INSERT INTO `tb_college` VALUES ('10270', '上海师范大学');
INSERT INTO `tb_college` VALUES ('11636', '上海师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11940', '上海应用技术学院');
INSERT INTO `tb_college` VALUES ('10279', '上海戏剧学院');
INSERT INTO `tb_college` VALUES ('10275', '上海旅游高等专科学校');
INSERT INTO `tb_college` VALUES ('11833', '上海杉达学院');
INSERT INTO `tb_college` VALUES ('10264', '上海水产大学');
INSERT INTO `tb_college` VALUES ('10254', '上海海事大学');
INSERT INTO `tb_college` VALUES ('10274', '上海海关高等专科学校');
INSERT INTO `tb_college` VALUES ('10252', '上海理工大学');
INSERT INTO `tb_college` VALUES ('10256', '上海电力学院');
INSERT INTO `tb_college` VALUES ('11458', '上海电机技术高等专科学校');
INSERT INTO `tb_college` VALUES ('10266', '上海第二医科大学');
INSERT INTO `tb_college` VALUES ('10272', '上海财经大学');
INSERT INTO `tb_college` VALUES ('11639', '上海金融高等专科学校');
INSERT INTO `tb_college` VALUES ('10278', '上海音乐学院');
INSERT INTO `tb_college` VALUES ('10416', '上饶师范学院');
INSERT INTO `tb_college` VALUES ('10224', '东北农业大学');
INSERT INTO `tb_college` VALUES ('10145', '东北大学');
INSERT INTO `tb_college` VALUES ('19145', '东北大学秦皇岛分校');
INSERT INTO `tb_college` VALUES ('10200', '东北师范大学');
INSERT INTO `tb_college` VALUES ('10225', '东北林业大学');
INSERT INTO `tb_college` VALUES ('10188', '东北电力学院');
INSERT INTO `tb_college` VALUES ('10173', '东北财经大学');
INSERT INTO `tb_college` VALUES ('10255', '东华大学');
INSERT INTO `tb_college` VALUES ('10405', '东华理工学院');
INSERT INTO `tb_college` VALUES ('10286', '东南大学');
INSERT INTO `tb_college` VALUES ('11819', '东莞理工学院');
INSERT INTO `tb_college` VALUES ('11954', '中华女子学院');
INSERT INTO `tb_college` VALUES ('10533', '中南大学');
INSERT INTO `tb_college` VALUES ('10538', '中南林业科技大学');
INSERT INTO `tb_college` VALUES ('10524', '中南民族大学');
INSERT INTO `tb_college` VALUES ('10520', '中南财经政法大学');
INSERT INTO `tb_college` VALUES ('10465', '中原工学院');
INSERT INTO `tb_college` VALUES ('10041', '中国人民公安大学');
INSERT INTO `tb_college` VALUES ('10002', '中国人民大学');
INSERT INTO `tb_college` VALUES ('11105', '中国人民武装警察部队学院');
INSERT INTO `tb_college` VALUES ('10033', '中国传媒大学');
INSERT INTO `tb_college` VALUES ('10019', '中国农业大学');
INSERT INTO `tb_college` VALUES ('10175', '中国刑事警察学院');
INSERT INTO `tb_college` VALUES ('12453', '中国劳动关系学院');
INSERT INTO `tb_college` VALUES ('10159', '中国医科大学');
INSERT INTO `tb_college` VALUES ('11415', '中国地质大学(北京)');
INSERT INTO `tb_college` VALUES ('10491', '中国地质大学(武汉)');
INSERT INTO `tb_college` VALUES ('10049', '中国戏曲学院');
INSERT INTO `tb_college` VALUES ('10053', '中国政法大学');
INSERT INTO `tb_college` VALUES ('10059', '中国民用航空学院');
INSERT INTO `tb_college` VALUES ('10624', '中国民用航空飞行学院');
INSERT INTO `tb_college` VALUES ('10423', '中国海洋大学');
INSERT INTO `tb_college` VALUES ('11414', '中国石油大学(北京)');
INSERT INTO `tb_college` VALUES ('10290', '中国矿业大学');
INSERT INTO `tb_college` VALUES ('11413', '中国矿业大学(北京)');
INSERT INTO `tb_college` VALUES ('10358', '中国科学技术大学');
INSERT INTO `tb_college` VALUES ('10355', '中国美术学院');
INSERT INTO `tb_college` VALUES ('10316', '中国药科大学');
INSERT INTO `tb_college` VALUES ('10356', '中国计量学院');
INSERT INTO `tb_college` VALUES ('11971', '中国防卫科技学院');
INSERT INTO `tb_college` VALUES ('11625', '中国青年政治学院');
INSERT INTO `tb_college` VALUES ('10046', '中国音乐学院');
INSERT INTO `tb_college` VALUES ('11972', '中央司法警官学院');
INSERT INTO `tb_college` VALUES ('10048', '中央戏剧学院');
INSERT INTO `tb_college` VALUES ('10052', '中央民族大学');
INSERT INTO `tb_college` VALUES ('10047', '中央美术学院');
INSERT INTO `tb_college` VALUES ('10034', '中央财经大学');
INSERT INTO `tb_college` VALUES ('10045', '中央音乐学院');
INSERT INTO `tb_college` VALUES ('10558', '中山大学');
INSERT INTO `tb_college` VALUES ('11068', '中州大学');
INSERT INTO `tb_college` VALUES ('10442', '临沂医学专科学校');
INSERT INTO `tb_college` VALUES ('10452', '临沂大学');
INSERT INTO `tb_college` VALUES ('10352', '丽水学院');
INSERT INTO `tb_college` VALUES ('11565', '乌鲁木齐职业大学');
INSERT INTO `tb_college` VALUES ('10649', '乐山师范学院');
INSERT INTO `tb_college` VALUES ('11955', '九江学院');
INSERT INTO `tb_college` VALUES ('11505', '九江职业大学');
INSERT INTO `tb_college` VALUES ('10680', '云南中医学院');
INSERT INTO `tb_college` VALUES ('11392', '云南公安高等专科学校');
INSERT INTO `tb_college` VALUES ('10676', '云南农业大学');
INSERT INTO `tb_college` VALUES ('10673', '云南大学');
INSERT INTO `tb_college` VALUES ('10681', '云南师范大学');
INSERT INTO `tb_college` VALUES ('10691', '云南民族学院');
INSERT INTO `tb_college` VALUES ('10690', '云南艺术学院');
INSERT INTO `tb_college` VALUES ('10689', '云南财贸学院');
INSERT INTO `tb_college` VALUES ('11349', '五邑大学');
INSERT INTO `tb_college` VALUES ('10890', '井冈山医学高等专科学校');
INSERT INTO `tb_college` VALUES ('10419', '井岗山师范学院');
INSERT INTO `tb_college` VALUES ('11963', '亳州师范高等专科学校');
INSERT INTO `tb_college` VALUES ('12740', '仙桃职业学院');
INSERT INTO `tb_college` VALUES ('11784', '仰恩大学');
INSERT INTO `tb_college` VALUES ('11347', '仲恺农业工程学院');
INSERT INTO `tb_college` VALUES ('10764', '伊犁师范学院');
INSERT INTO `tb_college` VALUES ('11444', '佳木斯大学');
INSERT INTO `tb_college` VALUES ('10096', '保定师范专科学校');
INSERT INTO `tb_college` VALUES ('11420', '保定金融高等专科学校');
INSERT INTO `tb_college` VALUES ('10686', '保山师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11326', '信阳农业高等专科学校');
INSERT INTO `tb_college` VALUES ('10477', '信阳师范学院');
INSERT INTO `tb_college` VALUES ('10238', '克山师范专科学校');
INSERT INTO `tb_college` VALUES ('10829', '公安海警学院');
INSERT INTO `tb_college` VALUES ('10977', '六盘水师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10734', '兰州医学院');
INSERT INTO `tb_college` VALUES ('10741', '兰州商学院');
INSERT INTO `tb_college` VALUES ('10730', '兰州大学');
INSERT INTO `tb_college` VALUES ('11807', '兰州工业学院');
INSERT INTO `tb_college` VALUES ('10737', '兰州师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10731', '兰州理工大学');
INSERT INTO `tb_college` VALUES ('10732', '兰州铁道学院');
INSERT INTO `tb_college` VALUES ('14103', '冀中职业学院');
INSERT INTO `tb_college` VALUES ('10640', '内江师范学院');
INSERT INTO `tb_college` VALUES ('11922', '内蒙古农业大学');
INSERT INTO `tb_college` VALUES ('10132', '内蒙古医学院');
INSERT INTO `tb_college` VALUES ('10126', '内蒙古大学');
INSERT INTO `tb_college` VALUES ('10128', '内蒙古工业大学');
INSERT INTO `tb_college` VALUES ('10135', '内蒙古师范大学');
INSERT INTO `tb_college` VALUES ('11947', '内蒙古民族大学');
INSERT INTO `tb_college` VALUES ('11709', '内蒙古民族高等专科学校');
INSERT INTO `tb_college` VALUES ('10127', '内蒙古科技大学');
INSERT INTO `tb_college` VALUES ('10139', '内蒙古财经学院');
INSERT INTO `tb_college` VALUES ('11662', '凉山大学');
INSERT INTO `tb_college` VALUES ('10133', '包头医学院');
INSERT INTO `tb_college` VALUES ('10137', '包头师范学院');
INSERT INTO `tb_college` VALUES ('10026', '北京中医药大学');
INSERT INTO `tb_college` VALUES ('10004', '北京交通大学');
INSERT INTO `tb_college` VALUES ('10043', '北京体育大学');
INSERT INTO `tb_college` VALUES ('10772', '北京信息工程学院');
INSERT INTO `tb_college` VALUES ('10020', '北京农学院');
INSERT INTO `tb_college` VALUES ('10010', '北京化工大学');
INSERT INTO `tb_college` VALUES ('10024', '北京协和医学院');
INSERT INTO `tb_college` VALUES ('10015', '北京印刷学院');
INSERT INTO `tb_college` VALUES ('10030', '北京外国语大学');
INSERT INTO `tb_college` VALUES ('10001', '北京大学');
INSERT INTO `tb_college` VALUES ('10005', '北京工业大学');
INSERT INTO `tb_college` VALUES ('11921', '北京工商大学');
INSERT INTO `tb_college` VALUES ('10027', '北京师范大学');
INSERT INTO `tb_college` VALUES ('10016', '北京建筑大学');
INSERT INTO `tb_college` VALUES ('10012', '北京服装学院');
INSERT INTO `tb_college` VALUES ('11232', '北京机械工业学院');
INSERT INTO `tb_college` VALUES ('10022', '北京林业大学');
INSERT INTO `tb_college` VALUES ('10037', '北京物资学院');
INSERT INTO `tb_college` VALUES ('10007', '北京理工大学');
INSERT INTO `tb_college` VALUES ('10018', '北京电子科技学院');
INSERT INTO `tb_college` VALUES ('10050', '北京电影学院');
INSERT INTO `tb_college` VALUES ('10017', '北京石油化工学院');
INSERT INTO `tb_college` VALUES ('10008', '北京科技大学');
INSERT INTO `tb_college` VALUES ('10031', '北京第二外国语学院');
INSERT INTO `tb_college` VALUES ('11417', '北京联合大学');
INSERT INTO `tb_college` VALUES ('10051', '北京舞蹈学院');
INSERT INTO `tb_college` VALUES ('10006', '北京航空航天大学');
INSERT INTO `tb_college` VALUES ('10032', '北京语言大学');
INSERT INTO `tb_college` VALUES ('10013', '北京邮电大学');
INSERT INTO `tb_college` VALUES ('11626', '北京青年政治学院');
INSERT INTO `tb_college` VALUES ('11923', '北华大学');
INSERT INTO `tb_college` VALUES ('11629', '北华航天工业学院');
INSERT INTO `tb_college` VALUES ('10009', '北方工业大学');
INSERT INTO `tb_college` VALUES ('10404', '华东交通大学');
INSERT INTO `tb_college` VALUES ('10269', '华东师范大学');
INSERT INTO `tb_college` VALUES ('10276', '华东政法学院');
INSERT INTO `tb_college` VALUES ('10251', '华东理工大学');
INSERT INTO `tb_college` VALUES ('10289', '华东船舶工业学院');
INSERT INTO `tb_college` VALUES ('10504', '华中农业大学');
INSERT INTO `tb_college` VALUES ('10511', '华中师范大学');
INSERT INTO `tb_college` VALUES ('13686', '华中师范大学武汉传媒学院');
INSERT INTO `tb_college` VALUES ('10487', '华中科技大学');
INSERT INTO `tb_college` VALUES ('10385', '华侨大学');
INSERT INTO `tb_college` VALUES ('10110', '华北工学院');
INSERT INTO `tb_college` VALUES ('19110', '华北工学院(分校)');
INSERT INTO `tb_college` VALUES ('10078', '华北水利水电大学');
INSERT INTO `tb_college` VALUES ('10090', '华北煤炭医学院');
INSERT INTO `tb_college` VALUES ('10079', '华北电力大学(保定)');
INSERT INTO `tb_college` VALUES ('10054', '华北电力大学(北京)');
INSERT INTO `tb_college` VALUES ('11104', '华北科技学院');
INSERT INTO `tb_college` VALUES ('10564', '华南农业大学');
INSERT INTO `tb_college` VALUES ('10574', '华南师范大学');
INSERT INTO `tb_college` VALUES ('10565', '华南热带农业大学');
INSERT INTO `tb_college` VALUES ('10561', '华南理工大学');
INSERT INTO `tb_college` VALUES ('10315', '南京中医药大学');
INSERT INTO `tb_college` VALUES ('10330', '南京体育学院');
INSERT INTO `tb_college` VALUES ('10300', '南京信息工程大学');
INSERT INTO `tb_college` VALUES ('10307', '南京农业大学');
INSERT INTO `tb_college` VALUES ('10301', '南京动力高等专科学校');
INSERT INTO `tb_college` VALUES ('10312', '南京医科大学');
INSERT INTO `tb_college` VALUES ('10284', '南京大学');
INSERT INTO `tb_college` VALUES ('11287', '南京审计学院');
INSERT INTO `tb_college` VALUES ('10291', '南京工业大学');
INSERT INTO `tb_college` VALUES ('11950', '南京工程学院');
INSERT INTO `tb_college` VALUES ('11290', '南京市农业专科学校');
INSERT INTO `tb_college` VALUES ('10319', '南京师范大学');
INSERT INTO `tb_college` VALUES ('11931', '南京晓庄学院');
INSERT INTO `tb_college` VALUES ('10298', '南京林业大学');
INSERT INTO `tb_college` VALUES ('11466', '南京森林公安高等专科学校');
INSERT INTO `tb_college` VALUES ('10288', '南京理工大学');
INSERT INTO `tb_college` VALUES ('10327', '南京经济学院');
INSERT INTO `tb_college` VALUES ('10287', '南京航空航天大学');
INSERT INTO `tb_college` VALUES ('10331', '南京艺术学院');
INSERT INTO `tb_college` VALUES ('10293', '南京邮电学院');
INSERT INTO `tb_college` VALUES ('10555', '南华大学');
INSERT INTO `tb_college` VALUES ('10604', '南宁师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10055', '南开大学');
INSERT INTO `tb_college` VALUES ('10407', '南方冶金学院');
INSERT INTO `tb_college` VALUES ('11902', '南昌大学');
INSERT INTO `tb_college` VALUES ('11319', '南昌水利水电高等专科学校');
INSERT INTO `tb_college` VALUES ('10406', '南昌航空工业学院');
INSERT INTO `tb_college` VALUES ('11322', '南昌高等专科学校');
INSERT INTO `tb_college` VALUES ('10311', '南通医学院');
INSERT INTO `tb_college` VALUES ('10304', '南通工学院');
INSERT INTO `tb_college` VALUES ('10325', '南通师范学院');
INSERT INTO `tb_college` VALUES ('11052', '南通职业大学');
INSERT INTO `tb_college` VALUES ('10481', '南阳师范学院');
INSERT INTO `tb_college` VALUES ('11653', '南阳理工学院');
INSERT INTO `tb_college` VALUES ('10384', '厦门大学');
INSERT INTO `tb_college` VALUES ('11062', '厦门理工学院');
INSERT INTO `tb_college` VALUES ('10350', '台州学院');
INSERT INTO `tb_college` VALUES ('10599', '右江民族医学院');
INSERT INTO `tb_college` VALUES ('10609', '右江民族师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11561', '合作民族师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11059', '合肥学院');
INSERT INTO `tb_college` VALUES ('10359', '合肥工业大学');
INSERT INTO `tb_college` VALUES ('10208', '吉林体育学院');
INSERT INTO `tb_college` VALUES ('11441', '吉林公安高等专科学校');
INSERT INTO `tb_college` VALUES ('10193', '吉林农业大学');
INSERT INTO `tb_college` VALUES ('10192', '吉林化工学院');
INSERT INTO `tb_college` VALUES ('10964', '吉林华桥外语职业学院');
INSERT INTO `tb_college` VALUES ('11262', '吉林商业高等专科学校');
INSERT INTO `tb_college` VALUES ('10183', '吉林大学');
INSERT INTO `tb_college` VALUES ('10204', '吉林工程技术师范学院');
INSERT INTO `tb_college` VALUES ('10203', '吉林师范大学');
INSERT INTO `tb_college` VALUES ('10191', '吉林建筑工程学院');
INSERT INTO `tb_college` VALUES ('11439', '吉林特产高等专科学校');
INSERT INTO `tb_college` VALUES ('11263', '吉林粮食高等专科学校');
INSERT INTO `tb_college` VALUES ('10209', '吉林艺术学院');
INSERT INTO `tb_college` VALUES ('11261', '吉林财税高等专科学校');
INSERT INTO `tb_college` VALUES ('10207', '吉林财经大学');
INSERT INTO `tb_college` VALUES ('10531', '吉首大学');
INSERT INTO `tb_college` VALUES ('10247', '同济大学');
INSERT INTO `tb_college` VALUES ('10812', '吕梁高等专科学校');
INSERT INTO `tb_college` VALUES ('10478', '周口师范学院');
INSERT INTO `tb_college` VALUES ('10819', '呼伦贝尔学院');
INSERT INTO `tb_college` VALUES ('10765', '和田师范专科学校');
INSERT INTO `tb_college` VALUES ('13265', '咸宁职业技术学院');
INSERT INTO `tb_college` VALUES ('10722', '咸阳师范学院');
INSERT INTO `tb_college` VALUES ('10242', '哈尔滨体育学院');
INSERT INTO `tb_college` VALUES ('10226', '哈尔滨医科大学');
INSERT INTO `tb_college` VALUES ('10240', '哈尔滨商业大学');
INSERT INTO `tb_college` VALUES ('11929', '哈尔滨学院');
INSERT INTO `tb_college` VALUES ('10213', '哈尔滨工业大学');
INSERT INTO `tb_college` VALUES ('10217', '哈尔滨工程大学');
INSERT INTO `tb_college` VALUES ('10231', '哈尔滨师范大学');
INSERT INTO `tb_college` VALUES ('11914', '哈尔滨理工大学');
INSERT INTO `tb_college` VALUES ('10245', '哈尔滨金融高等专科学校');
INSERT INTO `tb_college` VALUES ('11960', '唐山学院');
INSERT INTO `tb_college` VALUES ('10099', '唐山师范学院');
INSERT INTO `tb_college` VALUES ('10483', '商丘师范学院');
INSERT INTO `tb_college` VALUES ('11396', '商洛师范专科学校');
INSERT INTO `tb_college` VALUES ('10763', '喀什师范学院');
INSERT INTO `tb_college` VALUES ('11926', '嘉兴学院');
INSERT INTO `tb_college` VALUES ('10582', '嘉应学院');
INSERT INTO `tb_college` VALUES ('10626', '四川农业大学');
INSERT INTO `tb_college` VALUES ('10650', '四川外语学院');
INSERT INTO `tb_college` VALUES ('10610', '四川大学');
INSERT INTO `tb_college` VALUES ('10623', '四川工业学院');
INSERT INTO `tb_college` VALUES ('10636', '四川师范大学');
INSERT INTO `tb_college` VALUES ('11552', '四川烹饪高等专科学校');
INSERT INTO `tb_college` VALUES ('10655', '四川美术学院');
INSERT INTO `tb_college` VALUES ('11937', '四川警官高等专科学校');
INSERT INTO `tb_college` VALUES ('10622', '四川轻化工学院');
INSERT INTO `tb_college` VALUES ('10654', '四川音乐学院');
INSERT INTO `tb_college` VALUES ('11044', '四平职业大学');
INSERT INTO `tb_college` VALUES ('10042', '国际关系学院');
INSERT INTO `tb_college` VALUES ('10583', '培正商学院');
INSERT INTO `tb_college` VALUES ('10757', '塔里木大学');
INSERT INTO `tb_college` VALUES ('10246', '复旦大学');
INSERT INTO `tb_college` VALUES ('10040', '外交学院');
INSERT INTO `tb_college` VALUES ('10116', '大同医学专科学校');
INSERT INTO `tb_college` VALUES ('11243', '大同职业技术学院');
INSERT INTO `tb_college` VALUES ('10235', '大庆师范学院');
INSERT INTO `tb_college` VALUES ('10220', '大庆石油学院');
INSERT INTO `tb_college` VALUES ('10679', '大理学院');
INSERT INTO `tb_college` VALUES ('10161', '大连医科大学');
INSERT INTO `tb_college` VALUES ('10172', '大连外国语学院');
INSERT INTO `tb_college` VALUES ('11258', '大连大学');
INSERT INTO `tb_college` VALUES ('10152', '大连工业大学（原大连轻工业学院）');
INSERT INTO `tb_college` VALUES ('11257', '大连民族学院');
INSERT INTO `tb_college` VALUES ('10158', '大连水产学院');
INSERT INTO `tb_college` VALUES ('10151', '大连海事大学');
INSERT INTO `tb_college` VALUES ('10141', '大连理工大学');
INSERT INTO `tb_college` VALUES ('10150', '大连铁道学院');
INSERT INTO `tb_college` VALUES ('10739', '天水师范学院');
INSERT INTO `tb_college` VALUES ('10063', '天津中医学院');
INSERT INTO `tb_college` VALUES ('10071', '天津体育学院');
INSERT INTO `tb_college` VALUES ('10061', '天津农学院');
INSERT INTO `tb_college` VALUES ('11908', '天津医学高等专科学校');
INSERT INTO `tb_college` VALUES ('11904', '天津医科大学');
INSERT INTO `tb_college` VALUES ('10069', '天津商学院');
INSERT INTO `tb_college` VALUES ('10792', '天津城市建设学院');
INSERT INTO `tb_college` VALUES ('10068', '天津外国语学院');
INSERT INTO `tb_college` VALUES ('10056', '天津大学');
INSERT INTO `tb_college` VALUES ('10058', '天津工业大学');
INSERT INTO `tb_college` VALUES ('10065', '天津师范大学');
INSERT INTO `tb_college` VALUES ('10060', '天津理工大学');
INSERT INTO `tb_college` VALUES ('10057', '天津科技大学');
INSERT INTO `tb_college` VALUES ('10073', '天津美术学院');
INSERT INTO `tb_college` VALUES ('11032', '天津职业大学');
INSERT INTO `tb_college` VALUES ('10066', '天津职业技术师范学院');
INSERT INTO `tb_college` VALUES ('10070', '天津财经大学');
INSERT INTO `tb_college` VALUES ('10072', '天津音乐学院');
INSERT INTO `tb_college` VALUES ('14355', '天门职业学院');
INSERT INTO `tb_college` VALUES ('11242', '太原大学');
INSERT INTO `tb_college` VALUES ('10119', '太原师范学院');
INSERT INTO `tb_college` VALUES ('10112', '太原理工大学');
INSERT INTO `tb_college` VALUES ('10805', '太原电力高等专科学校');
INSERT INTO `tb_college` VALUES ('10109', '太原重型机械学院');
INSERT INTO `tb_college` VALUES ('10752', '宁夏医学院');
INSERT INTO `tb_college` VALUES ('10749', '宁夏大学宁夏农学院并入');
INSERT INTO `tb_college` VALUES ('10753', '宁夏师范学院（固原师范高等专科学校）');
INSERT INTO `tb_college` VALUES ('10398', '宁德师范学院');
INSERT INTO `tb_college` VALUES ('11646', '宁波大学');
INSERT INTO `tb_college` VALUES ('10372', '安庆师范学院');
INSERT INTO `tb_college` VALUES ('11397', '安康师范专科学校');
INSERT INTO `tb_college` VALUES ('10369', '安徽中医药大学');
INSERT INTO `tb_college` VALUES ('11968', '安徽中医药高等专科学校');
INSERT INTO `tb_college` VALUES ('10364', '安徽农业大学');
INSERT INTO `tb_college` VALUES ('11961', '安徽医学高等专科学校');
INSERT INTO `tb_college` VALUES ('10366', '安徽医科大学');
INSERT INTO `tb_college` VALUES ('10357', '安徽大学');
INSERT INTO `tb_college` VALUES ('10360', '安徽工业大学');
INSERT INTO `tb_college` VALUES ('10363', '安徽工程大学');
INSERT INTO `tb_college` VALUES ('10370', '安徽师范大学');
INSERT INTO `tb_college` VALUES ('10878', '安徽建筑大学');
INSERT INTO `tb_college` VALUES ('10361', '安徽理工大学');
INSERT INTO `tb_college` VALUES ('10879', '安徽科技学院');
INSERT INTO `tb_college` VALUES ('10378', '安徽财经大学');
INSERT INTO `tb_college` VALUES ('11330', '安阳大学');
INSERT INTO `tb_college` VALUES ('10479', '安阳师范学院');
INSERT INTO `tb_college` VALUES ('10667', '安顺师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10641', '宜宾学院');
INSERT INTO `tb_college` VALUES ('11938', '宜春学院');
INSERT INTO `tb_college` VALUES ('11905', '宝鸡文理学院');
INSERT INTO `tb_college` VALUES ('10379', '宿州学院');
INSERT INTO `tb_college` VALUES ('10036', '对外经济贸易大学');
INSERT INTO `tb_college` VALUES ('10441', '山东中医药大学');
INSERT INTO `tb_college` VALUES ('11510', '山东交通学院');
INSERT INTO `tb_college` VALUES ('10457', '山东体育学院');
INSERT INTO `tb_college` VALUES ('11324', '山东公安专科学校');
INSERT INTO `tb_college` VALUES ('10434', '山东农业大学');
INSERT INTO `tb_college` VALUES ('10422', '山东大学');
INSERT INTO `tb_college` VALUES ('11688', '山东工商学院');
INSERT INTO `tb_college` VALUES ('10908', '山东工艺美术学院');
INSERT INTO `tb_college` VALUES ('10445', '山东师范大学');
INSERT INTO `tb_college` VALUES ('10430', '山东建筑工程学院');
INSERT INTO `tb_college` VALUES ('14100', '山东政法学院');
INSERT INTO `tb_college` VALUES ('11323', '山东水利专科学校');
INSERT INTO `tb_college` VALUES ('11827', '山东电力高等专科学校');
INSERT INTO `tb_college` VALUES ('10424', '山东科技大学');
INSERT INTO `tb_college` VALUES ('10458', '山东艺术学院');
INSERT INTO `tb_college` VALUES ('11822', '山东财政学院');
INSERT INTO `tb_college` VALUES ('10456', '山东财经大学');
INSERT INTO `tb_college` VALUES ('10809', '山西中医学院');
INSERT INTO `tb_college` VALUES ('10113', '山西农业大学');
INSERT INTO `tb_college` VALUES ('10114', '山西医科大学');
INSERT INTO `tb_college` VALUES ('10108', '山西大学');
INSERT INTO `tb_college` VALUES ('10118', '山西师范大学');
INSERT INTO `tb_college` VALUES ('11566', '山西经济管理学院');
INSERT INTO `tb_college` VALUES ('11928', '山西警官高等专科学校');
INSERT INTO `tb_college` VALUES ('11630', '山西财政税务专科学校');
INSERT INTO `tb_college` VALUES ('10125', '山西财经大学');
INSERT INTO `tb_college` VALUES ('10634', '川北医学院');
INSERT INTO `tb_college` VALUES ('10380', '巢湖学院');
INSERT INTO `tb_college` VALUES ('11055', '常州工学院');
INSERT INTO `tb_college` VALUES ('10333', '常熟高等专科学校');
INSERT INTO `tb_college` VALUES ('11071', '平原大学');
INSERT INTO `tb_college` VALUES ('11765', '平顶山工学院');
INSERT INTO `tb_college` VALUES ('10919', '平顶山师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11110', '广东公安高等专科学校');
INSERT INTO `tb_college` VALUES ('10571', '广东医科大学');
INSERT INTO `tb_college` VALUES ('11846', '广东外语外贸大学');
INSERT INTO `tb_college` VALUES ('11911', '广东工业大学');
INSERT INTO `tb_college` VALUES ('10588', '广东技术师范学院');
INSERT INTO `tb_college` VALUES ('10573', '广东药科大学');
INSERT INTO `tb_college` VALUES ('10592', '广东财经大学');
INSERT INTO `tb_college` VALUES ('10572', '广州中医药大学');
INSERT INTO `tb_college` VALUES ('10585', '广州体育学院');
INSERT INTO `tb_college` VALUES ('10570', '广州医学院');
INSERT INTO `tb_college` VALUES ('11078', '广州大学');
INSERT INTO `tb_college` VALUES ('10586', '广州美术学院');
INSERT INTO `tb_college` VALUES ('11106', '广州航海高等专科学校');
INSERT INTO `tb_college` VALUES ('11540', '广州金融高等专科学校');
INSERT INTO `tb_college` VALUES ('10600', '广西中医学院');
INSERT INTO `tb_college` VALUES ('11350', '广西体育高等专科学校');
INSERT INTO `tb_college` VALUES ('10597', '广西农学院');
INSERT INTO `tb_college` VALUES ('10598', '广西医科大学');
INSERT INTO `tb_college` VALUES ('11351', '广西商业高等专科学校');
INSERT INTO `tb_college` VALUES ('10593', '广西大学');
INSERT INTO `tb_college` VALUES ('10594', '广西工学院');
INSERT INTO `tb_college` VALUES ('10602', '广西师范大学');
INSERT INTO `tb_college` VALUES ('10603', '广西师范学院');
INSERT INTO `tb_college` VALUES ('10608', '广西民族学院');
INSERT INTO `tb_college` VALUES ('10607', '广西艺术学院');
INSERT INTO `tb_college` VALUES ('11548', '广西财政高等专科学校');
INSERT INTO `tb_college` VALUES ('10738', '庆阳师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11661', '康定民族师范高等专科学校');
INSERT INTO `tb_college` VALUES ('14255', '廊坊东方职业技术学院');
INSERT INTO `tb_college` VALUES ('14335', '廊坊卫生职业学院');
INSERT INTO `tb_college` VALUES ('10100', '廊坊师范学院');
INSERT INTO `tb_college` VALUES ('14280', '廊坊燕京职业技术学院');
INSERT INTO `tb_college` VALUES ('13395', '廊坊职业技术学院');
INSERT INTO `tb_college` VALUES ('10715', '延安医学院');
INSERT INTO `tb_college` VALUES ('10719', '延安大学');
INSERT INTO `tb_college` VALUES ('10184', '延边大学');
INSERT INTO `tb_college` VALUES ('11069', '开封大学');
INSERT INTO `tb_college` VALUES ('10087', '张家口农业高等专科学校');
INSERT INTO `tb_college` VALUES ('10092', '张家口医学院');
INSERT INTO `tb_college` VALUES ('10097', '张家口师范专科学校');
INSERT INTO `tb_college` VALUES ('11053', '彭城职业大学');
INSERT INTO `tb_college` VALUES ('10313', '徐州医学院');
INSERT INTO `tb_college` VALUES ('10320', '徐州师范大学');
INSERT INTO `tb_college` VALUES ('10448', '德州学院');
INSERT INTO `tb_college` VALUES ('10124', '忻州师范学院');
INSERT INTO `tb_college` VALUES ('10548', '怀化学院');
INSERT INTO `tb_college` VALUES ('13037', '怀化职业技术学院');
INSERT INTO `tb_college` VALUES ('10685', '思茅师范高等专科学校');
INSERT INTO `tb_college` VALUES ('12347', '恩施职业技术学院');
INSERT INTO `tb_college` VALUES ('10581', '惠州大学');
INSERT INTO `tb_college` VALUES ('10577', '惠州学院');
INSERT INTO `tb_college` VALUES ('10633', '成都中医药大学');
INSERT INTO `tb_college` VALUES ('10653', '成都体育学院');
INSERT INTO `tb_college` VALUES ('10621', '成都信息工程学院');
INSERT INTO `tb_college` VALUES ('11559', '成都医学高等专科学校');
INSERT INTO `tb_college` VALUES ('11079', '成都大学');
INSERT INTO `tb_college` VALUES ('10648', '成都师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10616', '成都理工大学');
INSERT INTO `tb_college` VALUES ('11116', '成都电子机械高等专科学校');
INSERT INTO `tb_college` VALUES ('11553', '成都纺织高等专科学校');
INSERT INTO `tb_college` VALUES ('11117', '扬州大学');
INSERT INTO `tb_college` VALUES ('11462', '扬州市职业大学');
INSERT INTO `tb_college` VALUES ('10093', '承德医学院');
INSERT INTO `tb_college` VALUES ('14281', '承德护理职业学院');
INSERT INTO `tb_college` VALUES ('11777', '承德石油高等专科学校');
INSERT INTO `tb_college` VALUES ('10420', '抚州师范专科学校');
INSERT INTO `tb_college` VALUES ('10179', '抚顺师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11037', '抚顺职业技术学院');
INSERT INTO `tb_college` VALUES ('11360', '攀枝花学院');
INSERT INTO `tb_college` VALUES ('13262', '文华学院');
INSERT INTO `tb_college` VALUES ('11556', '文山师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10472', '新乡医学院');
INSERT INTO `tb_college` VALUES ('10916', '新乡师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11508', '新余高等专科学校');
INSERT INTO `tb_college` VALUES ('10758', '新疆农业大学');
INSERT INTO `tb_college` VALUES ('11925', '新疆医科大学');
INSERT INTO `tb_college` VALUES ('10755', '新疆大学');
INSERT INTO `tb_college` VALUES ('10994', '新疆工业高等专科学校');
INSERT INTO `tb_college` VALUES ('10762', '新疆师范大学');
INSERT INTO `tb_college` VALUES ('11818', '新疆维吾尔医学专科学校');
INSERT INTO `tb_college` VALUES ('10768', '新疆艺术学院');
INSERT INTO `tb_college` VALUES ('10995', '新疆警官高等专科学校');
INSERT INTO `tb_college` VALUES ('10766', '新疆财经学院');
INSERT INTO `tb_college` VALUES ('11557', '昆明冶金高等专科学校');
INSERT INTO `tb_college` VALUES ('10678', '昆明医科大学');
INSERT INTO `tb_college` VALUES ('11393', '昆明大学');
INSERT INTO `tb_college` VALUES ('10682', '昆明师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10674', '昆明理工大学');
INSERT INTO `tb_college` VALUES ('10997', '昌吉学院');
INSERT INTO `tb_college` VALUES ('10587', '星海音乐学院');
INSERT INTO `tb_college` VALUES ('10683', '昭通师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10122', '晋东南师范专科学校');
INSERT INTO `tb_college` VALUES ('10121', '晋中师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10408', '景德镇陶瓷学院');
INSERT INTO `tb_college` VALUES ('10894', '景德镇高等专科学校');
INSERT INTO `tb_college` VALUES ('10559', '暨南大学');
INSERT INTO `tb_college` VALUES ('10446', '曲阜师范大学');
INSERT INTO `tb_college` VALUES ('10684', '曲靖师范学院');
INSERT INTO `tb_college` VALUES ('10171', '朝阳师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11430', '本溪冶金高等专科学校');
INSERT INTO `tb_college` VALUES ('10346', '杭州师范大学');
INSERT INTO `tb_college` VALUES ('10336', '杭州电子科技大学');
INSERT INTO `tb_college` VALUES ('10904', '枣庄学院');
INSERT INTO `tb_college` VALUES ('11546', '柳州师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10601', '桂林医学院');
INSERT INTO `tb_college` VALUES ('10596', '桂林工学院');
INSERT INTO `tb_college` VALUES ('11824', '桂林师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11837', '桂林旅游高等专科学校');
INSERT INTO `tb_college` VALUES ('10595', '桂林电子工业学院');
INSERT INTO `tb_college` VALUES ('11825', '桂林航天工业高等专科学校');
INSERT INTO `tb_college` VALUES ('11838', '梧州师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11391', '楚雄师范学院');
INSERT INTO `tb_college` VALUES ('11395', '榆林高等专科学校');
INSERT INTO `tb_college` VALUES ('10397', '武夷学院');
INSERT INTO `tb_college` VALUES ('13241', '武昌工学院');
INSERT INTO `tb_college` VALUES ('12310', '武昌理工学院');
INSERT INTO `tb_college` VALUES ('12990', '武昌职业学院');
INSERT INTO `tb_college` VALUES ('12309', '武昌首义学院');
INSERT INTO `tb_college` VALUES ('11798', '武汉东湖学院');
INSERT INTO `tb_college` VALUES ('13264', '武汉交通职业学院');
INSERT INTO `tb_college` VALUES ('10522', '武汉体育学院');
INSERT INTO `tb_college` VALUES ('13253', '武汉体育学院体育科技学院');
INSERT INTO `tb_college` VALUES ('12989', '武汉信息传播职业技术学院');
INSERT INTO `tb_college` VALUES ('11654', '武汉商学院');
INSERT INTO `tb_college` VALUES ('12991', '武汉商贸职业学院');
INSERT INTO `tb_college` VALUES ('11796', '武汉城市职业学院');
INSERT INTO `tb_college` VALUES ('12988', '武汉外语外事职业学院');
INSERT INTO `tb_college` VALUES ('10486', '武汉大学');
INSERT INTO `tb_college` VALUES ('13188', '武汉大学珞珈学院');
INSERT INTO `tb_college` VALUES ('13634', '武汉学院');
INSERT INTO `tb_college` VALUES ('13795', '武汉工业职业技术学院');
INSERT INTO `tb_college` VALUES ('13242', '武汉工商学院');
INSERT INTO `tb_college` VALUES ('10490', '武汉工程大学');
INSERT INTO `tb_college` VALUES ('13239', '武汉工程大学邮电与信息工程学院');
INSERT INTO `tb_college` VALUES ('13664', '武汉工程科技学院');
INSERT INTO `tb_college` VALUES ('12738', '武汉工程职业技术学院');
INSERT INTO `tb_college` VALUES ('12369', '武汉工贸职业学院');
INSERT INTO `tb_college` VALUES ('13796', '武汉民政职业学院');
INSERT INTO `tb_college` VALUES ('10497', '武汉理工大学');
INSERT INTO `tb_college` VALUES ('13666', '武汉理工大学华夏学院');
INSERT INTO `tb_college` VALUES ('12362', '武汉生物工程学院');
INSERT INTO `tb_college` VALUES ('12981', '武汉电力职业技术学院');
INSERT INTO `tb_college` VALUES ('10488', '武汉科技大学');
INSERT INTO `tb_college` VALUES ('13235', '武汉科技大学城市学院');
INSERT INTO `tb_college` VALUES ('12987', '武汉科技职业学院');
INSERT INTO `tb_college` VALUES ('10495', '武汉纺织大学');
INSERT INTO `tb_college` VALUES ('13240', '武汉纺织大学外经贸学院');
INSERT INTO `tb_college` VALUES ('10834', '武汉职业技术学院');
INSERT INTO `tb_college` VALUES ('12952', '武汉航海职业技术学院');
INSERT INTO `tb_college` VALUES ('12052', '武汉船舶职业技术学院');
INSERT INTO `tb_college` VALUES ('12984', '武汉警官职业学院');
INSERT INTO `tb_college` VALUES ('14035', '武汉设计工程学院');
INSERT INTO `tb_college` VALUES ('12978', '武汉软件工程职业学院');
INSERT INTO `tb_college` VALUES ('10496', '武汉轻工大学');
INSERT INTO `tb_college` VALUES ('12977', '武汉铁路职业技术学院');
INSERT INTO `tb_college` VALUES ('11524', '武汉音乐学院');
INSERT INTO `tb_college` VALUES ('11126', '武警医学院');
INSERT INTO `tb_college` VALUES ('11665', '武警工程学院');
INSERT INTO `tb_college` VALUES ('11120', '武警部队专科学校');
INSERT INTO `tb_college` VALUES ('10668', '毕节师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11429', '民办内蒙古丰州学院');
INSERT INTO `tb_college` VALUES ('11114', '民办南华工商学院');
INSERT INTO `tb_college` VALUES ('11841', '民办四川天一学院');
INSERT INTO `tb_college` VALUES ('10868', '民办青岛滨海职业学院');
INSERT INTO `tb_college` VALUES ('11917', '民办黑龙江东方学院');
INSERT INTO `tb_college` VALUES ('11800', '汉口学院');
INSERT INTO `tb_college` VALUES ('10560', '汕头大学');
INSERT INTO `tb_college` VALUES ('10295', '江南大学');
INSERT INTO `tb_college` VALUES ('11072', '江汉大学');
INSERT INTO `tb_college` VALUES ('13237', '江汉大学文理学院');
INSERT INTO `tb_college` VALUES ('13793', '江汉艺术职业学院');
INSERT INTO `tb_college` VALUES ('10299', '江苏大学');
INSERT INTO `tb_college` VALUES ('10292', '江苏工业学院');
INSERT INTO `tb_college` VALUES ('11463', '江苏技术师范学院');
INSERT INTO `tb_college` VALUES ('12047', '江苏经贸职业技术学院');
INSERT INTO `tb_college` VALUES ('10329', '江苏警官学院');
INSERT INTO `tb_college` VALUES ('10412', '江西中医学院');
INSERT INTO `tb_college` VALUES ('11504', '江西公安专科学校');
INSERT INTO `tb_college` VALUES ('10410', '江西农业大学');
INSERT INTO `tb_college` VALUES ('10888', '江西医学院上饶分院');
INSERT INTO `tb_college` VALUES ('10892', '江西医学院抚州分院');
INSERT INTO `tb_college` VALUES ('10414', '江西师范大学');
INSERT INTO `tb_college` VALUES ('11318', '江西科技师范学院');
INSERT INTO `tb_college` VALUES ('10421', '江西财经大学');
INSERT INTO `tb_college` VALUES ('12941', '江西财经职业学院');
INSERT INTO `tb_college` VALUES ('11306', '池州学院');
INSERT INTO `tb_college` VALUES ('10176', '沈阳体育学院');
INSERT INTO `tb_college` VALUES ('10157', '沈阳农业大学');
INSERT INTO `tb_college` VALUES ('10149', '沈阳化工学院');
INSERT INTO `tb_college` VALUES ('10164', '沈阳医学院');
INSERT INTO `tb_college` VALUES ('11035', '沈阳大学');
INSERT INTO `tb_college` VALUES ('10142', '沈阳工业大学');
INSERT INTO `tb_college` VALUES ('19144', '沈阳工业学院(分校)');
INSERT INTO `tb_college` VALUES ('13201', '沈阳工学院');
INSERT INTO `tb_college` VALUES ('10166', '沈阳师范大学');
INSERT INTO `tb_college` VALUES ('10153', '沈阳建筑工程学院');
INSERT INTO `tb_college` VALUES ('10144', '沈阳理工大学');
INSERT INTO `tb_college` VALUES ('11632', '沈阳电力高等专科学校');
INSERT INTO `tb_college` VALUES ('10143', '沈阳航空航天大学');
INSERT INTO `tb_college` VALUES ('10163', '沈阳药科大学');
INSERT INTO `tb_college` VALUES ('10177', '沈阳音乐学院');
INSERT INTO `tb_college` VALUES ('11288', '沙洲职业工学院');
INSERT INTO `tb_college` VALUES ('10105', '沧州师范专科学校');
INSERT INTO `tb_college` VALUES ('12415', '沧州职业技术学院');
INSERT INTO `tb_college` VALUES ('13071', '河北交通职业技术学院');
INSERT INTO `tb_college` VALUES ('12784', '河北传媒学院');
INSERT INTO `tb_college` VALUES ('11236', '河北体育学院');
INSERT INTO `tb_college` VALUES ('11920', '河北农业大学');
INSERT INTO `tb_college` VALUES ('14208', '河北劳动关系职业学院');
INSERT INTO `tb_college` VALUES ('13072', '河北化工医药职业技术学院');
INSERT INTO `tb_college` VALUES ('11919', '河北医科大学');
INSERT INTO `tb_college` VALUES ('13690', '河北司法警官职业学院');
INSERT INTO `tb_college` VALUES ('10098', '河北名族师范学院');
INSERT INTO `tb_college` VALUES ('50139', '河北地质职工大学');
INSERT INTO `tb_college` VALUES ('10075', '河北大学');
INSERT INTO `tb_college` VALUES ('13822', '河北女子职业技术学院');
INSERT INTO `tb_college` VALUES ('10080', '河北工业大学');
INSERT INTO `tb_college` VALUES ('10085', '河北工程技术高等专科学校');
INSERT INTO `tb_college` VALUES ('10094', '河北师范大学');
INSERT INTO `tb_college` VALUES ('12389', '河北建材职业技术学院');
INSERT INTO `tb_college` VALUES ('10084', '河北建筑工程学院');
INSERT INTO `tb_college` VALUES ('10076', '河北建筑科技学院');
INSERT INTO `tb_college` VALUES ('12887', '河北旅游职业学院');
INSERT INTO `tb_college` VALUES ('13393', '河北机电职业技术学院');
INSERT INTO `tb_college` VALUES ('12367', '河北石油职业技术学院');
INSERT INTO `tb_college` VALUES ('10082', '河北科技大学');
INSERT INTO `tb_college` VALUES ('10798', '河北科技师范学院');
INSERT INTO `tb_college` VALUES ('11918', '河北经贸大学');
INSERT INTO `tb_college` VALUES ('10081', '河北联合大学');
INSERT INTO `tb_college` VALUES ('12418', '河北能源职业技术学院');
INSERT INTO `tb_college` VALUES ('12352', '河北软件职业技术学院');
INSERT INTO `tb_college` VALUES ('10471', '河南中医学院');
INSERT INTO `tb_college` VALUES ('11788', '河南公安高等专科学校');
INSERT INTO `tb_college` VALUES ('10466', '河南农业大学');
INSERT INTO `tb_college` VALUES ('11651', '河南商业高等专科学校');
INSERT INTO `tb_college` VALUES ('10475', '河南大学');
INSERT INTO `tb_college` VALUES ('10463', '河南工业大学');
INSERT INTO `tb_college` VALUES ('10476', '河南师范大学');
INSERT INTO `tb_college` VALUES ('11329', '河南机电高等专科学校');
INSERT INTO `tb_college` VALUES ('10460', '河南理工大学院');
INSERT INTO `tb_college` VALUES ('10464', '河南科技大学');
INSERT INTO `tb_college` VALUES ('11517', '河南纺织高等专科学校');
INSERT INTO `tb_college` VALUES ('10467', '河南职业技术师范学院');
INSERT INTO `tb_college` VALUES ('11652', '河南财政税务高等专科学校');
INSERT INTO `tb_college` VALUES ('10484', '河南财经政法大学');
INSERT INTO `tb_college` VALUES ('11631', '河套大学');
INSERT INTO `tb_college` VALUES ('10605', '河池师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10294', '河海大学');
INSERT INTO `tb_college` VALUES ('10740', '河西学院');
INSERT INTO `tb_college` VALUES ('10399', '泉州师范学院');
INSERT INTO `tb_college` VALUES ('14259', '泊头职业学院');
INSERT INTO `tb_college` VALUES ('10439', '泰山医学院');
INSERT INTO `tb_college` VALUES ('10453', '泰山学院');
INSERT INTO `tb_college` VALUES ('10632', '泸州医学院');
INSERT INTO `tb_college` VALUES ('11070', '洛阳大学');
INSERT INTO `tb_college` VALUES ('11515', '洛阳工业高等专科学校');
INSERT INTO `tb_college` VALUES ('10482', '洛阳师范学院');
INSERT INTO `tb_college` VALUES ('10427', '济南大学');
INSERT INTO `tb_college` VALUES ('10443', '济宁医学院');
INSERT INTO `tb_college` VALUES ('10454', '济宁学院');
INSERT INTO `tb_college` VALUES ('10876', '浙江万里学院');
INSERT INTO `tb_college` VALUES ('10344', '浙江中医药大学');
INSERT INTO `tb_college` VALUES ('11647', '浙江传媒学院');
INSERT INTO `tb_college` VALUES ('10341', '浙江农林大学');
INSERT INTO `tb_college` VALUES ('11956', '浙江医药高等专科学校');
INSERT INTO `tb_college` VALUES ('10335', '浙江大学');
INSERT INTO `tb_college` VALUES ('10337', '浙江工业大学');
INSERT INTO `tb_college` VALUES ('10353', '浙江工商大学');
INSERT INTO `tb_college` VALUES ('10345', '浙江师范大学');
INSERT INTO `tb_college` VALUES ('11842', '浙江树人学院');
INSERT INTO `tb_college` VALUES ('11481', '浙江水利水电学院');
INSERT INTO `tb_college` VALUES ('10340', '浙江海洋学院');
INSERT INTO `tb_college` VALUES ('10338', '浙江理工大学');
INSERT INTO `tb_college` VALUES ('11057', '浙江科技学院');
INSERT INTO `tb_college` VALUES ('43321', '浙江经贸职业技术学院');
INSERT INTO `tb_college` VALUES ('11483', '浙江警察学院');
INSERT INTO `tb_college` VALUES ('11482', '浙江财经大学');
INSERT INTO `tb_college` VALUES ('11810', '海南医学院');
INSERT INTO `tb_college` VALUES ('10589', '海南大学');
INSERT INTO `tb_college` VALUES ('11658', '海南师范大学');
INSERT INTO `tb_college` VALUES ('11100', '海南热带海洋学院');
INSERT INTO `tb_college` VALUES ('11418', '海淀走读大学');
INSERT INTO `tb_college` VALUES ('10647', '涪陵师范学院');
INSERT INTO `tb_college` VALUES ('10373', '淮北师范大学');
INSERT INTO `tb_college` VALUES ('10381', '淮南师范学院');
INSERT INTO `tb_college` VALUES ('11308', '淮南联合大学');
INSERT INTO `tb_college` VALUES ('11641', '淮海工学院');
INSERT INTO `tb_college` VALUES ('11049', '淮阴工学院');
INSERT INTO `tb_college` VALUES ('10323', '淮阴师范学院');
INSERT INTO `tb_college` VALUES ('12957', '深圳信息职业技术学院');
INSERT INTO `tb_college` VALUES ('10590', '深圳大学');
INSERT INTO `tb_college` VALUES ('11113', '深圳职业技术学院');
INSERT INTO `tb_college` VALUES ('10003', '清华大学');
INSERT INTO `tb_college` VALUES ('11356', '渝州大学');
INSERT INTO `tb_college` VALUES ('10642', '渝西学院');
INSERT INTO `tb_college` VALUES ('13394', '渤海石油职业学院');
INSERT INTO `tb_college` VALUES ('10343', '温州医科大学');
INSERT INTO `tb_college` VALUES ('11292', '温州大学');
INSERT INTO `tb_college` VALUES ('10723', '渭南师范学院');
INSERT INTO `tb_college` VALUES ('12979', '湖北三峡职业技术学院');
INSERT INTO `tb_college` VALUES ('10507', '湖北中医药大学');
INSERT INTO `tb_college` VALUES ('12951', '湖北中医药高等专科学校');
INSERT INTO `tb_college` VALUES ('12752', '湖北交通职业技术学院');
INSERT INTO `tb_college` VALUES ('14356', '湖北体育职业学院');
INSERT INTO `tb_college` VALUES ('10929', '湖北医药学院');
INSERT INTO `tb_college` VALUES ('13249', '湖北医药学院药护学院');
INSERT INTO `tb_college` VALUES ('13247', '湖北商贸学院');
INSERT INTO `tb_college` VALUES ('13800', '湖北国土资源职业学院');
INSERT INTO `tb_college` VALUES ('12983', '湖北城市建设职业技术学院');
INSERT INTO `tb_college` VALUES ('10512', '湖北大学');
INSERT INTO `tb_college` VALUES ('13234', '湖北大学知行学院');
INSERT INTO `tb_college` VALUES ('10500', '湖北工业大学');
INSERT INTO `tb_college` VALUES ('13238', '湖北工业大学工程技术学院');
INSERT INTO `tb_college` VALUES ('11334', '湖北工业职业技术学院');
INSERT INTO `tb_college` VALUES ('10528', '湖北工程学院');
INSERT INTO `tb_college` VALUES ('13258', '湖北工程学院新技术学院');
INSERT INTO `tb_college` VALUES ('14197', '湖北工程职业学院');
INSERT INTO `tb_college` VALUES ('10513', '湖北师范学院');
INSERT INTO `tb_college` VALUES ('13256', '湖北师范学院文理学院');
INSERT INTO `tb_college` VALUES ('14467', '湖北幼儿师范高等专科学校');
INSERT INTO `tb_college` VALUES ('12986', '湖北开放职业学院');
INSERT INTO `tb_college` VALUES ('10519', '湖北文理学院');
INSERT INTO `tb_college` VALUES ('13257', '湖北文理学院理工学院');
INSERT INTO `tb_college` VALUES ('10517', '湖北民族学院');
INSERT INTO `tb_college` VALUES ('13250', '湖北民族学院科技学院');
INSERT INTO `tb_college` VALUES ('12982', '湖北水利水电职业技术学院');
INSERT INTO `tb_college` VALUES ('10525', '湖北汽车工业学院');
INSERT INTO `tb_college` VALUES ('13248', '湖北汽车工业学院科技学院');
INSERT INTO `tb_college` VALUES ('10920', '湖北理工学院');
INSERT INTO `tb_college` VALUES ('13801', '湖北生态工程职业技术学院');
INSERT INTO `tb_college` VALUES ('12985', '湖北生物科技职业学院');
INSERT INTO `tb_college` VALUES ('10927', '湖北科技学院');
INSERT INTO `tb_college` VALUES ('14119', '湖北科技职业学院');
INSERT INTO `tb_college` VALUES ('14099', '湖北第二师范学院');
INSERT INTO `tb_college` VALUES ('11600', '湖北经济学院');
INSERT INTO `tb_college` VALUES ('13251', '湖北经济学院法商学院');
INSERT INTO `tb_college` VALUES ('10523', '湖北美术学院');
INSERT INTO `tb_college` VALUES ('12051', '湖北职业技术学院');
INSERT INTO `tb_college` VALUES ('13263', '湖北艺术职业学院');
INSERT INTO `tb_college` VALUES ('11332', '湖北警官学院');
INSERT INTO `tb_college` VALUES ('13798', '湖北财税职业学院');
INSERT INTO `tb_college` VALUES ('12744', '湖北轻工职业技术学院');
INSERT INTO `tb_college` VALUES ('14120', '湖北青年职业学院');
INSERT INTO `tb_college` VALUES ('10541', '湖南中医药大学');
INSERT INTO `tb_college` VALUES ('10553', '湖南人文科技学院');
INSERT INTO `tb_college` VALUES ('10537', '湖南农业大学');
INSERT INTO `tb_college` VALUES ('10554', '湖南商学院');
INSERT INTO `tb_college` VALUES ('11966', '湖南城市学院');
INSERT INTO `tb_college` VALUES ('10532', '湖南大学');
INSERT INTO `tb_college` VALUES ('11538', '湖南女子学院');
INSERT INTO `tb_college` VALUES ('11535', '湖南工业大学');
INSERT INTO `tb_college` VALUES ('11528', '湖南工学院');
INSERT INTO `tb_college` VALUES ('11949', '湖南工程学院');
INSERT INTO `tb_college` VALUES ('10542', '湖南师范大学');
INSERT INTO `tb_college` VALUES ('10549', '湖南文理学院');
INSERT INTO `tb_college` VALUES ('10543', '湖南理工学院');
INSERT INTO `tb_college` VALUES ('10534', '湖南科技大学');
INSERT INTO `tb_college` VALUES ('11601', '湖南税务高等专科学校');
INSERT INTO `tb_college` VALUES ('11534', '湖南警察学院');
INSERT INTO `tb_college` VALUES ('11532', '湖南财政经济学院');
INSERT INTO `tb_college` VALUES ('10347', '湖州师范学院');
INSERT INTO `tb_college` VALUES ('10545', '湘南学院');
INSERT INTO `tb_college` VALUES ('10530', '湘潭大学');
INSERT INTO `tb_college` VALUES ('10579', '湛江师范学院');
INSERT INTO `tb_college` VALUES ('10566', '湛江海洋大学');
INSERT INTO `tb_college` VALUES ('10377', '滁州学院');
INSERT INTO `tb_college` VALUES ('10440', '滨州医学院');
INSERT INTO `tb_college` VALUES ('10449', '滨州学院');
INSERT INTO `tb_college` VALUES ('10402', '漳州师范学院');
INSERT INTO `tb_college` VALUES ('10438', '潍坊医学院');
INSERT INTO `tb_college` VALUES ('11067', '潍坊学院');
INSERT INTO `tb_college` VALUES ('11066', '烟台大学');
INSERT INTO `tb_college` VALUES ('11522', '焦作大学');
INSERT INTO `tb_college` VALUES ('11967', '焦作师范高等专科学校');
INSERT INTO `tb_college` VALUES ('13895', '燕京理工学院');
INSERT INTO `tb_college` VALUES ('10216', '燕山大学');
INSERT INTO `tb_college` VALUES ('10229', '牡丹江医学院');
INSERT INTO `tb_college` VALUES ('11046', '牡丹江大学');
INSERT INTO `tb_college` VALUES ('10606', '玉林师范学院');
INSERT INTO `tb_college` VALUES ('11390', '玉溪师范学院');
INSERT INTO `tb_college` VALUES ('10735', '甘肃中医学院');
INSERT INTO `tb_college` VALUES ('10733', '甘肃农业大学');
INSERT INTO `tb_college` VALUES ('11406', '甘肃政法学院');
INSERT INTO `tb_college` VALUES ('11562', '甘肃联合大学');
INSERT INTO `tb_college` VALUES ('10614', '电子科技大学');
INSERT INTO `tb_college` VALUES ('10206', '白城师范学院');
INSERT INTO `tb_college` VALUES ('10368', '皖南医学院');
INSERT INTO `tb_college` VALUES ('11932', '皖西学院');
INSERT INTO `tb_college` VALUES ('10305', '盐城工学院');
INSERT INTO `tb_college` VALUES ('10324', '盐城师范学院');
INSERT INTO `tb_college` VALUES ('14158', '石家庄人民医学高等专科学校');
INSERT INTO `tb_college` VALUES ('12796', '石家庄城市职业学院（原石家庄法商职业学院）');
INSERT INTO `tb_college` VALUES ('10102', '石家庄师范专科学校');
INSERT INTO `tb_college` VALUES ('13400', '石家庄理工职业学院');
INSERT INTO `tb_college` VALUES ('14185', '石家庄科技工程职业学院');
INSERT INTO `tb_college` VALUES ('14213', '石家庄科技职业学院');
INSERT INTO `tb_college` VALUES ('10077', '石家庄经济学院');
INSERT INTO `tb_college` VALUES ('13070', '石家庄财经职业学院');
INSERT INTO `tb_college` VALUES ('10107', '石家庄铁道大学');
INSERT INTO `tb_college` VALUES ('10759', '石河子大学');
INSERT INTO `tb_college` VALUES ('10425', '石油大学(华东)');
INSERT INTO `tb_college` VALUES ('10386', '福州大学');
INSERT INTO `tb_college` VALUES ('10393', '福建中医学院');
INSERT INTO `tb_college` VALUES ('11948', '福建农林大学');
INSERT INTO `tb_college` VALUES ('10392', '福建医科大学');
INSERT INTO `tb_college` VALUES ('11499', '福建华南女子职业学院');
INSERT INTO `tb_college` VALUES ('11313', '福建商业高等专科学校');
INSERT INTO `tb_college` VALUES ('10388', '福建工程学院');
INSERT INTO `tb_college` VALUES ('10394', '福建师范大学');
INSERT INTO `tb_college` VALUES ('11495', '福建警察学院');
INSERT INTO `tb_college` VALUES ('11121', '私立华联学院');
INSERT INTO `tb_college` VALUES ('11047', '立信会计高等专科学校');
INSERT INTO `tb_college` VALUES ('10349', '绍兴文理学院');
INSERT INTO `tb_college` VALUES ('10236', '绥化学院');
INSERT INTO `tb_college` VALUES ('10639', '绵阳师范学院');
INSERT INTO `tb_college` VALUES ('10447', '聊城大学');
INSERT INTO `tb_college` VALUES ('10580', '肇庆学院');
INSERT INTO `tb_college` VALUES ('11357', '自贡师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11839', '自贡高等专科学校');
INSERT INTO `tb_college` VALUES ('10374', '芜湖师范专科学校');
INSERT INTO `tb_college` VALUES ('10296', '苏州丝绸工学院');
INSERT INTO `tb_college` VALUES ('10285', '苏州大学');
INSERT INTO `tb_college` VALUES ('11951', '苏州科技学院');
INSERT INTO `tb_college` VALUES ('11054', '苏州职业大学');
INSERT INTO `tb_college` VALUES ('11656', '茂名学院');
INSERT INTO `tb_college` VALUES ('11074', '荆州理工职业学院');
INSERT INTO `tb_college` VALUES ('12737', '荆州职业技术学院');
INSERT INTO `tb_college` VALUES ('11336', '荆楚理工学院');
INSERT INTO `tb_college` VALUES ('11498', '莆田学院');
INSERT INTO `tb_college` VALUES ('10444', '菏泽医学专科学校');
INSERT INTO `tb_college` VALUES ('10455', '菏泽学院');
INSERT INTO `tb_college` VALUES ('10895', '萍乡高等专科学校');
INSERT INTO `tb_college` VALUES ('10687', '蒙自师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10367', '蚌埠医学院');
INSERT INTO `tb_college` VALUES ('11305', '蚌埠学院');
INSERT INTO `tb_college` VALUES ('10101', '衡水师范专科学校');
INSERT INTO `tb_college` VALUES ('10546', '衡阳师范学院');
INSERT INTO `tb_college` VALUES ('14357', '襄阳汽车职业技术学院');
INSERT INTO `tb_college` VALUES ('12354', '襄阳职业技术学院');
INSERT INTO `tb_college` VALUES ('11924', '西北农林科技大学');
INSERT INTO `tb_college` VALUES ('10697', '西北大学');
INSERT INTO `tb_college` VALUES ('10699', '西北工业大学');
INSERT INTO `tb_college` VALUES ('10736', '西北师范大学');
INSERT INTO `tb_college` VALUES ('10726', '西北政法学院');
INSERT INTO `tb_college` VALUES ('10742', '西北民族学院');
INSERT INTO `tb_college` VALUES ('11407', '西北第二民族学院');
INSERT INTO `tb_college` VALUES ('10638', '西华师范大学');
INSERT INTO `tb_college` VALUES ('10613', '西南交通大学');
INSERT INTO `tb_college` VALUES ('10625', '西南农业大学');
INSERT INTO `tb_college` VALUES ('10635', '西南师范大学');
INSERT INTO `tb_college` VALUES ('10652', '西南政法大学');
INSERT INTO `tb_college` VALUES ('10677', '西南林学院');
INSERT INTO `tb_college` VALUES ('10656', '西南民族学院');
INSERT INTO `tb_college` VALUES ('10615', '西南石油学院');
INSERT INTO `tb_college` VALUES ('10619', '西南科技大学');
INSERT INTO `tb_college` VALUES ('10651', '西南财经大学');
INSERT INTO `tb_college` VALUES ('10698', '西安交通大学');
INSERT INTO `tb_college` VALUES ('10727', '西安体育学院');
INSERT INTO `tb_college` VALUES ('11400', '西安培华女子大学');
INSERT INTO `tb_college` VALUES ('10724', '西安外国语学院');
INSERT INTO `tb_college` VALUES ('10702', '西安工业大学');
INSERT INTO `tb_college` VALUES ('10709', '西安工程科技学院');
INSERT INTO `tb_college` VALUES ('10703', '西安建筑科技大学');
INSERT INTO `tb_college` VALUES ('10700', '西安理工大学');
INSERT INTO `tb_college` VALUES ('11826', '西安电力高等专科学校');
INSERT INTO `tb_college` VALUES ('10701', '西安电子科技大学');
INSERT INTO `tb_college` VALUES ('10705', '西安石油学院');
INSERT INTO `tb_college` VALUES ('10704', '西安科技大学');
INSERT INTO `tb_college` VALUES ('10729', '西安美术学院');
INSERT INTO `tb_college` VALUES ('11080', '西安联合大学');
INSERT INTO `tb_college` VALUES ('11736', '西安航空技术高等专科学校');
INSERT INTO `tb_college` VALUES ('11664', '西安邮电大学');
INSERT INTO `tb_college` VALUES ('10728', '西安音乐学院');
INSERT INTO `tb_college` VALUES ('10628', '西昌农业高等专科学校');
INSERT INTO `tb_college` VALUES ('10645', '西昌师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10694', '西藏大学');
INSERT INTO `tb_college` VALUES ('10695', '西藏民族学院');
INSERT INTO `tb_college` VALUES ('10696', '西藏藏医学院');
INSERT INTO `tb_college` VALUES ('10480', '许昌学院');
INSERT INTO `tb_college` VALUES ('10659', '贵州农学院');
INSERT INTO `tb_college` VALUES ('10657', '贵州大学');
INSERT INTO `tb_college` VALUES ('10658', '贵州工业大学');
INSERT INTO `tb_college` VALUES ('10663', '贵州师范大学');
INSERT INTO `tb_college` VALUES ('10672', '贵州民族学院');
INSERT INTO `tb_college` VALUES ('10671', '贵州财经学院');
INSERT INTO `tb_college` VALUES ('10662', '贵阳中医学院');
INSERT INTO `tb_college` VALUES ('10660', '贵阳医学院');
INSERT INTO `tb_college` VALUES ('10976', '贵阳师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10413', '赣南医学院');
INSERT INTO `tb_college` VALUES ('10418', '赣南师范学院');
INSERT INTO `tb_college` VALUES ('13873', '赣西科技职业学院');
INSERT INTO `tb_college` VALUES ('10138', '赤峰民族师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10162', '辽宁中医学院');
INSERT INTO `tb_college` VALUES ('11500', '辽宁交通高等专科学校');
INSERT INTO `tb_college` VALUES ('11248', '辽宁农业职业技术学院');
INSERT INTO `tb_college` VALUES ('10140', '辽宁大学');
INSERT INTO `tb_college` VALUES ('10154', '辽宁工学院');
INSERT INTO `tb_college` VALUES ('10147', '辽宁工程技术大学');
INSERT INTO `tb_college` VALUES ('10165', '辽宁师范大学');
INSERT INTO `tb_college` VALUES ('10148', '辽宁石油化工大学');
INSERT INTO `tb_college` VALUES ('11735', '辽宁税务高等专科学校');
INSERT INTO `tb_college` VALUES ('11432', '辽宁警官高等专科学校');
INSERT INTO `tb_college` VALUES ('11779', '辽宁财政高等专科学校');
INSERT INTO `tb_college` VALUES ('10644', '达县师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10123', '运城学院');
INSERT INTO `tb_college` VALUES ('11939', '连云港师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10202', '通化师范学院');
INSERT INTO `tb_college` VALUES ('10661', '遵义医学院');
INSERT INTO `tb_college` VALUES ('10664', '遵义师范学院');
INSERT INTO `tb_college` VALUES ('11549', '邕江大学');
INSERT INTO `tb_college` VALUES ('11964', '邢台医学高等专科学校');
INSERT INTO `tb_college` VALUES ('10104', '邢台学院');
INSERT INTO `tb_college` VALUES ('11821', '邢台职业技术学院');
INSERT INTO `tb_college` VALUES ('10795', '邯郸农业高等专科学校');
INSERT INTO `tb_college` VALUES ('10796', '邯郸医学高等专科学校');
INSERT INTO `tb_college` VALUES ('10103', '邯郸师范专科学校');
INSERT INTO `tb_college` VALUES ('11962', '邵阳学院');
INSERT INTO `tb_college` VALUES ('10459', '郑州大学');
INSERT INTO `tb_college` VALUES ('11327', '郑州工业高等专科学校');
INSERT INTO `tb_college` VALUES ('11969', '郑州师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11907', '郑州澍青医学高等专科学校');
INSERT INTO `tb_college` VALUES ('10469', '郑州牧业工程高等专科学校');
INSERT INTO `tb_college` VALUES ('11828', '郑州电力高等专科学校');
INSERT INTO `tb_college` VALUES ('10485', '郑州航空工业管理学院');
INSERT INTO `tb_college` VALUES ('10462', '郑州轻工业学院');
INSERT INTO `tb_college` VALUES ('10518', '郧阳师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11836', '郴州医学高等专科学校');
INSERT INTO `tb_college` VALUES ('13797', '鄂东职业技术学院');
INSERT INTO `tb_college` VALUES ('11335', '鄂州职业大学');
INSERT INTO `tb_college` VALUES ('10643', '重庆三峡学院');
INSERT INTO `tb_college` VALUES ('10618', '重庆交通大学');
INSERT INTO `tb_college` VALUES ('10631', '重庆医科大学');
INSERT INTO `tb_college` VALUES ('11799', '重庆商学院');
INSERT INTO `tb_college` VALUES ('10611', '重庆大学');
INSERT INTO `tb_college` VALUES ('11551', '重庆工业高等专科学校');
INSERT INTO `tb_college` VALUES ('11660', '重庆工学院');
INSERT INTO `tb_college` VALUES ('10637', '重庆师范学院');
INSERT INTO `tb_college` VALUES ('11916', '重庆电力高等专科学校');
INSERT INTO `tb_college` VALUES ('11829', '重庆石油高等专科学校');
INSERT INTO `tb_college` VALUES ('10617', '重庆邮电大学');
INSERT INTO `tb_college` VALUES ('11048', '金陵职业大学');
INSERT INTO `tb_college` VALUES ('11607', '钦州师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10182', '铁岭师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10665', '铜仁师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10383', '铜陵学院');
INSERT INTO `tb_college` VALUES ('10160', '锦州医学院');
INSERT INTO `tb_college` VALUES ('10167', '锦州师范学院');
INSERT INTO `tb_college` VALUES ('10180', '锦州师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11051', '镇江市高等专科学校');
INSERT INTO `tb_college` VALUES ('10710', '长安大学');
INSERT INTO `tb_college` VALUES ('10199', '长春中医学院');
INSERT INTO `tb_college` VALUES ('11823', '长春医学高等专科学校');
INSERT INTO `tb_college` VALUES ('11726', '长春大学');
INSERT INTO `tb_college` VALUES ('10190', '长春工业大学');
INSERT INTO `tb_college` VALUES ('11927', '长春工程学院');
INSERT INTO `tb_college` VALUES ('10205', '长春师范学院');
INSERT INTO `tb_college` VALUES ('11436', '长春汽车工业高等专科学校');
INSERT INTO `tb_college` VALUES ('10186', '长春理工大学');
INSERT INTO `tb_college` VALUES ('11440', '长春金融高等专科学校');
INSERT INTO `tb_college` VALUES ('10489', '长江大学');
INSERT INTO `tb_college` VALUES ('13245', '长江大学工程技术学院');
INSERT INTO `tb_college` VALUES ('13246', '长江大学文理学院');
INSERT INTO `tb_college` VALUES ('13266', '长江工程职业技术学院');
INSERT INTO `tb_college` VALUES ('10956', '长江职业学院');
INSERT INTO `tb_college` VALUES ('11077', '长沙学院');
INSERT INTO `tb_college` VALUES ('10536', '长沙理工大学');
INSERT INTO `tb_college` VALUES ('11850', '长沙航空职业技术学院');
INSERT INTO `tb_college` VALUES ('10117', '长治医学院');
INSERT INTO `tb_college` VALUES ('10395', '闽江学院');
INSERT INTO `tb_college` VALUES ('11315', '闽西职业大学');
INSERT INTO `tb_college` VALUES ('11250', '阜新高等专科学校');
INSERT INTO `tb_college` VALUES ('10233', '阜阳师范学院');
INSERT INTO `tb_college` VALUES ('11775', '防灾科技学院');
INSERT INTO `tb_college` VALUES ('10646', '阿坝师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10716', '陕西中医学院');
INSERT INTO `tb_college` VALUES ('11840', '陕西医学高等专科学校');
INSERT INTO `tb_college` VALUES ('10718', '陕西师范大学');
INSERT INTO `tb_college` VALUES ('11952', '陕西理工学院');
INSERT INTO `tb_college` VALUES ('10708', '陕西科技大学');
INSERT INTO `tb_college` VALUES ('12980', '随州职业技术学院');
INSERT INTO `tb_college` VALUES ('10120', '雁北师范学院');
INSERT INTO `tb_college` VALUES ('11427', '集宁师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11900', '集美大学');
INSERT INTO `tb_college` VALUES ('10551', '零陵学院');
INSERT INTO `tb_college` VALUES ('11428', '青山大学');
INSERT INTO `tb_college` VALUES ('10435', '青岛农业大学');
INSERT INTO `tb_college` VALUES ('11906', '青岛大学');
INSERT INTO `tb_college` VALUES ('10429', '青岛建筑工程学院');
INSERT INTO `tb_college` VALUES ('10426', '青岛科技大学');
INSERT INTO `tb_college` VALUES ('10745', '青海医学院');
INSERT INTO `tb_college` VALUES ('10743', '青海大学');
INSERT INTO `tb_college` VALUES ('10746', '青海师范大学');
INSERT INTO `tb_college` VALUES ('10747', '青海师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10748', '青海民族学院');
INSERT INTO `tb_college` VALUES ('11563', '青海民族师范高等专科学校');
INSERT INTO `tb_college` VALUES ('11036', '鞍山市高等职业专科学校');
INSERT INTO `tb_college` VALUES ('10169', '鞍山师范学院');
INSERT INTO `tb_college` VALUES ('10146', '鞍山科技大学');
INSERT INTO `tb_college` VALUES ('10578', '韩山师范学院');
INSERT INTO `tb_college` VALUES ('10576', '韶关学院');
INSERT INTO `tb_college` VALUES ('10029', '首都体育学院');
INSERT INTO `tb_college` VALUES ('10025', '首都医科大学');
INSERT INTO `tb_college` VALUES ('10028', '首都师范大学');
INSERT INTO `tb_college` VALUES ('11912', '首都经济贸易大学');
INSERT INTO `tb_college` VALUES ('11831', '首钢工学院');
INSERT INTO `tb_college` VALUES ('10918', '驻马店师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10451', '鲁东大学');
INSERT INTO `tb_college` VALUES ('10178', '鲁迅美术学院');
INSERT INTO `tb_college` VALUES ('11445', '鸡西大学');
INSERT INTO `tb_college` VALUES ('11959', '鹤岗师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10514', '黄冈师范学院');
INSERT INTO `tb_college` VALUES ('13799', '黄冈科技职业学院');
INSERT INTO `tb_college` VALUES ('10955', '黄冈职业技术学院');
INSERT INTO `tb_college` VALUES ('10375', '黄山学院');
INSERT INTO `tb_college` VALUES ('11834', '黄河科技学院');
INSERT INTO `tb_college` VALUES ('11317', '黎明职业大学');
INSERT INTO `tb_college` VALUES ('10228', '黑龙江中医药大学');
INSERT INTO `tb_college` VALUES ('10223', '黑龙江八一农垦大学');
INSERT INTO `tb_college` VALUES ('10212', '黑龙江大学');
INSERT INTO `tb_college` VALUES ('11930', '黑龙江工程学院');
INSERT INTO `tb_college` VALUES ('10243', '黑龙江水利专科学校');
INSERT INTO `tb_college` VALUES ('10219', '黑龙江科技学院');
INSERT INTO `tb_college` VALUES ('10669', '黔东南民族师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10670', '黔南民族师范学院');
INSERT INTO `tb_college` VALUES ('10666', '黔西南民族师范高等专科学校');
INSERT INTO `tb_college` VALUES ('10431', '齐鲁工业大学');
INSERT INTO `tb_college` VALUES ('11230', '齐齐哈尔医学院');
INSERT INTO `tb_college` VALUES ('10221', '齐齐哈尔大学');
INSERT INTO `tb_college` VALUES ('11312', '龙岩学院');

-- ----------------------------
-- Table structure for `tb_comments`
-- ----------------------------
DROP TABLE IF EXISTS `tb_comments`;
CREATE TABLE `tb_comments` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` longtext,
  `created` datetime DEFAULT NULL,
  `status` int(11) NOT NULL,
  `uid` bigint(20) DEFAULT NULL,
  `pid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKglipmjnjda5wyk4g4yrc1lw3` (`uid`),
  KEY `FKm0l9xrp2xxt64n7h7ef6v0i69` (`pid`),
  CONSTRAINT `FKglipmjnjda5wyk4g4yrc1lw3` FOREIGN KEY (`uid`) REFERENCES `tb_user` (`id`),
  CONSTRAINT `FKm0l9xrp2xxt64n7h7ef6v0i69` FOREIGN KEY (`pid`) REFERENCES `tb_post_attribute` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_comments
-- ----------------------------
INSERT INTO `tb_comments` VALUES ('1', '测试', '2018-03-12 14:07:13', '0', '1', '2');
INSERT INTO `tb_comments` VALUES ('2', '测试', '2018-03-12 14:07:14', '0', '1', '2');
INSERT INTO `tb_comments` VALUES ('3', '测试', '2018-03-12 14:07:14', '0', '1', '3');
INSERT INTO `tb_comments` VALUES ('4', '测试', '2018-03-12 14:07:14', '0', '1', '3');
INSERT INTO `tb_comments` VALUES ('5', '测试', '2018-03-12 14:07:14', '0', '1', '4');
INSERT INTO `tb_comments` VALUES ('6', '测试', '2018-03-12 14:07:14', '0', '1', '4');
INSERT INTO `tb_comments` VALUES ('7', '测试', '2018-03-12 14:07:14', '0', '1', '5');
INSERT INTO `tb_comments` VALUES ('8', '测试', '2018-03-12 14:07:14', '0', '1', '5');
INSERT INTO `tb_comments` VALUES ('9', '测试', '2018-03-12 14:07:14', '0', '1', '6');
INSERT INTO `tb_comments` VALUES ('10', '测试', '2018-03-12 14:07:14', '0', '1', '6');
INSERT INTO `tb_comments` VALUES ('11', '测试', '2018-03-12 14:07:14', '0', '1', '7');
INSERT INTO `tb_comments` VALUES ('12', '测试', '2018-03-12 14:07:15', '0', '1', '7');
INSERT INTO `tb_comments` VALUES ('13', '测试', '2018-03-12 14:07:15', '0', '1', '8');
INSERT INTO `tb_comments` VALUES ('14', '测试', '2018-03-12 14:07:15', '0', '1', '8');
INSERT INTO `tb_comments` VALUES ('15', '测试', '2018-03-12 14:07:15', '0', '1', '9');
INSERT INTO `tb_comments` VALUES ('16', '测试', '2018-03-12 14:07:15', '0', '1', '9');
INSERT INTO `tb_comments` VALUES ('17', '测试', '2018-03-12 14:07:15', '0', '1', '10');
INSERT INTO `tb_comments` VALUES ('18', '测试', '2018-03-12 14:07:15', '0', '1', '10');
INSERT INTO `tb_comments` VALUES ('19', '测试', '2018-03-12 14:07:15', '0', '1', '11');
INSERT INTO `tb_comments` VALUES ('20', '测试', '2018-03-12 14:07:15', '0', '1', '11');
INSERT INTO `tb_comments` VALUES ('21', '测试', '2018-03-12 14:07:15', '0', '1', '12');
INSERT INTO `tb_comments` VALUES ('22', '测试', '2018-03-12 14:07:15', '0', '1', '12');
INSERT INTO `tb_comments` VALUES ('23', '测试', '2018-03-12 14:07:15', '0', '1', '13');
INSERT INTO `tb_comments` VALUES ('24', '测试', '2018-03-12 14:07:15', '0', '1', '13');
INSERT INTO `tb_comments` VALUES ('25', '测试', '2018-03-12 14:07:15', '0', '1', '14');
INSERT INTO `tb_comments` VALUES ('26', '测试', '2018-03-12 14:07:15', '0', '1', '14');
INSERT INTO `tb_comments` VALUES ('27', '测试', '2018-03-12 14:07:15', '0', '1', '15');
INSERT INTO `tb_comments` VALUES ('28', '测试', '2018-03-12 14:07:15', '0', '1', '15');
INSERT INTO `tb_comments` VALUES ('29', '测试', '2018-03-12 14:07:15', '0', '1', '16');
INSERT INTO `tb_comments` VALUES ('30', '测试', '2018-03-12 14:07:15', '0', '1', '16');
INSERT INTO `tb_comments` VALUES ('31', '测试', '2018-03-12 14:07:15', '0', '1', '17');
INSERT INTO `tb_comments` VALUES ('32', '测试', '2018-03-12 14:07:15', '0', '1', '17');
INSERT INTO `tb_comments` VALUES ('33', '测试', '2018-03-12 14:07:16', '0', '1', '18');
INSERT INTO `tb_comments` VALUES ('34', '测试', '2018-03-12 14:07:16', '0', '1', '18');
INSERT INTO `tb_comments` VALUES ('35', '测试', '2018-03-12 14:07:16', '0', '1', '19');
INSERT INTO `tb_comments` VALUES ('36', '测试', '2018-03-12 14:07:16', '0', '1', '19');
INSERT INTO `tb_comments` VALUES ('37', '测试', '2018-03-12 14:07:16', '0', '1', '20');
INSERT INTO `tb_comments` VALUES ('38', '测试', '2018-03-12 14:07:16', '0', '1', '20');
INSERT INTO `tb_comments` VALUES ('39', '测试', '2018-03-12 14:07:16', '0', '1', '21');
INSERT INTO `tb_comments` VALUES ('40', '测试', '2018-03-12 14:07:16', '0', '1', '21');
INSERT INTO `tb_comments` VALUES ('41', '测试', '2018-03-12 14:07:16', '0', '1', '22');
INSERT INTO `tb_comments` VALUES ('42', '测试', '2018-03-12 14:07:16', '0', '1', '22');
INSERT INTO `tb_comments` VALUES ('43', '测试', '2018-03-12 14:07:16', '0', '1', '23');
INSERT INTO `tb_comments` VALUES ('44', '测试', '2018-03-12 14:07:16', '0', '1', '23');
INSERT INTO `tb_comments` VALUES ('45', '测试', '2018-03-12 14:07:16', '0', '1', '24');
INSERT INTO `tb_comments` VALUES ('46', '测试', '2018-03-12 14:07:16', '0', '1', '24');
INSERT INTO `tb_comments` VALUES ('47', '测试', '2018-03-12 14:07:16', '0', '1', '25');
INSERT INTO `tb_comments` VALUES ('48', '测试', '2018-03-12 14:07:16', '0', '1', '25');
INSERT INTO `tb_comments` VALUES ('49', '测试', '2018-03-12 14:07:16', '0', '1', '26');
INSERT INTO `tb_comments` VALUES ('50', '测试', '2018-03-12 14:07:16', '0', '1', '26');
INSERT INTO `tb_comments` VALUES ('51', '测试', '2018-03-12 14:07:16', '0', '1', '27');
INSERT INTO `tb_comments` VALUES ('52', '测试', '2018-03-12 14:07:16', '0', '1', '27');
INSERT INTO `tb_comments` VALUES ('53', '测试', '2018-03-12 14:07:16', '0', '1', '28');
INSERT INTO `tb_comments` VALUES ('54', '测试', '2018-03-12 14:07:16', '0', '1', '28');
INSERT INTO `tb_comments` VALUES ('55', '测试', '2018-03-12 14:07:16', '0', '1', '29');
INSERT INTO `tb_comments` VALUES ('56', '测试', '2018-03-12 14:07:16', '0', '1', '29');
INSERT INTO `tb_comments` VALUES ('57', '测试', '2018-03-12 14:07:16', '0', '1', '30');
INSERT INTO `tb_comments` VALUES ('58', '测试', '2018-03-12 14:07:16', '0', '1', '30');
INSERT INTO `tb_comments` VALUES ('59', '测试', '2018-03-12 14:07:17', '0', '1', '31');
INSERT INTO `tb_comments` VALUES ('60', '测试', '2018-03-12 14:07:17', '0', '1', '31');
INSERT INTO `tb_comments` VALUES ('61', '测试', '2018-03-12 14:07:17', '0', '1', '32');
INSERT INTO `tb_comments` VALUES ('62', '测试', '2018-03-12 14:07:17', '0', '1', '32');
INSERT INTO `tb_comments` VALUES ('63', '测试', '2018-03-12 14:07:17', '0', '1', '33');
INSERT INTO `tb_comments` VALUES ('64', '测试', '2018-03-12 14:07:17', '0', '1', '33');
INSERT INTO `tb_comments` VALUES ('65', '测试', '2018-03-12 14:07:17', '0', '1', '34');
INSERT INTO `tb_comments` VALUES ('66', '测试', '2018-03-12 14:07:17', '0', '1', '34');
INSERT INTO `tb_comments` VALUES ('67', '测试', '2018-03-12 14:07:17', '0', '1', '35');
INSERT INTO `tb_comments` VALUES ('68', '测试', '2018-03-12 14:07:17', '0', '1', '35');
INSERT INTO `tb_comments` VALUES ('69', '测试', '2018-03-12 14:07:17', '0', '1', '36');
INSERT INTO `tb_comments` VALUES ('70', '测试', '2018-03-12 14:07:17', '0', '1', '36');
INSERT INTO `tb_comments` VALUES ('71', '测试', '2018-03-12 14:07:17', '0', '1', '37');
INSERT INTO `tb_comments` VALUES ('72', '测试', '2018-03-12 14:07:17', '0', '1', '37');
INSERT INTO `tb_comments` VALUES ('73', '测试', '2018-03-12 14:07:17', '0', '1', '38');
INSERT INTO `tb_comments` VALUES ('74', '测试', '2018-03-12 14:07:17', '0', '1', '38');
INSERT INTO `tb_comments` VALUES ('75', '测试', '2018-03-12 14:07:17', '0', '1', '39');
INSERT INTO `tb_comments` VALUES ('76', '测试', '2018-03-12 14:07:17', '0', '1', '39');
INSERT INTO `tb_comments` VALUES ('77', '测试', '2018-03-12 14:07:17', '0', '1', '40');
INSERT INTO `tb_comments` VALUES ('78', '测试', '2018-03-12 14:07:17', '0', '1', '40');
INSERT INTO `tb_comments` VALUES ('79', '测试', '2018-03-12 14:07:17', '0', '1', '41');
INSERT INTO `tb_comments` VALUES ('80', '测试', '2018-03-12 14:07:17', '0', '1', '41');
INSERT INTO `tb_comments` VALUES ('81', '测试', '2018-03-12 14:07:17', '0', '1', '42');
INSERT INTO `tb_comments` VALUES ('82', '测试', '2018-03-12 14:07:17', '0', '1', '42');
INSERT INTO `tb_comments` VALUES ('83', '测试', '2018-03-12 14:07:17', '0', '1', '43');
INSERT INTO `tb_comments` VALUES ('84', '测试', '2018-03-12 14:07:17', '0', '1', '43');
INSERT INTO `tb_comments` VALUES ('85', '测试', '2018-03-12 14:07:17', '0', '1', '44');
INSERT INTO `tb_comments` VALUES ('86', '测试', '2018-03-12 14:07:17', '0', '1', '44');
INSERT INTO `tb_comments` VALUES ('87', '测试', '2018-03-12 14:07:17', '0', '1', '45');
INSERT INTO `tb_comments` VALUES ('88', '测试', '2018-03-12 14:07:17', '0', '1', '45');
INSERT INTO `tb_comments` VALUES ('89', '测试', '2018-03-12 14:07:17', '0', '1', '46');
INSERT INTO `tb_comments` VALUES ('90', '测试', '2018-03-12 14:07:17', '0', '1', '46');
INSERT INTO `tb_comments` VALUES ('91', '测试', '2018-03-12 14:07:17', '0', '1', '47');
INSERT INTO `tb_comments` VALUES ('92', '测试', '2018-03-12 14:07:18', '0', '1', '47');
INSERT INTO `tb_comments` VALUES ('93', '测试', '2018-03-12 14:07:18', '0', '1', '48');
INSERT INTO `tb_comments` VALUES ('94', '测试', '2018-03-12 14:07:18', '0', '1', '48');
INSERT INTO `tb_comments` VALUES ('95', '测试', '2018-03-12 14:07:18', '0', '1', '49');
INSERT INTO `tb_comments` VALUES ('96', '测试', '2018-03-12 14:07:18', '0', '1', '49');
INSERT INTO `tb_comments` VALUES ('97', '测试', '2018-03-12 14:07:18', '0', '1', '50');
INSERT INTO `tb_comments` VALUES ('98', '测试', '2018-03-12 14:07:18', '0', '1', '50');
INSERT INTO `tb_comments` VALUES ('99', '测试', '2018-03-12 14:07:18', '0', '1', '51');
INSERT INTO `tb_comments` VALUES ('100', '测试', '2018-03-12 14:07:18', '0', '1', '51');
INSERT INTO `tb_comments` VALUES ('101', '测试', '2018-03-12 14:09:15', '0', '1', '2');
INSERT INTO `tb_comments` VALUES ('102', '测试', '2018-03-12 14:09:16', '0', '1', '3');
INSERT INTO `tb_comments` VALUES ('103', '测试', '2018-03-12 14:09:16', '0', '1', '4');
INSERT INTO `tb_comments` VALUES ('104', '测试', '2018-03-12 14:09:16', '0', '1', '5');
INSERT INTO `tb_comments` VALUES ('105', '测试', '2018-03-12 14:09:16', '0', '1', '6');
INSERT INTO `tb_comments` VALUES ('106', '测试', '2018-03-12 14:09:16', '0', '1', '7');
INSERT INTO `tb_comments` VALUES ('107', '测试', '2018-03-12 14:09:16', '0', '1', '8');
INSERT INTO `tb_comments` VALUES ('108', '测试', '2018-03-12 14:09:16', '0', '1', '9');
INSERT INTO `tb_comments` VALUES ('109', '测试', '2018-03-12 14:09:16', '0', '1', '10');
INSERT INTO `tb_comments` VALUES ('110', '测试', '2018-03-12 14:09:16', '0', '1', '11');
INSERT INTO `tb_comments` VALUES ('111', '测试', '2018-03-12 14:09:17', '0', '1', '12');
INSERT INTO `tb_comments` VALUES ('112', '测试', '2018-03-12 14:09:17', '0', '1', '13');
INSERT INTO `tb_comments` VALUES ('113', '测试', '2018-03-12 14:09:17', '0', '1', '14');
INSERT INTO `tb_comments` VALUES ('114', '测试', '2018-03-12 14:09:17', '0', '1', '15');
INSERT INTO `tb_comments` VALUES ('115', '测试', '2018-03-12 14:09:17', '0', '1', '16');
INSERT INTO `tb_comments` VALUES ('116', '测试', '2018-03-12 14:09:17', '0', '1', '17');
INSERT INTO `tb_comments` VALUES ('117', '测试', '2018-03-12 14:09:17', '0', '1', '18');
INSERT INTO `tb_comments` VALUES ('118', '测试', '2018-03-12 14:09:17', '0', '1', '19');
INSERT INTO `tb_comments` VALUES ('119', '测试', '2018-03-12 14:09:17', '0', '1', '20');
INSERT INTO `tb_comments` VALUES ('120', '测试', '2018-03-12 14:09:17', '0', '1', '21');
INSERT INTO `tb_comments` VALUES ('121', '测试', '2018-03-12 14:09:17', '0', '1', '22');
INSERT INTO `tb_comments` VALUES ('122', '测试', '2018-03-12 14:09:17', '0', '1', '23');
INSERT INTO `tb_comments` VALUES ('123', '测试', '2018-03-12 14:09:17', '0', '1', '24');
INSERT INTO `tb_comments` VALUES ('124', '测试', '2018-03-12 14:09:18', '0', '1', '25');
INSERT INTO `tb_comments` VALUES ('125', '测试', '2018-03-12 14:09:18', '0', '1', '26');
INSERT INTO `tb_comments` VALUES ('126', '测试', '2018-03-12 14:09:18', '0', '1', '27');
INSERT INTO `tb_comments` VALUES ('127', '测试', '2018-03-12 14:09:18', '0', '1', '28');
INSERT INTO `tb_comments` VALUES ('128', '测试', '2018-03-12 14:09:18', '0', '1', '29');
INSERT INTO `tb_comments` VALUES ('129', '测试', '2018-03-12 14:09:18', '0', '1', '30');
INSERT INTO `tb_comments` VALUES ('130', '测试', '2018-03-12 14:09:18', '0', '1', '31');
INSERT INTO `tb_comments` VALUES ('131', '测试', '2018-03-12 14:09:18', '0', '1', '32');
INSERT INTO `tb_comments` VALUES ('132', '测试', '2018-03-12 14:09:18', '0', '1', '33');
INSERT INTO `tb_comments` VALUES ('133', '测试', '2018-03-12 14:09:18', '0', '1', '34');
INSERT INTO `tb_comments` VALUES ('134', '测试', '2018-03-12 14:09:18', '0', '1', '35');
INSERT INTO `tb_comments` VALUES ('135', '测试', '2018-03-12 14:09:18', '0', '1', '36');
INSERT INTO `tb_comments` VALUES ('136', '测试', '2018-03-12 14:09:18', '0', '1', '37');
INSERT INTO `tb_comments` VALUES ('137', '测试', '2018-03-12 14:09:18', '0', '1', '38');
INSERT INTO `tb_comments` VALUES ('138', '测试', '2018-03-12 14:09:19', '0', '1', '39');
INSERT INTO `tb_comments` VALUES ('139', '测试', '2018-03-12 14:09:19', '0', '1', '40');
INSERT INTO `tb_comments` VALUES ('140', '测试', '2018-03-12 14:09:19', '0', '1', '41');
INSERT INTO `tb_comments` VALUES ('141', '测试', '2018-03-12 14:09:19', '0', '1', '42');
INSERT INTO `tb_comments` VALUES ('142', '测试', '2018-03-12 14:09:19', '0', '1', '43');
INSERT INTO `tb_comments` VALUES ('143', '测试', '2018-03-12 14:09:19', '0', '1', '44');
INSERT INTO `tb_comments` VALUES ('144', '测试', '2018-03-12 14:09:19', '0', '1', '45');
INSERT INTO `tb_comments` VALUES ('145', '测试', '2018-03-12 14:09:19', '0', '1', '46');
INSERT INTO `tb_comments` VALUES ('146', '测试', '2018-03-12 14:09:19', '0', '1', '47');
INSERT INTO `tb_comments` VALUES ('147', '测试', '2018-03-12 14:09:19', '0', '1', '48');
INSERT INTO `tb_comments` VALUES ('148', '测试', '2018-03-12 14:09:19', '0', '1', '49');
INSERT INTO `tb_comments` VALUES ('149', '测试', '2018-03-12 14:09:19', '0', '1', '50');
INSERT INTO `tb_comments` VALUES ('150', '测试', '2018-03-12 14:09:20', '0', '1', '51');
INSERT INTO `tb_comments` VALUES ('151', 'mock测试', '2018-03-12 15:33:37', '0', '1', '2');
INSERT INTO `tb_comments` VALUES ('152', 'mock测试', '2018-03-12 16:49:29', '0', '1', '2');

-- ----------------------------
-- Table structure for `tb_notify`
-- ----------------------------
DROP TABLE IF EXISTS `tb_notify`;
CREATE TABLE `tb_notify` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created` datetime DEFAULT NULL,
  `event` int(11) NOT NULL,
  `from_id` bigint(20) DEFAULT NULL,
  `own_id` bigint(20) DEFAULT NULL,
  `post_id` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_notify
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_orders`
-- ----------------------------
DROP TABLE IF EXISTS `tb_orders`;
CREATE TABLE `tb_orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `body` varchar(64) DEFAULT NULL,
  `openid` varchar(32) NOT NULL,
  `spbill_create_ip` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `time_expire` datetime DEFAULT NULL,
  `time_start` datetime DEFAULT NULL,
  `total_fee` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ec38gb9osr62k6vt461f70ep7` (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_orders
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_posts`
-- ----------------------------
DROP TABLE IF EXISTS `tb_posts`;
CREATE TABLE `tb_posts` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` longtext,
  `created` datetime DEFAULT NULL,
  `last_update` datetime DEFAULT NULL,
  `privacy` int(11) NOT NULL,
  `replys` int(11) NOT NULL,
  `reward` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `tag` varchar(16) NOT NULL,
  `title` varchar(64) DEFAULT NULL,
  `views` int(11) NOT NULL,
  `author_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc3vsgdn1n56cvkj4023cnlmgc` (`author_id`),
  CONSTRAINT `FKc3vsgdn1n56cvkj4023cnlmgc` FOREIGN KEY (`author_id`) REFERENCES `tb_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_posts
-- ----------------------------
INSERT INTO `tb_posts` VALUES ('2', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('3', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('4', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('5', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('6', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('7', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('8', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('9', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('10', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('11', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('12', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('13', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('14', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('15', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('16', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('17', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('18', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('19', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('20', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('21', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('22', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('23', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('24', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('25', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('26', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('27', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('28', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('29', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('30', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('31', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('32', null, '2018-03-11 14:55:57', '2018-03-11 14:55:57', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('33', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('34', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('35', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('36', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('37', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('38', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('39', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('40', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('41', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('42', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('43', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('44', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('45', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('46', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('47', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('48', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('49', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('50', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('51', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('52', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('53', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('54', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('55', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('56', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('57', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('58', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('59', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('60', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('61', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('62', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('63', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('64', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('65', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('66', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('67', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('68', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('69', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('70', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('71', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('72', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('73', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('74', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('75', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('76', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('77', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('78', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('79', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('80', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('81', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('82', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('83', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('84', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('85', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('86', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('87', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('88', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('89', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('90', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('91', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('92', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('93', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('94', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('95', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('96', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('97', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('98', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('99', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('100', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('101', null, '2018-03-11 14:55:58', '2018-03-11 14:55:58', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('103', 'mock测试', '2018-03-12 16:28:14', '2018-03-12 16:28:14', '0', '0', '0', '0', '高数', '测试标题', '0', null);
INSERT INTO `tb_posts` VALUES ('104', 'mock测试', '2018-03-12 16:32:38', '2018-03-12 16:32:38', '0', '0', '0', '0', '高数', '测试标题', '0', null);
INSERT INTO `tb_posts` VALUES ('105', 'mock测试', '2018-03-12 16:36:07', '2018-03-12 16:36:07', '0', '0', '0', '0', '高数', '测试标题', '0', null);
INSERT INTO `tb_posts` VALUES ('106', 'mock测试', '2018-03-12 16:38:59', '2018-03-12 16:38:59', '0', '0', '0', '0', '高数', '测试标题', '0', null);
INSERT INTO `tb_posts` VALUES ('107', 'mock测试', '2018-03-12 16:40:48', '2018-03-12 16:40:48', '0', '0', '0', '0', '高数', '测试标题', '0', null);
INSERT INTO `tb_posts` VALUES ('110', null, '2018-03-12 16:43:27', '2018-03-12 16:43:27', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('111', null, '2018-03-12 16:43:27', '2018-03-12 16:43:27', '0', '0', '0', '0', '测试', '测试', '0', '1');
INSERT INTO `tb_posts` VALUES ('112', 'mock测试', '2018-03-12 16:54:34', '2018-03-12 16:54:34', '0', '0', '0', '0', '高数', '测试标题', '0', '1');

-- ----------------------------
-- Table structure for `tb_post_attribute`
-- ----------------------------
DROP TABLE IF EXISTS `tb_post_attribute`;
CREATE TABLE `tb_post_attribute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKt7yunle7kjv0qebxujpqqmgay` (`pid`),
  CONSTRAINT `FKt7yunle7kjv0qebxujpqqmgay` FOREIGN KEY (`pid`) REFERENCES `tb_posts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_post_attribute
-- ----------------------------
INSERT INTO `tb_post_attribute` VALUES ('2', '2');
INSERT INTO `tb_post_attribute` VALUES ('3', '3');
INSERT INTO `tb_post_attribute` VALUES ('4', '4');
INSERT INTO `tb_post_attribute` VALUES ('5', '5');
INSERT INTO `tb_post_attribute` VALUES ('6', '6');
INSERT INTO `tb_post_attribute` VALUES ('7', '7');
INSERT INTO `tb_post_attribute` VALUES ('8', '8');
INSERT INTO `tb_post_attribute` VALUES ('9', '9');
INSERT INTO `tb_post_attribute` VALUES ('10', '10');
INSERT INTO `tb_post_attribute` VALUES ('11', '11');
INSERT INTO `tb_post_attribute` VALUES ('12', '12');
INSERT INTO `tb_post_attribute` VALUES ('13', '13');
INSERT INTO `tb_post_attribute` VALUES ('14', '14');
INSERT INTO `tb_post_attribute` VALUES ('15', '15');
INSERT INTO `tb_post_attribute` VALUES ('16', '16');
INSERT INTO `tb_post_attribute` VALUES ('17', '17');
INSERT INTO `tb_post_attribute` VALUES ('18', '18');
INSERT INTO `tb_post_attribute` VALUES ('19', '19');
INSERT INTO `tb_post_attribute` VALUES ('20', '20');
INSERT INTO `tb_post_attribute` VALUES ('21', '21');
INSERT INTO `tb_post_attribute` VALUES ('22', '22');
INSERT INTO `tb_post_attribute` VALUES ('23', '23');
INSERT INTO `tb_post_attribute` VALUES ('24', '24');
INSERT INTO `tb_post_attribute` VALUES ('25', '25');
INSERT INTO `tb_post_attribute` VALUES ('26', '26');
INSERT INTO `tb_post_attribute` VALUES ('27', '27');
INSERT INTO `tb_post_attribute` VALUES ('28', '28');
INSERT INTO `tb_post_attribute` VALUES ('29', '29');
INSERT INTO `tb_post_attribute` VALUES ('30', '30');
INSERT INTO `tb_post_attribute` VALUES ('31', '31');
INSERT INTO `tb_post_attribute` VALUES ('32', '32');
INSERT INTO `tb_post_attribute` VALUES ('33', '33');
INSERT INTO `tb_post_attribute` VALUES ('34', '34');
INSERT INTO `tb_post_attribute` VALUES ('35', '35');
INSERT INTO `tb_post_attribute` VALUES ('36', '36');
INSERT INTO `tb_post_attribute` VALUES ('37', '37');
INSERT INTO `tb_post_attribute` VALUES ('38', '38');
INSERT INTO `tb_post_attribute` VALUES ('39', '39');
INSERT INTO `tb_post_attribute` VALUES ('40', '40');
INSERT INTO `tb_post_attribute` VALUES ('41', '41');
INSERT INTO `tb_post_attribute` VALUES ('42', '42');
INSERT INTO `tb_post_attribute` VALUES ('43', '43');
INSERT INTO `tb_post_attribute` VALUES ('44', '44');
INSERT INTO `tb_post_attribute` VALUES ('45', '45');
INSERT INTO `tb_post_attribute` VALUES ('46', '46');
INSERT INTO `tb_post_attribute` VALUES ('47', '47');
INSERT INTO `tb_post_attribute` VALUES ('48', '48');
INSERT INTO `tb_post_attribute` VALUES ('49', '49');
INSERT INTO `tb_post_attribute` VALUES ('50', '50');
INSERT INTO `tb_post_attribute` VALUES ('51', '51');
INSERT INTO `tb_post_attribute` VALUES ('52', '52');
INSERT INTO `tb_post_attribute` VALUES ('53', '53');
INSERT INTO `tb_post_attribute` VALUES ('54', '54');
INSERT INTO `tb_post_attribute` VALUES ('55', '55');
INSERT INTO `tb_post_attribute` VALUES ('56', '56');
INSERT INTO `tb_post_attribute` VALUES ('57', '57');
INSERT INTO `tb_post_attribute` VALUES ('58', '58');
INSERT INTO `tb_post_attribute` VALUES ('59', '59');
INSERT INTO `tb_post_attribute` VALUES ('60', '60');
INSERT INTO `tb_post_attribute` VALUES ('61', '61');
INSERT INTO `tb_post_attribute` VALUES ('62', '62');
INSERT INTO `tb_post_attribute` VALUES ('63', '63');
INSERT INTO `tb_post_attribute` VALUES ('64', '64');
INSERT INTO `tb_post_attribute` VALUES ('65', '65');
INSERT INTO `tb_post_attribute` VALUES ('66', '66');
INSERT INTO `tb_post_attribute` VALUES ('67', '67');
INSERT INTO `tb_post_attribute` VALUES ('68', '68');
INSERT INTO `tb_post_attribute` VALUES ('69', '69');
INSERT INTO `tb_post_attribute` VALUES ('70', '70');
INSERT INTO `tb_post_attribute` VALUES ('71', '71');
INSERT INTO `tb_post_attribute` VALUES ('72', '72');
INSERT INTO `tb_post_attribute` VALUES ('73', '73');
INSERT INTO `tb_post_attribute` VALUES ('74', '74');
INSERT INTO `tb_post_attribute` VALUES ('75', '75');
INSERT INTO `tb_post_attribute` VALUES ('76', '76');
INSERT INTO `tb_post_attribute` VALUES ('77', '77');
INSERT INTO `tb_post_attribute` VALUES ('78', '78');
INSERT INTO `tb_post_attribute` VALUES ('79', '79');
INSERT INTO `tb_post_attribute` VALUES ('80', '80');
INSERT INTO `tb_post_attribute` VALUES ('81', '81');
INSERT INTO `tb_post_attribute` VALUES ('82', '82');
INSERT INTO `tb_post_attribute` VALUES ('83', '83');
INSERT INTO `tb_post_attribute` VALUES ('84', '84');
INSERT INTO `tb_post_attribute` VALUES ('85', '85');
INSERT INTO `tb_post_attribute` VALUES ('86', '86');
INSERT INTO `tb_post_attribute` VALUES ('87', '87');
INSERT INTO `tb_post_attribute` VALUES ('88', '88');
INSERT INTO `tb_post_attribute` VALUES ('89', '89');
INSERT INTO `tb_post_attribute` VALUES ('90', '90');
INSERT INTO `tb_post_attribute` VALUES ('91', '91');
INSERT INTO `tb_post_attribute` VALUES ('92', '92');
INSERT INTO `tb_post_attribute` VALUES ('93', '93');
INSERT INTO `tb_post_attribute` VALUES ('94', '94');
INSERT INTO `tb_post_attribute` VALUES ('95', '95');
INSERT INTO `tb_post_attribute` VALUES ('96', '96');
INSERT INTO `tb_post_attribute` VALUES ('97', '97');
INSERT INTO `tb_post_attribute` VALUES ('98', '98');
INSERT INTO `tb_post_attribute` VALUES ('99', '99');
INSERT INTO `tb_post_attribute` VALUES ('100', '100');
INSERT INTO `tb_post_attribute` VALUES ('101', '101');
INSERT INTO `tb_post_attribute` VALUES ('103', '103');
INSERT INTO `tb_post_attribute` VALUES ('104', '104');
INSERT INTO `tb_post_attribute` VALUES ('105', '105');
INSERT INTO `tb_post_attribute` VALUES ('106', '106');
INSERT INTO `tb_post_attribute` VALUES ('107', '107');
INSERT INTO `tb_post_attribute` VALUES ('110', '110');
INSERT INTO `tb_post_attribute` VALUES ('111', '111');
INSERT INTO `tb_post_attribute` VALUES ('112', '112');

-- ----------------------------
-- Table structure for `tb_sys_log`
-- ----------------------------
DROP TABLE IF EXISTS `tb_sys_log`;
CREATE TABLE `tb_sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `operation` varchar(255) DEFAULT NULL,
  `params` varchar(255) DEFAULT NULL,
  `time` bigint(20) DEFAULT NULL,
  `uid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `golds` int(11) NOT NULL,
  `head_img_url` varchar(255) DEFAULT NULL,
  `lasg_login` datetime DEFAULT NULL,
  `nickname` varchar(64) DEFAULT NULL,
  `open_id` varchar(32) DEFAULT NULL,
  `posts` int(11) NOT NULL,
  `province` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `subscribe` tinyint(4) DEFAULT '1',
  `subscribe_time` bigint(20) DEFAULT NULL,
  `cid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_bd5k8i9oh5pjqeowca3ou0aau` (`open_id`),
  KEY `FKalwyyftwxvt22bfmb9d3oo63h` (`cid`),
  CONSTRAINT `FKalwyyftwxvt22bfmb9d3oo63h` FOREIGN KEY (`cid`) REFERENCES `tb_college` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', null, null, '2018-03-11 14:50:22', '0', null, '2018-03-13 19:48:59', 'Civinbtw', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('2', null, null, '2018-03-11 14:50:22', '0', null, '2018-03-13 19:46:56', 'Civinbtw', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('3', null, null, '2018-03-11 14:50:22', '0', null, '2018-03-11 14:50:22', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('4', null, null, '2018-03-11 14:50:22', '0', null, '2018-03-11 14:50:22', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('5', null, null, '2018-03-11 14:50:22', '0', null, '2018-03-11 14:50:22', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('6', null, null, '2018-03-11 14:50:22', '0', null, '2018-03-11 14:50:22', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('7', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('8', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('9', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('10', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('11', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('12', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('13', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('14', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('15', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('16', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('17', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('18', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('19', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('20', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('21', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('22', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('23', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('24', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('25', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('26', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('27', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('28', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('29', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('30', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('31', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('32', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('33', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('34', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('35', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('36', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('37', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('38', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('39', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('40', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('41', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('42', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('43', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('44', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('45', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('46', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('47', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('48', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('49', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('50', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('51', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('52', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('53', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('54', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('55', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('56', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('57', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('58', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('59', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('60', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('61', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('62', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('63', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('64', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('65', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('66', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('67', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('68', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('69', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('70', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('71', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('72', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('73', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('74', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('75', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('76', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('77', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('78', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('79', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('80', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('81', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('82', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('83', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('84', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('85', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('86', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('87', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('88', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('89', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('90', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('91', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('92', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('93', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('94', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('95', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('96', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('97', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('98', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('99', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
INSERT INTO `tb_user` VALUES ('100', null, null, '2018-03-11 14:50:23', '0', null, '2018-03-11 14:50:23', 'Civin', null, '0', null, null, '0', '0', null, '10013');
