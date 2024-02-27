package main.groovy

class Delegate {
	def leap(int year) {
		if (year % 4 == 0 && year % 100 !=0) {
			return "leap year"
		}
		else if (year % 400 == 0) {
			return "leap year"
		}
		return "not leap year"
	}
}
class Example {
	static void main(args) {
		def closure = {
			return delegate.leap(it)
		}
		def output = new Delegate()
		closure.delegate = output
		def result = closure(2000)
		println(result)
	}
}

