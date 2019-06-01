package com.study_online.mapper;

import com.smart.pojo.TbAttendance;
import com.smart.pojo.TbAttendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAttendanceMapper {
    long countByExample(TbAttendanceExample example);

    int deleteByExample(TbAttendanceExample example);

    int deleteByPrimaryKey(String attendanceId);

    int insert(TbAttendance record);

    int insertSelective(TbAttendance record);

    List<TbAttendance> selectByExample(TbAttendanceExample example);

    TbAttendance selectByPrimaryKey(String attendanceId);

    int updateByExampleSelective(@Param("record") TbAttendance record, @Param("example") TbAttendanceExample example);

    int updateByExample(@Param("record") TbAttendance record, @Param("example") TbAttendanceExample example);

    int updateByPrimaryKeySelective(TbAttendance record);

    int updateByPrimaryKey(TbAttendance record);
}