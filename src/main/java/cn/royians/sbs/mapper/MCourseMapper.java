package cn.royians.sbs.mapper;

import cn.royians.sbs.pojo.MCourse;
import cn.royians.sbs.pojo.MCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCourseMapper {
    int countByExample(MCourseExample example);

    int deleteByExample(MCourseExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(MCourse record);

    int insertSelective(MCourse record);

    List<MCourse> selectByExample(MCourseExample example);

    MCourse selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") MCourse record, @Param("example") MCourseExample example);

    int updateByExample(@Param("record") MCourse record, @Param("example") MCourseExample example);

    int updateByPrimaryKeySelective(MCourse record);

    int updateByPrimaryKey(MCourse record);
}