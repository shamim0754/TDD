package com.javaaround.unittest;
/**
 * Sum program by an str + expresion
 *
 */
public class Calculator {
  	
  public int sum(String expression) {
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}