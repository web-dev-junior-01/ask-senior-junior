package com.askSenior.app.answer.vo;

public class InterestingQuestionVO {
	private int questionNumber;
	private int userNumber;
	
	public InterestingQuestionVO() {
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
		return "InterestingQuestionVO [questionNumber=" + questionNumber + ", userNumber=" + userNumber + "]";
	}

	
	
}
