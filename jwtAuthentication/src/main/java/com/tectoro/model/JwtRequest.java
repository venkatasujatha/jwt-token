package com.tectoro.model;

public class JwtRequest {
String userName;
String password;
public JwtRequest(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
public JwtRequest() {
	super();
	// TODO Auto-generated constructor stub
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
