package com.project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quiz {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String QuizCode;
	private String Question1;
	private String Question2;
	private String Question3;
	public int getId() {
		return Id;
	}
	public Quiz(int id, String quizCode, String question1, String question2, String question3) {
		super();
		this.Id = id;
		this.QuizCode = quizCode;
		this.Question1 = question1;
		this.Question2 = question2;
		this.Question3 = question3;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getQuizCode() {
		return QuizCode;
	}
	public void setQuizCode(String quizCode) {
		this.QuizCode = quizCode;
	}
	public String getQuestion1() {
		return Question1;
	}
	public void setQuestion1(String question1) {
		this.Question1 = question1;
	}
	public String getQuestion2() {
		return Question2;
	}
	public void setQuestion2(String question2) {
		this.Question2 = question2;
	}
	public String getQuestion3() {
		return Question3;
	}
	public void setQuestion3(String question3) {
		this.Question3 = question3;
	}
	
	
	public Quiz() {
		// TODO Auto-generated constructor stub
	}	

	
}
