package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MBookMapper;
import cn.royians.sbs.pojo.MBook;
import cn.royians.sbs.pojo.MUser;
import cn.royians.sbs.service.BookService;
import cn.royians.sbs.service.CommonService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class BookServiceImpl implements BookService {

    private final
    MBookMapper bookMapper;

    private final
    CommonService commonService;

    @Autowired
    public BookServiceImpl(CommonService commonService, MBookMapper bookMapper) {
        this.commonService = commonService;
        this.bookMapper = bookMapper;
    }

    @Override
    public String addBook(String title, String description, Integer uid) throws Exception {
        MBook book = new MBook();
        MUser user = commonService.findUserByUID(uid);
        Date date = new Date(System.currentTimeMillis());
        book.setbTitle(title);
        book.setbDescription(description);
        book.setbUid(uid);
        book.setbGid(user.getuGid());
        book.setbContent("{}");
        book.setbCreateTime(date);
        book.setbUpdateTime(date);
        bookMapper.insertSelective(book);
        return "add new book successful.";
    }

    @Override
    public String addChapter(Integer bid, String title) {
        MBook book = bookMapper.selectByPrimaryKey(bid);
        Date date = new Date(System.currentTimeMillis());
        JSONObject jsonObject = JSON.parseObject(book.getbContent());
        jsonObject.put(title,"{}");
        book.setbContent(JSON.toJSONString(jsonObject));
        book.setbUpdateTime(date);
        bookMapper.updateByPrimaryKeySelective(book);
        return "add new chapter successful";
    }
}
