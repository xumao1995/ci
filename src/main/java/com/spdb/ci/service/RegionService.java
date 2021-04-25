package com.spdb.ci.service;

import com.spdb.ci.bean.dto.RegionDto;

import java.util.List;

/**
 * @ClassName RegionService 接口
 * @Description TODO
 * @Author 许茂
 * @Date 2021/4/22 23:28
 * @Version 1.0
 */
public interface RegionService {

    List<RegionDto> getAll();
}
