package com.king.library.common.tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.king.library.common.constants.ErrorEnum;

/**
 * @date: 2019/12/14 12:22
 * @author: duanyong
 * @desc:
 */
public class CommonUtil {

    public static <T> QueryWrapper<T> getQueryWrapperByFilterStr(String text, Class<T> clazz) {
        T t=null;
        if(StringTools.isNotEmpty(text)){
            t = JSON.parseObject(text, clazz);
        }
        QueryWrapper<T> query=new QueryWrapper<T>(t);
        return query;
    }

    /**
     * 返回错误信息JSON
     */
    public static JSONObject errorJson(ErrorEnum errorEnum) {
        JSONObject resultJson = new JSONObject();
        resultJson.put("code", errorEnum.getErrorCode());
        resultJson.put("msg", errorEnum.getErrorMsg());
        resultJson.put("info", new JSONObject());
        return resultJson;
    }
}
