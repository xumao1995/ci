package com.spdb.ci.bean.dto;

import com.spdb.ci.bean.po.BranchPo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName RegionBo 类
 * @Description 区域业务对象
 * @Author 许茂
 * @Date 2021/4/22 23:39
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegionDto {
    private Integer id;

    private String regionName;

    /*区域下网点集合*/
    private List<BranchPo> branchPoList;
}
