package org.kumaransystems.week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

    public static void main(String args[]){
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();
       
       //Load the url
        driver.get("https://leafground.com/frame.xhtml");
        
        //maximize the browser
        driver.manage().window().maximize();

        //Switch to frame
        //By index
        //driver.switchTo().frame(0);

        //By webelement
        WebElement clickElement=driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']/following-sibling::iframe"));
        driver.switchTo().frame(clickElement);
        
        //click the button
        driver.findElement(By.id("Click")).click();
   }

}
