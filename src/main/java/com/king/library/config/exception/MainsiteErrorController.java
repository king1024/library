package com.king.library.config.exception;

import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.tools.CommonUtil;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date: 2019/12/13 17:12
 * @author: duanyong
 * @desc:系统错误拦截, 主要是针对404的错误
 */
//@Controller
public class MainsiteErrorController implements ErrorController {

	private static final String ERROR_PATH = "/error";

	/**
	 * 主要是登陆后的各种错误路径  404页面改为返回此json
	 * 未登录的情况下,大部分接口都已经被shiro拦截,返回让用户登录了
	 *
	 * @return 501的错误信息json
	 */
	@RequestMapping(value = ERROR_PATH)
	@ResponseBody
	public ResponseVo handleError() {
		return CommonUtil.errorReponse(StatusEnum.E_501);
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
}

