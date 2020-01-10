package com.insi.hd.wsmanager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 经销商负责人关联
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_dealer_manager_relation")
@ApiModel(value="DealerManagerRelation对象", description="经销商负责人关联")
public class DealerManagerRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "经销商负责人关联ID")
    @TableId(value = "dealer_manager_relation_id", type = IdType.ID_WORKER)
    private Long dealerManagerRelationId;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "经销商ID")
    private Long dealerId;


}
