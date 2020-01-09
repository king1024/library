package com.king.library.config.system;

import com.king.library.common.model.PageVo;
import com.king.library.common.tools.ReflectUtil;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Map;

/**
 * @date: 2020/1/8 16:06
 * @author: duanyong
 * @desc:
 */
public class PageVoMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return PageVo.class.isAssignableFrom(methodParameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Class paramType= methodParameter.getParameterType();
        PageVo pageVo=null;
        if(PageVo.class.isAssignableFrom(paramType)){
            Map parameterMap=nativeWebRequest.getParameterMap();
            Map map= ReflectUtil.mapArrToMapObject(parameterMap);
            ReflectUtil.mapToBeanAndFieldMap(pageVo=new PageVo(),map,"dataMap");
        }
        return pageVo;
    }
}
