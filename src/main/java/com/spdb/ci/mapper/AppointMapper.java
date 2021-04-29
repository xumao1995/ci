package com.spdb.ci.mapper;

import com.spdb.ci.bean.dto.AppointDto;
import com.spdb.ci.bean.vo.ReqAppoint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AppointMapper {
    Integer addAppoint(ReqAppoint reqAppoint);

    List<AppointDto> findAppointListByTel(String tel);

    Integer getQueuePersonal(@Param("branch") String branch,@Param("appointDate") String date, @Param("appointTime") String time);
}
