package com.insi.hd.wsmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.insi.da.wscommon.base.CodeMsg;
import com.insi.da.wscommon.base.Result;
import com.insi.da.wscommon.constant.Constant;
import com.insi.hd.wsmanager.entity.SysDictionary;
import com.insi.hd.wsmanager.mapper.SysDictionaryMapper;
import com.insi.hd.wsmanager.service.ISysDictionaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统数字字典 服务实现类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
@Service
public class SysDictionaryServiceImpl extends ServiceImpl<SysDictionaryMapper, SysDictionary> implements ISysDictionaryService {

    @Override
    public Result<?> deleteDictionary(Long dictionaryId) {

        QueryWrapper<SysDictionary> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", dictionaryId);
        int count = count(wrapper);
        if (count > 0) {
            return Result.error(CodeMsg.DIC_DELETE_ERROR);
        } else {
            wrapper = new QueryWrapper<>();
            wrapper.eq("dictionary_id", dictionaryId);
            SysDictionary sysDictionary = getOne(wrapper);
            sysDictionary.setIsDeleted(Constant.SYS_ONE);
            boolean status = updateById(sysDictionary);
            if (status) {
                return Result.success();
            } else {
                return Result.error(CodeMsg.DATA_DELETE_ERROR);
            }
        }
    }
}
