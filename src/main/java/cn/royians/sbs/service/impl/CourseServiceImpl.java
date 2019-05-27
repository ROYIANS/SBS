package cn.royians.sbs.service.impl;

import cn.royians.sbs.pojo.MCourse;
import cn.royians.sbs.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Override
    public List<MCourse> getCoursesByUID(Integer uid) {
        return null;
    }
}
