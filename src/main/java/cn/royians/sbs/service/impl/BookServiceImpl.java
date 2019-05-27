package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MBookMapper;
import cn.royians.sbs.pojo.MBook;
import cn.royians.sbs.pojo.MBookExample;
import cn.royians.sbs.service.BookService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final
    MBookMapper bookMapper;

    @Autowired
    public BookServiceImpl(MBookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<JSONObject> getBooksByUID(Integer uid) {
        MBookExample bookExample = new MBookExample();
        MBookExample.Criteria criteria = bookExample.createCriteria();
        criteria.andBUidEqualTo(uid);
        List<MBook> bookList = bookMapper.selectByExample(bookExample);
        List<JSONObject> jsonObjectList = new LinkedList<>();
        for(MBook book: bookList) {
            if (!book.getbIsDel()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("bid", book.getbId());
                jsonObject.put("title", book.getbTitle());
                jsonObject.put("description", book.getbDescription());
                jsonObject.put("create_time", book.getbCreateTime());
                jsonObject.put("update_time", book.getbUpdateTime());
                jsonObjectList.add(jsonObject);
            }
        }
        return jsonObjectList;
    }
}
