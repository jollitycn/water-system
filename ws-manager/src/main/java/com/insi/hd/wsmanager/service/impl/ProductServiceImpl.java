package com.insi.hd.wsmanager.service.impl;

import com.insi.hd.wsmanager.entity.Product;
import com.insi.hd.wsmanager.mapper.ProductMapper;
import com.insi.hd.wsmanager.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-10
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
