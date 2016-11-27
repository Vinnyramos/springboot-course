package com.danielabella.courses.springboot.example6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielabella.courses.springboot.example6.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

	public User findByName(String name);
	
}
