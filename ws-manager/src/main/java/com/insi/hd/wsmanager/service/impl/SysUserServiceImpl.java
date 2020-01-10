package com.insi.hd.wsmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.insi.da.wscommon.base.BaseRequest;
import com.insi.da.wscommon.constant.Constant;
import com.insi.da.wscommon.util.JSONResult;
import com.insi.da.wscommon.util.StringUtil;
import com.insi.hd.wsmanager.entity.SysUser;
import com.insi.hd.wsmanager.mapper.SysUserMapper;
import com.insi.hd.wsmanager.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public IPage<SysUser> getSysUserList(Page<SysUser> page, BaseRequest request) {

        String userAccount = StringUtil.addPercent(request.getSearchKey());

        return baseMapper.getSysUserList(page, userAccount);
    }

    @Override
    public JSONResult deleteSysUser(Long userId) {

        SysUser sysUser = getById(userId);
        sysUser.setIsDeleted(Constant.SYS_ONE);
        sysUser.setModifyTime(LocalDateTime.now());
        boolean status = updateById(sysUser);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("删除失败");
        }
    }
}
