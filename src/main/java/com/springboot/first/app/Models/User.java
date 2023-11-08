package com.springboot.first.app.Models;


public class User {
     private String nickName;
     private String userName;
     private String password;
      
	public User() {
	}
	
	
	
	public User(String nickName, String userName, String password) {
		this.nickName = nickName;
		this.userName = userName;
		this.password = password;
	}



	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
     
     
}

