insert into SYS_USER (id, account, user_name, pass_word) values (1, 'wyf', 'wyf', 'wyf');
insert into SYS_USER (id, account, user_name, pass_word) values (2, 'zl', '张磊', 'zl');

INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(1,'备注1','description','管理员');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(2,'备注2','description','一般用户');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(3,'备注3','description','业务办窗口');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(4,'备注4','description','业务办助理');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(5,'备注5','description','业务办打印员');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(6,'备注6','description','样品主任');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(7,'备注7','description','样品员工');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(8,'备注8','description','角色8');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(9,'备注9','description','角色9');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(10,'备注10','description','角色10');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(11,'备注11','description','角色11');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(12,'备注12','description','角色12');
INSERT INTO sys_role(`id`,`comment`,`description`,`name`)VALUES(13,'备注13','description','角色13');


insert into SYS_USER_ROLES(SYS_USER_ID, ROLES_ID) values(1,1);
insert into SYS_USER_ROLES(SYS_USER_ID, ROLES_ID) values(2,2);


INSERT INTO sys_authority(id, authority, name) VALUES (1,'ROLE_ADMIN','管理');
INSERT INTO sys_authority(id, authority, name) VALUES (2,'ROLE_USER','登录');
INSERT INTO sys_authority(id, authority, name) VALUES (3,'ROLE_3','签订合同');
INSERT INTO sys_authority(id, authority, name) VALUES (4,'ROLE_4','样品管理');
INSERT INTO sys_authority(id, authority, name) VALUES (5,'ROLE_5','财务收费');
INSERT INTO sys_authority(id, authority, name) VALUES (6,'ROLE_6','权限6');
INSERT INTO sys_authority(id, authority, name) VALUES (7,'ROLE_7','权限7');
INSERT INTO sys_authority(id, authority, name) VALUES (8,'ROLE_8','权限8');
INSERT INTO sys_authority(id, authority, name) VALUES (9,'ROLE_9','权限9');
INSERT INTO sys_authority(id, authority, name) VALUES (10,'ROLE_10','权限10');
INSERT INTO sys_authority(id, authority, name) VALUES (11,'ROLE_11','权限11');
INSERT INTO sys_authority(id, authority, name) VALUES (12,'ROLE_12','权限12');
