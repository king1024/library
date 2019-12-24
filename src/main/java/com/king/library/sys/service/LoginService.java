package com.king.library.sys.service;

import com.alibaba.fastjson.JSONObject;
import com.king.library.common.constants.Constants;
import com.king.library.common.tools.CommonUtil;
import com.king.library.sys.mapper.SysUserMapper;
import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.pojo.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date: 2019/12/13 17:28
 * @author: duanyong
 * @desc:
 */
@Service
public class LoginService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysPermissionService sysPermissionService;
    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 登录表单提交
     */
//    public JSONObject authLogin(SysUser user) {
//        String username = user.getUsername();
//        String password = user.getPassword();
//        JSONObject info = new JSONObject();
//        Subject currentUser = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//        try {
//            currentUser.login(token);
//            info.put("result", "success");
//        } catch (AuthenticationException e) {
//            info.put("result", "fail");
//        }
//        return CommonUtil.successJson(info);
//    }

    /**
     * 根据用户名和密码查询对应的用户
     */
    public SysUser getUser(String username, String password) {
        SysUser user=new SysUser();
        user.setUsername(username);
        user.setPassword(password);
        List<SysUser> sysUsers = sysUserMapper.selectUser(user);
        if(sysUsers.size()!=1){
            return null;
        }
        user=sysUsers.get(0);
        List<SysRole> roles=sysRoleService.findRolesByUser(username);
        user.setRoles(roles);

        return user;
    }

//    /**
//     * 查询当前登录用户的权限等信息
//     */
//    public JSONObject getInfo() {
//        //从session获取用户信息
//        Session session = SecurityUtils.getSubject().getSession();
//        SysUser userInfo = (SysUser) session.getAttribute(Constants.SESSION_USER_INFO);
//        String username = userInfo.getUsername();
//        JSONObject info = new JSONObject();
//        JSONObject userPermission = sysPermissionService.getUserPermission(username);
//        session.setAttribute(Constants.SESSION_USER_PERMISSION, userPermission);
//        info.put("userPermission", userPermission);
//        return CommonUtil.successJson(info);
//    }

    /**
     * 退出登录
     */
    public JSONObject logout() {
        try {
            Subject currentUser = SecurityUtils.getSubject();
            currentUser.logout();
        } catch (Exception e) {
        }
        return CommonUtil.successJson();
    }
}
