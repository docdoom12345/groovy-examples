package test.groovy

import main.groovy.*
import spock.lang.*

class CalculatorServiceSpec extends Specification{
	def testing() {
		given:
		def calculatorMock = Mock(Calculator)
		def calculatorService = new CalculatorService(calculator: calculatorMock)
		calculatorMock.add(2,3) >> 5
		
		when:
		def result = calculatorService.calculate(2,3)
		
		then:
		calculatorMock.add(2,3) >> 5
		result == 5
	}
}
