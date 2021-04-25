package com.spdb.ci.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName RegionPo 类
 * @Description 区域 持久化对象
 * @Author 许茂
 * @Date 2021/4/22 23:39
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegionPo {
    private Integer id;

    private String regionName;

}
