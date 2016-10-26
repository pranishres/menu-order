package com.menuorder.api.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menuorder.api.persistence.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
//	public User findById(Integer id);
	
}
