package cn.royians.sbs.service;

import cn.royians.sbs.pojo.*;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface CommonService {
    Message setSuccessMessage(Object data);
    Message setFailureMessage(Exception e);
    MBook getBookInfoByBID(Integer bid) throws Exception;
    JSONObject getUserInfoByUID(Integer uid) throws Exception;
    JSONObject getCourseInfoByCID(Integer cid) throws Exception;
    MCourse findCourseByCID(Integer cid) throws Exception;
    MGroup findGroupByGID(Integer gid) throws Exception;
    Integer getGIDByInviteCode(String code) throws Exception;
    void updateUser(MUser user) throws Exception;
    List<JSONObject> getBooksByUIDOrGID(Integer id, String idType) throws Exception;

    List<MCourse> getCoursesByUID(Integer uid) throws Exception;
    List<MCourse> getCoursesBGID(Integer gid) throws Exception;

    MUser findUserByUID(Integer uid) throws Exception;
    List<MUser> getUsersByGID(Integer gid) throws Exception;
}
