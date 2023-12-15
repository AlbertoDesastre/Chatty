package com.desastre.chatty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.desastre.chatty.models.User;
import com.desastre.chatty.repositories.UserRepository;

@SpringBootApplication
public class ChattyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChattyApplication.class, args);

		System.out.println("Hola mundo");
	}

	@Bean
	CommandLineRunner runner(UserRepository userRepository) { // Executes a command
		return args -> {
			User user = new User("email@email.com",
					"my avatar", 
					"crazy description", 
					"token", 
					"123456password");

			userRepository.insert(user);
		};

	}

}
