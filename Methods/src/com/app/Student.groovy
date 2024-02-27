package com.app

class Student {
	private int studentID
	private String studentName
	
	Student(int studentID,String studentName){
		this.studentID = studentID
		this.studentName = studentName
	}
	
	int getstudentID() {
		return this.studentID
	}
	String getstudentName() {
		return this.studentName
	}
	void setstudentID(int studentID) {
		this.studentID = studentID
	}
	void setstudentName(String studentName) {
		this.studentName = studentName
	}
	static void main(args) {
		// TODO Auto-generated method stub
		Student student = new Student(40,"Jones")
		student.setstudentID(77)
		student.setstudentName("John")
		println(student.getstudentID())
		println(student.getstudentName())
	}
}
