package com.app

class Switch {
	static void main(args) {
		def name = "Watson"
		switch(name) {
			case "Sherlock":
				println("Watson")
				break
			case "Bonnie":
			    println("Clyde")
				break
			case "Jekyll":
			    println("Hyde")
				break
			default:
				println("No conditions matched")
				break
		}
	}
}
