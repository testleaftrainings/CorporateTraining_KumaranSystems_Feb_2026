package org.kumaransystems.week2.day3;

public class RetrieveCredentials {

    public static void main(String[] args) {
        AccountCredentails details=new AccountCredentails();
        details.set(12345);
        int retreivedPassword=details.get();
        System.out.println(retreivedPassword);
    }

}
