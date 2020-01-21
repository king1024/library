package com.king.library.common.web;

import com.king.library.common.constants.UrlConstants;
import com.king.library.common.tools.StringTools;
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

    @RequestMapping(value={"/page/{path1}","/page/{path1}/{path2}","/page/{path1}/{path2}/{path3}",
            "/page/{path1}/{path2}/{path3}/{path4}","/page/{path1}/{path2}/{path3}/{path4}/{path5}"} )
    public String gotoView(@PathVariable(value="path1",required = true) String path1,
                           @PathVariable(value="path2",required = false) String path2, @PathVariable(value="path3",required = false) String path3,
                           @PathVariable(value="path4",required = false) String path4,@PathVariable(value="path5",required = false) String path5){
        String path=path1;
        if(StringTools.isNotEmpty(path2)){
            path += "/"+path2;
        }
        if(StringTools.isNotEmpty(path3)){
            path += "/"+path3;
        }
        if(StringTools.isNotEmpty(path4)){
            path += "/"+path4;
        }
        if(StringTools.isNotEmpty(path5)){
            path += "/"+path5;
        }
        return path;
    }

    @RequestMapping("/")
    public String defaultPage(){
        return UrlConstants.DEFAULT_PAGE;
    }

}
