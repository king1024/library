package com.king.library.sys.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.mapper.SysRoleMapper;
import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    @Override
    public List<SysRole> findRolesByUser(Integer userId){
        return this.baseMapper.selectRolesByUserId(userId);
    }

    @Override
    public PageVo findAllRoles(PageVo pageVo){
        SysRole sysRole=null;
        if(StringTools.isNotEmpty(pageVo.getFilterStr())){
            sysRole = JSON.parseObject(pageVo.getFilterStr(), SysRole.class);
        }
        QueryWrapper<SysRole> query=new QueryWrapper<SysRole>(sysRole);
        query.orderByDesc("update_time");
        Page<SysRole> page = new Page<>(pageVo.getPageIndex()+1,pageVo.getPageSize());
        IPage<SysRole> datas = this.baseMapper.selectPage(page, query);
        pageVo.setData(datas.getRecords());
        pageVo.setTotal(datas.getTotal());
        return pageVo;
    }

    @Override
    public ResponseVo batchUpdate(List<SysRole> sysUserList) {
        for(SysRole role:sysUserList){
            this.baseMapper.updateById(role);
        }
        return new ResponseVo(StatusEnum.SUCCESS.getCode());
    }
}
