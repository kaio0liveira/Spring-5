package com.example.demo.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.repositories.RepositoryUser;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	RepositoryUser repositoryUser;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		//createUser("Maria", "teste@gmail.com");
		//createUser("Joao", "joao@gmail.com");
		//createUser("Kaio","kaio@gmail.com");
		
		

	
	
	
	
		
		
	}
	public void createUser(String name, String email) {
		User user = new User(name, email);
		
		repositoryUser.save(user);
	}
}
