package com.insi.hd.wsmanager.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author ：liuhao
 * @date ：Created in 2020/1/13
 */
@Data
public class SfaPurchaseDetailVO {

    @ApiModelProperty(value = "SFA采购ID")
    private Long sfaPurchaseId;

    @ApiModelProperty(value = "采购单号")
    private String purchaseNo;

    @ApiModelProperty(value = "状态（0：未生成，1：已生成，2：异常）")
    private Integer waterCouponStatus;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "发布状态（0：未发布，1：已发布）")
    private Integer publishStatus;

    @ApiModelProperty(value = "经销商ID")
    private Long dealerId;

    @ApiModelProperty(value = "经销商名称")
    private String dealerName;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "商品ID")
    private Long productId;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品规格")
    private String productSpecs;

    @ApiModelProperty(value = "采购单分派明细")
    private List<WaterCouponDispatchVO> dispatchVOList;

}
