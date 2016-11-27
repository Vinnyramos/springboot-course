package com.danielabella.courses.springboot.example5.service;

import java.util.List;

import com.danielabella.courses.springboot.example5.domain.User;

public interface UserService {

	User save(User user);

	User getById(String id);
	
	List<User> listAllUsers();
}
