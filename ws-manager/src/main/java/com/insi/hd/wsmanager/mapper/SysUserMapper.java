package com.insi.hd.wsmanager.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.insi.hd.wsmanager.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 *
 * @author LiuHao
 * @since 2020-01-09
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    IPage<SysUser> getSysUserList(Page<SysUser> page, @Param("userAccount") String userAccount);
}
