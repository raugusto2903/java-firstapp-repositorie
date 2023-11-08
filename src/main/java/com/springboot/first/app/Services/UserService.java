package com.springboot.first.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.ArrayList;

import com.github.javafaker.Faker;
import com.springboot.first.app.Models.User;

import jakarta.annotation.PostConstruct;

@Service
public class UserService {
   @Autowired
   private Faker faker;
   private List<User>users = new ArrayList<>();
   @PostConstruct
   public void init() {
	   for(int i=0;i<100;i++) {
		   users.add(new User(faker.funnyName().name(),faker.name().username(),  faker.dragonBall().character())); 
	   }   
   }
   public List<User> getUsers(){
	   return users;
   }
   
   public User getUserByUsername(String username) {
	   return users.stream().filter(u->u.getUserName().equals(username)).
	   findAny().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
       String.format("USER %S NOT FOUND", username)));
   }
}
