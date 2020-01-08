package com.king.library.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.service.BaseServiceImpl;
import com.king.library.common.tools.CommonUtil;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.mapper.SysCodeSetMapper;
import com.king.library.sys.pojo.SysCodeSet;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.service.SysCodeSetService;
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
public class SysCodeSetServiceImpl extends BaseServiceImpl<SysCodeSetMapper, SysCodeSet> implements SysCodeSetService {

    @Override
    public String getMaxSetId() {
        String setId=this.baseMapper.getMaxSetId();
        if(StringTools.isEmpty(setId)){
            setId="1000";
        }
        int res=new Integer(setId).intValue();
        return res+1+"";
    }
}
