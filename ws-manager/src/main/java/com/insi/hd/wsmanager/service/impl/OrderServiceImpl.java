package com.insi.hd.wsmanager.service.impl;

import com.insi.hd.wsmanager.entity.Order;
import com.insi.hd.wsmanager.mapper.OrderMapper;
import com.insi.hd.wsmanager.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
