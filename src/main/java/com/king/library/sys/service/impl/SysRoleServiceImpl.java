package com.king.library.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.ResponseVo;
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
    public List<SysRole> findAllRoles(){
        return this.baseMapper.selectList(null);
    }

    @Override
    public ResponseVo batchUpdate(List<SysRole> sysUserList) {
        for(SysRole role:sysUserList){
            this.baseMapper.updateById(role);
        }
        return new ResponseVo(StatusEnum.SUCCESS.getCode());
    }
}
