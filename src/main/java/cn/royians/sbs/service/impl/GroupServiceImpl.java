package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MGroupMapper;
import cn.royians.sbs.pojo.MGroup;
import cn.royians.sbs.pojo.MUser;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.GroupService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    private final
    MGroupMapper groupMapper;

    private final
    CommonService commonService;

    @Autowired
    public GroupServiceImpl(MGroupMapper groupMapper, CommonService commonService) {
        this.groupMapper = groupMapper;
        this.commonService = commonService;
    }

    @Override
    public String add(String name, String avatar, Integer uid) throws Exception {
        MUser user = commonService.findUserByUID(uid);
        if(!user.getuGid().equals(1)) {
            return "you already in a group.";
        }
        MGroup group = new MGroup();
        Date date = new Date(System.currentTimeMillis());
        group.setgName(name);
        group.setgAvatarurl(avatar);
        group.setgRegisterTime(date);
        group.setgAndmin(uid);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String inviteCode = passwordEncoder.encode(date.toString());
        group.setgInviteCode(inviteCode);
        groupMapper.insertSelective(group);
        user.setuGid(commonService.getGIDByInviteCode(inviteCode));
        commonService.updateUser(user);
        return "add group success";
    }

    @Override
    public JSONObject get(Integer gid) throws Exception {
        MGroup group = commonService.findGroupByGID(gid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", group.getgName());
        jsonObject.put("avatarUrl", group.getgAvatarurl());
        jsonObject.put("code", group.getgInviteCode());
        jsonObject.put("registerTime", group.getgRegisterTime());
        return jsonObject;
    }

    @Override
    public String join(Integer uid, String code) throws Exception{
        MUser user = commonService.findUserByUID(uid);
        if (!user.getuGid().equals(1)){
            return "you have already in a group!";
        }
        if(commonService.getGIDByInviteCode(code).equals(1)){
            return "invite code is not correct";
        }
        user.setuGid(commonService.getGIDByInviteCode(code));
        commonService.updateUser(user);
        return "join group success.";
    }

    @Override
    public String del(Integer gid) throws Exception {
        List<MUser> users = commonService.getUsersByGID(gid);
        for(MUser user: users){
            this.quit(user.getuId());
        }
        groupMapper.deleteByPrimaryKey(gid);
        return "del group success";
    }

    @Override
    public String edit(Integer gid, String name, String avatar) throws Exception {
        MGroup group = groupMapper.selectByPrimaryKey(gid);
        group.setgName(name);
        group.setgAvatarurl(avatar);
        groupMapper.updateByPrimaryKeySelective(group);
        return "update group info success.";
    }

    @Override
    public String quit(Integer uid) throws Exception {
        MUser user = commonService.findUserByUID(uid);
        user.setuGid(1);
        commonService.updateUser(user);
        return "quit group success.";
    }

    @Override
    public List<JSONObject> getGroupUsers(Integer gid) throws Exception {
        List<MUser> users = commonService.getUsersByGID(gid);
        List<JSONObject> list = new LinkedList<>();
        for (MUser user : users) {
            JSONObject info = commonService.getUserInfoByUID(user.getuId());
            list.add(info);
        }
        return list;
    }

    @Override
    public String delUser(Integer uid) throws Exception {
        this.quit(uid);
        return "del user from group success";
    }
}
