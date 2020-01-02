package com.king.library.sys.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.tools.CommonUtil;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.mapper.SysResourcesMapper;
import com.king.library.sys.mapper.SysRoleMapper;
import com.king.library.sys.mapper.SysUserMapper;
import com.king.library.sys.mapper.SysUserRoleMapper;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.pojo.SysUser;
import com.king.library.sys.pojo.SysUserRole;
import com.king.library.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private SysResourcesMapper sysResourcesMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public SysUser getUserByName(String username) {
        SysUser user=null;
        List<SysUser> users = this.baseMapper.getUserByName(username);
        if (users!=null && users.size()==1){
            user=users.get(0);
            List<SysRole> roles=sysRoleMapper.selectRolesByUserId(user.getId());
//            for(SysRole role:roles){
////                List<SysResources> resources=sysResourcesMapper.selectResByRoleId(role.getId(),true);
////                role.setSysResources(resources);
////            }
            List<SysResources> resourcesList=sysResourcesMapper.selectResourcesByUserId(user.getId(),true);
            user.setRoles(roles);
            user.setResourcesList(resourcesList);
        }
        return user;
    }

    @Override
    public ResponseVo batchUpdate(List<SysUser> sysUserList) {
        for(SysUser user:sysUserList){
            this.baseMapper.updateById(user);
        }
        return new ResponseVo(StatusEnum.SUCCESS.getCode());
    }

    @Override
    public PageVo listUser(PageVo pageVo) {
        QueryWrapper<SysUser> query = CommonUtil.getQueryWrapperByFilterStr(pageVo.getFilterStr(), SysUser.class);
        query.orderByDesc("create_time");
        Page<SysUser> page = new Page<>(pageVo.getPageIndex()+1,pageVo.getPageSize());
        IPage<SysUser> datas = this.baseMapper.selectPage(page, query);
        pageVo.setData(datas.getRecords());
        pageVo.setTotal(datas.getTotal());
        return pageVo;
    }
}
