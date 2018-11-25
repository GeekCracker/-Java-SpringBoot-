package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.User;
import com.springboot.service.UserService;

@RestController("AdminUserController")
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	UserService userService;
	@RequestMapping("queryById.action")
	public User queryById(){
		return userService.queryById("11");
	}
}