package org.kumaransystems.week2.day2;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        //Declare a String
        String rateOfInterest="rupee6.45%";
        //System.out.println(rateOfInterest+1);
        
        //replaceAll - to replace the characters in the string
        String updatedValue=rateOfInterest.replaceAll("[^0-9.]", "");
        System.out.println(updatedValue);

        //parseFloat - to convert the String to float
        float rate=Float.parseFloat(updatedValue);
        System.out.println(rate+1);

       //split - to split the string based on the given character
        String batch="Feb 2026";
        String[] data=batch.split(" ");
     
        //Declare a String
        String date="Applicable from 17th December, 2025";
        String dates[]=date.split(" ");
        String name=Arrays.toString(dates);
        System.out.println(name);

        //split the String
        String newDate=dates[2]+" "+dates[3];
        System.out.println(newDate);


     //Substring - to get the part of the String based on the index
     String str="6000Dollar";
     //substring with single parameter - it will return the string from the given index to the end of the string
     String newString1=str.substring(2);
      System.out.println(newString1);
     //substring with two parameters - it will return the string from the given start index to the
     String newString2=str.substring(2, 6);
     System.out.println(newString2);
     

    }
    
}
