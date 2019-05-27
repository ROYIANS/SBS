package cn.royians.sbs.mapper;

import cn.royians.sbs.pojo.MCourse;
import cn.royians.sbs.pojo.MCourseExample;
import cn.royians.sbs.pojo.MCourseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCourseMapper {
    int countByExample(MCourseExample example);

    int deleteByExample(MCourseExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(MCourseWithBLOBs record);

    int insertSelective(MCourseWithBLOBs record);

    List<MCourseWithBLOBs> selectByExampleWithBLOBs(MCourseExample example);

    List<MCourse> selectByExample(MCourseExample example);

    MCourseWithBLOBs selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") MCourseWithBLOBs record, @Param("example") MCourseExample example);

    int updateByExampleWithBLOBs(@Param("record") MCourseWithBLOBs record, @Param("example") MCourseExample example);

    int updateByExample(@Param("record") MCourse record, @Param("example") MCourseExample example);

    int updateByPrimaryKeySelective(MCourseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MCourseWithBLOBs record);

    int updateByPrimaryKey(MCourse record);
}