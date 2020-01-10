package com.insi.hd.wsmanager.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.insi.da.wscommon.base.BaseRequest;
import com.insi.da.wscommon.util.JSONResult;
import com.insi.hd.wsmanager.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
public interface ISysUserService extends IService<SysUser> {

    IPage<SysUser> getSysUserList(Page<SysUser> page, BaseRequest request);

    JSONResult deleteSysUser(Long userId);
}
