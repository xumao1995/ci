package com.spdb.ci.bean.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName RepAppoint 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/4/24 15:22
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepAppoint {

    private Integer id;

    private String branch;

    private String business;

    /*包含时间段 eg: 2021-04-26 8:00-9:00*/
    private String appointDate;

    private String status;

    private String operation;

    public String getStatus(){
        String str = "";
        switch (status){
            case "0":
                str = "待办理";
                break;
            case "1":
                str = "已办理";
                break;
            case "2":
                str = "过期";
                break;
            default:
                break;
        }
        return str;
    }
    public String getOperation(){
        String str = "";
        switch (status){
            case "0":
                str = "取消";
                break;
            default:
                break;
        }
        return str;
    }


}
