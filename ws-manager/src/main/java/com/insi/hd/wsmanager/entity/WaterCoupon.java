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
 * 水票
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_water_coupon")
@ApiModel(value="WaterCoupon对象", description="水票")
public class WaterCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "水票ID")
    @TableId(value = "water_coupon_id", type = IdType.ID_WORKER)
    private Long waterCouponId;

    @ApiModelProperty(value = "uuid")
    private String uuid;

    @ApiModelProperty(value = "来源（0：SFA，1：电商)")
    private Integer source;

    @ApiModelProperty(value = "状态（0：未使用，1：已使用）")
    private Integer status;

    @ApiModelProperty(value = "水票类型")
    private Integer couponType;

    @ApiModelProperty(value = "水站ID")
    private Long waterSupplierId;

    @ApiModelProperty(value = "订单明细ID")
    private Long orderDetailId;

    @ApiModelProperty(value = "送水员ID")
    private Long courierId;

    @ApiModelProperty(value = "分派经销商ID")
    private Long sfaDealerId;

    @ApiModelProperty(value = "兑换经销商ID")
    private Long redeemDealerId;

    @ApiModelProperty(value = "采购单ID")
    private Long sfaPurchaseId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "打印状态（0：未打印，1：已打印）")
    private Integer printStatus;

    @ApiModelProperty(value = "商品规格")
    private String productSpecs;


}
