package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int User_id;
	private String User_email;
	private String User_password;
	public int getId() {
		return User_id;
	}
	public void setId(int id) {
		this.User_id = id;
	}
	public String getEmail() {
		return User_email;
	}
	public void setEmail(String email) {
		this.User_email = email;
	}
	public String getPassword() {
		return User_password;
	}
	public void setPassword(String password) {
		this.User_password = password;
	}
	public User(int id, String email, String password) {
		super();
		this.User_id = id;
		this.User_email = email;
		this.User_password = password;
	}
	
	public User() {
		
	}
	
}
	
	