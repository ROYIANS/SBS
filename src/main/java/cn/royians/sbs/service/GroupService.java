package cn.royians.sbs.service;


import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface GroupService {

    String add(String name, String avatar, Integer uid) throws Exception;
    JSONObject get(Integer gid) throws Exception;

    String join(Integer uid, String code) throws Exception;

    String del(Integer gid) throws Exception;

    String edit(Integer gid, String name, String avatar) throws Exception;

    String quit(Integer uid) throws Exception;

    List<JSONObject> getGroupUsers(Integer gid) throws Exception;

    String delUser(Integer uid) throws Exception;
}
