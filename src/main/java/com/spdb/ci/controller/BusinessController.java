package com.spdb.ci.controller;

import com.spdb.ci.bean.po.BusinessPo;
import com.spdb.ci.service.BusinessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BusinessController 类
 * @Description 业务种类接口类
 * @Author 许茂
 * @Date 2021/4/24 12:31
 * @Version 1.0
 */
@RestController
@RequestMapping("/business")
public class BusinessController {
    @Resource
    private BusinessService businessService;

    @GetMapping("/all")
    public List<BusinessPo> getAll(){
        return businessService.getAll();
    }
}
