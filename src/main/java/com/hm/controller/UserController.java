package com.hm.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.pojo.User;
import com.hm.pojo.result.JSONResult;

@RestController    //@RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	public User getUser() {
		
		User u = new User();
		u.setName("hm");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("hm");
		u.setDesc("hello hm...。。。。。。。。。。。。");
		return u;
	}
	
	/**
	 * 封装对象返回
	 * @return
	 */
	@RequestMapping("/getUserJson")
	public JSONResult getUserJson() {
		
		User u = new User();
		u.setName("hm");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("hm");
		u.setDesc("hello hm...。。。。。。。。。。。");
		return JSONResult.ok(u);
	}
	
	
}
