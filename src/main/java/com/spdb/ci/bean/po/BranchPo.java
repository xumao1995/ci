package com.spdb.ci.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName BranchPo 类
 * @Description 网点类 持久化类
 * @Author 许茂
 * @Date 2021/4/23 23:14
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchPo {
    private Integer id;

    private String branchName;

    private String address;

    private Integer regionId;
}
