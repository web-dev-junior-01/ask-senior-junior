package com.askSenior.app.answer.vo;

public class LikeAnswerVO {
	private int answerNumber;
	private int userNumber;
	
	public LikeAnswerVO() {
		// TODO Auto-generated constructor stub
	}

	public int getAnswerNumber() {
		return answerNumber;
	}

	public void setAnswerNumber(int answerNumber) {
		this.answerNumber = answerNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "LikeAnswerVO [answerNumber=" + answerNumber + ", userNumber=" + userNumber + "]";
	}

	
	
	
}
