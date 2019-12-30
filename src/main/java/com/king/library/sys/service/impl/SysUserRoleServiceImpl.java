package com.king.library.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.model.ResponseVo;
import com.king.library.sys.mapper.SysUserRoleMapper;
import com.king.library.sys.pojo.SysUserRole;
import com.king.library.sys.service.SysUserRoleService;
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
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    @Override
    @Transactional
    public ResponseVo updateUserRole(Long userId, List<Integer> roleIds) {
        Map param=new HashMap();
        param.put("user_id",userId);
        this.baseMapper.deleteByMap(param);
        List<SysUserRole> urs=new ArrayList<>();
        for(Integer roleid:roleIds){
            SysUserRole sysUserRole=new SysUserRole();
            sysUserRole.setUserId(userId);
            sysUserRole.setRoleId(new Long(roleid));
            urs.add(sysUserRole);
        }
        saveBatch(urs);
        ResponseVo vo=new ResponseVo();
        vo.setStatus(200);
        return vo;
    }
}
