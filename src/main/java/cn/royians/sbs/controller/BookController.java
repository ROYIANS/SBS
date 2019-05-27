package cn.royians.sbs.controller;

import cn.royians.sbs.service.BookService;
import cn.royians.sbs.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/book")
public class BookController {
    
    private final
    BookService bookService;
    
    private final
    CommonService commonService;

    @Autowired
    public BookController(BookService bookService, CommonService commonService) {
        this.bookService = bookService;
        this.commonService = commonService;
    }
}
