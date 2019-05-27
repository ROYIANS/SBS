package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MUserMapper;
import cn.royians.sbs.pojo.*;
import cn.royians.sbs.service.BookService;
import cn.royians.sbs.service.CourseService;
import cn.royians.sbs.service.GroupService;
import cn.royians.sbs.service.UserService;
import cn.royians.sbs.util.HttpClientExample;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final
    MUserMapper userMapper;

    private final
    GroupService groupService;

    private final
    BookService bookService;

    private final
    CourseService courseService;

    @Autowired
    public UserServiceImpl(MUserMapper userMapper, GroupService groupService, BookService bookService, CourseService courseService) {
        this.userMapper = userMapper;
        this.groupService = groupService;
        this.bookService = bookService;
        this.courseService = courseService;
    }

    @Override
    public MUser registerOrLogin(String JSCODE) {
        try {
            String APPID = "";
            String SECRET = "";
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + APPID + "&secret=" + SECRET + "&js_code=" + JSCODE + "&grant_type=authorization_code";
            HttpClientExample http = new HttpClientExample();
            JSONObject jsonObject = http.sendGet(url);
            if (this.findUserByOpenID(jsonObject.getString("openid")) == null) {
                MUser userInfo = new MUser();
                userInfo.setuOpenid(jsonObject.getString("openid"));
                userInfo.setuSessionKey(jsonObject.getString("session_key"));
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
    public void updateUserInfo(String INFO, MUser newUser) {
        JSONObject object = JSON.parseObject(INFO);
        newUser.setuNickname(object.getString("nickname"));
        newUser.setuAvatarUrl(object.getString("avatarUrl"));
        newUser.setuCity(object.getString("city"));
        newUser.setuLanguage(object.getString("language"));
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String newSessionKey = passwordEncoder.encode(newUser.getuSessionKey());//加密
        newUser.setU3rdKey(newSessionKey);
        userMapper.updateByPrimaryKeySelective(newUser);
    }

    @Override
    public MUser findUserByOpenID(String openid) {
        MUserExample userInfoExample = new MUserExample();
        MUserExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUOpenidEqualTo(openid);
        List<MUser> users = userMapper.selectByExample(userInfoExample);
        return users.get(0);
    }

    @Override
    public MUser findUserByUID(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public JSONObject getUserInfoByUID(Integer uid) {
        MUser user = this.findUserByUID(uid);
        MGroup group = groupService.getGroupByGID(user.getuGid());
        JSONObject data = new JSONObject();
        data.put("uid", uid);
        data.put("session_key", user.getU3rdKey());
        data.put("nickname", user.getuNickname());
        data.put("avatarUrl", user.getuAvatarUrl());
        data.put("group", group);
        data.put("city", user.getuCity());
        data.put("language", user.getuLanguage());
        data.put("registerTime", user.getuRegisterTime());
        return data;
    }

    @Override
    public JSONObject getBooksOfUID(Integer uid) {
        JSONObject data = new JSONObject();
        List<MBook> bookList = bookService.getBooksByUID(uid);
        data.put("uid", uid);
        data.put("books", bookList);
        return data;
    }

    @Override
    public JSONObject getCoursesOfUID(Integer uid) {
        JSONObject data = new JSONObject();
        List<MCourse> courseList = courseService.getCoursesByUID(uid);
        data.put("uid", uid);
        data.put("books", courseList);
        return data;
    }
}
