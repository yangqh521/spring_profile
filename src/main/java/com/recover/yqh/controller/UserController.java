package com.recover.yqh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.recover.yqh.entity.User;
import com.recover.yqh.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/get")
	@ResponseBody
	public User getUser(Integer id){
		User user = userService.selectUserById(id);
		System.out.println("user >>> " + JSONObject.toJSONString(user));
		return user;
	}
	
	
}
