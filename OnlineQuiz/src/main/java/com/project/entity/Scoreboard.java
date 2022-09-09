package com.project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scoreboard {
	@Id
	@Column(name="position")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int position;
	private String User;
	private String Score;
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		this.User = user;
	}
	public String getScore() {
		return Score;
	}
	public void setScore(String score) {
		this.Score = score;
	}
	public Scoreboard(int position, String user, String score) {
		super();
		this.position = position;
		this.User = user;
		this.Score = score;
	}
	
	
	public Scoreboard() {
		
	}
	
	

}
