package org.kumaransystems.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        //Declare a List
        List<String> employee=new ArrayList<String>();
        System.out.println("The List is: "+employee);

        //add
        employee.add("Bharath");
        System.out.println("The List is: "+employee);

        //add
        employee.add("Venkatesh");
        employee.add("Manikandan");
        System.out.println("The List is: "+employee);

        //add duplicate
        employee.add("Venkatesh");
        System.out.println("The List after adding duplicate: "+employee);

        //To retrieve a value - get -based on index
        String valueAtIndex2=employee.get(2);
        System.out.println(valueAtIndex2);

        employee.add(1, "Selvi");
        System.out.println("The List is: "+employee);
       
       //To count the number of elements
       int listSize=employee.size();
       System.out.println("The size is: "+listSize);

       //addAll
       // add all the elements from 1 list to another list
       //create empty list
       List<String> seniorEmployees=new ArrayList<String>();
       System.out.println("The List is:" +seniorEmployees);
       seniorEmployees.addAll(employee);
       System.out.println("The new List is: "+seniorEmployees);

       Collections.sort(seniorEmployees);
       System.out.println("the Sorted List is: "+seniorEmployees);

       //remove
       seniorEmployees.remove("Venkatesh");
       System.out.println("The List is: "+seniorEmployees);

       //clear
       seniorEmployees.clear();
       System.out.println("The List is: "+seniorEmployees);

       }

}
