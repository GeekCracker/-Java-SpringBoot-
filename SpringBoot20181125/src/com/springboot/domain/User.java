package com.springboot.domain;

public class User {

	/**�û�����*/
	private String userName;
	/**�û�����*/
	private String userAge;
	/**�û��Ա�*/
	private String userSex;
	/**�û�����*/
	private String userPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userAge=" + userAge + ", userSex=" + userSex + ", userPassword="
				+ userPassword + "]";
	}
}
