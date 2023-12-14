package com.desastre.chatty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desastre.chatty.database.DBConnection;

@SpringBootApplication
public class ChattyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChattyApplication.class, args);
		
		System.out.println("Hola mundo");
		
		DBConnection dbConnection = new DBConnection();
		dbConnection.connect();
	}

}