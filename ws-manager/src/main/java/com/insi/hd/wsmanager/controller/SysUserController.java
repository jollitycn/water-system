package com.insi.hd.wsmanager.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.insi.da.wscommon.base.BaseRequest;
import com.insi.da.wscommon.constant.Constant;
import com.insi.da.wscommon.util.JSONResult;
import com.insi.hd.wsmanager.entity.SysUser;
import com.insi.hd.wsmanager.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
@Api(tags = {"系统用户管理"})
@RestController
@RequestMapping("/sys-user")
public class SysUserController {

    @Resource
    private ISysUserService sysUserService;

    @GetMapping("/list")
    @ApiOperation("系统用户列表")
    public JSONResult list(BaseRequest request) {

        Page<SysUser> page = new Page<>(request.getPageNum(), request.getPageSize());

        IPage<SysUser> result = sysUserService.getSysUserList(page, request);

        return JSONResult.ok(result);
    }

    @DeleteMapping("/delete/{userId}")
    @ApiOperation("删除系统用户")
    public JSONResult delete(@PathVariable Long userId) {

        return sysUserService.deleteSysUser(userId);
    }

    @GetMapping("/detail/{userId}")
    @ApiOperation("获取用户详情")
    public JSONResult detail(@PathVariable Long userId) {

        SysUser sysUser = sysUserService.getById(userId);
        return JSONResult.ok(sysUser);
    }

    @PostMapping("/update")
    @ApiOperation("更新用户信息")
    public JSONResult update(@RequestBody SysUser sysUser) {

        boolean status = sysUserService.updateById(sysUser);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("用户信息更新失败");
        }
    }

    @PostMapping("/block/{userId}")
    @ApiOperation("停用用户")
    public JSONResult block(@PathVariable Long userId) {

        SysUser sysUser = sysUserService.getById(userId);
        sysUser.setIsStopped(Constant.SYS_ONE);
        boolean status = sysUserService.updateById(sysUser);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("停用用户失败");
        }
    }

    @PostMapping("/unblock/{userId}")
    @ApiOperation("启用用户")
    public JSONResult unblock(@PathVariable Long userId) {

        SysUser sysUser = sysUserService.getById(userId);
        sysUser.setIsStopped(Constant.SYS_ZERO);
        boolean status = sysUserService.updateById(sysUser);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("启用用户失败");
        }
    }
}
