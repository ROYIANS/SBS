use sbs;
insert into m_user (U_OPENID, U_GID, U_SESSION_KEY, U_3RD_KEY, U_NICKNAME, U_AVATAR_URL, U_CITY, U_LANGUAGE, U_REGISTER_TIME) VALUES ('null',null,'null','null','admin','null','null','null',now());
insert into m_group (G_NAME, G_AVATARURL, G_REGISTER_TIME, G_INVITE_CODE, G_ANDMIN) VALUES ('未加入家庭','null',now(),'null',1);