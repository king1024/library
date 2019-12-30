package com.king.library.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.library.common.model.ResponseVo;
import com.king.library.sys.pojo.SysRoleResources;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysRoleResourcesService extends IService<SysRoleResources> {

    /**
     * 修改角色拥有的资源权限
     * @param userId
     * @param roleIds
     * @return
     */
    ResponseVo updateRoleRes(Long roleId, List<String> resIds);
}
