package com.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.model.Post;
import com.model.User;
import com.repository.PostRepository;
import com.repository.UserRepository;

/**Project: springMongoDB
 * File: Instatiation.java
 * @author jaime
 * Em 05-08-2020 **/

@Configuration
public class Instatiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private PostRepository postRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		//Repository
		//User
		userRepo.deleteAll();
		
		User cesar = new User(null, "Cesar Gray", "cesar@gmail.com");
		User alex = new User(null, "Alex Ross", "alex@gmail.com");
		User bob = new User(null, "Bob Dylan", "bob@gmail.com");
		User hommer = new User(null, "Hommer Nor", "hommer@gmail.com");
		User ted = new User(null, "Ted Thompson", "ted@gmail.com");
//		
		userRepo.saveAll(Arrays.asList(cesar,alex,bob,hommer,ted));
//		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viagem","Vou viajar para São Paulo. abraços!!!!", alex);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom Dia","Acordei Feliz Hoje!!!!", bob);
		
		postRepo.saveAll(Arrays.asList(post1, post2));
		
		cesar.getPosts().addAll(Arrays.asList(post1, post2));
		userRepo.save(cesar);
		
	}
}
