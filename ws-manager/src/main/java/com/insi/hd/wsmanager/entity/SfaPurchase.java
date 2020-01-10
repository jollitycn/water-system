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
 * SFA采购
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sfa_purchase")
@ApiModel(value="SfaPurchase对象", description="SFA采购")
public class SfaPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "SFA采购ID")
    @TableId(value = "sfa_purchase_id", type = IdType.ID_WORKER)
    private Long sfaPurchaseId;

    @ApiModelProperty(value = "采购单号")
    private String purchaseNo;

    @ApiModelProperty(value = "状态（0：未生成，1：已生成，2：异常）")
    private Integer waterCouponStatus;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "水票类型")
    private Integer couponType;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "采购总金额")
    private Double totalPrice;

    @ApiModelProperty(value = "经销商ID")
    private Long dealerId;


}
