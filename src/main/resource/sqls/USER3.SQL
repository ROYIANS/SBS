alter table m_user
  add constraint m_user_m_group_G_ID_fk
    foreign key (U_GID) references m_group (G_ID);

