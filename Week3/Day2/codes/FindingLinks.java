package org.kumaransystems.week3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement forgetOptions=driver.findElement(By.xpath("//span[text()='Forgotten password?']"));
        System.out.println("The expected webelemnt is: "+forgetOptions);
        String textOnElement=forgetOptions.getText();
        System.out.println("The text on the element is: "+textOnElement);
        
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        List<String> newList=new ArrayList<String>();
        

        for (int i = 0; i < allLinks.size(); i++) {
            String allTextValues=allLinks.get(i).getText();
            newList.add(allTextValues);
            System.out.println(allTextValues);
           }
           System.out.println("The List is: "+newList);
   }

}
