create table M_GROUP
(
  G_ID int not null,
  G_NAME VARCHAR(40) not null,
  G_AVATARURL VARCHAR(200) not null,
  G_REGESTER_TIME DATETIME not null
);

create unique index M_GROUP_G_ID_uindex
  on M_GROUP (G_ID);

alter table M_GROUP
  add constraint M_GROUP_pk
    primary key (G_ID);

