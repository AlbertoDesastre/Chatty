package com.desastre.chatty.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private String username;
    @Indexed(unique=true) // a User with the same email can't be repeated
	private String email;
	private String avatar;
	private String description;
	private String token;
	private String password;

	public User(String email, 
			String username, 
			String avatar, 
			String description, 
			String token, 
			String password) {
		super();
		this.email = email;
		this.username = username;
		this.avatar = avatar;
		this.description = description;
		this.token = token;
		this.password = password;
	}
	
	public User(String email, 
			String avatar, 
			String description, 
			String token, 
			String password) {
		super();
		this.email = email;
		this.avatar = avatar;
		this.description = description;
		this.token = token;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getAvatar() {
		return avatar;
	}

	public String getDescription() {
		return description;
	}

	public String getToken() {
		return token;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
