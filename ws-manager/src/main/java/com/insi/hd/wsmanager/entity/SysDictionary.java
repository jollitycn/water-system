package com.insi.hd.wsmanager.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统数字字典
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysDictionary对象", description="系统数字字典")
public class SysDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "数字字典id")
    private Long dictionaryId;

    @ApiModelProperty(value = "父id")
    private Long parentId;

    @ApiModelProperty(value = "数据编码")
    private String dataCode;

    @ApiModelProperty(value = "数据类型")
    private String dataType;

    @ApiModelProperty(value = "数据名称/数据值")
    private String dataValue;

    @ApiModelProperty(value = "数据说明")
    private String dataDesc;

    @ApiModelProperty(value = "数据顺序")
    private Integer dataOrder;

    @ApiModelProperty(value = "是否只读（0：否，1：只读）")
    private Integer isReadOnly;

    @ApiModelProperty(value = "状态（0：正常，1：删除）")
    private Integer isDeleted;

}
