package test.groovy

import spock.lang.*


class MathSpec extends Specification {

	def maximum() {
		expect:
		Math.max(a,b) == c
		
		where:
		a | b | c
		1 | 2 | 2
		5 | 7 | 7
		20 | 10 | 20
	}

}
