package com.app

class Condition {

	static void main(args) {
		// TODO Auto-generated method stub
		def num1 = 150
		def name = "sai"
		if(num1 == 150 && name == "sai") { 		// && is and condition
			println("num1 is equal to 150 and name is sai")
		}
		else if(num1 < 150 && name == "sai") { 		// || is or condition
			println("num1 is less than 150")
		}
		else {
			println("num1 is greater than 150")
		}
	}
}
