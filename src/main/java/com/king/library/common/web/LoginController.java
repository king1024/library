package com.king.library.common.web;

import com.alibaba.fastjson.JSONObject;
import com.king.library.common.tools.CommonUtil;
import com.king.library.sys.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: duanyong
 * @description: 登录相关Controller
 * @date: 2017/10/24 10:33
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	/**
	 * 登录
	 */
//	@PostMapping("/auth")
//	public JSONObject authLogin(@RequestBody JSONObject requestJson) {
//		CommonUtil.hasAllRequired(requestJson, "username,password");
//		return loginService.authLogin(requestJson);
//	}
//
//	/**
//	 * 查询当前登录用户的信息
//	 */
//	@PostMapping("/getInfo")
//	public JSONObject getInfo() {
//		return loginService.getInfo();
//	}

	/**
	 * 登出
	 */
	@ResponseBody
	@RequestMapping("/logout")
	public JSONObject logout() {
		System.out.println("logout----------------------------------->");
		return loginService.logout();
	}
}
