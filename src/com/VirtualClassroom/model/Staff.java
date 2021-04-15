package com.VirtualClassroom.model;

public class Staff {

	private String staffName;
	private String staffEmail;
	private int staffAge;

	/**
	 * @param staffName
	 * @param staffEmail
	 * @param staffAge
	 */
	public Staff(String staffName, String staffEmail, int staffAge) {
		super();
		this.staffName = staffName;
		this.staffEmail = staffEmail;
		this.staffAge = staffAge;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public int getStaffAge() {
		return staffAge;
	}

	public void setStaffAge(int staffAge) {
		this.staffAge = staffAge;
	}

}
