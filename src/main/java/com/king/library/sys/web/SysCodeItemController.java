package com.king.library.sys.web;


import com.king.library.common.model.PageVo;
import com.king.library.common.model.SortFild;
import com.king.library.sys.service.SysCodeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author duanyong
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/sysCodeItem")
public class SysCodeItemController {

    @Autowired
    private SysCodeItemService sysCodeItemService;

    @RequestMapping("datas")
    public PageVo findAllResForPage(PageVo pageVo){
        SortFild sort=new SortFild();
        String[] asc={"item_id"};
        sort.setAsc(asc);
        pageVo = sysCodeItemService.findAllForPage(pageVo,sort);
        return pageVo;
    }
}

