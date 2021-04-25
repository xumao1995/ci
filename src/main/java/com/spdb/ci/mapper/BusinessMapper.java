package com.spdb.ci.mapper;

import com.spdb.ci.bean.po.BusinessPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusinessMapper {
    List<BusinessPo> findAll();
}
