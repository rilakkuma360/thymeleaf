insert into SYS_USER (id, account, user_name, pass_word) values (1, 'wyf', 'wyf', 'wyf');
insert into SYS_USER (id, account, user_name, pass_word) values (2, 'zl', '张磊', 'zl');

insert into SYS_ROLE (id, name) values (1, 'ROLE_ADMIN');
insert into SYS_ROLE (id, name) values (2, 'ROLE_USER');

insert into SYS_USER_ROLES(SYS_USER_ID, ROLES_ID) values(1,1);
insert into SYS_USER_ROLES(SYS_USER_ID, ROLES_ID) values(2,2);
