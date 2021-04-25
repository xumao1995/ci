package com.spdb.ci.mapper;

import com.spdb.ci.bean.dto.RegionDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegionMapper {
    /**
     * 查询所有区域记录
     * @return
     */
    List<RegionDto> findAll();
}
