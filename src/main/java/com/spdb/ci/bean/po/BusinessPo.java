package com.spdb.ci.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName BusinessPo 类
 * @Description 业务种类 持久化类
 * @Author 许茂
 * @Date 2021/4/23 23:40
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessPo {
    private Integer id;

    private String type;

    private String businessName;
}
