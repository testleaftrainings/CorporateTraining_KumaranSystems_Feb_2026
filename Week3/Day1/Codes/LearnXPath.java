package org.kumaransystems.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXPath {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("guest");
        //Launch the Browser
        ChromeDriver driver=new ChromeDriver(options);

        //Load the url  -get()
        driver.get("http://leaftaps.com/opentaps/control/main");

        //Maximiize the browser
        driver.manage().window().maximize();

        //add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //enter username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demo",Keys.ENTER);
        
    
    
    }

}
