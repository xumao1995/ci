package com.spdb.ci.service.impl;

import com.spdb.ci.bean.po.BusinessPo;
import com.spdb.ci.mapper.BusinessMapper;
import com.spdb.ci.service.BusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BusinessServiceImpl 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/4/24 12:34
 * @Version 1.0
 */
@Service
public class BusinessServiceImpl implements BusinessService {
    @Resource
    private BusinessMapper businessMapper;
    @Override
    public List<BusinessPo> getAll() {
        return businessMapper.findAll();
    }
}
