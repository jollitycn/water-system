package com.insi.hd.wsmanager.service;

import com.insi.da.wscommon.base.Result;
import com.insi.hd.wsmanager.entity.WaterCouponDispatch;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 采购单水票分派 服务类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
public interface IWaterCouponDispatchService extends IService<WaterCouponDispatch> {

    Result<?> saveDispatch(List<WaterCouponDispatch> dispatchList, int quantity);
}
