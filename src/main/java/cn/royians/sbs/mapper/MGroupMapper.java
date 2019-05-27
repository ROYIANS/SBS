package cn.royians.sbs.mapper;

import cn.royians.sbs.pojo.MGroup;
import cn.royians.sbs.pojo.MGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MGroupMapper {
    int countByExample(MGroupExample example);

    int deleteByExample(MGroupExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(MGroup record);

    int insertSelective(MGroup record);

    List<MGroup> selectByExample(MGroupExample example);

    MGroup selectByPrimaryKey(Integer gId);

    int updateByExampleSelective(@Param("record") MGroup record, @Param("example") MGroupExample example);

    int updateByExample(@Param("record") MGroup record, @Param("example") MGroupExample example);

    int updateByPrimaryKeySelective(MGroup record);

    int updateByPrimaryKey(MGroup record);
}