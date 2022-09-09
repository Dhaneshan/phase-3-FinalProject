package com.project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuizCompetition {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int QuizId;
	private int QuestionId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuizId() {
		return QuizId;
	}
	public void setQuizId(int quizId) {
		this.QuizId = quizId;
	}
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		this.QuestionId = questionId;
	}
	public QuizCompetition(int id, int quizId, int questionId) {
		super();
		this.id = id;
		this.QuizId = quizId;
		this.QuestionId = questionId;
	}
	public QuizCompetition() {
		// TODO Auto-generated constructor stub
	}

}