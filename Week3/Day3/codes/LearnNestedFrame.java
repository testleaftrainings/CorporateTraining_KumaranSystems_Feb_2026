package org.kumaransystems.week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();
       
       //Load the url
        driver.get("https://leafground.com/frame.xhtml");
        
        //maximize the browser
        driver.manage().window().maximize();

        //Swith to outer frame
        driver.switchTo().frame(2);

        //Switch to inner frame
        //driver.switchTo().frame(0);
        driver.switchTo().frame("frame2");

        driver.findElement(By.id("Click")).click();

        //Switch to main page
        driver.switchTo().defaultContent();

        //immmediate parent frame
        driver.switchTo().parentFrame();

   }
}
