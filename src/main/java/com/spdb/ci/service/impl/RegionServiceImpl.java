package com.spdb.ci.service.impl;

import com.spdb.ci.bean.dto.RegionDto;
import com.spdb.ci.mapper.RegionMapper;
import com.spdb.ci.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName RegionServiceImpl 类
 * @Description 区域实现类
 * @Author 许茂
 * @Date 2021/4/22 23:29
 * @Version 1.0
 */
@Service
public class RegionServiceImpl implements RegionService {
    @Resource
    private RegionMapper regionMapper;


    @Override
    public List<RegionDto> getAll() {
        return regionMapper.findAll();
    }
}
