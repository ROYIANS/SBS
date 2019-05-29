package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MBookMapper;
import cn.royians.sbs.mapper.MCourseMapper;
import cn.royians.sbs.mapper.MGroupMapper;
import cn.royians.sbs.mapper.MUserMapper;
import cn.royians.sbs.pojo.*;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.util.DateExample;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {

    private final
    MUserMapper userMapper;

    private final
    MGroupMapper groupMapper;

    private final
    MBookMapper bookMapper;

    private final
    MCourseMapper courseMapper;

    @Autowired
    public CommonServiceImpl(MCourseMapper courseMapper, MBookMapper bookMapper, MGroupMapper groupMapper, MUserMapper userMapper) {
        this.courseMapper = courseMapper;
        this.bookMapper = bookMapper;
        this.groupMapper = groupMapper;
        this.userMapper = userMapper;
    }

    @Override
    public Message setSuccessMessage(Object data) {
        Message message = new Message();
        message.setData(data);
        message.setCode("200");
        message.setStatus("success");
        return message;
    }

    @Override
    public Message setFailureMessage(Exception e) {
        Message message = new Message();
        message.setData(e.getMessage()+", "+"At "+e.getStackTrace()[0]);
//        message.setData(e);
        message.setCode("500");
        message.setStatus("error");
        return message;
    }

    @Override
    public MBook getBookInfoByBID(Integer bid) throws Exception {
        return null;
    }

    @Override
    public JSONObject getUserInfoByUID(Integer uid) throws Exception {
        MUser user = this.findUserByUID(uid);
        MGroup group = this.findGroupByGID(user.getuGid());
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
    public JSONObject getCourseInfoByCID(Integer cid) throws Exception {
        JSONObject jsonObject = new JSONObject();
        MCourse course = courseMapper.selectByPrimaryKey(cid);
        JSONObject userInfo = this.getUserInfoByUID(course.getcUid());
        DateExample dateExample = new DateExample();
        String s = dateExample.dateToWord(course.getcCreateTime());
        jsonObject.put("userInfo", userInfo);
        jsonObject.put("content", course.getcContent());
        jsonObject.put("imgUrls", course.getcImgUrls());
        jsonObject.put("vidUrl", course.getcVidUrl());
        jsonObject.put("time", s);
        return jsonObject;
    }

    @Override
    public MCourse findCourseByCID(Integer cid) throws Exception {
        return courseMapper.selectByPrimaryKey(cid);
    }

    @Override
    public MGroup findGroupByGID(Integer gid) throws Exception {
        return groupMapper.selectByPrimaryKey(gid);
    }

    @Override
    public Integer getGIDByInviteCode(String code) throws Exception {
        MGroupExample groupExample = new MGroupExample();
        MGroupExample.Criteria criteria = groupExample.createCriteria();
        criteria.andGInviteCodeEqualTo(code);
        if(groupMapper.selectByExample(groupExample).size()==0){
            return 1;
        }
        return groupMapper.selectByExample(groupExample).get(0).getgId();
    }

    @Override
    public void updateUser(MUser user) throws Exception {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<JSONObject> getBooksByUIDOrGID(Integer id, String idType) throws Exception {
        MBookExample bookExample = new MBookExample();
        MBookExample.Criteria criteria = bookExample.createCriteria();
        criteria.andBIsDelEqualTo(false);
        if (idType.equals("uid")){
            criteria.andBUidEqualTo(id);
        }
        if (idType.equals("gid")) {
            criteria.andBGidEqualTo(id);
        }
        List<MBook> bookList = bookMapper.selectByExample(bookExample);
        List<JSONObject> jsonObjectList = new LinkedList<>();
        for(MBook book: bookList) {
            if (!book.getbIsDel()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("bid", book.getbId());
                jsonObject.put("uid", book.getbUid());
                jsonObject.put("gid", book.getbGid());
                jsonObject.put("title", book.getbTitle());
                jsonObject.put("description", book.getbDescription());
                jsonObject.put("create_time", book.getbCreateTime());
                jsonObject.put("update_time", book.getbUpdateTime());
                jsonObjectList.add(jsonObject);
            }
        }
        return jsonObjectList;
    }

    @Override
    public List<MCourse> getCoursesByUID(Integer uid) throws Exception {
        MCourseExample courseExample = new MCourseExample();
        MCourseExample.Criteria criteria = courseExample.createCriteria();
        criteria.andCUidEqualTo(uid);
        criteria.andCIsDelEqualTo(false);
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public List<MCourse> getCoursesBGID(Integer gid) throws Exception {
        List<MUser> users = getUsersByGID(gid);
        List<MCourse> list = new LinkedList<>();
        for (MUser user : users) {
            List<MCourse> courses = this.getCoursesByUID(user.getuId());
            list.addAll(courses);
        }
        return list;
    }

    @Override
    public MUser findUserByUID(Integer uid) throws Exception {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public List<MUser> getUsersByGID(Integer gid) throws Exception {
        MUserExample userExample = new MUserExample();
        MUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUGidEqualTo(gid);
        return userMapper.selectByExample(userExample);
    }
}
