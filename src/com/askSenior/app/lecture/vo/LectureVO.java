package com.askSenior.app.lecture.vo;

import java.util.Date;

public class LectureVO {
	private int lectureNumber;
	private int userNumber;
	private String lectureCategory;
	private String lectureTitle;
	private String lectureIntroductionImage;
	private String lecturelecturerIntroduction;
	private String lectureContent;
	private Date lectureDate;
	private Date lectureSignupStartDate;
	private Date lectureSignupEndDate;
	private String lectureLocation;
	private int lectureLimitNumber;
	private int lectureApplyNumber;
	
	public LectureVO() {
		// TODO Auto-generated constructor stub
	}

	public int getLectureNumber() {
		return lectureNumber;
	}

	public void setLectureNumber(int lectureNumber) {
		this.lectureNumber = lectureNumber;
	}

	public int getUserEmail() {
		return userNumber;
	}

	public void setUserEmail(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getLectureCategory() {
		return lectureCategory;
	}

	public void setLectureCategory(String lectureCategory) {
		this.lectureCategory = lectureCategory;
	}

	public String getLectureTitle() {
		return lectureTitle;
	}

	public void setLectureTitle(String lectureTitle) {
		this.lectureTitle = lectureTitle;
	}

	public String getLectureIntroductionImage() {
		return lectureIntroductionImage;
	}

	public void setLectureIntroductionImage(String lectureIntroductionImage) {
		this.lectureIntroductionImage = lectureIntroductionImage;
	}

	public String getLectureTalkerIntroduction() {
		return lecturelecturerIntroduction;
	}

	public void setLectureTalkerIntroduction(String lectureTalkerIntroduction) {
		this.lecturelecturerIntroduction = lectureTalkerIntroduction;
	}

	public String getLectureContent() {
		return lectureContent;
	}

	public void setLectureContent(String lectureContent) {
		this.lectureContent = lectureContent;
	}

	public Date getLectureDate() {
		return lectureDate;
	}

	public void setLectureDate(Date lectureDate) {
		this.lectureDate = lectureDate;
	}

	public Date getLectureSignupStartDate() {
		return lectureSignupStartDate;
	}

	public void setLectureSignupStartDate(Date lectureSignupStartDate) {
		this.lectureSignupStartDate = lectureSignupStartDate;
	}

	public Date getLectureSignupEndDate() {
		return lectureSignupEndDate;
	}

	public void setLectureSignupEndDate(Date lectureSignupEndDate) {
		this.lectureSignupEndDate = lectureSignupEndDate;
	}

	public String getLectureLocation() {
		return lectureLocation;
	}

	public void setLectureLocation(String lectureLocation) {
		this.lectureLocation = lectureLocation;
	}

	public int getLectureLimitNumber() {
		return lectureLimitNumber;
	}

	public void setLectureLimitNumber(int lectureLimitNumber) {
		this.lectureLimitNumber = lectureLimitNumber;
	}

	public int getLectureApplyNumber() {
		return lectureApplyNumber;
	}

	public void setLectureApplyNumber(int lectureApplyNumber) {
		this.lectureApplyNumber = lectureApplyNumber;
	}

	@Override
	public String toString() {
		return "LectureVO [lectureNumber=" + lectureNumber + ", userEmail=" + userNumber + ", lectureCategory="
				+ lectureCategory + ", lectureTitle=" + lectureTitle + ", lectureIntroductionImage="
				+ lectureIntroductionImage + ", lectureTalkerIntroduction=" + lecturelecturerIntroduction
				+ ", lectureContent=" + lectureContent + ", lectureDate=" + lectureDate + ", lectureSignupStartDate="
				+ lectureSignupStartDate + ", lectureSignupEndDate=" + lectureSignupEndDate + ", lectureLocation="
				+ lectureLocation + ", lectureLimitNumber=" + lectureLimitNumber + ", lectureApplyNumber="
				+ lectureApplyNumber + "]";
	}

	


	
}
