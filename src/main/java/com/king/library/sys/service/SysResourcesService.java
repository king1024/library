package com.king.library.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.model.TreeNode;
import com.king.library.sys.pojo.SysResources;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysResourcesService extends IService<SysResources> {
    public List<SysResources> findAllResourcesByUserId(Integer userId);

    public ResponseVo saveResource(SysResources res);

    public ResponseVo updateRes(List<SysResources> resList) ;

    /**
     * 获取用户的树结构数据
     * @param userId
     * @return
     */
    List<TreeNode> getTreeData(int userId);
}
