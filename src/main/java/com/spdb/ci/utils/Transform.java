package com.spdb.ci.utils;

import com.spdb.ci.bean.dto.AppointDto;
import com.spdb.ci.bean.vo.RepAppoint;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Transform 类
 * @Description 实体转换类
 * @Author 许茂
 * @Date 2021/4/24 15:27
 * @Version 1.0
 */
public class Transform {
    /**
     *
     * @param appointDtoList
     * @return
     */
    public static List<RepAppoint> transformAppointDto2Vo(List<AppointDto> appointDtoList){
        List<RepAppoint> appointList = appointDtoList.stream().map(
                e->new RepAppoint(e.getId(),
                        e.getBranchPo().getBranchName(),
                        e.getBusinessPo().getBusinessName(),
                        e.getAppointDate()+" "+e.getAppointTime(),
                        e.getStatus(),
                        e.getStatus())
        ).collect(Collectors.toList());
        return appointList;
    }



}
