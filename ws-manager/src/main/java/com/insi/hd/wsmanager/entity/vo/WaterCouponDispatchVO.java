package com.insi.hd.wsmanager.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ：liuhao
 * @date ：Created in 2020/1/13
 */

@Data
public class WaterCouponDispatchVO {

    @ApiModelProperty(value = "采购单水票分派ID")
    private Long waterCouponDispatchId;

    @ApiModelProperty(value = "经销商ID")
    private Long dealerId;

    @ApiModelProperty(value = "经销商名称")
    private String dealerName;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "操作人ID")
    private Long operatorId;

    @ApiModelProperty(value = "操作人姓名")
    private String operatorName;

    @ApiModelProperty(value = "分派时间")
    private LocalDateTime operateTime;

    @ApiModelProperty(value = "（0：未生成，1：已生成，2：异常）")
    private Integer waterCouponStatus;
}
