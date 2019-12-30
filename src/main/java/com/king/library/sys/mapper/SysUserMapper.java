package com.king.library.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.king.library.sys.pojo.SysUser;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> getUserByName(String username);

    List<SysUser> findUser(SysUser sysUser);
}