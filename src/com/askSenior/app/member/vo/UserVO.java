package com.askSenior.app.member.vo;

public class UserVO {
	
	private int userNumber;
	private String userEmail;
	private String userPassword;
	private String userNickname;
	private String userProfileImage;
	private String userGreetings;
	private String userJoinType;
	private String userName;
	private String userPhoneNumber;
	
	
	
	public UserVO() {;}



	public int getUserNumber() {
		return userNumber;
	}



	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public String getUserNickname() {
		return userNickname;
	}



	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}



	public String getUserProfileImage() {
		return userProfileImage;
	}



	public void setUserProfileImage(String userProfileImage) {
		this.userProfileImage = userProfileImage;
	}



	public String getUserGreetings() {
		return userGreetings;
	}



	public void setUserGreetings(String userGreetings) {
		this.userGreetings = userGreetings;
	}



	public String getUserJoinType() {
		return userJoinType;
	}



	public void setUserJoinType(String userJoinType) {
		this.userJoinType = userJoinType;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}



	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}



	@Override
	public String toString() {
		return "UserVO [userNumber=" + userNumber + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userNickname=" + userNickname + ", userProfileImage=" + userProfileImage + ", userGreetings="
				+ userGreetings + ", userJoinType=" + userJoinType + ", userName=" + userName + ", userPhoneNumber="
				+ userPhoneNumber + "]";
	}

	

	
	
	
	
}
