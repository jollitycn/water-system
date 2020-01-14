package com.insi.hd.wsmanager.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.insi.da.wscommon.base.BaseRequest;
import com.insi.da.wscommon.base.Result;
import com.insi.hd.wsmanager.entity.SfaPurchase;
import com.insi.hd.wsmanager.entity.WaterCouponDispatch;
import com.insi.hd.wsmanager.entity.vo.SfaPurchaseDetailVO;
import com.insi.hd.wsmanager.service.ISfaPurchaseService;
import com.insi.hd.wsmanager.service.IWaterCouponDispatchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * SFA采购 前端控制器
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Api(tags = {"SFA采购管理"})
@RestController
@RequestMapping("/sfa-purchase")
public class SfaPurchaseController {

    @Resource
    private ISfaPurchaseService sfaPurchaseService;

    @Resource
    private IWaterCouponDispatchService waterCouponDispatchService;

    @GetMapping("/list")
    @ApiOperation("获取SFA采购列表")
    public Result<?> list(BaseRequest request) {

        Page<SfaPurchase> page = new Page<>(request.getPageNum(), request.getPageSize());

        IPage<SfaPurchase> result = sfaPurchaseService.getSfaPurchaseList(page);

        return Result.success(result);
    }

    @GetMapping("/detail/{sfaPurchaseId}")
    @ApiOperation("获取采购单明细")
    public Result<?> detail(@PathVariable Long sfaPurchaseId) {

        SfaPurchaseDetailVO result = sfaPurchaseService.getSfaPurchaseDetail(sfaPurchaseId);
        return Result.success(result);

    }

    @PostMapping("/saveDispatch")
    @ApiOperation("保存分派水票")
    public Result<?> saveDispatch(@RequestBody List<WaterCouponDispatch> dispatchList) {

        int quantity = dispatchList.get(0).getQuantity();
        return waterCouponDispatchService.saveDispatch(dispatchList, quantity);
    }
}
