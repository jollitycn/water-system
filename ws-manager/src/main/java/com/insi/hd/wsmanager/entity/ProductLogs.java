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
 * 商品操作日志
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_product_logs")
@ApiModel(value="ProductLogs对象", description="商品操作日志")
public class ProductLogs implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品操作日志ID")
    @TableId(value = "product_logs_id", type = IdType.ID_WORKER)
    private Long productLogsId;

    @ApiModelProperty(value = "操作人ID")
    private Long operatorId;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operateTime;

    @ApiModelProperty(value = "操作类型（1：新增，2：删除，3：修改，4：上下架）")
    private Integer operateType;

    @ApiModelProperty(value = "商品ID")
    private Long productId;

    @ApiModelProperty(value = "操作内容")
    private String content;

    @ApiModelProperty(value = "操作结果（0：成功，1：失败）")
    private Integer operateResult;


}
