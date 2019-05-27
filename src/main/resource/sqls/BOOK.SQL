create table M_BOOK
(
  B_ID int not null,
  B_UID int not null,
  B_GID int not null,
  B_TITLE VARCHAR(40) not null,
  B_DESCRIPTION VARCHAR(400) null,
  B_CONTENT JSON not null,
  B_CREATE_TIME DATETIME not null,
  B_UPDATE_TIME DATETIME not null,
  B_IS_DEL BOOLEAN default FALSE not null
);

create unique index M_BOOK_B_ID_uindex
  on M_BOOK (B_ID);

alter table M_BOOK
  add constraint M_BOOK_pk
    primary key (B_ID);

