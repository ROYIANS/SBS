package cn.royians.sbs.controller;

import cn.royians.sbs.pojo.Message;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.CourseService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/api/course")
public class CourseController {
    private final
    CourseService courseService;
    
    private final
    CommonService commonService;

    @Autowired
    public CourseController(CourseService courseService, CommonService commonService) {
        this.courseService = courseService;
        this.commonService = commonService;
    }

    @PostMapping("/post")
    @ResponseBody
    public Message post(@RequestParam Integer uid, @RequestParam String content, @RequestParam String vidUrl, @RequestParam String imgUrls) {
        try {
            String data = courseService.post(uid, content, imgUrls, vidUrl);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @GetMapping("{cid}")
    @ResponseBody
    public Message get(@PathVariable Integer cid){
        try {
            JSONObject data = commonService.getCourseInfoByCID(cid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/del/{cid}")
    @ResponseBody
    public Message del(@PathVariable Integer cid) {
        try {
            String data = courseService.del(cid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/realDel/{cid}")
    @ResponseBody
    public Message realDel(@PathVariable Integer cid) {
        try {
            String data = courseService.realDel(cid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @GetMapping("/list")
    @ResponseBody
    public Message list(@RequestParam Integer gid, @RequestParam String t) {
        try {
            JSONArray data = courseService.list(gid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }
}
