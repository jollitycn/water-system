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
 * 消费者兑换水票记录
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_water_coupon_record")
@ApiModel(value="WaterCouponRecord对象", description="消费者兑换水票记录")
public class WaterCouponRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "消费者兑换水票记录ID")
    @TableId(value = "water_coupon_record_id", type = IdType.ID_WORKER)
    private Long waterCouponRecordId;

    @ApiModelProperty(value = "水票ID")
    private Long waterCouponId;

    @ApiModelProperty(value = "消费者ID")
    private Long consumerId;

    @ApiModelProperty(value = "兑换时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "送水员ID")
    private Long courierId;

    @ApiModelProperty(value = "水站ID")
    private Long waterSuppierId;

    @ApiModelProperty(value = "兑换地址")
    private String address;


}
