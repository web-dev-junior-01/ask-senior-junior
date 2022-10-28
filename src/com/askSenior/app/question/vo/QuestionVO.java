package com.askSenior.app.question.vo;

import java.util.Date;

public class QuestionVO {
	private int questionNumber;
	private int userNumber;
	private String questionCategory;
	private String questionTitle;
	private String questionContent;
	private Date questionUpdatedDate;
	
	public QuestionVO() {
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

	public String getQuestionCategory() {
		return questionCategory;
	}

	public void setQuestionCategory(String questionCategory) {
		this.questionCategory = questionCategory;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public Date getQuestionUpdatedDate() {
		return questionUpdatedDate;
	}

	public void setQuestionUpdatedDate(Date questionUpdatedDate) {
		this.questionUpdatedDate = questionUpdatedDate;
	}

	@Override
	public String toString() {
		return "QuestionVO [questionNumber=" + questionNumber + ", userNumber=" + userNumber + ", questionCategory="
				+ questionCategory + ", questionTitle=" + questionTitle + ", questionContent=" + questionContent
				+ ", questionUpdatedDate=" + questionUpdatedDate + "]";
	}

	
}
