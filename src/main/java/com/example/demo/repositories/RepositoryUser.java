package com.example.demo.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.User;

public interface RepositoryUser extends MongoRepository<User, Long> {

	User findByName(String name);
	
	User deleteById(String id);
	
	User findByNameIgnoreCase(String name);
	
}
