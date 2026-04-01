package org.kumaransystems.week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {


        public static void main(String[] args) {
             //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        //maximize the browser
        driver.manage().window().maximize();
//Find element
       WebElement rightClickElement=driver.findElement(By.xpath("//span[text()='right click me']"));

//Create Object for Actions Class
Actions act=new Actions(driver);

//contextClick()
act.contextClick(rightClickElement).perform();


        }
}
