create table M_COURSE
(
  C_ID int not null,
  C_UID int not null,
  C_CONTENT TEXT not null,
  C_IMG_URLS TEXT null,
  C_VID_URL VARCHAR(400) null,
  C_CREATE_TIME DATETIME not null,
  C_IS_DEL BOOLEAN default FALSE not null
);

create unique index M_COURSE_C_ID_uindex
  on M_COURSE (C_ID);

alter table M_COURSE
  add constraint M_COURSE_pk
    primary key (C_ID);

