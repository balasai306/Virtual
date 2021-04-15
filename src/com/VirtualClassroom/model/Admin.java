package com.VirtualClassroom.model;

public class Admin {
	private String adminName;
	private String adminEmail;
	private int adminAge;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param adminName
	 * @param adminEmail
	 * @param adminAge
	 */
	public Admin(String adminName, String adminEmail, int adminAge) {
		super();
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminAge = adminAge;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public int getAdminAge() {
		return adminAge;
	}
	public void setAdminAge(int adminAge) {
		this.adminAge = adminAge;
	}

}
