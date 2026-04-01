package org.kumaransystems.week3.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://leafground.com/alert.xhtml");
        
        //maximize the browser
        driver.manage().window().maximize();

        //Click on the show button
        driver.findElement(By.xpath("//span[text()='Show']")).click();

        //Switch the driver focus
        Alert simpleAlert=driver.switchTo().alert();

        //accept the alert
        simpleAlert.accept();

        }

}
