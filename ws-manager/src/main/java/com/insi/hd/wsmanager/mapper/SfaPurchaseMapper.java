package com.insi.hd.wsmanager.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.insi.hd.wsmanager.entity.SfaPurchase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.insi.hd.wsmanager.entity.vo.SfaPurchaseDetailVO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * SFA采购 Mapper 接口
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
public interface SfaPurchaseMapper extends BaseMapper<SfaPurchase> {

    IPage<SfaPurchase> getSfaPurchaseList(Page<SfaPurchase> page);

    SfaPurchaseDetailVO getSfaPurchaseDetail(@Param("sfaPurchaseId") Long sfaPurchaseId);
}
