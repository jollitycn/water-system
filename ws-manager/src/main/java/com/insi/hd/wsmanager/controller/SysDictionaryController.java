package com.insi.hd.wsmanager.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.insi.da.wscommon.util.JSONResult;
import com.insi.hd.wsmanager.entity.SysDictionary;
import com.insi.hd.wsmanager.service.ISysDictionaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 系统数字字典 前端控制器
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
@Api(tags = {"系统数据字典管理"})
@RestController
@RequestMapping("/sys-dictionary")
public class SysDictionaryController {

    @Resource
    private ISysDictionaryService sysDictionaryService;

    @PutMapping("/add")
    @ApiOperation("新增数据字典")
    public JSONResult add(@RequestBody SysDictionary sysDictionary) {
        QueryWrapper<SysDictionary> wrapper = new QueryWrapper<>();
        wrapper.eq("data_code", sysDictionary.getDataCode());
        int count = sysDictionaryService.count(wrapper);
        if (count > 0) {
            return JSONResult.errorMsg("数据编码不能重复");
        }
        boolean status = sysDictionaryService.save(sysDictionary);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("数据添加失败");
        }
    }

    @DeleteMapping("/delete/{dictionaryId}")
    @ApiOperation("删除数据字典")
    public JSONResult delete(@PathVariable Long dictionaryId) {

        return sysDictionaryService.deleteDictionary(dictionaryId);
    }

    @PostMapping("/update")
    @ApiOperation("更新数据字典")
    public JSONResult update(@RequestBody SysDictionary sysDictionary) {

        boolean status = sysDictionaryService.updateById(sysDictionary);
        if (status) {
            return JSONResult.ok();
        } else {
            return JSONResult.errorMsg("字典更新失败");
        }
    }

    @GetMapping("/detail/{dictionaryId}")
    @ApiOperation("获取字典详情")
    public JSONResult detail(@PathVariable Long dictionaryId) {

        SysDictionary sysDictionary = sysDictionaryService.getById(dictionaryId);
        return JSONResult.ok(sysDictionary);
    }

    @GetMapping("/list")
    @ApiOperation("获取数据字典列表")
    public JSONResult list(Long parentId) {

        QueryWrapper<SysDictionary> wrapper = new QueryWrapper<>();
        if (null != parentId) {
            wrapper.eq("parent_id", parentId);
        }
        List<SysDictionary> result = sysDictionaryService.list(wrapper);
        return JSONResult.ok(result);
    }

}