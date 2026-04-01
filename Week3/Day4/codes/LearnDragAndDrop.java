package org.kumaransystems.week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

    public static void main(String[] args) {
         //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://jqueryui.com/droppable/");
        
        //maximize the browser
        driver.manage().window().maximize();

        //add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       //switch to frame
       driver.switchTo().frame(0);

        //Find element1
        WebElement dragElement=driver.findElement(By.id("draggable"));
        //Find elemet 2
        WebElement dropElement=driver.findElement(By.id("droppable"));

        Actions act=new Actions(driver);

        act.dragAndDrop(dragElement, dropElement).perform();
    }

}
