package com.hm.mapper;

import java.util.List;

import com.hm.pojo.SysUser;

/**
 * 自定义Mapper
 * 
 * Custom自定义
 * @author 004
 *
 */
public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}