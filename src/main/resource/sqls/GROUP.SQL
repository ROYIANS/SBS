create table sbs.m_group
(
  G_ID int auto_increment,
  G_NAME varchar(40) not null,
  G_AVATARURL varchar(200) not null,
  G_REGISTER_TIME datetime not null,
  G_INVITE_CODE varchar(40) not null,
  constraint M_GROUP_G_ID_uindex
    unique (G_ID)
);

alter table sbs.m_group
  add primary key (G_ID);

