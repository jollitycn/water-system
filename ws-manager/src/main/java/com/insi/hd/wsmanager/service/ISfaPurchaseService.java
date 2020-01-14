package com.insi.hd.wsmanager.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.insi.hd.wsmanager.entity.SfaPurchase;
import com.baomidou.mybatisplus.extension.service.IService;
import com.insi.hd.wsmanager.entity.vo.SfaPurchaseDetailVO;

/**
 * <p>
 * SFA采购 服务类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
public interface ISfaPurchaseService extends IService<SfaPurchase> {

    IPage<SfaPurchase> getSfaPurchaseList(Page<SfaPurchase> page);

    SfaPurchaseDetailVO getSfaPurchaseDetail(Long sfaPurchaseId);
}
