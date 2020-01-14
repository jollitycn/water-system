package com.insi.hd.wsmanager.entity;

import java.math.BigDecimal;
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
 * 商品
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_product")
@ApiModel(value="Product对象", description="商品")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品ID")
    @TableId(value = "product_id", type = IdType.ID_WORKER)
    private Long productId;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品类型")
    private String productType;

    @ApiModelProperty(value = "商品编号")
    private String productNumber;

    @ApiModelProperty(value = "商品规格")
    private String productSpecs;

    @ApiModelProperty(value = "商品数量")
    private Long quantity;

    @ApiModelProperty(value = "商品价格")
    private BigDecimal price;

    @ApiModelProperty(value = "优惠价格")
    private BigDecimal discountPrice;

    @ApiModelProperty(value = "是否启用优惠价（0：否，1：是）")
    private Integer isDiscountPrice;

    @ApiModelProperty(value = "商品图片")
    private String imageUrl;

    @ApiModelProperty(value = "商品详情页")
    private String productDetail;

    @ApiModelProperty(value = "商品描述")
    private String description;

    @ApiModelProperty(value = "上架状态（0：未上架，1：已上架）")
    private Integer status;

    @ApiModelProperty(value = "上架时间")
    private LocalDateTime putOnTime;

    @ApiModelProperty(value = "下架时间")
    private LocalDateTime pullOffTime;

    @ApiModelProperty(value = "创建人id")
    private Long createId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改人id")
    private Long modifyId;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除（0：正常，1：已删除）")
    private Integer isDeleted;


}
