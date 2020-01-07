package com.insi.da.wscommon.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: hd
 * @description: 请求基本参数封装类
 * @author: XuChao
 * @create: 2019-12-24 15:03
 **/
@ApiModel("请求基本参数封装类")
@Data
public class BaseRequest {

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "页码编号",example="1")
    private Integer pageNum=1;

    @ApiModelProperty(value = "页码大小",example="10")
    private Integer pageSize=10;

    @ApiModelProperty(value = "搜索关键字")
    private String searchKey;
}
