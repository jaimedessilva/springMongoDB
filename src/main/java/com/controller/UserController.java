package com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.User;

/**Project: springMongo
 * File: UserController.java
 * @author jaime
 * Em 05-08-2020 
 * @param <User>**/

@RestController
@RequestMapping(value ="/users")
public class UserController {
	
	
	@GetMapping
	public List<User> findAll(){
		User maria = new User("1","maria Silva","maria@gmail.com");
		User alex = new User("1","Alex Green","alex@gmail.com");
		
		List<User> listUser = new ArrayList<>();
		listUser.addAll(Arrays.asList(maria, alex));
		return listUser;
	}

	

}
