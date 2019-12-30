package com.king.library.sys.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.king.library.sys.pojo.SysRole;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> selectRolesByUserId(Integer id);
}