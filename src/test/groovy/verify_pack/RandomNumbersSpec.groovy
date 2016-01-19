package verify_pack

import com.devskiller.Calculator
import spock.lang.Specification

class RandomNumbersSpec extends Specification {
	
	Random random = new Random(System.currentTimeMillis());

	def "shouldAddTwoRandomNumbers"() {
		given:
		Calculator calculator = new Calculator();

		when:
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int result = calculator.add(a,b);

		then:
		result == a+b
	}

	def "shouldSubtractTwoRandomNumbers"() {
		given:
		Calculator calculator = new Calculator();

		when:
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int result = calculator.subtract(a,b);

		then:
		result == a-b
	}

	def "shouldMultiplyTwoRandomNumbers"() {
		given:
		Calculator calculator = new Calculator();

		when:
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int result = calculator.multiply(a,b);

		then:
		result == a*b
	}

	def "shouldDivideTwoRandomNumbers"() {
		given:
		Calculator calculator = new Calculator();

		when:
		int a = random.nextInt(100)+1;
		int b = (random.nextInt(100)+1) * a;
		int result = calculator.divide(b,a);

		then:
		result == b/a as int
	}
}
