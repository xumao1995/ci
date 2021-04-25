package com.spdb.ci.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName AppointPo 类
 * @Description 预约类 持久化对象
 * @Author 许茂
 * @Date 2021/4/23 23:20
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointPo {
    private Integer id;

    private String appointDate;

    private String appointTime;

    private String customerName;

    private String idType;

    private String idNo;

    private String tel;

    private String note;

    private String status;

    private Integer branchId;

    private Integer businessId;
}
