package com.VirtualClassroom.model;

public class Student {
	private String studentName;
	private String studentEmail;
	private int studentAge;
	
	
public Student(String studentName, String studentEmail, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAge = studentAge;
	}

public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}


}
