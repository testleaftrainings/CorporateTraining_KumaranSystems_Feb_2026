package org.kumaransystems.week3.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://leafground.com/table.xhtml");
        
        //maximize the browser
        driver.manage().window().maximize();

        //Locating table
       // WebElement table=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));

        //Number of rows
        List<WebElement> totalTr=driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
        int numberOfRows=totalTr.size();
        System.out.println("numberOfRows is: "+numberOfRows);

        //number of columns
        List<WebElement> totalTd=driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
        int numberOfColumns=totalTd.size();
        System.out.println(numberOfColumns);
    }

}
