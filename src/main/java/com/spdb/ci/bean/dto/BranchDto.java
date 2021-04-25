package com.spdb.ci.bean.dto;

import com.spdb.ci.bean.po.RegionPo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName BranchBo 类
 * @Description 网点业务类
 * @Author 许茂
 * @Date 2021/4/24 0:01
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchDto {
    private Integer id;

    private String branchName;

    /*网点所属区域*/
    private RegionPo regionPo;

}
