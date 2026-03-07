package org.kumaransystems.week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClickAndHold {

     public static void main(String[] args) {
            //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://jqueryui.com/selectable/");
        
        //maximize the browser
        driver.manage().window().maximize();

        //add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //switch to frame
        driver.switchTo().frame(0);

        WebElement ele1=driver.findElement(By.xpath("//li[text()='Item 1']"));

        WebElement ele2=driver.findElement(By.xpath("//li[text()='Item 2']"));

        WebElement ele3=driver.findElement(By.xpath("//li[text()='Item 3']"));

        WebElement ele4=driver.findElement(By.xpath("//li[text()='Item 4']"));

        WebElement ele5=driver.findElement(By.xpath("//li[text()='Item 5']"));

        WebElement ele6=driver.findElement(By.xpath("//li[text()='Item 6']"));

        WebElement ele7=driver.findElement(By.xpath("//li[text()='Item 7']"));
 
        Actions act=new Actions(driver);
        act.clickAndHold(ele1).pause(5000).clickAndHold(ele2).clickAndHold(ele3)
        .clickAndHold(ele4).clickAndHold(ele5).clickAndHold(ele6).clickAndHold(ele7).perform();
    }
}
