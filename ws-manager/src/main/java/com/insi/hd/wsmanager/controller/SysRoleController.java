package com.insi.hd.wsmanager.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.insi.da.wscommon.util.JSONResult;
import com.insi.hd.wsmanager.entity.SysRole;
import com.insi.hd.wsmanager.service.ISysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 系统角色 前端控制器
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */

@Api(tags = {"系统角色管理"})
@RestController
@RequestMapping("/sys-role")
@Slf4j
public class SysRoleController {

    @Resource
    private ISysRoleService sysRoleService;

    @PutMapping("/add")
    @ApiOperation("新增角色")
    public JSONResult add(@RequestBody SysRole data) {
        QueryWrapper<SysRole> wrapper = new QueryWrapper<>();
        wrapper.eq("role_name", data.getRoleName());
        int count = sysRoleService.count(wrapper);
        if (count > 0) {
            return JSONResult.errorMsg("角色名称不能重复");
        }
        boolean status = sysRoleService.save(data);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("数据添加失败");
        }
    }

    @DeleteMapping("/delete/{Id}")
    @ApiOperation("删除角色")
    public JSONResult delete(@PathVariable Long Id) {
        boolean status = sysRoleService.removeById(Id);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("删除失败");
        }
    }

    @PostMapping("/update")
    @ApiOperation("更新角色")
    public JSONResult update(@RequestBody SysRole sys) {
        boolean status = sysRoleService.updateById(sys);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("角色更新失败");
        }
    }

    @GetMapping("/detail/{Id}")
    @ApiOperation("获取角色详情")
    public JSONResult detail(@PathVariable Long Id) {
        SysRole data = sysRoleService.getById(Id);
        return JSONResult.ok(data);
    }

    @GetMapping("/list")
    @ApiOperation("获取角色列表")
    public JSONResult list(Long parentId) {
        QueryWrapper<SysRole> wrapper = new QueryWrapper<>();
        if (null != parentId) {
            wrapper.eq("parent_id", parentId);
        }
        List<SysRole> result = sysRoleService.list(wrapper);
        return JSONResult.ok(result);
    }
}
