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
 * 图片上传表
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_image_upload")
@ApiModel(value="ImageUpload对象", description="图片上传表")
public class ImageUpload implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "image_upload_id", type = IdType.ID_WORKER)
    private Long imageUploadId;

    private Long sysId;

    private Long tableId;

    private Long objectId;

    private Long typeId;

    private String imagePath;

    private String imageUrl;

    private Integer imageType;

    private String imageSize;

    private String imageRemark;

    private String orderNo;

    private Long createId;

    private LocalDateTime createTime;


}
