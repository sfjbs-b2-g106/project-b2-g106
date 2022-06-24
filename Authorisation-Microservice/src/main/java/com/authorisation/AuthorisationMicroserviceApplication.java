package com.authorisation;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.authorisation.entity.User;
import com.authorisation.repository.UserRepository;



@SpringBootApplication
public class AuthorisationMicroserviceApplication {
	
	@Autowired
	private UserRepository repository;
	
	 @PostConstruct
	    public void initUsers() {
	        List<User> users = Stream.of(
	                new User(101, "akram", "akram", "akram@gmail.com"),
	                new User(102, "vaishnavi", "vaishnavi", "vaishnavi@gmail.com"),
	                new User(103, "sravani", "sravani", "sravani@gmail.com")
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	    }
	

	public static void main(String[] args) {
		SpringApplication.run(AuthorisationMicroserviceApplication.class, args);
	}

}
