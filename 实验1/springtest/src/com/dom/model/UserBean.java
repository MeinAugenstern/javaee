package com.dom.model;

public class UserBean {
	private String username;
	private String password; 
	private int type;
	//构造方法 
	public UserBean(){} 
	// get方法 
	public String getUsername(){ return username; } 
	public String getPassword(){ return password; } 
	public int getType() {return type;}
	// set方法
	public void setUsername(String username){ this.username = username; } 
	public void setPassword(String password){ this.password = password; }
	public void setType(int type) {this.type = type;}
}
