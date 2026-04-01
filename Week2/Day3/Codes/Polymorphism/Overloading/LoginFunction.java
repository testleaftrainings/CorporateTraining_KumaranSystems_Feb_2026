package org.kumaransystems.week2.day3;

public class LoginFunction {

public void runLogin(String username,String password){
System.out.println(username + " "+password);
}

public void runLogin(long mobileNumber){
System.out.println(mobileNumber+ " entered successfully");
}

public void runLogin(String emailId){
System.out.println(emailId+ " entered successfully");
}




    public static void main(String[] args) {
        LoginFunction loginOptions=new LoginFunction();
        loginOptions.runLogin("vineeth123", "1234");
        loginOptions.runLogin(8925411170L);
        loginOptions.runLogin("vineeth@gmail.com");
    }
    
}
