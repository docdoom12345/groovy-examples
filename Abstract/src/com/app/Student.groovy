package com.app

class Example {

	static void main(args) {
		// TODO Auto-generated method stub
		//Person t = new Person()
		Student student = new Student()
		student.Name = "Jake"
		student.studentID = 700
		student.Marks = 80
		println(student.Name)
		println(student.studentID)
		println(student.displayMarks())
		println(student.testing())
	}
}
abstract class Person {
	public String Name // should be public
	Person() {
		
	}
	abstract int displayMarks() // abstract method
	int testing() {             // non abstract method
		return 45
	}
}
class Student extends Person {
	int studentID
	int Marks
	public Student() {

	}
	public int displayMarks() {
		// TODO Auto-generated method stub
		return this.marks;
	}	

}