package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MBookMapper;
import cn.royians.sbs.pojo.MBook;
import cn.royians.sbs.pojo.MBookExample;
import cn.royians.sbs.pojo.MUser;
import cn.royians.sbs.service.BookService;
import cn.royians.sbs.service.CommonService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

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
        book.setbContent("{\"data\":[]}");
        book.setbCreateTime(date);
        book.setbUpdateTime(date);
        bookMapper.insertSelective(book);
        return "add new book successful.";
    }

    @Override
    public String addChapter(Integer bid, String title) throws Exception {
        MBook book = bookMapper.selectByPrimaryKey(bid);
        Date date = new Date(System.currentTimeMillis());
        JSONObject oldBook = JSON.parseObject(book.getbContent());
        JSONArray data = oldBook.getJSONArray("data");
        int lastChapter = 0;
        if (data.size() > 0) {
            JSONObject item = data.getJSONObject(data.size() - 1);
            lastChapter = item.getInteger("zid");
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("zid", lastChapter + 1);
        jsonObject.put("title", title);
        jsonObject.put("section", new JSONArray());
        data.add(jsonObject);
        JSONObject newBook = new JSONObject();
        newBook.put("data", data);
        book.setbContent(JSON.toJSONString(newBook));
        book.setbUpdateTime(date);
        bookMapper.updateByPrimaryKeySelective(book);
        return "add new chapter successful";
    }

    @Override
    public String addSection(Integer bid, Integer zid, String title, String content) throws Exception {
        MBook book = bookMapper.selectByPrimaryKey(bid);
        Date date = new Date(System.currentTimeMillis());
        JSONObject bookContent = JSON.parseObject(book.getbContent());
        JSONArray sections = bookContent.getJSONArray("data").getJSONObject(zid - 1).getJSONArray("section");
        int lastSection = 0;
        if (sections.size() > 0) {
            JSONObject item = sections.getJSONObject(sections.size() - 1);
            lastSection = item.getInteger("sid");
        }
        JSONObject newSection = new JSONObject();
        newSection.put("sid", lastSection+1);
        newSection.put("title", title);
        newSection.put("content", content);
        bookContent.getJSONArray("data").getJSONObject(zid - 1).getJSONArray("section").add(newSection);
        book.setbContent(JSON.toJSONString(bookContent));
        book.setbUpdateTime(date);
        bookMapper.updateByPrimaryKeySelective(book);
        return "add new section successful";
    }

    @Override
    public String editBook(String title, String description, Integer bid) throws Exception{
        MBook book = bookMapper.selectByPrimaryKey(bid);
        Date date = new Date(System.currentTimeMillis());
        book.setbTitle(title);
        book.setbDescription(description);
        book.setbUpdateTime(date);
        bookMapper.updateByPrimaryKeySelective(book);
        return "edit book info successful.";
    }

    @Override
    public String editChapter(Integer bid, Integer zid, String title) throws Exception{
        MBook book = bookMapper.selectByPrimaryKey(bid);
        JSONArray data = JSON.parseObject(book.getbContent()).getJSONArray("data");
        JSONObject jsonObject = data.getJSONObject(zid - 1);
        jsonObject.put("title", title);
        JSONObject newChapter = new JSONObject();
        newChapter.put("data", data);
        book.setbContent(JSON.toJSONString(newChapter));
        bookMapper.updateByPrimaryKeySelective(book);
        return "edit chapter info successful.";
    }

    @Override
    public String editSection(Integer bid, Integer zid, Integer sid, String title, String content) throws Exception {
        MBook book = bookMapper.selectByPrimaryKey(bid);
        JSONArray data = JSON.parseObject(book.getbContent()).getJSONArray("data");
        JSONObject jsonObject = data.getJSONObject(zid -1);
        JSONArray sectionArray = jsonObject.getJSONArray("section");
        JSONObject section = sectionArray.getJSONObject(sid - 1);
        section.put("title", title);
        section.put("content", content);
        JSONObject newSection = new JSONObject();
        newSection.put("data", data);
        book.setbContent(JSON.toJSONString(newSection));
        bookMapper.updateByPrimaryKeySelective(book);
        return "edit section info success.";
    }

    @Override
    public String del(Integer bid) throws  Exception{
        MBook book = bookMapper.selectByPrimaryKey(bid);
        book.setbIsDel(true);
        bookMapper.updateByPrimaryKeySelective(book);
        return "del book success.";
    }

    @Override
    public String delChapter(Integer bid, Integer zid) throws Exception {
        MBook book = bookMapper.selectByPrimaryKey(bid);
        JSONArray data = JSON.parseObject(book.getbContent()).getJSONArray("data");
        data.remove(zid - 1);
        for (int i = 0; i < data.size(); i++) {
            JSONObject jsonObject = data.getJSONObject(i);
            jsonObject.put("zid", i+1);
        }
        JSONObject newChapter = new JSONObject();
        newChapter.put("data", data);
        book.setbContent(JSON.toJSONString(newChapter));
        bookMapper.updateByPrimaryKeySelective(book);
        return "del chapter successful";
    }

    @Override
    public String delSection(Integer bid, Integer zid, Integer sid) throws Exception {
        MBook book = bookMapper.selectByPrimaryKey(bid);
        JSONArray data = JSON.parseObject(book.getbContent()).getJSONArray("data");
        JSONObject jsonObject = data.getJSONObject(zid -1);
        JSONArray sectionArray = jsonObject.getJSONArray("section");
        sectionArray.remove(sid - 1);
        for (int i = 0; i < sectionArray.size(); i++) {
            JSONObject section = sectionArray.getJSONObject(i);
            section.put("sid", i+1);
        }
        JSONObject newSection = new JSONObject();
        newSection.put("data", data);
        book.setbContent(JSON.toJSONString(newSection));
        bookMapper.updateByPrimaryKeySelective(book);
        return "del section successful";
    }

    @Override
    public JSONObject getBookList(Integer gid) throws Exception {
        JSONObject data = new JSONObject();
        List<JSONObject> books = commonService.getBooksByUIDOrGID(gid, "gid");
        data.put("data", books);
        return data;
    }

    @Override
    public String realDdel(Integer bid) throws Exception {
        bookMapper.deleteByPrimaryKey(bid);
        return "real delete this book.";
    }
}
