package com.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.User;
import com.repository.UserRepository;

/**Project: springMongoDB
 * File: UserService.java
 * @author jaime
 * Em 05-08-2020 **/

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	// Insert/Save
	public User save(User obj) {
		return userRepo.save(obj);
	}

	// Find All
	public List<User> findAll() {
		return userRepo.findAll();
	}

	//Find By Id
	public Optional<User> findById(String id) {
		return userRepo.findById(id);
	}
	// Delete
	public void delete(String id) {
		findById(id);
		userRepo.deleteById(id);
	}
}
