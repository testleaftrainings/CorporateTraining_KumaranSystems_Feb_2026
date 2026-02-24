package org.kumaransystems.week2.day2;

public class LearnStrings {
    
    public static void main(String[] args) {
     

    //SString Literal
    String str1="Kumaran";
    String str3="Kumaran";
    
    //String Object
    String str2=new String("Kumaran");
    String str4=new String("Kumaran");

    //Reference
    System.out.println(str1==str3);
    //equals - to compare the values of the string
    System.out.println(str2.equals(str4));
        

    String name="Vineeth";
    //toUpperCase
    String modifiedname=name.toUpperCase();
    System.out.println(modifiedname);

    StringBuilder companyName=new StringBuilder("Kumaran");
    StringBuilder modifiedName=companyName.append("Systems");
    System.out.println(companyName);
    System.out.println(modifiedName);

     }
}
