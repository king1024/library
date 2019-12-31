package com.king.library.common.web;

import com.alibaba.fastjson.JSONObject;
import com.king.library.common.constants.UrlConstants;
import com.king.library.common.model.MenuNode;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.tools.CommonUtil;
import com.king.library.common.tools.MenuTree;
import com.king.library.common.tools.ResultUtil;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.pojo.SysUser;
import com.king.library.sys.service.SysResourcesService;
import com.king.library.sys.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: duanyong
 * @description: 登录相关Controller
 * @date: 2017/10/24 10:33
 */
@Slf4j
@Controller
@RequestMapping("/auth")
public class LoginController {

	@Autowired
	private SysRoleService sysRoleService;
	@Autowired
	private SysResourcesService sysResourcesService;

	/**
	 * 登录
	 */
//	@ResponseBody
	@RequestMapping("/login")
	public String authLogin(String username, String password, Model model) {
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		//获取当前的Subject
		Subject currentUser = SecurityUtils.getSubject();
		try{
			currentUser.login(token);
			SysUser user = (SysUser)currentUser.getPrincipal();
//			model.addAttribute("",sysRoleService.findRolesByUser())
			List<SysRole> roleList=new ArrayList<>();
			List<SysResources> menuList=new ArrayList<>();
			List<SysRole> roles = user.getRoles();
			for (SysRole role:roles) {
				for(SysResources resources:role.getSysResources()){
//					resources.setName(resources.getName()+"--"+resources.getId());
					if("menu".equals(resources.getType())){
						menuList.add(resources);
					}
				}
				role.setSysResources(null);
				roleList.add(role);
			}

			MenuTree tree=new MenuTree();
			List<MenuNode> menu =tree.buildSysMenuByResources(menuList);

			model.addAttribute("menu",menu);
			model.addAttribute("roles",roleList);
			return "main3";
		} catch (UnknownAccountException e) {
			log.info("=========用户名"+username+"不存在========");
			token.clear();
			model.addAttribute("message","登录失败：用户名不存在");
			return "login";
		}catch(IncorrectCredentialsException e){
            log.info("=========用户名"+username+"密码错误不存在========");
            token.clear();
            model.addAttribute("message","登录失败：密码错误");
            return "login";
        }catch (Exception e){
            log.info("=========用户名"+username+"登录失败========",e);
            token.clear();
            model.addAttribute("message","登录失败：密码错误");
            return "login";
        }
	}


	/**
	 * 登出
	 */
	@RequestMapping("/logout")
	public String logout() {
		try {
			Subject currentUser = SecurityUtils.getSubject();
			currentUser.logout();
		} catch (Exception e) {
		}
		return "login";
	}
}
