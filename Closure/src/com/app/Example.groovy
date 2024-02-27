package com.app

class Example {

	static void main(args) {
		// TODO Auto-generated method stub
		def closure = { 
			println("Hello ${it}")
		}
		closure("Alex")
		def code = { name ->
			123
			//it = 100
			name = 99
		}
		println(code("77"))
		def list = ["gRRoovy","ANSIBLE", "Jenkins"]
		println("Entering transform")
		def transform = { word ->
			word[0].toUpperCase() + word[1..-1].toLowerCase()
		} 
		def updatedList = list.collect(transform) // collect is used for iteration
		println(updatedList)
		
		def year = { year ->
			if (year % 4 == 0) {
				println("Leap")
				year
			}
			else {
				println("Not leap")
			    year
			}
		}
		println(year(2013))
		def list1=(1..10).toList()
		def list2=(0..4).toList()
		def result = [*list1, *list2].toSet().toList()
		println(result)
	}
}
