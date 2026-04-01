package org.kumaransystems.week2.day1;

public class LearnArrays {
public static void main(String[] args) {
   
     //Array Literal
    //             0   1  2
    int[] number={80,90,100};
    System.out.println(number[0]);
    System.out.println(number[1]);
    System.out.println(number[2]);

//Array Instantiation
int[] num=new int[5];
num[0]=76;
num[1]=67;
num[2]=100;
num[3]=56;
num[4]=87;

System.out.println("Array elements are:");
for(int i=0;i<num.length;i++){
    System.out.println(num[i]);
      }
  }

}
