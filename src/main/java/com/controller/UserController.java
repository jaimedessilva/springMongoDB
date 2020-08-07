package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Post;
import com.model.User;
import com.service.UserService;

/**Project: springMongo
 * File: UserController.java
 * @author jaime
 * Em 05-08-2020 
 * @param <User>**/

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping
	public User save (@RequestBody User user) {
		return service.save(user);
	}	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value="/{id}")
	public Optional<User> findById(@PathVariable String id){
		return service.findById(id);	
	}
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	@PutMapping(value="/{id}")
	public User update (@PathVariable String id, @RequestBody User user){
		Optional<User> obj = service.findById(id);
		if (obj == null) {
			return null; 
		}else {
			return service.save(user);
		}	
	}
	@GetMapping(value="/{id}/posts")
	public ResponseEntity<List<Post>> findPosts(@PathVariable String id){
		Optional<User> obj = service.findById(id);
		return null;//ResponseEntity.ok().body(obj.getPosts());
		
	}
}
