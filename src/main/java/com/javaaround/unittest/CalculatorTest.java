package com.javaaround.unittest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.sum("1+2+3");
    assertEquals(6, sum);
  }
}