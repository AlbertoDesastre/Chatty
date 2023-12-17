package com.desastre.chatty.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desastre.chatty.models.User;
import com.desastre.chatty.service.UserService;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<User> fetchAllUsers (){
		return userService.fetchAllUsers();
	}
	
}
