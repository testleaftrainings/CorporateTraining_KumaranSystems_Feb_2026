package org.kumaransystems.week4;

public class LearnExceptionHandling {

public static void main(String[] args) {
    
try {
int number=7;
System.out.println(number/0);
}
catch(ArithmeticException expName){
}

try {
    int arr[]=new int[-3];
System.out.println(arr[3]);
    
} catch (NegativeArraySizeException exp) {
System.out.println("The exception is: "+exp);
}
catch(Exception exp){

}

finally{
    System.out.println("close the browser");
}
    
System.out.println("Code completed");
      }
}
