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
 * 消费者
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_consumer")
@ApiModel(value="Consumer对象", description="消费者")
public class Consumer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "消费者ID")
    @TableId(value = "consumer_id", type = IdType.ID_WORKER)
    private Long consumerId;

    @ApiModelProperty(value = "消费者名称")
    private String consumerName;

    @ApiModelProperty(value = "联系电话")
    private String mobilePhone;

    @ApiModelProperty(value = "性别 （0：未知、1：男、2：女）")
    private Integer gender;

    @ApiModelProperty(value = "微信open_id")
    private String openId;

    @ApiModelProperty(value = "微信union_id")
    private String unionId;

    @ApiModelProperty(value = "国家")
    private String county;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区县")
    private String district;

    @ApiModelProperty(value = "头像")
    private String avatarUrl;

    @ApiModelProperty(value = "积分")
    private Double point;

    @ApiModelProperty(value = "消费者下单次数")
    private Integer orderCount;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "是否删除（0：正常，1：已删除）")
    private Integer isDeleted;


}
