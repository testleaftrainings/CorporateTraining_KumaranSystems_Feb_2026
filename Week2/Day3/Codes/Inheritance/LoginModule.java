package org.kumaransystems.week2.day3;

public class LoginModule extends RegistrationModule {

    public void runLogin(){
        System.out.println("Login successful");
    }

   public static void main(String[] args) {
    LoginModule options=new LoginModule();
    options.runLogin();
    options.registerAccount();
   }
    
}
