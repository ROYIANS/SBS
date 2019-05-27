package cn.royians.sbs.service;

import cn.royians.sbs.pojo.MUser;
import com.alibaba.fastjson.JSONObject;

public interface UserService {
    MUser registerOrLogin(String jscode);

    void updateUserInfo(String INFO, MUser newUser);

    MUser findUserByOpenID(String openid);

    MUser findUserByUID(Integer uid);

    JSONObject getUserInfoByUID(Integer uid);

    JSONObject getBooksOfUID(Integer uid);

    JSONObject getCoursesOfUID(Integer uid);
}
