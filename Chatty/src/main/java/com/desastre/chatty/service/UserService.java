package com.desastre.chatty.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desastre.chatty.models.User;
import com.desastre.chatty.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> fetchAllUsers() {
		return userRepository.findAll();
	};
}
