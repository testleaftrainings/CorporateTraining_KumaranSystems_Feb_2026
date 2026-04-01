package org.kumaransystems.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWindow {
public static void main(String[] args) {
    //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://leafground.com/window.xhtml");
        
        //maximize the browser
        driver.manage().window().maximize();

        //Clicl the button
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

        //add wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }
}
