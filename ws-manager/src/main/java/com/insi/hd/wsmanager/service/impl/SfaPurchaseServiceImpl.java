package com.insi.hd.wsmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.insi.hd.wsmanager.entity.SfaPurchase;
import com.insi.hd.wsmanager.entity.WaterCouponDispatch;
import com.insi.hd.wsmanager.entity.vo.SfaPurchaseDetailVO;
import com.insi.hd.wsmanager.entity.vo.WaterCouponDispatchVO;
import com.insi.hd.wsmanager.mapper.SfaPurchaseMapper;
import com.insi.hd.wsmanager.mapper.WaterCouponDispatchMapper;
import com.insi.hd.wsmanager.service.ISfaPurchaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.insi.hd.wsmanager.service.IWaterCouponDispatchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * SFA采购 服务实现类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Service
public class SfaPurchaseServiceImpl extends ServiceImpl<SfaPurchaseMapper, SfaPurchase> implements ISfaPurchaseService {

    @Resource
    private WaterCouponDispatchMapper waterCouponDispatchMapper;

    @Override
    public IPage<SfaPurchase> getSfaPurchaseList(Page<SfaPurchase> page) {
        return baseMapper.getSfaPurchaseList(page);
    }

    @Override
    public SfaPurchaseDetailVO getSfaPurchaseDetail(Long sfaPurchaseId) {

        SfaPurchaseDetailVO sfaPurchaseDetailVO = baseMapper.getSfaPurchaseDetail(sfaPurchaseId);
        List<WaterCouponDispatchVO> waterCouponDispatchVO = waterCouponDispatchMapper.getWaterCouponDispatch(sfaPurchaseId);
        sfaPurchaseDetailVO.setDispatchVOList(waterCouponDispatchVO);

        return sfaPurchaseDetailVO;
    }
}
