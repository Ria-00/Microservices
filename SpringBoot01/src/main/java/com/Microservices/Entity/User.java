package com.Microservices.Entity;

public class User {

	private String username;
	private String pass;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", pass=" + pass + "]";
	}
	
}
