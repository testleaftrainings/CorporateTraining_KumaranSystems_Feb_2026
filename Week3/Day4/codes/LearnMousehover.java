package org.kumaransystems.week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMousehover {

    public static void main(String[] args) {
         //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.pvrcinemas.com/");
        
        //maximize the browser
        driver.manage().window().maximize();

        //Step1: Locating Element
        WebElement moreElement=driver.findElement(By.xpath("//span[text()='More']"));

        //Step2: Create Object Actions Class
        Actions actOptions=new Actions(driver);
        
        //Step3:Use the proper method
        //actOptions.moveToElement(moreElement).perform();
        actOptions.scrollToElement(moreElement);
    }

}
