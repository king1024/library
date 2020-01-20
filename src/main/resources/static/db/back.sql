-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT '' COMMENT '文章内容',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `delete_status` varchar(1) DEFAULT '1' COMMENT '是否有效  1.有效  2无效',
  PRIMARY KEY (`id`),
  KEY `article_content` (`content`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='发布号作者表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (5,'莎士比亚','2017-10-25 01:08:45','2017-10-30 09:59:41','1'),(6,'亚里士多德','2017-10-26 02:49:28','2017-11-18 01:54:15','1'),(10,'亚历山大','2017-10-26 06:57:45','2017-11-08 05:28:52','1'),(11,'李白','2017-10-26 07:23:42','2017-10-26 07:23:42','1'),(19,'文章test2','2017-11-18 05:37:07','2017-11-18 05:37:11','1');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_catalog`
--

DROP TABLE IF EXISTS `book_catalog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_catalog` (
  `catalog_id` varchar(64) NOT NULL,
  `catalog_name` varchar(150) NOT NULL,
  `areas` varchar(10) DEFAULT NULL,
  `floors` varchar(10) DEFAULT NULL,
  `create_date` varchar(10) DEFAULT NULL,
  `create_user_id` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`catalog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_catalog`
--

LOCK TABLES `book_catalog` WRITE;
/*!40000 ALTER TABLE `book_catalog` DISABLE KEYS */;
INSERT INTO `book_catalog` VALUES ('c0000001','图书001','A001','2','2019-12-09',''),('c0000002','图书002','A002','3','2019-12-10',''),('c0000003','图书003','A003','2','2019-12-11',''),('c0000004','图书004','A003','2','2019-12-11',''),('c0000005','图书005','A005','5','2019-12-11','');
/*!40000 ALTER TABLE `book_catalog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plus_file`
--

DROP TABLE IF EXISTS `plus_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plus_file` (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `name` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `size` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `url` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pid` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `createdate` datetime DEFAULT NULL,
  `updatedate` datetime DEFAULT NULL,
  `folder` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='InnoDB free: 7168 kB; InnoDB free: 7168 kB';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plus_file`
--

LOCK TABLES `plus_file` WRITE;
/*!40000 ALTER TABLE `plus_file` DISABLE KEYS */;
INSERT INTO `plus_file` VALUES ('1','Files',NULL,'0',NULL,'-1',NULL,NULL,1,NULL),('10','Product icons',NULL,NULL,NULL,'3',NULL,NULL,1,NULL),('11','Description.rtf','rtf',NULL,NULL,'1',NULL,NULL,0,NULL),('12','n.txt','txt',NULL,NULL,'1',NULL,NULL,0,NULL),('13','o.txt','txt',NULL,NULL,'1',NULL,NULL,0,NULL),('14','file1.txt','txt',NULL,NULL,'2',NULL,NULL,0,NULL),('15','file2.txt','txt',NULL,NULL,'2',NULL,NULL,0,NULL),('16','file3.txt','txt',NULL,NULL,'3',NULL,NULL,0,NULL),('17','file4.txt','txt',NULL,NULL,'3',NULL,NULL,0,NULL),('18','file5.txt','txt',NULL,NULL,'4',NULL,NULL,0,NULL),('19','file6.txt','txt',NULL,NULL,'5',NULL,NULL,0,NULL),('2','Documents',NULL,NULL,NULL,'1',NULL,NULL,1,NULL),('20','file7.txt','txt',NULL,NULL,'6',NULL,NULL,0,NULL),('21','file8','txt',NULL,NULL,'7',NULL,NULL,0,NULL),('22','file9','txt',NULL,NULL,'8',NULL,NULL,0,NULL),('3','Images',NULL,NULL,NULL,'1',NULL,NULL,1,NULL),('4','Music',NULL,NULL,NULL,'1',NULL,NULL,1,NULL),('5','System',NULL,NULL,NULL,'1',NULL,NULL,1,NULL),('6','Video',NULL,NULL,NULL,'1',NULL,NULL,1,NULL),('7','Projects',NULL,NULL,NULL,'2',NULL,NULL,1,NULL),('8','Reports',NULL,NULL,NULL,'2',NULL,NULL,1,NULL),('9','Employees',NULL,NULL,NULL,'3',NULL,NULL,1,NULL);
/*!40000 ALTER TABLE `plus_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_code_item`
--

DROP TABLE IF EXISTS `sys_code_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_code_item` (
  `item_id` varchar(12) NOT NULL,
  `set_id` varchar(6) DEFAULT NULL,
  `super_item_id` varchar(12) DEFAULT NULL,
  `item_name` varchar(50) NOT NULL,
  `item_status` varchar(2) DEFAULT '1',
  `item_bak` varchar(50) DEFAULT NULL,
  `sort` int(6) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`item_id`),
  KEY `index_code_item_set_id` (`set_id`),
  KEY `index_code_item_sort` (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_code_item`
--

LOCK TABLES `sys_code_item` WRITE;
/*!40000 ALTER TABLE `sys_code_item` DISABLE KEYS */;
INSERT INTO `sys_code_item` VALUES ('1001001','1001',NULL,'1号','1','哈哈',1);
/*!40000 ALTER TABLE `sys_code_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_code_set`
--

DROP TABLE IF EXISTS `sys_code_set`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_code_set` (
  `set_id` varchar(6) NOT NULL,
  `set_name` varchar(50) NOT NULL,
  `set_status` varchar(2) DEFAULT '1',
  `set_bak` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_code_set`
--

LOCK TABLES `sys_code_set` WRITE;
/*!40000 ALTER TABLE `sys_code_set` DISABLE KEYS */;
INSERT INTO `sys_code_set` VALUES ('1001','测试','1','就是测一下'),('1002','再测一下','1',NULL);
/*!40000 ALTER TABLE `sys_code_set` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_menu`
--

DROP TABLE IF EXISTS `sys_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_menu` (
  `MENU_ID` varchar(64) NOT NULL,
  `MENU_NAME` varchar(100) NOT NULL,
  `MENU_URL` varchar(100) DEFAULT NULL,
  `PARENT_MENU_ID` varchar(64) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP,
  `icon_cls` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_menu`
--

LOCK TABLES `sys_menu` WRITE;
/*!40000 ALTER TABLE `sys_menu` DISABLE KEYS */;
INSERT INTO `sys_menu` VALUES ('1','敏捷开发','/page/main','','2019-12-19 18:56:11','fa fa-send-o'),('1_1','代码生成器','/page/main','1','2019-12-19 18:56:16','fa fa-desktop'),('1_2','单页管理','/page/main','1','2019-12-19 18:56:17','fa fa-search'),('1_3','插件演示','/page/main','1','2019-12-19 18:56:17','fa fa-send-o'),('1_4','开发示例','/page/main','1','2019-12-19 18:56:17','fa fa-window-restore'),('1_4_1','商机管理','/page/main','1_4','2019-12-19 18:56:17','fa fa-assistive-listening-systems'),('21E4F72B9D274510AB219C33D792A101','用户新增','/page/main','21E4F72B9D274510AB219C33D792A4C4','2019-12-12 15:10:46',NULL),('21E4F72B9D274510AB219C33D792A102','用户列表','/page/main','21E4F72B9D274510AB219C33D792A4C4','2019-12-12 15:10:46',NULL),('21E4F72B9D274510AB219C33D792A4C4','用户管理','/page/main','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:18',NULL),('3D7C1106526F457BBB8B15E72478E983','角色管理','/page/main','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:18',NULL),('65E16E3E1EFC484A8CBD2AD77D8D3100','书本管理','/page/main','','2019-12-12 15:10:46',NULL),('65E16E3E1EFC484A8CBD2AD77D8D3101','书本新增','/page/main','65E16E3E1EFC484A8CBD2AD77D8D3100','2019-12-12 15:10:46',NULL),('65E16E3E1EFC484A8CBD2AD77D8D3102','书本列表','/page/main','65E16E3E1EFC484A8CBD2AD77D8D3100','2019-12-12 15:10:46',NULL),('65E16E3E1EFC484A8CBD2AD77D8D3200','英雄联盟','/page/main','','2019-12-12 15:10:46',NULL),('65E16E3E1EFC484A8CBD2AD77D8D3F92','系统管理','/page/main','','2019-12-12 09:59:18',NULL),('6E62020D770346F08A4287FF205EEB8F','机构管理','/page/main','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:17',NULL),('8C95B11FF4C042DDB3AF2C467B593295','修改密码','/page/main','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:18',NULL),('A57EF00DD8934819AE2311DC88B622C1','菜单管理','/page/main','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:18',NULL),('bbgl','报表管理','/page/main','bbzx','2019-12-19 18:56:19','fa fa-cogs'),('bbsl','报表实例','/page/main','bbzx','2019-12-19 18:58:32','fa fa-file-powerpoint-o'),('bbxq','报表模板','/page/main','bbzx','2019-12-19 18:56:19','fa fa-wpforms'),('bbzx','报表中心','/page/main','','2019-12-19 18:56:19','fa fa-area-chart'),('bdfbsl','表单发布实例','/page/main','bdzx','2019-12-19 18:56:18','fa fa-list-alt'),('bdzx','表单中心','/page/main','','2019-12-19 18:56:18','fa fa-table'),('bmgl','部门管理','/page/main','dwzz','2019-12-19 18:56:18','fa fa-th-list'),('ccbb','仓存报表','/page/main','bbxq','2019-12-19 18:56:19','fa fa-area-chart'),('cgbb','采购报表','/page/main','bbxq','2019-12-19 18:56:19','fa fa-bar-chart'),('csbd','测试表单','/page/main','bdfbsl','2019-12-19 18:56:18','fa fa-bandcamp'),('dcpz','导出配置','/page/main','excel','2019-12-19 18:56:17','fa fa-sign-out'),('ddgn','订单功能','/page/main','bdfbsl','2019-12-19 18:56:18','fa fa-address-book'),('djbm','单据编码','/page/main','xzgl','2019-12-19 18:56:17','fa fa-barcode'),('drpz','导入配置','/page/main','excel','2019-12-19 18:56:17','fa fa-sign-out'),('dwzz','单位组织','/page/main','','2019-12-19 18:56:18','fa fa-coffee'),('dzqz','电子签章','/page/main','ggxx','2019-12-19 18:56:20','fa fa-registered'),('excel','Excel配置','/page/main','xtgl','2019-12-19 18:56:17','fa fa-file-excel-o'),('fbbdgn','发布表单功能','/page/main','bdzx','2019-12-19 18:56:18','fa fa-list-alt'),('ggxx','公共信息','/page/main','','2019-12-19 18:56:19','fa fa-globe'),('gsgl','公司管理','/page/main','dwzz','2019-12-19 18:56:18','fa fa-sitemap'),('gwgl','岗位管理','/page/main','dwzz','2019-12-19 18:56:18','fa fa-graduation-cap'),('gzwt','工作委托','/page/main','lczx','2019-12-19 18:56:19','fa fa-coffee'),('hyda','会员档案','/page/main','bdfbsl','2019-12-19 18:56:18','fa fa-address-card-o'),('jsgl','角色管理','/page/main','dwzz','2019-12-19 18:56:18','fa fa-paw'),('khdd','客户订单','/page/main','1_4','2019-12-19 18:56:17','fa fa-modx'),('khgl','客户管理','/page/main','1_4','2019-12-19 18:56:17','fa fa-vcard'),('khxq1','客户详情','/page/main','ggxx','2019-12-19 18:56:20','fa-braille'),('kpxx','开票信息','/page/main','1_4','2019-12-19 18:56:17','fa fa-file-excel-o'),('lcjk','流程监控','/page/main','lczx','2019-12-19 18:56:19','fa fa-eye'),('lczx','流程中心','/page/main','','2019-12-19 18:56:19','fa fa-share-alt'),('mbgl','模板管理','/page/main','lczx','2019-12-19 18:56:19','fa fa-share-alt'),('qjgl','请假管理','/page/main','bdfbsl','2019-12-19 18:56:18','fa fa-user-circle'),('qyhsz','企业号设置','/page/main','wxgl','2019-12-19 18:56:20','fa fa-plug'),('rcgl','日程管理','/page/main','ggxx','2019-12-19 18:56:20','fa fa-calendar'),('sjbgl','数据表管理','/page/main','sjgl','2019-12-19 18:56:18','fa fa-table'),('sjgl','数据管理','/page/main','xzgl','2019-12-19 18:56:17','fa fa-database'),('sjklj','数据库连接','/page/main','sjgl','2019-12-19 18:56:18','fa fa-plug'),('sjqxgl','数据权限管理','/page/main','xtgl','2019-12-19 18:56:18','fa fa-briefcase'),('sjygl','数据源管理','/page/main','sjgl','2019-12-19 18:56:18','fa fa-bullseye'),('sjzd','数据字典','/page/main','xzgl','2019-12-19 18:56:17','fa fa-book'),('sxbb','销售报表','/page/main','bbxq','2019-12-19 18:56:19','fa fa-line-chart'),('szbb','收支报表','/page/main','bbxq','2019-12-19 18:56:19','fa fa-pie-chart'),('tzgg','通知公告','/page/main','ggxx','2019-12-19 18:56:20','fa fa-volume-up'),('wdrw','我的任务','/page/main','lczx','2019-12-19 18:56:19','fa fa-file-word-o'),('wjzl','文件资料','/page/main','ggxx','2019-12-19 18:56:20','fa fa-jsfiddle'),('wxgl','微信管理','/page/main','ydgl','2019-12-19 18:56:20','fa fa-weixin'),('xshh','销售混合','/page/main','bbsl','2019-12-19 18:56:19','fa fa-area-chart'),('xslb','销售列表','/page/main','bbsl','2019-12-19 18:56:19','fa fa-area-chart'),('xstb','销售图表','/page/main','bbsl','2019-12-19 18:56:19','fa fa-area-chart'),('xtgl','系统管理','/page/main','','2019-12-19 18:56:17','fa fa-desktop'),('xtgn','系统功能','/page/main','xzgl','2019-12-19 18:56:17','fa fa-navicon'),('xtlcgl','系统流程案例','/page/main','lczx','2019-12-19 18:56:19','fa fa-industry'),('xtrz','系统日志','/page/main','xtgl','2019-12-19 18:56:18','fa fa-warning'),('xwzx','新闻中心','/page/main','ggxx','2019-12-19 18:56:20','fa-feed'),('xzgl','行政管理','/page/main','xzgl','2019-12-19 18:56:17','fa fa-leaf'),('ydgl','移动管理','/page/main','','2019-12-19 18:56:20','fa fa-android'),('yhgl','用户管理','/page/main','dwzz','2019-12-19 18:56:18','fa fa-user'),('yjzx','邮件中心','/page/main','ggxx','2019-12-19 18:56:20','fa fa-send'),('zdybd','自定义表单','/page/main','bdzx','2019-12-19 18:56:18','fa fa-puzzle-piece');
/*!40000 ALTER TABLE `sys_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_permission`
--

DROP TABLE IF EXISTS `sys_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL DEFAULT '0' COMMENT '自定id,主要供前端展示权限列表分类排序使用.',
  `menu_code` varchar(255) DEFAULT '' COMMENT '归属菜单,前端判断并展示菜单使用,',
  `menu_name` varchar(255) DEFAULT '' COMMENT '菜单的中文释义',
  `permission_code` varchar(255) DEFAULT '' COMMENT '权限的代码/通配符,对应代码中@RequiresPermissions 的value',
  `permission_name` varchar(255) DEFAULT '' COMMENT '本权限的中文释义',
  `required_permission` tinyint(1) DEFAULT '2' COMMENT '是否本菜单必选权限, 1.必选 2非必选 通常是"列表"权限是必选',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='后台权限表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_permission`
--

LOCK TABLES `sys_permission` WRITE;
/*!40000 ALTER TABLE `sys_permission` DISABLE KEYS */;
INSERT INTO `sys_permission` VALUES (101,'article','文章管理','article:list','列表',1),(102,'article','文章管理','article:add','新增',2),(103,'article','文章管理','article:update','修改',2),(601,'user','用户','user:list','列表',1),(602,'user','用户','user:add','新增',2),(603,'user','用户','user:update','修改',2),(701,'role','角色权限','role:list','列表',1),(702,'role','角色权限','role:add','新增',2),(703,'role','角色权限','role:update','修改',2),(704,'role','角色权限','role:delete','删除',2);
/*!40000 ALTER TABLE `sys_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_resources`
--

DROP TABLE IF EXISTS `sys_resources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_resources` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `permission` varchar(100) DEFAULT NULL,
  `parent_id` bigint(20) unsigned DEFAULT '0',
  `sort` int(10) unsigned DEFAULT NULL,
  `external` tinyint(1) unsigned DEFAULT NULL COMMENT '是否外部链接',
  `available` tinyint(1) unsigned DEFAULT '0',
  `icon` varchar(100) DEFAULT NULL COMMENT '菜单图标',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `tree_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_sys_resource_parent_id` (`parent_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=255 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_resources`
--

LOCK TABLES `sys_resources` WRITE;
/*!40000 ALTER TABLE `sys_resources` DISABLE KEYS */;
INSERT INTO `sys_resources` VALUES (2,'用户列表','menu','/page/sys/user/userList','user:list',241,1,0,1,'fa fa-user-circle-o','2017-12-15 05:56:15','2018-05-09 06:44:20','101001'),(3,'新增用户','button',NULL,'user:add',2,2,0,1,NULL,'2018-05-15 22:07:43','2018-05-15 22:16:23','101001001'),(4,'批量删除用户','button',NULL,'user:batchDelete',2,3,0,1,NULL,'2018-05-15 22:12:23','2018-05-15 22:16:35','101001005'),(5,'编辑用户','button',NULL,'user:update',2,4,0,1,NULL,'2018-05-15 06:12:50','2018-05-15 06:16:43','101001002'),(6,'删除用户','button',NULL,'user:delete',2,5,0,0,NULL,'2018-05-15 22:13:09','2018-05-15 22:51:50','101001003'),(7,'分配用户角色','button',NULL,'user:updateRoles',2,6,0,1,NULL,'2018-05-14 14:15:28','2018-05-14 14:16:54','101001004'),(10,'新增资源','button',NULL,'resource:add',149,2,0,1,NULL,'2018-05-15 06:07:43','2018-05-15 06:16:23','102001001'),(11,'批量删除资源','button',NULL,'resource:batchDelete',149,3,0,1,NULL,'2018-05-15 06:12:23','2018-05-15 06:16:35','102001004'),(12,'编辑资源','button',NULL,'resource:update',149,4,0,1,NULL,'2018-05-14 14:12:50','2018-05-14 14:16:43','102001002'),(13,'删除资源','button',NULL,'resource:delete',149,5,0,1,NULL,'2018-05-15 06:13:09','2018-05-15 06:51:50','102001003'),(14,'角色管理','menu','/page/sys/role/roleList','roles',241,2,0,1,'fa fa-graduation-cap','2017-12-19 23:31:27','2018-05-14 20:51:06','101002'),(15,'新增角色','button',NULL,'role:add',14,2,0,1,NULL,'2018-05-15 22:07:43','2018-05-15 22:16:23','10100201'),(16,'批量删除角色','button',NULL,'role:batchDelete',149,3,0,1,NULL,'2018-05-15 06:12:23','2018-05-15 06:16:35','101002004'),(17,'编辑角色','button',NULL,'role:edit',14,4,0,1,NULL,'2018-05-15 22:12:50','2018-05-15 22:16:43','101002002'),(18,'删除角色','button',NULL,'role:delete',14,5,0,1,NULL,'2018-05-15 22:13:09','2018-05-15 22:51:50','101002003'),(19,'分配角色资源','button',NULL,'role:addResource',14,6,0,1,NULL,'2018-05-16 02:04:21','2018-05-16 02:04:21','101002005'),(149,'系统功能','menu','/page/sys/res/resList','resource:list',241,3,0,1,'fa fa-cubes','2019-12-22 19:33:27','2019-12-22 19:33:27','102001'),(152,'系统代码管理','menu','/page/sys/code/codeSetList','sysCodeSet:list',241,NULL,0,1,'fa fa-book','2020-01-05 16:41:33','2020-01-05 16:41:33','102002'),(159,'资源禁用','button','','resource:batchForbid',149,NULL,1,0,'','2020-01-09 00:49:31','2020-01-09 00:49:31','102001005'),(161,'我的桌面','menu','/page/test','test',0,999,0,1,'fa fa-desktop','2020-01-09 07:35:14','2020-01-09 07:35:14','201'),(162,'我的事务','menu','/page/test','test',0,999,0,1,'fa fa-cog','2020-01-09 23:35:14','2020-01-09 23:35:14','202'),(163,'新建流程事务','menu','/page/test','test',162,999,0,1,'fa fa-envira','2020-01-09 23:35:14','2020-01-09 23:35:14','202001'),(164,'待处理的事务','menu','/page/test','test',162,999,0,1,'fa fa-envira','2020-01-09 23:35:14','2020-01-09 23:35:14','202002'),(165,'已处理的事务','menu','/page/test','test',162,999,0,1,'fa fa-envira','2020-01-09 23:35:14','2020-01-09 23:35:14','202003'),(166,'我发起的事务','menu','/page/test','test',162,999,0,1,'fa fa-envira','2020-01-09 23:35:14','2020-01-09 23:35:14','202004'),(167,'目标管理','menu','/page/test','test',0,999,0,1,'fa fa-clock-o','2020-01-09 23:35:15','2020-01-09 23:35:15','203'),(168,'我的工作计划','menu','/page/test','test',167,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','203001'),(169,'全部工作计划','menu','/page/test','test',167,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','203002'),(170,'我的工作任务','menu','/page/test','test',167,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','203003'),(171,'全部工作任务','menu','/page/test','test',167,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','203004'),(172,'我的工作报告','menu','/page/test','test',167,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','203005'),(173,'全部工作报告','menu','/page/test','test',167,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','203006'),(174,'我的工作日程','menu','/page/test','test',167,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','203007'),(175,'全部工作日程','menu','/page/test','test',167,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','203008'),(176,'信息中心','menu','/page/test','test',0,999,0,1,'fa fa-calendar-check-o','2020-01-09 23:35:15','2020-01-09 23:35:15','204'),(177,'内部通讯录','menu','/page/test','test',176,999,0,1,'fa fa-envira','2020-01-09 23:35:15','2020-01-09 23:35:15','204001'),(178,'外部通讯录','menu','/page/test','test',176,999,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','204002'),(179,'电子消息','menu','/page/test','test',176,999,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','204003'),(180,'信息公告','menu','/page/test','test',176,999,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','204004'),(181,'公告管理','menu','/page/test','test',176,176,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','204005'),(182,'文档管理','menu','/page/test','test',176,176,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','204006'),(183,'全部文档','menu','/page/test','test',176,176,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','204007'),(184,'知识社区','menu','/page/test','test',176,176,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','204008'),(185,'客户关系','menu','/page/test','test',0,999,0,1,'fa fa-handshake-o','2020-01-09 07:35:16','2020-01-09 07:35:16','205'),(186,'全部客户','menu','/page/test','test',185,185,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','205001'),(187,'我的商机','menu','/page/test','test',185,185,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','205002'),(188,'全部商机','menu','/page/test','test',185,999,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','205003'),(189,'我的跟单','menu','/page/test','test',185,999,0,1,'fa fa-envira','2020-01-09 23:35:16','2020-01-09 23:35:16','205004'),(190,'全部跟单','menu','/page/test','test',185,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','205005'),(191,'全部讨论帖子','menu','/page/test','test',185,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','205006'),(192,'我的合同','menu','/page/test','test',185,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','205007'),(193,'全部合同','menu','/page/test','test',185,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','205008'),(194,'售后服务','menu','/page/test','test',185,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','205009'),(195,'统计分析','menu','/page/test','test',185,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','205010'),(196,'进销存管理','menu','/page/test','test',0,999,0,1,'fa fa-balance-scale','2020-01-09 23:35:17','2020-01-09 23:35:17','206'),(197,'客户管理','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','206001'),(198,'供应商管理','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','206002'),(199,'品种管理','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','206003'),(200,'品种库存','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:17','2020-01-09 23:35:17','206004'),(201,'销售管理','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','206005'),(202,'采购管理','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','206006'),(203,'库存管理','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','206007'),(204,'库存台帐','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','206008'),(205,'统计报表','menu','/page/test','test',196,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','206009'),(206,'项目管理','menu','/page/test','test',0,999,0,1,'fa fa-folder-open','2020-01-09 23:35:18','2020-01-09 23:35:18','207'),(207,'我的项目','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','207001'),(208,'全部项目管理','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','207002'),(209,'我的任务','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','207003'),(210,'全部项目任务','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','207004'),(211,'我的工作量','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','207005'),(212,'全部项目工作量','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:18','2020-01-09 23:35:18','207006'),(213,'全部成本费用','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','207007'),(214,'我的文档','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','207008'),(215,'全部项目文档','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','207009'),(216,'全部讨论帖子','menu','/page/test','test',206,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','207010'),(217,'行政管理','menu','/page/test','test',0,999,0,1,'fa fa-university','2020-01-09 23:35:19','2020-01-09 23:35:19','208'),(218,'会议室管','menu','/page/test','test',217,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','208001'),(219,'车辆管理','menu','/page/test','test',217,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','208002'),(220,'资产管理','menu','/page/test','test',217,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','208003'),(221,'用品管理','menu','/page/test','test',217,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','208004'),(222,'证照管理','menu','/page/test','test',217,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','208005'),(223,'印章管理','menu','/page/test','test',217,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','208006'),(224,'行政事务','menu','/page/test','test',217,999,0,1,'fa fa-envira','2020-01-09 23:35:19','2020-01-09 23:35:19','208007'),(225,'人力资源','menu','/page/test','test',0,999,0,1,'fa fa-user-circle','2020-01-09 23:35:19','2020-01-09 23:35:19','209'),(226,'我的人事','menu','/page/login02','test',225,999,0,1,'fa fa-envira','2020-01-08 15:35:20','2020-01-08 15:35:20','209001'),(227,'员工管理','menu','/page/test','test',225,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','209002'),(228,'招聘和配置','menu','/page/test','test',225,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','209003'),(229,'考勤管理','menu','/page/test','test',225,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','209004'),(230,'考勤打卡','menu','/page/test','test',225,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','209005'),(231,'福利和关怀','menu','/page/test','test',225,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','209006'),(232,'绩效管理','menu','/page/test','test',225,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','209007'),(233,'薪资管理','menu','/page/test','test',225,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','209008'),(234,'财务中心','menu','/page/test','test',0,999,0,1,'fa fa-diamond','2020-01-09 23:35:20','2020-01-09 23:35:20','210'),(235,'费用管理','menu','/page/test','test',234,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','210001'),(236,'票据管理','menu','/page/test','test',234,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','210002'),(237,'资金管理','menu','/page/test','test',234,999,0,1,'fa fa-envira','2020-01-09 23:35:20','2020-01-09 23:35:20','210003'),(238,'收入管理','menu','/page/test','test',234,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','210004'),(239,'支出管理','menu','/page/test','test',234,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','210005'),(240,'统计报表','menu','/page/test','test',234,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','210006'),(241,'系统管理','menu','','test',0,999,0,1,'fa fa-desktop','2020-01-09 07:35:21','2020-01-09 07:35:21','211'),(242,'组织机构','menu','/page/test','test',241,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','211001'),(243,'岗位角色','menu','/page/test','test',241,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','211002'),(245,'权限管理','menu','/page/test','test',241,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','211004'),(246,'在线用户','menu','/page/test','test',241,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','211005'),(247,'系统日志','menu','/page/test','test',241,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','211006'),(248,'设置中心','menu','/page/test','test',0,999,0,1,'fa fa-cogs','2020-01-09 07:35:21','2020-01-09 07:35:21','212'),(249,'个人设置','menu','/page/test','test',248,999,0,1,'fa fa-envira','2020-01-09 23:35:21','2020-01-09 23:35:21','212001'),(250,'电子印章和授权','menu','/page/test','test',248,999,0,1,'fa fa-envira','2020-01-09 23:35:22','2020-01-09 23:35:22','212002'),(251,'数据分类设置','menu','/page/test','test',248,999,0,1,'fa fa-envira','2020-01-09 23:35:22','2020-01-09 23:35:22','212003'),(252,'系统设置','menu','/page/test','test',248,999,0,1,'fa fa-envira','2020-01-09 23:35:22','2020-01-09 23:35:22','212004'),(253,'安全注销','menu','/page/test','test',0,999,0,0,'fa fa-minus-circle','2020-01-09 07:35:22','2020-01-09 07:35:22','300'),(254,'人员卡片列表','menu','/page/sys/user/userCards','test',225,999,1,1,'fa fa-envira','2020-01-13 07:58:04','2020-01-13 07:58:04','209009');
/*!40000 ALTER TABLE `sys_resources` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_resources_back`
--

DROP TABLE IF EXISTS `sys_resources_back`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_resources_back` (
  `id` bigint(20) unsigned NOT NULL DEFAULT '0',
  `name` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `type` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `url` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `permission` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `parent_id` bigint(20) unsigned DEFAULT '0',
  `sort` int(10) unsigned DEFAULT NULL,
  `external` tinyint(1) unsigned DEFAULT NULL COMMENT '是否外部链接',
  `available` tinyint(1) unsigned DEFAULT '0',
  `icon` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '菜单图标',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `tree_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_resources_back`
--

LOCK TABLES `sys_resources_back` WRITE;
/*!40000 ALTER TABLE `sys_resources_back` DISABLE KEYS */;
INSERT INTO `sys_resources_back` VALUES (1,'用户管理','menu',NULL,'user',0,1,0,1,'fa fa-user-secret','2018-05-14 17:02:54','2018-05-14 17:02:54','001'),(2,'用户列表','menu','/page/sys/user/userList','user:list',1,1,0,1,'fa fa-user-circle-o','2017-12-17 05:56:15','2018-05-11 06:44:20','001001'),(3,'新增用户','button',NULL,'user:add',2,2,0,1,NULL,'2018-05-15 22:07:43','2018-05-15 22:16:23','001001001'),(4,'批量删除用户','button',NULL,'user:batchDelete',2,3,0,1,NULL,'2018-05-15 22:12:23','2018-05-15 22:16:35','001001005'),(5,'编辑用户','button',NULL,'user:edit',2,4,0,1,NULL,'2018-05-15 22:12:50','2018-05-15 22:16:43','001001002'),(6,'删除用户','button',NULL,'user:delete',2,5,0,0,NULL,'2018-05-15 22:13:09','2018-05-15 22:51:50','001001003'),(7,'分配用户角色','button',NULL,'user:addRole',2,6,0,1,NULL,'2018-05-15 06:15:28','2018-05-15 06:16:54','001001004'),(10,'新增资源','button',NULL,'resource:add',149,2,0,1,NULL,'2018-05-15 06:07:43','2018-05-15 06:16:23','002001001'),(11,'批量删除资源','button',NULL,'resource:batchDelete',149,3,0,1,NULL,'2018-05-15 06:12:23','2018-05-15 06:16:35','002001004'),(12,'编辑资源','button',NULL,'resource:edit',149,4,0,1,NULL,'2018-05-15 06:12:50','2018-05-15 06:16:43','002001002'),(13,'删除资源','button',NULL,'resource:delete',149,5,0,1,NULL,'2018-05-15 06:13:09','2018-05-15 06:51:50','002001003'),(14,'角色管理','menu','/page/sys/role/roleList','roles',1,2,0,1,'fa fa-graduation-cap','2017-12-20 15:31:27','2018-05-15 12:51:06','001002'),(15,'新增角色','button',NULL,'role:add',14,2,0,1,NULL,'2018-05-15 22:07:43','2018-05-15 22:16:23','00100201'),(16,'批量删除角色','button',NULL,'role:batchDelete',149,3,0,1,NULL,'2018-05-15 06:12:23','2018-05-15 06:16:35','001002004'),(17,'编辑角色','button',NULL,'role:edit',14,4,0,1,NULL,'2018-05-15 22:12:50','2018-05-15 22:16:43','001002002'),(18,'删除角色','button',NULL,'role:delete',14,5,0,1,NULL,'2018-05-15 22:13:09','2018-05-15 22:51:50','001002003'),(19,'分配角色资源','button',NULL,'role:addResource',14,6,0,1,NULL,'2018-05-16 02:04:21','2018-05-16 02:04:21','001002005'),(89,'系统管理','menu','','sys',0,2,NULL,1,'fa fa-desktop','2019-12-15 18:56:17','2019-12-15 18:56:17','002'),(149,'系统功能','menu','/page/sys/res/resList','resource:list',89,3,0,1,'fa fa-cubes','2019-12-23 11:33:27','2019-12-23 11:33:27','002001'),(151,'考勤管理','menu','','attach',0,NULL,1,1,'','2020-01-04 16:49:27','2020-01-04 16:49:27','003'),(152,'系统代码管理','menu','/page/sys/code/codeSetList','sysCodeSet:list',89,NULL,0,1,'fa fa-book','2020-01-06 08:41:33','2020-01-06 08:41:33','002002'),(154,'测试1号','menu','',NULL,151,NULL,1,0,'fa fa-bandcamp','2020-01-09 16:32:28','2020-01-09 16:32:28','003001'),(155,'测试2号','menu','',NULL,151,NULL,1,0,'fa fa-bandcamp','2020-01-09 00:32:59','2020-01-09 00:32:59','003002');
/*!40000 ALTER TABLE `sys_resources_back` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS `sys_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_role` (
  `id` varchar(40) NOT NULL,
  `name` varchar(100) DEFAULT NULL COMMENT '角色名',
  `description` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
INSERT INTO `sys_role` VALUES ('1','role:root','超级管理员',1,'2017-12-20 16:40:24','2017-12-20 16:40:26'),('15','','无敌',1,'2020-01-02 16:10:33','2020-01-02 16:10:33'),('2','role:admin','管理员',1,'2017-12-22 13:56:39','2017-12-22 13:56:39'),('aaa1',NULL,'3333',0,'2020-01-06 22:44:11','2020-01-06 22:44:11');
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role_permission`
--

DROP TABLE IF EXISTS `sys_role_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `permission_id` int(11) DEFAULT NULL COMMENT '权限id',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delete_status` varchar(1) DEFAULT '1' COMMENT '是否有效 1有效     2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='角色-权限关联表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role_permission`
--

LOCK TABLES `sys_role_permission` WRITE;
/*!40000 ALTER TABLE `sys_role_permission` DISABLE KEYS */;
INSERT INTO `sys_role_permission` VALUES (1,2,101,'2017-11-22 08:26:21','2017-11-22 08:26:32','1'),(2,2,102,'2017-11-22 08:26:21','2017-11-22 08:26:32','1'),(5,2,602,'2017-11-22 08:28:28','2017-11-22 08:28:28','1'),(6,2,601,'2017-11-22 08:28:28','2017-11-22 08:28:28','1'),(7,2,603,'2017-11-22 08:28:28','2017-11-22 08:28:28','1'),(8,2,703,'2017-11-22 08:28:28','2017-11-22 08:28:28','1'),(9,2,701,'2017-11-22 08:28:28','2017-11-22 08:28:28','1'),(10,2,702,'2017-11-22 08:28:28','2017-11-22 08:28:28','1'),(11,2,704,'2017-11-22 08:28:31','2017-11-22 08:28:31','1'),(12,2,103,'2017-11-22 08:28:31','2017-11-22 08:28:31','1'),(13,3,601,'2017-11-22 08:28:47','2017-11-22 08:28:47','1'),(14,3,701,'2017-11-22 08:28:47','2017-11-22 08:28:47','1'),(15,3,702,'2017-11-22 08:35:01','2017-11-22 08:35:01','1'),(16,3,704,'2017-11-22 08:35:01','2017-11-22 08:35:01','1'),(17,3,102,'2017-11-22 08:35:01','2017-11-22 08:35:01','1'),(18,3,101,'2017-11-22 08:35:01','2017-11-22 08:35:01','1'),(19,3,603,'2017-11-22 08:35:01','2017-11-22 08:35:01','1');
/*!40000 ALTER TABLE `sys_role_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role_resources`
--

DROP TABLE IF EXISTS `sys_role_resources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_role_resources` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) unsigned NOT NULL,
  `resources_id` bigint(20) unsigned NOT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1310 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role_resources`
--

LOCK TABLES `sys_role_resources` WRITE;
/*!40000 ALTER TABLE `sys_role_resources` DISABLE KEYS */;
INSERT INTO `sys_role_resources` VALUES (27,1,20,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(28,1,21,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(29,1,1,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(30,1,2,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(31,1,3,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(32,1,4,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(33,1,5,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(34,1,6,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(35,1,7,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(36,1,8,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(37,1,9,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(38,1,10,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(39,1,11,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(40,1,12,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(41,1,13,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(42,1,14,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(43,1,15,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(44,1,16,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(45,1,17,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(46,1,18,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(47,1,19,'2018-05-17 12:52:41','2018-05-17 12:52:41'),(1103,15,1,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1104,15,2,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1105,15,3,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1106,15,4,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1107,15,5,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1108,15,6,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1109,15,7,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1110,15,14,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1111,15,15,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1112,15,17,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1113,15,18,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1114,15,19,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1115,15,89,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1116,15,149,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1117,15,10,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1118,15,11,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1119,15,12,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1120,15,13,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1121,15,16,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1122,15,159,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1123,15,152,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1124,15,151,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1125,15,160,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1126,15,161,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1127,15,162,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1128,15,163,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1129,15,164,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1130,15,165,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1131,15,166,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1132,15,167,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1133,15,168,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1134,15,169,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1135,15,170,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1136,15,171,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1137,15,172,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1138,15,173,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1139,15,174,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1140,15,175,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1141,15,176,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1142,15,177,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1143,15,178,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1144,15,179,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1145,15,180,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1146,15,181,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1147,15,182,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1148,15,183,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1149,15,184,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1150,15,185,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1151,15,186,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1152,15,187,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1153,15,188,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1154,15,189,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1155,15,190,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1156,15,191,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1157,15,192,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1158,15,193,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1159,15,194,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1160,15,195,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1161,15,196,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1162,15,197,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1163,15,198,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1164,15,199,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1165,15,200,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1166,15,201,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1167,15,202,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1168,15,203,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1169,15,204,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1170,15,205,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1171,15,206,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1172,15,207,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1173,15,208,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1174,15,209,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1175,15,210,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1176,15,211,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1177,15,212,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1178,15,213,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1179,15,214,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1180,15,215,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1181,15,216,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1182,15,217,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1183,15,218,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1184,15,219,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1185,15,220,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1186,15,221,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1187,15,222,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1188,15,223,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1189,15,224,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1190,15,225,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1191,15,226,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1192,15,227,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1193,15,228,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1194,15,229,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1195,15,230,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1196,15,231,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1197,15,232,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1198,15,233,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1199,15,234,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1200,15,235,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1201,15,236,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1202,15,237,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1203,15,238,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1204,15,239,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1205,15,240,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1206,15,241,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1207,15,242,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1208,15,243,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1209,15,244,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1210,15,245,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1211,15,246,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1212,15,247,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1213,15,248,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1214,15,249,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1215,15,250,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1216,15,251,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1217,15,252,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1218,15,253,'2020-01-10 15:48:57','2020-01-10 15:48:57'),(1287,2,225,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1288,2,226,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1289,2,229,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1290,2,254,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1291,2,241,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1292,2,2,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1293,2,3,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1294,2,4,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1295,2,5,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1296,2,6,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1297,2,7,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1298,2,14,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1299,2,15,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1300,2,17,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1301,2,18,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1302,2,19,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1303,2,149,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1304,2,10,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1305,2,11,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1306,2,12,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1307,2,13,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1308,2,16,'2020-01-20 15:52:07','2020-01-20 15:52:07'),(1309,2,159,'2020-01-20 15:52:07','2020-01-20 15:52:07');
/*!40000 ALTER TABLE `sys_role_resources` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL COMMENT '登录密码',
  `nickname` varchar(30) DEFAULT '' COMMENT '昵称',
  `mobile` varchar(30) DEFAULT NULL COMMENT '手机号',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱地址',
  `qq` varchar(20) DEFAULT NULL COMMENT 'QQ',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `gender` tinyint(2) unsigned DEFAULT NULL COMMENT '性别',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `user_type` enum('ROOT','ADMIN','USER') DEFAULT 'ADMIN' COMMENT '超级管理员、管理员、普通用户',
  `reg_ip` varchar(30) DEFAULT NULL COMMENT '注册IP',
  `last_login_ip` varchar(30) DEFAULT NULL COMMENT '最近登录IP',
  `last_login_time` datetime DEFAULT NULL COMMENT '最近登录时间',
  `login_count` int(10) unsigned DEFAULT '0' COMMENT '登录次数',
  `remark` varchar(100) DEFAULT NULL COMMENT '用户备注',
  `status` int(1) unsigned DEFAULT NULL COMMENT '用户状态',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` VALUES (1,'root','CGUx1FN++xS+4wNDFeN6DA==','超级管理员','15151551516','843977358@qq.com','843977358',NULL,0,'https://static.zhyd.me/static/img/favicon.ico','ROOT',NULL,'127.0.0.1','2018-05-17 13:09:35',228,NULL,1,'2018-01-02 09:32:15','2018-05-17 13:09:35'),(2,'admin','123456','管理员','15151551516','843977358@qq.com','843977358',NULL,1,NULL,'ADMIN','0:0:0:0:0:0:0:1','0:0:0:0:0:0:0:1','2018-05-17 13:08:30',13,NULL,1,'2018-01-02 15:56:34','2018-05-17 13:08:30'),(8,'yong','123456','小糊涂仙','666','','','2020-01-11',1,NULL,'ADMIN',NULL,NULL,NULL,0,NULL,1,'2020-01-01 18:26:09','2020-01-01 18:26:09');
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user_role`
--

DROP TABLE IF EXISTS `sys_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) unsigned NOT NULL,
  `role_id` bigint(20) unsigned NOT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_role`
--

LOCK TABLES `sys_user_role` WRITE;
/*!40000 ALTER TABLE `sys_user_role` DISABLE KEYS */;
INSERT INTO `sys_user_role` VALUES (1,1,1,'2018-01-02 10:47:27','2018-01-02 10:47:27'),(15,2,2,'2019-12-30 15:05:52','2019-12-30 15:05:52'),(25,8,15,'2020-01-10 15:49:16','2020-01-10 15:49:16');
/*!40000 ALTER TABLE `sys_user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-20 16:09:26
