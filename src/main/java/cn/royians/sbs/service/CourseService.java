package cn.royians.sbs.service;

import cn.royians.sbs.pojo.MCourse;

import java.util.List;

public interface CourseService {
    List<MCourse> getCoursesByUID(Integer uid);
}
