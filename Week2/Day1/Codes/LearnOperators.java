package org.kumaransystems.week2.day1;

public class LearnOperators {
   
  
   public static void main(String[] args) {
   int a=10; 
   int b=3;
    //add
    System.out.println(a+b);  //30
    //multiply
    System.out.println(a*b);  //200
    //subtract
    System.out.println(a-b); //-10
    //division
    System.out.println(a/b); //10/3=3 
    //modulus
    System.out.println(a%b); //10%3=1

//Comparison operators
int c=5;
int d=7;
//equal to
System.out.println(c==d);   
//not equal to
System.out.println(c!=d);  
//greater than
System.out.println(c>d);   
//less than
System.out.println(c<d);
//greater than or equal to
System.out.println(c>=d);
//less than or equal to
System.out.println(c<=d);

//logical operators
int s=20;
int t=30;
//logical AND - both conditions should be true
System.out.println(s>10 && t>20);  //true  
//logical OR - at least one condition should be true
System.out.println(s>10 || t>20);  //true

//assignment operators
int x=10;
x+=5;  //x=x+5
System.out.println(x);  //15

//incremental/decremental
int v=7;
//post-increment
System.out.println(v++);    //7
System.out.println(v);      //8

//pre-increment
System.out.println(++v);    //9

//post-decrement
System.out.println(v--);   //9
System.out.println(v);     //8

//pre-decrement
System.out.println(--v);   //7


   }
}
