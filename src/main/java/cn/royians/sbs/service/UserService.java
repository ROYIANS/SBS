package cn.royians.sbs.service;

import cn.royians.sbs.pojo.MUser;
import com.alibaba.fastjson.JSONObject;

public interface UserService {
    MUser registerOrLogin(String jscode) throws Exception;

    void updateUserInfo(String INFO, MUser newUser) throws Exception;

    MUser findUserByOpenID(String openid) throws Exception;

    JSONObject getUserInfoByUID(Integer uid) throws Exception;

    JSONObject getBooksOfUID(Integer uid) throws Exception;

    JSONObject getCoursesOfUID(Integer uid) throws Exception;
}
