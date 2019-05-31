package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MUserMapper;
import cn.royians.sbs.pojo.*;
import cn.royians.sbs.service.*;
import cn.royians.sbs.util.HttpClientExample;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final
    MUserMapper userMapper;

    private final
    CommonService commonService;

    @Autowired
    public UserServiceImpl(CommonService commonService, MUserMapper userMapper) {
        this.commonService = commonService;
        this.userMapper = userMapper;
    }

    @Override
    public MUser registerOrLogin(String JSCODE) throws Exception {
        try {
            String APPID = "wxbfbe8ed998b8c233";
            String SECRET = "d8cb8e071ed73f8b135d5850a8337aa1";
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + APPID + "&secret=" + SECRET + "&js_code=" + JSCODE + "&grant_type=authorization_code";
            HttpClientExample http = new HttpClientExample();
            JSONObject jsonObject = http.sendGet(url);
            System.out.println(jsonObject.toJSONString());
            if (this.findUserByOpenID(jsonObject.getString("openid")) == null) {
                MUser userInfo = new MUser();
                userInfo.setuOpenid(jsonObject.getString("openid"));
                userInfo.setuSessionKey(jsonObject.getString("session_key"));
                userInfo.setuGid(1);
                userInfo.setuRegisterTime(new Date(System.currentTimeMillis()));
                userMapper.insertSelective(userInfo);
            }
            if (!this.findUserByOpenID(jsonObject.getString("openid")).getuSessionKey().equals(jsonObject.getString("session_key"))) {
                MUser userInfo = this.findUserByOpenID(jsonObject.getString("openid"));
                userInfo.setuSessionKey(jsonObject.getString("session_key"));
                return userInfo;
            }
            return this.findUserByOpenID(jsonObject.getString("openid"));
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public void updateUserInfo(String INFO, MUser newUser) throws Exception {
        JSONObject object = JSON.parseObject(INFO);
        System.out.println(INFO);
        newUser.setuNickname(object.getString("nickName"));
        newUser.setuAvatarUrl(object.getString("avatarUrl"));
        newUser.setuCity(object.getString("city"));
        newUser.setuLanguage(object.getString("language"));
        System.out.println(newUser.toString());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String newSessionKey = passwordEncoder.encode(newUser.getuSessionKey());//加密
        newUser.setU3rdKey(newSessionKey);
        userMapper.updateByPrimaryKeySelective(newUser);
    }

    @Override
    public MUser findUserByOpenID(String openid) throws Exception {
        MUserExample userInfoExample = new MUserExample();
        MUserExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUOpenidEqualTo(openid);
        List<MUser> users = userMapper.selectByExample(userInfoExample);
        if(users.size()==0){
            return null;
        }
        return users.get(0);
    }




    @Override
    public JSONObject getBooksOfUID(Integer uid) throws Exception {
        JSONObject data = new JSONObject();
        List<JSONObject> bookList = commonService.getBooksByUIDOrGID(uid, "uid");
        data.put("uid", uid);
        data.put("books", bookList);
        return data;
    }

    @Override
    public JSONObject getCoursesOfUID(Integer uid) throws Exception {
        JSONObject data = new JSONObject();
        List<MCourse> courses = commonService.getCoursesByUID(uid);
        JSONArray array = new JSONArray();
        for(MCourse course:courses) {
            JSONObject courseInfo = commonService.getCourseInfoByCID(course.getcId());
            array.add(courseInfo);
        }
        data.put("uid", uid);
        data.put("courses", array);
        return data;
    }
}
