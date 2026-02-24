package org.kumaransystems.week2.day2;

public class Mobile {
    //normal method
    public void makeCall(){
      System.out.println("Make Call");  
    }
    
   public static void main(String[] args) {
        //ClassName objectName=new ClassName();
        Mobile mobileOptions=new Mobile();
        mobileOptions.makeCall();
    }

}
