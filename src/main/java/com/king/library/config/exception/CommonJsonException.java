package com.king.library.config.exception;

import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.tools.CommonUtil;

/**
 * @author: duanyong
 * @desc: 本系统使用的自定义错误类
 * 比如在校验参数时,如果不符合要求,可以抛出此错误类
 * 拦截器可以统一拦截此错误,将其中json返回给前端
 * @date: 2019/12/13 17:12
 */
public class CommonJsonException extends RuntimeException {
	private ResponseVo resultJson;

	/**
	 * 调用时可以在任何代码处直接throws这个Exception,
	 * 都会统一被拦截,并封装好json返回给前台
	 *
	 * @param errorEnum 以错误的ErrorEnum做参数
	 */
	public CommonJsonException(StatusEnum errorEnum) {
		this.resultJson = CommonUtil.errorReponse(errorEnum);
	}

	public CommonJsonException(ResponseVo resultJson) {
		this.resultJson = resultJson;
	}

	public ResponseVo getResultJson() {
		return resultJson;
	}
}
