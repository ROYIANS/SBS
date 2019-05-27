package cn.royians.sbs.mapper;

import cn.royians.sbs.pojo.MBook;
import cn.royians.sbs.pojo.MBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MBookMapper {
    int countByExample(MBookExample example);

    int deleteByExample(MBookExample example);

    int deleteByPrimaryKey(Integer bId);

    int insert(MBook record);

    int insertSelective(MBook record);

    List<MBook> selectByExample(MBookExample example);

    MBook selectByPrimaryKey(Integer bId);

    int updateByExampleSelective(@Param("record") MBook record, @Param("example") MBookExample example);

    int updateByExample(@Param("record") MBook record, @Param("example") MBookExample example);

    int updateByPrimaryKeySelective(MBook record);

    int updateByPrimaryKey(MBook record);
}