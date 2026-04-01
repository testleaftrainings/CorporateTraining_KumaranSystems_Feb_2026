package org.kumaransystems.week3.day4;

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

        //To retrieve row 1
        List<WebElement> row1Data=driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
//         0    1   2     3    4    5
//       [We1, We2, We3, We4, We5, We6]

        for (int i = 0; i < row1Data.size() ; i++) {
            String row1DataText=row1Data.get(i).getText();
            System.out.println("row1DataText is: "+row1DataText);
            //String row1DataText=row1Data.get(0).getText();
            //String row1DataText=row1Data.get(1).getText();
            //String row1DataText=row1Data.get(5).getText();
        }

        //To retrieve coloumn 2
        List<WebElement> columnData=driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[2]"));
       for (int i = 0; i <columnData.size() ; i++) {
           String column2Data=columnData.get(i).getText();
        System.out.println("column2Data is: "+column2Data);
       }
   
    for(int i=1;i<=numberOfRows;i++){
        WebElement row=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]"));
        
        for (int j = 1; j <=numberOfColumns ; j++) {
           WebElement column =driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]"));
           String allData=column.getText();
           System.out.println("allData is: "+allData);
        }
       
    }


    }

}
