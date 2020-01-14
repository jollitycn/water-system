package com.insi.hd.wsmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.insi.hd.wsmanager.entity.RoleMenuRelation;
import com.insi.hd.wsmanager.entity.SysMenu;
import com.insi.hd.wsmanager.entity.UserRoleRelation;
import com.insi.hd.wsmanager.mapper.RoleMenuRelationMapper;
import com.insi.hd.wsmanager.mapper.SysMenuMapper;
import com.insi.hd.wsmanager.mapper.UserRoleRelationMapper;
import com.insi.hd.wsmanager.service.ISysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * <p>
 * 系统菜单 服务实现类
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {
    @Resource
    RoleMenuRelationMapper roleMenuRelationMapper;
    @Resource
    UserRoleRelationMapper userRoleRelationMapper;

    @Override
    public List<SysMenu> listByRoleId(Long roleId) {
        QueryWrapper<RoleMenuRelation> roleMenuRelationQueryWrapper = new QueryWrapper<RoleMenuRelation>();
        roleMenuRelationQueryWrapper.eq("role_id", roleId);
        List<RoleMenuRelation> roleMenuRelations = roleMenuRelationMapper.selectList(roleMenuRelationQueryWrapper);
        QueryWrapper<RoleMenuRelation> menu = new QueryWrapper<RoleMenuRelation>();
        List<Long> menuIds = new ArrayList<>();
        roleMenuRelations.forEach(
                new Consumer<RoleMenuRelation>() {
                    @Override
                    public void accept(RoleMenuRelation roleMenuRelation) {
                        menuIds.add(roleMenuRelation.getMenuId());
                    }
                }
        );
        List<SysMenu> result = baseMapper.selectBatchIds(menuIds);
        return result;
    }

    @Override
    public List<SysMenu> listByUserId(Long userId) {
        List<SysMenu> result = new ArrayList<>();
        QueryWrapper<UserRoleRelation> userRoleRelationQueryWrapper = new QueryWrapper<UserRoleRelation>();
        userRoleRelationQueryWrapper.eq("user_id", userId);
        List<UserRoleRelation> roleMenuRelations = userRoleRelationMapper.selectList(userRoleRelationQueryWrapper);
        if (roleMenuRelations != null) {
            roleMenuRelations.forEach(new Consumer<UserRoleRelation>() {
                @Override
                public void accept(UserRoleRelation userRoleRelation) {
                    result.addAll(listByRoleId(userRoleRelation.getRoleId()));
                }
            });
        }

        return result;
    }


}
