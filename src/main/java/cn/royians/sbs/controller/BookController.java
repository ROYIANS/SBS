package cn.royians.sbs.controller;

import cn.royians.sbs.pojo.MBook;
import cn.royians.sbs.pojo.Message;
import cn.royians.sbs.service.BookService;
import cn.royians.sbs.service.CommonService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


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

    @PostMapping("/add")
    @ResponseBody
    public Message add(@RequestParam String title, @RequestParam String description, @RequestParam Integer uid) {
        try {
            String data = bookService.addBook(title, description, uid);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/chapter/add")
    @ResponseBody
    public Message addChapter(@RequestParam Integer bid, @RequestParam String title) {
        try {
            String data = bookService.addChapter(bid, title);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/section/add")
    @ResponseBody
    public Message addSection(@RequestParam Integer bid, @RequestParam Integer zid, @RequestParam String title, @RequestParam String content) {
        try {
            String data = bookService.addSection(bid, zid, title, content);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }
}
