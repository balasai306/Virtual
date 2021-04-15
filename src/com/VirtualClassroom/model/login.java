package com.VirtualClassroom.model;

public class login {
private String loginId;
private String password;
	public login() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param loginId
	 * @param password
	 */
	public login(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
