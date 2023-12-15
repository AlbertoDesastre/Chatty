package com.desastre.chatty;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.desastre.chatty.models.User;
import com.desastre.chatty.repositories.UserRepository;

@SpringBootApplication
public class ChattyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChattyApplication.class, args);

		System.out.println("Hola mundo");
	}

	/**

CAREFUL! If the class you are using for querying with MongoDB doesn't have an empty constructor available it will throw an exception. Here it's why:

The need for a no-argument constructor in classes mapped by Spring Data MongoDB is related to how the conversion between MongoDB documents and Java instances is performed. Spring Data MongoDB uses reflection to instantiate objects of mapped classes from documents retrieved from the database.

In Java, each class has a default (no-argument) constructor automatically provided if another constructor is not explicitly defined. When you define a constructor in your class, especially a constructor with arguments, the default constructor is no longer automatically provided. In other words, if you define any constructor in your class, Java will not automatically provide a default (no-argument) constructor.

When Spring Data MongoDB retrieves documents from the database, it needs to be able to instantiate objects of your mapped classes. If there is no no-argument constructor available, reflection cannot instantiate the class without knowing the necessary arguments. Therefore, to facilitate the instantiation of mapped classes, Spring Data MongoDB requires a no-argument constructor.
	 */
	
	
	@Bean
	CommandLineRunner runner(UserRepository userRepository, MongoTemplate mongoTemplate) { // Executes a command
		
		return args -> {
			String email = "email@email.com";
			User user = new User(email,
					"my avatar", 
					"crazy description", 
					"token", 
					"123456password");
			
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email));
			 
            List<User> users = mongoTemplate.find(query, User.class);
			
            if(users.size() > 1) {
            	throw new IllegalStateException("There are multiple users with the same email, look: ");
            }
            
            if(users.isEmpty()) {
            	userRepository.insert(user);
            	System.out.println("User created.");
            } else {
            	throw new IllegalStateException("Can't create the user because already exists.");
            }
            
		};

	}

}
