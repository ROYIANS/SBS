package cn.royians.sbs.service;

import cn.royians.sbs.pojo.*;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface CommonService {
    Message setSuccessMessage(Object data);
    Message setFailureMessage(Exception e);
    MBook getBookInfoByBID(Integer bid) throws Exception;
    MUser getUserInfoByUID(Integer uid) throws Exception;
    MCourse getCourseInfoByCID(Integer cid) throws Exception;
    MGroup getGroupInfoByGID(Integer gid) throws Exception;

    List<JSONObject> getBooksByUIDOrGID(Integer id, String idType) throws Exception;

    List<MCourse> getCoursesByUID(Integer uid) throws Exception;

    MUser findUserByUID(Integer uid) throws Exception;
}
