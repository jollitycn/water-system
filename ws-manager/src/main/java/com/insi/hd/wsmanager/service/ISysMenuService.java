package com.insi.hd.wsmanager.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.insi.hd.wsmanager.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.insi.hd.wsmanager.entity.SysRole;

import java.util.List;

/**
 * <p>
 * 系统菜单 服务类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
public interface ISysMenuService extends IService<SysMenu> {
    List<SysMenu> listByRoleId(Long roleId);
    List<SysMenu> listByUserId(Long userId);
}
