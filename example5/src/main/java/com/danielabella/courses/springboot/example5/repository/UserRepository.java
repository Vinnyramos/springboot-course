package com.danielabella.courses.springboot.example5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielabella.courses.springboot.example5.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

	public User findByName(String name);
	
}
