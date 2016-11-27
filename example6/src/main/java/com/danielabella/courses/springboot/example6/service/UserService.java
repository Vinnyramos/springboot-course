package com.danielabella.courses.springboot.example6.service;

import java.util.List;

import com.danielabella.courses.springboot.example6.domain.User;

public interface UserService {

	User save(User user);

	User getById(String id);
	
	List<User> listAllUsers();
}
