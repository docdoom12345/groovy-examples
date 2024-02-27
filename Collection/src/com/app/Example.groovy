package com.app

class Example {

	static void main(args) {
		// TODO Auto-generated method stub
		def list1 = [1,2,3,4,5]
		
		//println("The full list is " + list1)
		//println("Index position 0 is " + list1[0])
		
		//def set1 = [1,2,2,2,2].toSet()
		//def set1 = [1,2,2,2,2].toSet()
		//println("The full set is " + set1)
		//println("Index position 2 is " + set1[2])
		//println("Index position 10 is " + list1[10])
		//println("Index position -1 is " + list1[-1])
		//println("Index position -5 is " + list1[-5])
		//println("Index position -6 is " + list1[-6])   //negative index starts from last element
		def dict1 = [
			"name": "Alex",
			"name": "Jake"
		]
		println("The full dictionary is " + dict1)
		println(dict1.name)
		for (entry in dict1) {
			println("The key is ${entry.key} " + "The value is ${entry.value}")
		}
		def list2 = [1,6,6,6,5,5]
		println(list2.toSet())
		for (element in list2.toSet()) {
			println("the value is " + element)
		}
		println( list2 == [1,6,6,6,5])
		def setupdated = list2.toSet().toList()
		println(setupdated)
	}
}
