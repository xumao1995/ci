package com.spdb.ci.mapper;

import com.spdb.ci.bean.dto.AppointDto;
import com.spdb.ci.bean.vo.ReqAppoint;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppointMapper {
    Integer addAppoint(ReqAppoint reqAppoint);

    List<AppointDto> findAppointListByTel(String tel);
}
