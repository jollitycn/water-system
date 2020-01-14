package com.insi.hd.wsmanager.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.insi.da.wscommon.util.JSONResult;
import com.insi.hd.wsmanager.entity.RoleMenuRelation;
import com.insi.hd.wsmanager.entity.SysMenu;
import com.insi.hd.wsmanager.entity.SysRole;
import com.insi.hd.wsmanager.service.IRoleMenuRelationService;
import com.insi.hd.wsmanager.service.ISysMenuService;
import com.insi.hd.wsmanager.service.ISysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * <p>
 * 系统菜单 前端控制器
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
@Api(tags = {"系统菜单管理"})
@RestController
@RequestMapping("/sys-menu")
public class SysMenuController {

    @Resource
    private ISysMenuService sysMenuService;

    @GetMapping("/listByRoleId/{id}")
    @ApiOperation("根据角色获取菜单列表")
    public JSONResult listByRoleId(@PathVariable Long id) {
        List<SysMenu> result = sysMenuService.listByRoleId(id);
        return JSONResult.ok(result);
    }

    @GetMapping("/listByUserId/{id}")
    @ApiOperation("根据账号ID获取菜单列表")
    public JSONResult listByUserId(@PathVariable Long id) {
        List<SysMenu> result = sysMenuService.listByUserId(id);
        return JSONResult.ok(result);
    }
}
