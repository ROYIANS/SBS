package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MCourseMapper;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements CourseService {

    private final
    MCourseMapper courseMapper;

    private final
    CommonService commonService;

    @Autowired
    public CourseServiceImpl(CommonService commonService, MCourseMapper courseMapper) {
        this.commonService = commonService;
        this.courseMapper = courseMapper;
    }
}
