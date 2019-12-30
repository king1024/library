package com.king.library.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.library.common.model.ResponseVo;
import com.king.library.sys.pojo.SysUserRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysUserRoleService extends IService<SysUserRole> {
    /**
     * 更新用户角色
     * @param userId
     * @param roleIds
     * @return
     */
    public ResponseVo updateUserRole(Long userId, List<Integer> roleIds);
}
