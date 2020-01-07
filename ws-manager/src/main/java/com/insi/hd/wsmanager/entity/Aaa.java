package com.insi.hd.wsmanager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author XuChao
 * @since 2020-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Aaa对象", description="")
public class Aaa implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "a", type = IdType.AUTO)
    private Integer a;

    private String b;


}
