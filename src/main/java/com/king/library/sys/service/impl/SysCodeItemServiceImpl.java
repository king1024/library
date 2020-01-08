package com.king.library.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.service.BaseServiceImpl;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.mapper.SysCodeItemMapper;
import com.king.library.sys.pojo.SysCodeItem;
import com.king.library.sys.service.SysCodeItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author duanyong
 * @since 2020-01-07
 */
@Service
public class SysCodeItemServiceImpl extends BaseServiceImpl<SysCodeItemMapper, SysCodeItem> implements SysCodeItemService {

    @Override
    public String getMaxItemId() {
        String setId=this.baseMapper.getMaxItemId();
        if(StringTools.isEmpty(setId)){
            setId="1000";
        }
        int res=new Integer(setId).intValue();
        return res+1+"";
    }
}
