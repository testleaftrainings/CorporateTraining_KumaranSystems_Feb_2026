package org.kumaransystems.week3.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleBrowserNotofications {


    
   public static void main(String args[]){
  ChromeOptions options=new ChromeOptions();
   options.addArguments("--disable-notifications");
   ChromeDriver driver=new ChromeDriver(options);
   }

}
