package com.example.one.beans;

public class User {
	
	int id;
	String userName;
	String userPassword;
	
	public User(int id, String userName, String userPassword) {
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

}
