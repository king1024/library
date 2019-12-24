package com.king.library.sys.mapper;

import java.util.List;

import com.king.library.sys.pojo.SysMenu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysMenuMapper {
	
	List<SysMenu> findAll();
	
	void save(SysMenu menu);
	
	void update(SysMenu menu);
	
	void delete(String menuId);

	List<SysMenu> findByChildId(List<String> menuId);

	void inserBatch(List<SysMenu> list);

}
