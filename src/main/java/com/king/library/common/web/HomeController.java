package com.king.library.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @date: 2019/12/11 15:56
 * @author: duanyong
 * @desc:
 */
@Controller
public class HomeController {

    @RequestMapping("/page/{path}")
    public String gotoView(@PathVariable String path){
        System.out.println("==============================>>>> "+ path);
        return path;
    }
}
