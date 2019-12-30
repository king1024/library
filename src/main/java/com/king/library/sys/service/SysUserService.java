package com.king.library.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.library.common.model.ResponseVo;
import com.king.library.sys.pojo.SysUser;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 通过用户名查用户
     * @param username
     * @return
     */
    public SysUser getUserByName(String username);
}
