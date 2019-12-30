package com.king.library.sys.web;

import com.king.library.common.model.ResponseVo;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.service.SysRoleResourcesService;
import com.king.library.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @date: 2019/12/26 16:45
 * @author: duanyong
 * @desc:
 */
@Controller
@RequestMapping("/sysRole/")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysRoleResourcesService sysRoleResourcesService;

    @ResponseBody
    @RequestMapping("datas")
    public List<SysRole> findAllRoles(){
        List<SysRole> roleList = sysRoleService.list();
        return roleList;
    }

    @ResponseBody
    @RequestMapping("getDataByUserId")
    public List<SysRole> getDataByUserId(int userId){
        return sysRoleService.findRolesByUser(userId);
    }


    @ResponseBody
    @RequestMapping("updateRoleRes")
    public ResponseVo updateRoleRes(@RequestBody Map param) {
        String roleIdstr= StringTools.filterObject(param.get("roleId"));
        if(StringTools.isEmpty(roleIdstr)){
            return new ResponseVo("未传入角色Id");
        }
        Long roleId=new Long(roleIdstr);
        Object obj=param.get("resIds");
        List<String> resIds=obj==null?null:(List<String>)obj;
        return sysRoleResourcesService.updateRoleRes(roleId,resIds);
    }
}
