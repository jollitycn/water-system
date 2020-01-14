package com.insi.hd.wsmanager.mapper;

import com.insi.hd.wsmanager.entity.WaterCouponDispatch;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.insi.hd.wsmanager.entity.vo.WaterCouponDispatchVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 采购单水票分派 Mapper 接口
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
public interface WaterCouponDispatchMapper extends BaseMapper<WaterCouponDispatch> {

    List<WaterCouponDispatchVO> getWaterCouponDispatch(@Param("sfaPurchaseId") Long sfaPurchaseId);
}
