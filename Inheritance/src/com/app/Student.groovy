package com.app
class Parent {
	def studentID = 100
	public java.lang.Object getStudentID() {
		return studentID;
	}
	public void setStudentID(java.lang.Object studentID) {
		this.studentID = studentID;
	}
	void display() {
		println("parent class")
	}
}

class Child extends Parent{
	def studentID = 75
	def studentName = "Jake"
	void display() {
		super.display()
		super.studentID = 700
		println(this.studentName)
		println(super.studentID)
		println("child class")
	}
}


class Child3 extends Parent{
	void display() {
		println(super.studentID)
		super.studentID=1000
	}
}
class Student{
	static void main(args) {
		Parent parent = new Parent()
		Child child = new Child()
		Child2 child2 = new Child2()
		Child3 child3 = new Child3()
		child.display()
		child3.display()
		println(child3.getStudentID())
	}
}
class Child2 extends Child{
	void display() {
		super.display()
	}
}