package org.kumaransystems.week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollAction {

    public static void main(String[] args) {
         //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.amazon.in/");
        
        //maximize the browser
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Step1: Locate Element
        WebElement exploreButton=driver.findElement(By.xpath("//span[text()='Explore all']"));

        //Step2:
        Actions act=new Actions(driver);
         
        act.scrollToElement(exploreButton).pause(2000).perform();


        Dimension size=exploreButton.getSize();
        System.out.println(size);

Point location=exploreButton.getLocation();
System.out.println(location);

     
     }

}
