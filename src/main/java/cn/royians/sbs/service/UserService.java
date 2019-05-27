package cn.royians.sbs.service;

import cn.royians.sbs.pojo.MUser;

public interface UserService {
    MUser registerOrLogin(String jscode);
}
