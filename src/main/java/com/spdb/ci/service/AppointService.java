package com.spdb.ci.service;

import com.spdb.ci.bean.dto.AppointDto;
import com.spdb.ci.bean.vo.ReqAppoint;

import java.util.List;

/**
 * @ClassName AppointService 类
 * @Description 预约服务类
 * @Author 许茂
 * @Date 2021/4/24 13:55
 * @Version 1.0
 */
public interface AppointService {

    Integer addAppoint(ReqAppoint reqAppoint);

    List<AppointDto> getAppointListByTel(String tel);

    Integer getQueuePersonal(String branch, String date, String time);
}
