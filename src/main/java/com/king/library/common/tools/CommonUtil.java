package com.king.library.common.tools;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.ResponseVo;

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

    public static <T> T getEntityByStr(String text, Class<T> clazz) {
        T t=null;
        if(StringTools.isNotEmpty(text)){
            t = JSON.parseObject(text, clazz);
        }
        return t;
    }

    /**
     * 返回错误信息JSON
     */
    public static ResponseVo errorReponse(StatusEnum errorEnum) {
        ResponseVo responseVo=new ResponseVo();
        responseVo.setMessage(errorEnum.getDesc());
        responseVo.setStatus(errorEnum.getCode());
        return responseVo;
    }
}
