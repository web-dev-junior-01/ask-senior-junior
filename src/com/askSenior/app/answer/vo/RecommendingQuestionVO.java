package com.askSenior.app.answer.vo;

public class RecommendingQuestionVO {
	private int questionNumber;
	private int memberNumber;
	
	public RecommendingQuestionVO() {
		// TODO Auto-generated constructor stub
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}

	public int getUserNumber() {
		return memberNumber;
	}

	public void setUserNumber(int userNumber) {
		this.memberNumber = userNumber;
	}

	@Override
	public String toString() {
		return "RecommendingQuestionVO [questionNumber=" + questionNumber + ", userNumber=" + memberNumber + "]";
	}

	
	
	
}
