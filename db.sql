DROP TABLE IF EXISTS `T_UserInfo`;
CREATE TABLE `T_UserInfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(100) NOT NULL COMMENT '用户名',
  `password` VARCHAR(100) NOT NULL COMMENT '密码',
  `telephone` varchar(20) NOT NULL COMMENT '手机号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8mb4;
