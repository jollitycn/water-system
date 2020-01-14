package com.insi.hd.wsmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.insi.da.wscommon.base.CodeMsg;
import com.insi.da.wscommon.base.Result;
import com.insi.hd.wsmanager.entity.WaterCouponDispatch;
import com.insi.hd.wsmanager.mapper.WaterCouponDispatchMapper;
import com.insi.hd.wsmanager.service.IWaterCouponDispatchService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 采购单水票分派 服务实现类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Service
public class WaterCouponDispatchServiceImpl extends ServiceImpl<WaterCouponDispatchMapper, WaterCouponDispatch> implements IWaterCouponDispatchService {

    @Override
    public Result<?> saveDispatch(List<WaterCouponDispatch> dispatchList, int quantity) {

        //获取分派数量总和
        int count = dispatchList.stream().mapToInt(WaterCouponDispatch::getQuantity).sum();
        if (count > quantity) {
            return Result.error(CodeMsg.DISPATCH_OVER_SIZE);
        } else {
            //删除旧数据
            Long sfaPurchaseId = dispatchList.get(0).getSfaPurchaseId();
            QueryWrapper<WaterCouponDispatch> wrapper = new QueryWrapper<>();
            wrapper.eq("sfa_purchase_id", sfaPurchaseId);
            remove(wrapper);
            boolean status = saveBatch(dispatchList);
            if (status) {
                return Result.success();
            } else {
                return Result.error(CodeMsg.DATA_INSERT_ERROR);
            }
        }
    }
}
