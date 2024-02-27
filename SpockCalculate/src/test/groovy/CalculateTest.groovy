package test.groovy
import main.groovy.*
import spock.lang.*
class CalculateTest extends Specification {

	def calculate() {
		given:
		Calculate calculate = new Calculate()

		expect :
		//def result = calculate.calculateGrade(70)
		//def nextresult = calculate.calculateGrade(30)
		calculate.calculateGrade(mark) == result

		where:
		mark | result
		70   | "passed"
		30   | "failed"
		65 | "passed"
	}
}
