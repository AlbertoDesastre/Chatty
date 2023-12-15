package com.desastre.chatty.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desastre.chatty.models.User;

public interface UserRepository extends MongoRepository<User, String>{

	
	
}
