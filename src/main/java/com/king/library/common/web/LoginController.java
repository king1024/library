package com.king.library.common.web;

import com.king.library.common.model.MenuNode;
import com.king.library.common.tools.MenuTree;
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
//			MenuTree tree=new MenuTree();
//			List<MenuNode> menu =tree.buildSysMenuByResources(user.getResourcesList());
//			model.addAttribute("menu",menu);
			model.addAttribute("roles",user.getRoles());
			model.addAttribute("username",user.getUsername());
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
		return "login02";
	}

	@ResponseBody
	@RequestMapping("/getMenu")
	public List<MenuNode> getMenu(){
		Subject currentUser = SecurityUtils.getSubject();
		SysUser user = (SysUser)currentUser.getPrincipal();
		MenuTree tree=new MenuTree();
		return tree.buildSysMenuByResources(user.getResourcesList());
	}
}
