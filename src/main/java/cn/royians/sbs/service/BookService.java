package cn.royians.sbs.service;


public interface BookService {

    String addBook(String title, String description, Integer uid) throws Exception;

    String addChapter(Integer bid, String title);
}
