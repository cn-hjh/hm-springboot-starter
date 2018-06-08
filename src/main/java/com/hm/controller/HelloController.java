package com.hm.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.pojo.Resource;
import com.hm.pojo.result.JSONResult;

@RestController
public class HelloController {

	@Autowired//加载时会自动一一对应资源文件所有属性
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot...";
	}
	
	//获取resource.properties资源文件数据以json形式返回给前台
	@RequestMapping("/getResource")
	public JSONResult getResource() {
		
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		
		return JSONResult.ok(bean);
	}
	
	
	
}
