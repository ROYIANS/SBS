package cn.royians.sbs.controller;

import cn.royians.sbs.pojo.Message;
import cn.royians.sbs.service.BookService;
import cn.royians.sbs.service.CommonService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    // TODO: 2019/5/28 图书列表

    @PostMapping("/edit")
    @ResponseBody
    public Message edit(@RequestParam String title, @RequestParam String description, @RequestParam Integer bid) {
        try {
            String data = bookService.editBook(title, description, bid);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("chapter/edit")
    @ResponseBody
    public Message editChapter(@RequestParam Integer bid, @RequestParam Integer zid, @RequestParam String title) {
        try {
            String data = bookService.editChapter(bid, zid, title);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("section/edit")
    @ResponseBody
    public Message editSection(@RequestParam Integer bid, @RequestParam Integer zid, @RequestParam Integer sid, @RequestParam String title, @RequestParam String content) {
        try {
            String data = bookService.editSection(bid, zid, sid, title, content);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("del")
    @ResponseBody
    public Message del(@RequestParam Integer bid) {
        try {
            String data = bookService.del(bid);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("chapter/del")
    @ResponseBody
    public Message delChapter(@RequestParam Integer bid, @RequestParam Integer zid) {
        try {
            String data = bookService.delChapter(bid, zid);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("section/del")
    @ResponseBody
    public Message delSection(@RequestParam Integer bid, @RequestParam Integer zid, @RequestParam Integer sid) {
        try {
            String data = bookService.delSection(bid, zid, sid);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @GetMapping("list")
    @ResponseBody
    public Message getBookList(@RequestParam Integer gid) {
        try {
            JSONObject data = bookService.getBookList(gid);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

}
