package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MCourseMapper;
import cn.royians.sbs.pojo.MCourse;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.CourseService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;


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

    @Override
    public String post(Integer uid, String content, String imgUrls, String vidUrl) throws Exception {
        MCourse course = new MCourse();
        Date date = new Date(System.currentTimeMillis());
        course.setcUid(uid);
        course.setcVidUrl(vidUrl);
        course.setcCreateTime(date);
        course.setcImgUrls(imgUrls);
        course.setcContent(content);
        courseMapper.insertSelective(course);
        return "post course success.";
    }

    @Override
    public String del(Integer cid) throws Exception {
        MCourse course = commonService.findCourseByCID(cid);
        course.setcIsDel(true);
        courseMapper.updateByPrimaryKeySelective(course);
        return "del course success";
    }

    @Override
    public String realDel(Integer cid) throws Exception {
        courseMapper.deleteByPrimaryKey(cid);
        return "real delete this course";
    }

    @Override
    public JSONArray list(Integer gid) throws Exception {
        List<MCourse> courses = commonService.getCoursesBGID(gid);
        JSONArray array = new JSONArray();
        for(MCourse course:courses) {
            JSONObject courseInfo = commonService.getCourseInfoByCID(course.getcId());
            array.add(courseInfo);
        }
        return array;
    }
}
