package org.kumaransystems.week2.day3;

public class AccountCredentails {

    private int password;
//                      12345
    public void set(int password){
    this.password=password;
    //   password=12345
    }

    public int get(){
     return password;
    }



    public static void main(String[] args) {
        AccountCredentails details=new AccountCredentails();
        System.out.println(details.password);
    }


}
