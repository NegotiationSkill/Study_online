package com.study_online.mapper;

import com.smart.pojo.TbPosition;
import com.smart.pojo.TbPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPositionMapper {
    long countByExample(TbPositionExample example);

    int deleteByExample(TbPositionExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbPosition record);

    int insertSelective(TbPosition record);

    List<TbPosition> selectByExample(TbPositionExample example);

    TbPosition selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbPosition record, @Param("example") TbPositionExample example);

    int updateByExample(@Param("record") TbPosition record, @Param("example") TbPositionExample example);

    int updateByPrimaryKeySelective(TbPosition record);

    int updateByPrimaryKey(TbPosition record);
}