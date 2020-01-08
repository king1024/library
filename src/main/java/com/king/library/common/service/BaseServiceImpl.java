package com.king.library.common.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.model.SortFild;
import com.king.library.common.tools.CommonUtil;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @date: 2020/1/7 20:03
 * @author: duanyong
 * @desc:
 */

public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M , T> implements BaseService<T>{

    @Override
    public PageVo findAllForPage(PageVo pageVo, SortFild sortFild) {
        Class<T> entityClass= (Class<T>) ReflectionKit.getSuperClassGenericType(this.getClass(),1);
        QueryWrapper<T> query= CommonUtil.getQueryWrapperByFilterStr(pageVo.getFilterStr(), entityClass);
        if(sortFild!=null){
            if(sortFild.getAsc()!=null && sortFild.getAsc().length>0){
                query.orderByAsc(sortFild.getAsc());
            }
            if(sortFild.getDesc()!=null && sortFild.getDesc().length>0){
                query.orderByDesc(sortFild.getDesc());
            }
        }
        Page<T> page = new Page<>(pageVo.getPageIndex()+1,pageVo.getPageSize());
        IPage<T> datas = this.baseMapper.selectPage(page, query);
        pageVo.setData(datas.getRecords());
        pageVo.setTotal(datas.getTotal());
        return pageVo;
    }

    @Override
    public ResponseVo saveRecord(T t) {
        int rn=this.baseMapper.insert(t);
        if(rn>0){
            return new ResponseVo(StatusEnum.SUCCESS.getCode());
        }
        return new ResponseVo("失败");
    }

    @Override
    public ResponseVo batchUpdate(List<T> ts) {
        //待添加手动事务
        for(T t:ts){
            this.baseMapper.updateById(t);
        }

        return new ResponseVo(StatusEnum.SUCCESS.getCode());
    }

    @Override
    public ResponseVo updateRecord(T t) {
        int res=this.baseMapper.updateById(t);
        if(res>0){
            return new ResponseVo(StatusEnum.SUCCESS.getCode());
        }
        return new ResponseVo("失败");
    }

    @Override
    public ResponseVo batchDelete(List tList) {
        this.baseMapper.deleteBatchIds(tList);
        return new ResponseVo(StatusEnum.SUCCESS.getCode());
    }
}
