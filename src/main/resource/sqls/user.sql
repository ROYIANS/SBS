use sbs;

create table M_USER
(
  U_ID int not null,
  U_OPENID int not null,
  U_GID int default 0 not null,
  U_SESSION_KEY VARCHAR(200) not null,
  U_3RD_KEY VARCHAR(200) not null,
  U_NICKNAME VARCHAR(100) not null,
  U_AVATAR_URL VARCHAR(200) not null,
  U_CITY VARCHAR(40) null,
  U_LANGUAGE VARCHAR(40) null,
  U_REGESTER_TIME DATETIME not null
);

create unique index M_USER_U_3RD_KEY_uindex
  on M_USER (U_3RD_KEY);

create unique index M_USER_U_ID_uindex
  on M_USER (U_ID);

create unique index M_USER_U_OPENID_uindex
  on M_USER (U_OPENID);

create unique index M_USER_U_SESSION_KEY_uindex
  on M_USER (U_SESSION_KEY);

alter table M_USER
  add constraint M_USER_pk
    primary key (U_ID);

