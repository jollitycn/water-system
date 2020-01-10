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
 * 角色菜单关联
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_role_menu_relation")
@ApiModel(value="RoleMenuRelation对象", description="角色菜单关联")
public class RoleMenuRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色菜单关联ID")
    @TableId(value = "role_menu_relation_id", type = IdType.ID_WORKER)
    private Long roleMenuRelationId;

    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    @ApiModelProperty(value = "菜单ID")
    private Long menuId;


}
