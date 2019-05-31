create schema sbs collate utf8_general_ci;

create table m_group
(
  G_ID int auto_increment,
  G_NAME varchar(40) not null,
  G_AVATARURL varchar(200) not null,
  G_REGISTER_TIME datetime not null,
  G_INVITE_CODE varchar(200) not null,
  G_ANDMIN int null,
  constraint M_GROUP_G_ID_uindex
    unique (G_ID)
);

alter table m_group
  add primary key (G_ID);

insert into m_group (G_NAME, G_AVATARURL, G_REGISTER_TIME, G_INVITE_CODE, G_ANDMIN) VALUES ('未加入家庭','null',now(),'null',null);


create table m_user
(
  U_ID int auto_increment,
  U_OPENID varchar(100) not null,
  U_GID int null,
  U_SESSION_KEY varchar(200) not null,
  U_3RD_KEY varchar(200) null,
  U_NICKNAME varchar(100) null,
  U_AVATAR_URL varchar(200) null,
  U_CITY varchar(40) null,
  U_LANGUAGE varchar(40) null,
  U_REGISTER_TIME datetime not null,
  constraint M_USER_U_3RD_KEY_uindex
    unique (U_3RD_KEY),
  constraint M_USER_U_ID_uindex
    unique (U_ID),
  constraint M_USER_U_OPENID_uindex
    unique (U_OPENID),
  constraint M_USER_U_SESSION_KEY_uindex
    unique (U_SESSION_KEY),
  constraint m_user_m_group_G_ID_fk
    foreign key (U_GID) references m_group (g_id)
);

insert into m_user (U_OPENID, U_GID, U_SESSION_KEY, U_3RD_KEY, U_NICKNAME, U_AVATAR_URL, U_CITY, U_LANGUAGE, U_REGISTER_TIME) VALUES ('null',1,'null','null','admin','null','null','null',now());
update m_group set G_ANDMIN = 1 where G_ID = 1;

create table m_book
(
  B_ID int auto_increment,
  B_UID int not null,
  B_GID int not null,
  B_TITLE varchar(40) not null,
  B_DESCRIPTION varchar(400) null,
  B_CONTENT json not null,
  B_CREATE_TIME datetime not null,
  B_UPDATE_TIME datetime not null,
  B_IS_DEL tinyint(1) default 0 not null,
  constraint M_BOOK_B_ID_uindex
    unique (B_ID),
  constraint m_book_m_group_G_ID_fk
    foreign key (B_GID) references m_group (g_id),
  constraint m_book_m_user_U_ID_fk
    foreign key (B_UID) references m_user (u_id)
);

alter table m_book
  add primary key (B_ID);

create table m_course
(
  C_ID int auto_increment,
  C_UID int not null,
  C_CONTENT json not null,
  C_IMG_URLS json null,
  C_VID_URL varchar(400) null,
  C_CREATE_TIME datetime not null,
  C_IS_DEL tinyint(1) default 0 not null,
  constraint M_COURSE_C_ID_uindex
    unique (C_ID),
  constraint m_course_m_user_U_ID_fk
    foreign key (C_UID) references m_user (u_id)
);

alter table m_course
  add primary key (C_ID);

alter table m_group
  add constraint m_group_m_user_U_ID_fk
    foreign key (G_ANDMIN) references m_user (u_id);

alter table m_user
  add primary key (U_ID);


