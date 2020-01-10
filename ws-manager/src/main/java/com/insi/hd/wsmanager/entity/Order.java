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
 * 订单
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_order")
@ApiModel(value="Order对象", description="订单")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单ID")
    @TableId(value = "order_id", type = IdType.ID_WORKER)
    private Long orderId;

    @ApiModelProperty(value = "消费者ID")
    private Long consumerId;

    @ApiModelProperty(value = "消费者地址ID")
    private Long consumerAddressId;

    @ApiModelProperty(value = "订单状态（0：未支付，1：已支付）")
    private Integer orderStatus;

    @ApiModelProperty(value = "订单总价")
    private Double totalPrice;

    @ApiModelProperty(value = "支付方式（0：微信支付，1：其他）")
    private Integer paymentType;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "水票状态（0：未生成，1：已生成，2：异常）")
    private Integer waterCouponStatus;

    @ApiModelProperty(value = "微信返回状态")
    private Integer wecharStatus;

    @ApiModelProperty(value = "是否删除（0：正常，1：已删除）")
    private Integer isDeleted;


}
