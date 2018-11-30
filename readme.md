### Demo ###

1. create a maven project

mvn archetype:generate -DgroupId=com.javaaround.TestApp -DartifactId=TDD -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

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

1. JUnitCore Using Command line : 

	```java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest```	

	The output is <br>

	```
	JUnit version 4.12
	. // one . means 1 test run
	Time: 0,006

	OK (1 test)
	```	

	JUnitCore Using program : <br>

	```java
	import org.junit.runner.JUnitCore;
	import org.junit.runner.Result;
	import org.junit.runner.notification.Failure;

	public class Runner 
	{
	    public static void main( String[] args )
	    {
		   System.out.println("Hello world");			
		   Result result = JUnitCore.runClasses(CalculatorTest.class);
	       for (Failure failure : result.getFailures())
	       {
	            System.out.println(failure.toString());
	       }	
		   System.out.println(result.wasSuccessful());
	    }

	``` 

	compile <br> 

	```javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar Runner.java```

	Run <br> 

	```java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar Runner```
