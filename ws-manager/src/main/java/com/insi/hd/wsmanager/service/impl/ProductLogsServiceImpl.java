package com.insi.hd.wsmanager.service.impl;

import com.insi.hd.wsmanager.entity.ProductLogs;
import com.insi.hd.wsmanager.mapper.ProductLogsMapper;
import com.insi.hd.wsmanager.service.IProductLogsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品操作日志 服务实现类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Service
public class ProductLogsServiceImpl extends ServiceImpl<ProductLogsMapper, ProductLogs> implements IProductLogsService {

}
