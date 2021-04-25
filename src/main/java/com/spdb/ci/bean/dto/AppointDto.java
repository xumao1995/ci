package com.spdb.ci.bean.dto;

import com.spdb.ci.bean.po.BranchPo;
import com.spdb.ci.bean.po.BusinessPo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName AppointBo 类
 * @Description 预约业务类
 * @Author 许茂
 * @Date 2021/4/24 0:20
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointDto {
    private Integer id;

    private String appointDate;

    private String appointTime;

    private String customerName;

    private String idType;

    private String idNo;

    private String tel;

    private String note;

    private String status;

    private BranchPo branchPo;

    private BusinessPo businessPo;
}
