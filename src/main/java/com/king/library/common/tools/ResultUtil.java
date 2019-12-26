package com.king.library.common.tools;

import com.king.library.common.constants.CommonConst;
import com.king.library.common.constants.ResponseStatus;
import com.king.library.common.model.ResponseVo;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @date: 2019/12/25 14:21
 * @author: duanyong
 * @desc:
 */
public class ResultUtil {
    public static ModelAndView view(String view) {
        return new ModelAndView(view);
    }

    public static ModelAndView view(String view, Map<String, Object> model) {
        return new ModelAndView(view, model);
    }

    public static ModelAndView redirect(String view) {
        return new ModelAndView("redirect:" + view);
    }

    public static ResponseVo error(int code, String message) {
        return vo(code, message, null);
    }

    public static ResponseVo error(ResponseStatus status) {
        return vo(status.getCode(), status.getMessage(), null);
    }

    public static ResponseVo error(String message) {
        return vo(CommonConst.DEFAULT_ERROR_CODE, message, null);
    }

    public static ResponseVo success(String message, Object data) {
        return vo(CommonConst.DEFAULT_SUCCESS_CODE, message, data);
    }

    public static ResponseVo success(String message) {
        return success(message, null);
    }

    public static ResponseVo success(ResponseStatus status) {
        return vo(status.getCode(), status.getMessage(), null);
    }

    public static ResponseVo vo(int code, String message, Object data) {
        return new ResponseVo<>(code, message, data);
    }

//    public static PageResult tablePage(Long total, List<?> list) {
//        return new PageResult(total, list);
//    }
//
//    public static PageResult tablePage(PageInfo info) {
//        if (info == null) {
//            return new PageResult(0L, new ArrayList());
//        }
//        return tablePage(info.getTotal(), info.getList());
//    }
}
