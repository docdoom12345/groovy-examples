package com.app

class Example {

	static void main(args) {
		// TODO Auto-generated method stub
		Student student = new Student(60)
		student.displayMarks()
		student.testing(60)
	}
}
interface Marks {
	//int num1
	void displayMarks()
	int testing(int num1)
}
class Student implements Marks {
	int marks
	public int getMarks() {
		return marks;
	}
	Student(int marks) {
		this.marks = marks
	}
	public void displayMarks() {
		// TODO Auto-generated method stub
		if(this.getMarks() >= 60) {
			println("You have cleared")
		}
		else {
			println("Minimum marks to clear is 60")
		}
	}
	public int testing(int marks) {
		// TODO Auto-generated method stub
		println(marks)
		return marks
	}
}