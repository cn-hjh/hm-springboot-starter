package com.hm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hm.pojo.Resource;
/**
 * Freemarker模板引擎
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/ftl/")
public class FreemarkerController {

	@Autowired
	private Resource resource;
	
	@RequestMapping("index")
    public String index(ModelMap map) {//相当于springMVC的modeandview
		//通过resource获取resource.properties资源文件所有属性返回给前台页面
		map.addAttribute("resource", resource);
        return "freemarker/index";//index.ftl 页面
    }
	
	@RequestMapping("center")
    public String center() {
        return "freemarker/center/center";//center.ftl 页面
    }

}