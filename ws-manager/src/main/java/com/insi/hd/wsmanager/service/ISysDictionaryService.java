package com.insi.hd.wsmanager.service;

import com.insi.da.wscommon.util.JSONResult;
import com.insi.hd.wsmanager.entity.SysDictionary;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统数字字典 服务类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
public interface ISysDictionaryService extends IService<SysDictionary> {

    JSONResult deleteDictionary(Long dictionaryId);
}
