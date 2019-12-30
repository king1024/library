package com.king.library.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.model.ResponseVo;
import com.king.library.sys.mapper.SysRoleResourcesMapper;
import com.king.library.sys.pojo.SysRoleResources;
import com.king.library.sys.service.SysRoleResourcesService;
import org.springframework.stereotype.Service;

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
public class SysRoleResourcesServiceImpl extends ServiceImpl<SysRoleResourcesMapper, SysRoleResources> implements SysRoleResourcesService {

    @Override
    public ResponseVo updateRoleRes(Long roleId, List<String> resIds) {
        Map param=new HashMap();
        param.put("role_id",roleId);
        this.baseMapper.deleteByMap(param);

        List<SysRoleResources> roleResources=new ArrayList<>();
        for(String resId:resIds){
            SysRoleResources sysUserRole=new SysRoleResources();
            sysUserRole.setRoleId(roleId);
            sysUserRole.setResourcesId(new Long(resId));
            roleResources.add(sysUserRole);
        }
        saveBatch(roleResources);
        ResponseVo vo=new ResponseVo();
        vo.setStatus(200);
        return vo;
    }
}
