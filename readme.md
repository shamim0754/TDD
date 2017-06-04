### Demo ###

1. create a directory

	mkdir UnitTesting

2. Create Calculator.java under UnitTesting

	```java
	public class Calculator {
	  public int evaluate(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	      sum += Integer.valueOf(summand);
	    return sum;
	  }
	}
	```

   Now compile above class:

	`javac Calculator.java`

3. Create CalculatorTest.java

	```java
	import static org.junit.Assert.assertEquals;
	import org.junit.Test;

	public class CalculatorTest {
	  @Test
	  public void evaluatesExpression() {
	    Calculator calculator = new Calculator();
	    int sum = calculator.evaluate("1+2+3");
	    assertEquals(6, sum);
	  }
	}
	```	
4. Download	
	
	1. [Junit](https://github.com/junit-team/junit4/releases)
	1. [hamcrest-core](http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar)

	copy to UnitTesting directory

4. Compile CalculatorTest.java

	`javac -cp .;junit-4.12.jar CalculatorTest.java`

### How to run ###	

	1. Using Command line : 

		`java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest`	

		The output is <br>

		```java
		JUnit version 4.12
		. // one . means 1 test run
		Time: 0,006

		OK (1 test)
		```	