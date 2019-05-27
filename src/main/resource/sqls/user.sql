create table sbs.m_user
(
  U_ID int auto_increment,
  U_OPENID varchar(100) not null,
  U_GID int default 1 not null,
  U_SESSION_KEY varchar(200) not null,
  U_3RD_KEY varchar(200) not null,
  U_NICKNAME varchar(100) not null,
  U_AVATAR_URL varchar(200) not null,
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
    foreign key (U_GID) references sbs.m_group (g_id)
);

alter table sbs.m_user
  add primary key (U_ID);

