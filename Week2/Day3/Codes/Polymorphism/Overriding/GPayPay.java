package org.kumaransystems.week2.day3;

public class GPayPay extends PaymentModule{

    public void completePayment(){
     System.out.println("Gpay Payment");

    }
    

    public static void main(String[] args) {
       GPayPay options=new GPayPay();
       options.completePayment();

    }
}
