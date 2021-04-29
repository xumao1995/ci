package com.spdb.ci.controller;

import com.spdb.ci.bean.dto.AppointDto;
import com.spdb.ci.bean.vo.RepAppoint;
import com.spdb.ci.bean.vo.ReqAppoint;
import com.spdb.ci.service.AppointService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.List;

import static com.spdb.ci.utils.Transform.transformAppointDto2Vo;

/**
 * @ClassName AppointController 类
 * @Description 预约 接口 类
 * @Author 许茂
 * @Date 2021/4/24 13:54
 * @Version 1.0
 */
@RestController
@RequestMapping("/appoint")
public class AppointController {
    @Resource
    private AppointService appointService;

    @PostMapping("/add")
    public Integer addAppoint(@RequestBody ReqAppoint reqAppoint){

        return  appointService.addAppoint(reqAppoint);
    }

    @GetMapping("/customer")
    public List<RepAppoint> getAppointListByTel(@RequestParam("tel") String tel){
        List<AppointDto> appointDtoList = appointService.getAppointListByTel(tel);
        List<RepAppoint> appointList = transformAppointDto2Vo(appointDtoList);
        System.out.println(appointList);
        return appointList;
    }

    @GetMapping("/queue")
    public Integer getQueuePersonal(@RequestParam("branch") String branch,@RequestParam("date") String date, @RequestParam("time") String time){
        Integer num = appointService.getQueuePersonal(branch,date,time);
        return num;
    }
}
