-- 建库
CREATE DATABASE library;
-- 建用户
CREATE USER 'king'@'%' IDENTIFIED BY 'king1024';
GRANT ALL PRIVILEGES ON library.* TO 'king'@'%';
FLUSH PRIVILEGES;

ALTER USER 'king'@'%' IDENTIFIED WITH mysql_native_password BY 'king1024';

DROP TABLE book_catalog;
CREATE TABLE book_catalog(
	catalog_id VARCHAR(64) PRIMARY KEY,
	catalog_name VARCHAR(150) NOT NULL,
	areas VARCHAR(10),
	floors VARCHAR(10),
	create_date VARCHAR(10),
	create_user_id VARCHAR(64)
);

INSERT INTO book_catalog VALUES ('c0000001','图书001','A001','2','2019-12-09','');
INSERT INTO book_catalog VALUES ('c0000002','图书002','A002','3','2019-12-10','');
INSERT INTO book_catalog VALUES ('c0000003','图书003','A003','2','2019-12-11','');
INSERT INTO book_catalog VALUES ('c0000004','图书004','A003','2','2019-12-11','');
INSERT INTO book_catalog ( catalog_id,catalog_name,areas,floors,create_date,create_user_id )
VALUES ('c0000005','图书005','A003','2','2019-12-11','');

UPDATE book_catalog SET areas='A005',floors='5' WHERE catalog_id='c0000005'
SELECT * FROM book_catalog ;

DROP TABLE SYS_MENU
CREATE TABLE SYS_MENU
(
  MENU_ID        VARCHAR(64) PRIMARY KEY,
  MENU_NAME      VARCHAR(100) NOT NULL,
  MENU_URL       VARCHAR(100),
  PARENT_MENU_ID VARCHAR(64),
  UPDATE_TIME    DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('6E62020D770346F08A4287FF205EEB8F', '机构管理', '/app/page/sysgroup', '65E16E3E1EFC484A8CBD2AD77D8D3F92');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('8C95B11FF4C042DDB3AF2C467B593295', '修改密码', '/app/page/syspasswd', '65E16E3E1EFC484A8CBD2AD77D8D3F92');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('65E16E3E1EFC484A8CBD2AD77D8D3F92', '系统管理', '', '');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('A57EF00DD8934819AE2311DC88B622C1', '菜单管理', '/app/page/sysmenu', '65E16E3E1EFC484A8CBD2AD77D8D3F92');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('3D7C1106526F457BBB8B15E72478E983', '角色管理', '/app/page/sysrole', '65E16E3E1EFC484A8CBD2AD77D8D3F92');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('21E4F72B9D274510AB219C33D792A4C4', '用户管理', '/app/page/sysuser', '65E16E3E1EFC484A8CBD2AD77D8D3F92');


INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('21E4F72B9D274510AB219C33D792A101', '用户新增', '', '21E4F72B9D274510AB219C33D792A4C4');
INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('21E4F72B9D274510AB219C33D792A102', '用户列表', '', '21E4F72B9D274510AB219C33D792A4C4');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('65E16E3E1EFC484A8CBD2AD77D8D3100', '书本管理', '', '');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('65E16E3E1EFC484A8CBD2AD77D8D3101', '书本新增', '', '65E16E3E1EFC484A8CBD2AD77D8D3100');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('65E16E3E1EFC484A8CBD2AD77D8D3102', '书本列表', '', '65E16E3E1EFC484A8CBD2AD77D8D3100');

INSERT INTO sys_menu (MENU_ID, MENU_NAME, MENU_URL, PARENT_MENU_ID)
VALUES ('65E16E3E1EFC484A8CBD2AD77D8D3200', '英雄联盟', '', '');


