package com.spdb.ci.controller;

import com.spdb.ci.bean.dto.RegionDto;
import com.spdb.ci.service.RegionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName RegionController 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/4/24 0:20
 * @Version 1.0
 */
@RestController
@RequestMapping("/region")
public class RegionController {
    @Resource
    private RegionService regionService;

    @GetMapping("/all")
    public List<RegionDto> getAll(){
        return regionService.getAll();
    }
}
