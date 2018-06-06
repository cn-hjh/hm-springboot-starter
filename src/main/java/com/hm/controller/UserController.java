package com.hm.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.pojo.JSONResult;
import com.hm.pojo.User;

@RestController    //@RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	public User uesr() {
		
		User u = new User();
		u.setName("hm");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("hm");
		u.setDesc("hello hm...。。。。。。。。。。。。");
		return u;
	}
	
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
