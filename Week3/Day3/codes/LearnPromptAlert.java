package org.kumaransystems.week3.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://leafground.com/alert.xhtml");
        
        //maximize the browser
        driver.manage().window().maximize();

        //Click Show button
        driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::button[@name='j_idt88:j_idt104']")).click();

        //Switch to Alert
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Kumaran");
        promptAlert.dismiss();

    }

}
