package com.king.library.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.sys.pojo.SysRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysRoleService extends IService<SysRole> {
    public List<SysRole> findRolesByUser(Integer userId);

    public PageVo findAllRoles(PageVo pageVo);

    /**
     * 批量修改
     * @param sysUserList
     * @return
     */
    ResponseVo batchUpdate(List<SysRole> sysUserList);
}
