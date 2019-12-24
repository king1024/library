/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.18 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `sys_menu` (
	`MENU_ID` varchar (192),
	`MENU_NAME` varchar (300),
	`MENU_URL` varchar (300),
	`PARENT_MENU_ID` varchar (192),
	`UPDATE_TIME` datetime ,
	`icon_cls` varchar (300)
); 
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('1','敏捷开发','','','2019-12-19 18:56:11','fa fa-send-o');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('1_1','代码生成器','pages/1.html','1','2019-12-19 18:56:16','fa fa-desktop');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('1_2','单页管理','pages/1.html','1','2019-12-19 18:56:17','fa fa-search');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('1_3','插件演示','pages/1.html','1','2019-12-19 18:56:17','fa fa-send-o');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('1_4','开发示例','','1','2019-12-19 18:56:17','fa fa-window-restore');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('1_4_1','商机管理','pages/1.html','1_4','2019-12-19 18:56:17','fa fa-assistive-listening-systems');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('21E4F72B9D274510AB219C33D792A101','用户新增','','21E4F72B9D274510AB219C33D792A4C4','2019-12-12 15:10:46',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('21E4F72B9D274510AB219C33D792A102','用户列表','','21E4F72B9D274510AB219C33D792A4C4','2019-12-12 15:10:46',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('21E4F72B9D274510AB219C33D792A4C4','用户管理','/app/page/sysuser','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:18',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('3D7C1106526F457BBB8B15E72478E983','角色管理','/app/page/sysrole','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:18',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('65E16E3E1EFC484A8CBD2AD77D8D3100','书本管理','','','2019-12-12 15:10:46',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('65E16E3E1EFC484A8CBD2AD77D8D3101','书本新增','','65E16E3E1EFC484A8CBD2AD77D8D3100','2019-12-12 15:10:46',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('65E16E3E1EFC484A8CBD2AD77D8D3102','书本列表','','65E16E3E1EFC484A8CBD2AD77D8D3100','2019-12-12 15:10:46',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('65E16E3E1EFC484A8CBD2AD77D8D3200','英雄联盟','','','2019-12-12 15:10:46',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('65E16E3E1EFC484A8CBD2AD77D8D3F92','系统管理','','','2019-12-12 09:59:18',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('6E62020D770346F08A4287FF205EEB8F','机构管理','/app/page/sysgroup','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:17',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('8C95B11FF4C042DDB3AF2C467B593295','修改密码','/app/page/syspasswd','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:18',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('A57EF00DD8934819AE2311DC88B622C1','菜单管理','/app/page/sysmenu','65E16E3E1EFC484A8CBD2AD77D8D3F92','2019-12-12 09:59:18',NULL);
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('bbgl','报表管理','pages/1.html','bbzx','2019-12-19 18:56:19','fa fa-cogs');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('bbsl','报表实例','','bbzx','2019-12-19 18:58:32','fa fa-file-powerpoint-o');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('bbxq','报表模板','','bbzx','2019-12-19 18:56:19','fa fa-wpforms');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('bbzx','报表中心','','','2019-12-19 18:56:19','fa fa-area-chart');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('bdfbsl','表单发布实例','','bdzx','2019-12-19 18:56:18','fa fa-list-alt');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('bdzx','表单中心','','','2019-12-19 18:56:18','fa fa-table');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('bmgl','部门管理','pages/1.html','dwzz','2019-12-19 18:56:18','fa fa-th-list');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('ccbb','仓存报表','pages/1.html','bbxq','2019-12-19 18:56:19','fa fa-area-chart');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('cgbb','采购报表','pages/1.html','bbxq','2019-12-19 18:56:19','fa fa-bar-chart');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('csbd','测试表单','pages/1.html','bdfbsl','2019-12-19 18:56:18','fa fa-bandcamp');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('dcpz','导出配置','pages/1.html','excel','2019-12-19 18:56:17','fa fa-sign-out');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('ddgn','订单功能','pages/1.html','bdfbsl','2019-12-19 18:56:18','fa fa-address-book');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('djbm','单据编码','pages/1.html','xzgl','2019-12-19 18:56:17','fa fa-barcode');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('drpz','导入配置','pages/1.html','excel','2019-12-19 18:56:17','fa fa-sign-out');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('dwzz','单位组织','','','2019-12-19 18:56:18','fa fa-coffee');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('dzqz','电子签章','pages/1.html','ggxx','2019-12-19 18:56:20','fa fa-registered');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('excel','Excel配置','','xtgl','2019-12-19 18:56:17','fa fa-file-excel-o');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('fbbdgn','发布表单功能','pages/1.html','bdzx','2019-12-19 18:56:18','fa fa-list-alt');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('ggxx','公共信息','','','2019-12-19 18:56:19','fa fa-globe');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('gsgl','公司管理','pages/1.html','dwzz','2019-12-19 18:56:18','fa fa-sitemap');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('gwgl','岗位管理','pages/1.html','dwzz','2019-12-19 18:56:18','fa fa-graduation-cap');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('gzwt','工作委托','pages/1.html','lczx','2019-12-19 18:56:19','fa fa-coffee');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('hyda','会员档案','pages/1.html','bdfbsl','2019-12-19 18:56:18','fa fa-address-card-o');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('jsgl','角色管理','pages/1.html','dwzz','2019-12-19 18:56:18','fa fa-paw');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('khdd','客户订单','pages/1.html','1_4','2019-12-19 18:56:17','fa fa-modx');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('khgl','客户管理','pages/1.html','1_4','2019-12-19 18:56:17','fa fa-vcard');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('khxq1','客户详情','pages/1.html','ggxx','2019-12-19 18:56:20','fa-braille');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('kpxx','开票信息','pages/1.html','1_4','2019-12-19 18:56:17','fa fa-file-excel-o');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('lcjk','流程监控','pages/1.html','lczx','2019-12-19 18:56:19','fa fa-eye');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('lczx','流程中心','','','2019-12-19 18:56:19','fa fa-share-alt');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('mbgl','模板管理','pages/1.html','lczx','2019-12-19 18:56:19','fa fa-share-alt');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('qjgl','请假管理','pages/1.html','bdfbsl','2019-12-19 18:56:18','fa fa-user-circle');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('qyhsz','企业号设置','pages/1.html','wxgl','2019-12-19 18:56:20','fa fa-plug');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('rcgl','日程管理','pages/1.html','ggxx','2019-12-19 18:56:20','fa fa-calendar');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('sjbgl','数据表管理','pages/1.html','sjgl','2019-12-19 18:56:18','fa fa-table');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('sjgl','数据管理','','xzgl','2019-12-19 18:56:17','fa fa-database');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('sjklj','数据库连接','pages/1.html','sjgl','2019-12-19 18:56:18','fa fa-plug');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('sjqxgl','数据权限管理','','xtgl','2019-12-19 18:56:18','fa fa-briefcase');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('sjygl','数据源管理','pages/1.html','sjgl','2019-12-19 18:56:18','fa fa-bullseye');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('sjzd','数据字典','pages/1.html','xzgl','2019-12-19 18:56:17','fa fa-book');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('sxbb','销售报表','pages/1.html','bbxq','2019-12-19 18:56:19','fa fa-line-chart');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('szbb','收支报表','pages/1.html','bbxq','2019-12-19 18:56:19','fa fa-pie-chart');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('tzgg','通知公告','pages/1.html','ggxx','2019-12-19 18:56:20','fa fa-volume-up');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('wdrw','我的任务','pages/1.html','lczx','2019-12-19 18:56:19','fa fa-file-word-o');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('wjzl','文件资料','pages/1.html','ggxx','2019-12-19 18:56:20','fa fa-jsfiddle');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('wxgl','微信管理',' ','ydgl','2019-12-19 18:56:20','fa fa-weixin');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xshh','销售混合','pages/1.html','bbsl','2019-12-19 18:56:19','fa fa-area-chart');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xslb','销售列表','pages/1.html','bbsl','2019-12-19 18:56:19','fa fa-area-chart');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xstb','销售图表','pages/1.html','bbsl','2019-12-19 18:56:19','fa fa-area-chart');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xtgl','系统管理','','','2019-12-19 18:56:17','fa fa-desktop');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xtgn','系统功能','pages/1.html','xzgl','2019-12-19 18:56:17','fa fa-navicon');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xtlcgl','系统流程案例','pages/1.html','lczx','2019-12-19 18:56:19','fa fa-industry');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xtrz','系统日志','','xtgl','2019-12-19 18:56:18','fa fa-warning');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xwzx','新闻中心','pages/1.html','ggxx','2019-12-19 18:56:20','fa-feed');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('xzgl','行政管理','pages/1.html','xzgl','2019-12-19 18:56:17','fa fa-leaf');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('ydgl','移动管理','','','2019-12-19 18:56:20','fa fa-android');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('yhgl','用户管理','pages/1.html','dwzz','2019-12-19 18:56:18','fa fa-user');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('yjzx','邮件中心','pages/1.html','ggxx','2019-12-19 18:56:20','fa fa-send');
insert into `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_URL`, `PARENT_MENU_ID`, `UPDATE_TIME`, `icon_cls`) values('zdybd','自定义表单','pages/1.html','bdzx','2019-12-19 18:56:18','fa fa-puzzle-piece');
