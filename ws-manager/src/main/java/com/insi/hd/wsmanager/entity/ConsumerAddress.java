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
 * 消费者地址
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_consumer_address")
@ApiModel(value="ConsumerAddress对象", description="消费者地址")
public class ConsumerAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "消费者地址ID")
    @TableId(value = "consumer_address_id", type = IdType.ID_WORKER)
    private Long consumerAddressId;

    @ApiModelProperty(value = "消费者ID")
    private Long consumerId;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "收件人姓名")
    private String recipientName;

    @ApiModelProperty(value = "收件人电话")
    private String recipientPhone;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "是否是默认地址（0：否，1：是）")
    private Integer isDefaulted;

    @ApiModelProperty(value = "是否删除（0：正常，1：已删除）")
    private Integer isDeleted;


}
