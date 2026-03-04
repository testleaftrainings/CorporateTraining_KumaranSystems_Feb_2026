package org.kumaransystems.week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

    public static void main(String[] args) {
        //Declare set
        //HashSet
        //Set<String> interns=new HashSet<String>();

        Set<String> interns=new LinkedHashSet<String>();
        //     0        1      2
        //  [Ashish, Monish, Devaraj]

        //Tree Set
        //Set<String> interns=new TreeSet<String>();
        //  0         1      2
        //[Ashish, Devaraj, Monish]
        interns.add("Ashish");
        interns.add("Monish");
        interns.add("Devaraj");
        System.out.println("The set is: "+interns);

        interns.add("Monish");
        System.out.println(interns);

        //remove
        //interns.remove("Devaraj");

        //Move all values from Set to List
        List<String> employee=new ArrayList<String>(interns);
        System.out.println("The List is: "+employee);
    }
}





