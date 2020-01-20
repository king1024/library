-- 建库
CREATE DATABASE library;
-- 建用户
CREATE USER 'king'@'%' IDENTIFIED BY 'king1024';
GRANT ALL PRIVILEGES ON library.* TO 'king'@'%';
FLUSH PRIVILEGES;

ALTER USER 'king'@'%' IDENTIFIED WITH mysql_native_password BY 'king1024';



