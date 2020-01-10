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
 * sfa日志
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sfa_log")
@ApiModel(value="SfaLog对象", description="sfa日志")
public class SfaLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "sfa日志ID")
    @TableId(value = "sfa_log_id", type = IdType.ID_WORKER)
    private Long sfaLogId;

    @ApiModelProperty(value = "日志类型（1：SFA-系统，2：系统-SFA)")
    private Integer type;

    @ApiModelProperty(value = "状态（1：成功，2：失败）")
    private Integer status;

    @ApiModelProperty(value = "IP地址")
    private String ipAddress;

    @ApiModelProperty(value = "操作人")
    private Long operatorId;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operateTime;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "json文本内容")
    private String jsonContent;


}
