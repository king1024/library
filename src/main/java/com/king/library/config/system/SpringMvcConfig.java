package com.king.library.config.system;

import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @date: 2020/1/8 15:54
 * @author: duanyong
 * @desc:
 */
//@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new PageVoMethodArgumentResolver());
    }
}
