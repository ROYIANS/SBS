alter table m_book modify B_ID int auto_increment;

alter table m_book
  add constraint m_book_m_group_G_ID_fk
    foreign key (B_GID) references m_group (G_ID);

alter table m_book
  add constraint m_book_m_user_U_ID_fk
    foreign key (B_UID) references m_user (U_ID);

