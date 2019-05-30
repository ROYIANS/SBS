package cn.royians.sbs.service;


import com.alibaba.fastjson.JSONObject;

public interface BookService {

    String addBook(String title, String description, Integer uid) throws Exception;

    String addChapter(Integer bid, String title) throws Exception;

    String addSection(Integer bid, Integer zid, String title, String content) throws Exception;

    String editBook(String title, String description, Integer bid) throws Exception;

    String editChapter(Integer bid, Integer zid, String title) throws Exception;

    String editSection(Integer bid, Integer zid, Integer sid, String title, String content) throws Exception;

    String del(Integer bid) throws Exception;

    String delChapter(Integer bid, Integer zid) throws Exception;

    String delSection(Integer bid, Integer zid, Integer sid) throws Exception;

    JSONObject getBookList(Integer gid) throws Exception;

    String realDdel(Integer bid) throws Exception;

    JSONObject getChaAndSecList(Integer bid, Integer zid, Integer sid) throws Exception;

    String getContent(Integer bid, Integer zid, Integer sid) throws Exception;
}
