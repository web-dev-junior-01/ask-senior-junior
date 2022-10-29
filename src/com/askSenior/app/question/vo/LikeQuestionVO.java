package com.askSenior.app.question.vo;

public class LikeQuestionVO {
	private int questionNumber;
	private int userNumber;
	
	public LikeQuestionVO() {
		// TODO Auto-generated constructor stub
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "LikeQuestionVO [questionNumber=" + questionNumber + ", userNumber=" + userNumber + "]";
	}

	
	
}
