package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.entity.User;
import com.project.service.UserService;
@RestController
@RequestMapping("/quizapi/user")
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping("/user1")
	public String adminLogin(@RequestBody User u)
	{
		if(service.verifyUser(u.getEmail(), u.getPassword()))
		{
			return "Welcome User!";
		}
		else
		{
			return "Invalid Credentials.";
		}
	}
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User u){
		User user= service.addUser(u);
		if(user!=null)  
			return new ResponseEntity<User>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<User>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	//List of Users Or RETRIVE DATA
	@GetMapping("/")
	public  List<User> getAllUser(){
		return service.getAllUser();
	}
	//get user by id
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id){
		  User user= service.getUserById(id);
		  
		  if(user!=null)
			  return new ResponseEntity<User>(user,HttpStatus.FOUND);
		  else
			  return new  ResponseEntity<User>(user,HttpStatus.NOT_FOUND);
	}
	
}