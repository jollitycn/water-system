package com.insi.hd.wsmanager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 采购单水票分派
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_water_coupon_dispatch")
@ApiModel(value="WaterCouponDispatch对象", description="采购单水票分派")
public class WaterCouponDispatch implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购单水票分派ID")
    @TableId(value = "water_coupon_dispatch_id", type = IdType.ID_WORKER)
    private Long waterCouponDispatchId;

    @ApiModelProperty(value = "SFA采购ID")
    private Long sfaPurchaseId;

    @ApiModelProperty(value = "经销商ID")
    private Long dealerId;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "操作人ID")
    private Long operatorId;

    @ApiModelProperty(value = "分派时间")
    private LocalDateTime operateTime;

    @ApiModelProperty(value = "（0：未生成，1：已生成，2：异常）")
    private Integer waterCouponStatus;


}
