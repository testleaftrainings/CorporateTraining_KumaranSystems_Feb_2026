package org.kumaransystems.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Wait
//Implicit wait
//Explicit Wait
//WedDriverWait
//FluentWait



public class LearnWebDriverWait {

    public static void main(String[] args) throws InterruptedException {
         //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://leafground.com/waits.xhtml");
        
        //maximize the browser
        driver.manage().window().maximize();

        //Click the button
        driver.findElement(By.xpath("//span[text()='Click']")).click();

        //Find the invisible button
        //Thread.sleep(10000);
       //boolean isDisplayed= driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
       //System.out.println(isDisplayed);


      //Create Object
      WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));
      waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
      WebElement waitElement=driver.findElement(By.xpath("//span[text()='I am here']"));
      boolean isDisplayed=waitElement.isDisplayed();
      System.out.println(isDisplayed);


    }

}
