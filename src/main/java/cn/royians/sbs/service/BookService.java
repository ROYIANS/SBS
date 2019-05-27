package cn.royians.sbs.service;

import cn.royians.sbs.pojo.MBook;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface BookService {
    List<JSONObject> getBooksByUID(Integer uid);
}
