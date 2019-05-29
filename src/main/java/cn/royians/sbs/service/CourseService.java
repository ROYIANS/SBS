package cn.royians.sbs.service;


import com.alibaba.fastjson.JSONArray;

public interface CourseService {

    String post(Integer uid, String content, String imgUrls, String vidUrl) throws Exception;

    String del(Integer cid) throws  Exception;

    String realDel(Integer cid) throws Exception;

    JSONArray list(Integer gid) throws Exception;
}
