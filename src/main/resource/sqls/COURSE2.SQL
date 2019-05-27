alter table m_course modify C_ID int auto_increment;

alter table m_course
  add constraint m_course_m_user_U_ID_fk
    foreign key (C_UID) references m_user (U_ID);

