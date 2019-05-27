package cn.royians.sbs.service;

import cn.royians.sbs.pojo.MBook;

import java.util.List;

public interface BookService {
    List<MBook> getBooksByUID(Integer uid);
}
