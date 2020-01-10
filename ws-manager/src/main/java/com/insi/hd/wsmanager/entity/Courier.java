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
 * 送水员
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_courier")
@ApiModel(value="Courier对象", description="送水员")
public class Courier implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "送水员ID")
    @TableId(value = "courier_id", type = IdType.ID_WORKER)
    private Long courierId;

    @ApiModelProperty(value = "水站ID")
    private Long waterSupplierId;

    @ApiModelProperty(value = "送水员名称")
    private String courierName;

    @ApiModelProperty(value = "微信openid")
    private String openId;

    @ApiModelProperty(value = "联系方式")
    private String mobilePhone;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "账户状态（0：正常，1：停用）")
    private Integer activityStatus;

    @ApiModelProperty(value = "审核状态（0：未审核，1：已审核，2：审核不通过）")
    private Integer auditStatus;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除（0：正常，1：已删除）")
    private Integer isDeleted;


}
