package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MBookMapper;
import cn.royians.sbs.mapper.MCourseMapper;
import cn.royians.sbs.mapper.MGroupMapper;
import cn.royians.sbs.mapper.MUserMapper;
import cn.royians.sbs.pojo.*;
import cn.royians.sbs.service.CommonService;
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
        message.setData(e);
        message.setCode("-1");
        message.setStatus("error");
        return message;
    }

    @Override
    public MBook getBookInfoByBID(Integer bid) throws Exception {
        return null;
    }

    @Override
    public MUser getUserInfoByUID(Integer uid) throws Exception {
        return null;
    }

    @Override
    public MCourse getCourseInfoByCID(Integer cid) throws Exception {
        return null;
    }

    @Override
    public MGroup getGroupInfoByGID(Integer gid) throws Exception {
        return null;
    }

    @Override
    public List<JSONObject> getBooksByUIDOrGID(Integer id, String idType) throws Exception {
        MBookExample bookExample = new MBookExample();
        MBookExample.Criteria criteria = bookExample.createCriteria();
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
        return null;
    }

    @Override
    public MUser findUserByUID(Integer uid) throws Exception {
        return userMapper.selectByPrimaryKey(uid);
    }
}
