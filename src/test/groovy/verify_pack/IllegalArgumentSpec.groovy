package verify_pack

import com.devskiller.Calculator
import spock.lang.Specification

class IllegalArgumentSpec extends Specification {

	def "shouldThrowExceptionForDivisionByZero"() {
		given:
		Calculator calculator = new Calculator();

		when:
		calculator.divide(10, 0);

		then:
		thrown(RuntimeException)
	}

}
