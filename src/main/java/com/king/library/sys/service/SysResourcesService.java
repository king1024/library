package com.king.library.sys.service;

import com.king.library.sys.mapper.SysResourcesMapper;
import com.king.library.sys.pojo.SysResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date: 2019/12/13 17:27
 * @author: duanyong
 * @desc:
 */
@Service
public class SysResourcesService {

    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    public List<SysResources> findAllResources(){
        return sysResourcesMapper.selectAll();
    }

    public List<SysResources> findAllResourcesByUserId(Integer userId){
        return sysResourcesMapper.selectResourcesByUserId(userId);
    }
}
