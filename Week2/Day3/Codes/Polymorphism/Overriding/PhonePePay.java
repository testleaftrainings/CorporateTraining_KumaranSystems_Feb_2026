package org.kumaransystems.week2.day3;

public class PhonePePay extends PaymentModule{
    
    public void completePayment(){
        super.completePayment();
     //System.out.println("PhonePe pay");

    }

    public static void main(String[] args) {
        PhonePePay options=new PhonePePay();
        options.completePayment();
    }

}
