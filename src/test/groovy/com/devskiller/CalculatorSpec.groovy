package com.devskiller

import spock.lang.Specification

class CalculatorSpec extends Specification {

	def "shouldAddTwoNumbers"() {
		given:
		Calculator calculator = new Calculator();

		when:
		int result = calculator.add(2, 3);

		then:
		result == 5
	}

	def "shouldSubtractTwoNumbers"() {
		given:
		Calculator calculator = new Calculator();

		when:
		int result = calculator.subtract(5, 3);

		then:
		result == 2;
	}

	def "shouldMultiplyTwoNumbers"() {
		given:
		Calculator calculator = new Calculator();

		when:
		int result = calculator.multiply(2, 3);

		then:
		result == 6
	}

	def "shouldDivideTwoNumbers"() {
		given:
		Calculator calculator = new Calculator();

		when:
		int result = calculator.divide(6, 3);

		then:
		result == 2
	}
}
