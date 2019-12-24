package com.king.library.common.web;

import com.alibaba.fastjson.JSONObject;
import com.king.library.common.tools.CommonUtil;
import com.king.library.sys.service.ArticleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: duanyong
 * @description: 文章相关Controller
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

//	@Autowired
//	private ArticleService articleService;
//
//	/**
//	 * 查询文章列表
//	 */
//	@RequiresPermissions("article:list")
//	@GetMapping("/listArticle")
//	public JSONObject listArticle(HttpServletRequest request) {
//		return articleService.listArticle(CommonUtil.request2Json(request));
//	}
//
//	/**
//	 * 新增文章
//	 */
//	@RequiresPermissions("article:add")
//	@PostMapping("/addArticle")
//	public JSONObject addArticle(@RequestBody JSONObject requestJson) {
//		CommonUtil.hasAllRequired(requestJson, "content");
//		return articleService.addArticle(requestJson);
//	}
//
//	/**
//	 * 修改文章
//	 */
//	@RequiresPermissions("article:update")
//	@PostMapping("/updateArticle")
//	public JSONObject updateArticle(@RequestBody JSONObject requestJson) {
//		CommonUtil.hasAllRequired(requestJson, "id,content");
//		return articleService.updateArticle(requestJson);
//	}
}
