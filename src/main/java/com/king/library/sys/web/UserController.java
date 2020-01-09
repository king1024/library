package com.king.library.sys.web;

import com.alibaba.fastjson.JSONObject;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.tools.CommonUtil;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.pojo.SysUser;
import com.king.library.sys.service.SysUserRoleService;
import com.king.library.sys.service.SysUserService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author: duanyong
 * @description: 用户/角色/权限相关controller
 * @date: 2017/11/2 10:19
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysUserRoleService sysUserRoleService;

	/**
	 * 查询用户列表
	 */
	@RequiresPermissions("user:list")
	@ResponseBody
	@RequestMapping("datas")
	public PageVo listUser(PageVo pageVo) {
		return sysUserService.listUser(pageVo);
	}

	@RequiresPermissions("user:updateRoles")
	@ResponseBody
	@RequestMapping("updateRoles")
	public ResponseVo updateRoles(@RequestBody Map param) {
		String userIdstr= StringTools.filterObject(param.get("userId"));
		if(StringTools.isEmpty(userIdstr)){
			return new ResponseVo("未传入用户Id");
		}
		Long userId=new Long(userIdstr);
		Object obj=param.get("roleids");
		List<Integer> roleIds=obj==null?null:(List<Integer>)obj;
		return sysUserRoleService.updateUserRole(userId,roleIds);
	}

	@RequiresPermissions("user:add")
	@ResponseBody
	@RequestMapping("save")
	public ResponseVo save(@RequestBody SysUser sysUser) {
		if(StringTools.isEmpty(sysUser.getPassword())){
			sysUser.setPassword("123456");
		}
		sysUser.setStatus(1);
		ResponseVo vo=new ResponseVo(StatusEnum.SUCCESS.getCode());
		sysUserService.save(sysUser);
		return vo;
	}

	@RequiresPermissions("user:update")
	@ResponseBody
	@RequestMapping("update")
	public ResponseVo update(@RequestBody List<SysUser> sysUserList) {
		return sysUserService.batchUpdate(sysUserList);
	}

	@RequiresPermissions("user:delete")
	@ResponseBody
	@RequestMapping("remove")
	public ResponseVo remove(@RequestBody List<String> resList) {
		ResponseVo vo=new ResponseVo(StatusEnum.SUCCESS.getCode());
		if(!sysUserService.removeByIds(resList)){
			vo.setStatus(StatusEnum.ERROR.getCode());
			vo.setMessage("删除失败");
		}
		return vo;
	}
}
