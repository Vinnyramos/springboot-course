package com.danielabella.courses.springboot.example7.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.danielabella.courses.springboot.example7.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findByName(String name);	
	
	
}
