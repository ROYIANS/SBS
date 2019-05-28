package cn.royians.sbs.service;


public interface BookService {

    String addBook(String title, String description, Integer uid) throws Exception;

    String addChapter(Integer bid, String title) throws Exception;

    String addSection(Integer bid, Integer zid, String title, String content) throws Exception;
}
