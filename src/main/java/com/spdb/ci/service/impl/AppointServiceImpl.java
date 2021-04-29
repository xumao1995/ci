package com.spdb.ci.service.impl;

import com.spdb.ci.bean.dto.AppointDto;
import com.spdb.ci.bean.vo.ReqAppoint;
import com.spdb.ci.mapper.AppointMapper;
import com.spdb.ci.service.AppointService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AppointServiceImpl 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/4/24 14:07
 * @Version 1.0
 */
@Service
public class AppointServiceImpl implements AppointService {
    @Resource
    private AppointMapper appointMapper;
    @Override
    public Integer addAppoint(ReqAppoint reqAppoint) {
        return appointMapper.addAppoint(reqAppoint);
    }

    @Override
    public List<AppointDto> getAppointListByTel(String tel) {
        List<AppointDto> appointDtoList = appointMapper.findAppointListByTel(tel);
        return appointDtoList;
    }

    @Override
    public Integer getQueuePersonal(String branch, String date, String time) {
        return appointMapper.getQueuePersonal(date, branch, time);
    }
}
