package cn.royians.sbs.controller;

import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
