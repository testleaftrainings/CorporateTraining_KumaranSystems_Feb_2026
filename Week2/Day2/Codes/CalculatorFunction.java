package org.kumaransystems.week2.day2;

public class CalculatorFunction {
   //Declare a method with parameter
  public void add(int number){
      //int number=7;
      System.out.println(number);
  }

  public static void main(String[] args) {
    CalculatorFunction calcOptions=new CalculatorFunction();
    calcOptions.add(10);
    calcOptions.add(7);
  }


}
