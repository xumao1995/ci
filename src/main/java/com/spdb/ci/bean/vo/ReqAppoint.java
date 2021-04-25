package com.spdb.ci.bean.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ReqAppoint 类
 * @Description 新增预约接受参数类
 * @Author 许茂
 * @Date 2021/4/24 13:57
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqAppoint {



    private Integer branchId;

    private Integer businessId;

    private String appointDate;

    private String appointTime;

    private String customerName;

    private String idType;

    private String idNo;

    private String tel;

    private String note;


}
