package org.kumaransystems.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/window.xhtml");
        driver.manage().window().maximize();

        //Click open button
        driver.findElement(By.xpath("//span[text()='Open']")).click();

        String currentTitle=driver.getTitle();
        System.out.println(currentTitle);

        //getWindowHanle
        String parentAddress=driver.getWindowHandle();
        System.out.println(parentAddress);
        //555EAFFF80D7B5B47C4B9DC0E54BEC5B
        //3283995CBCFF592112A09B242B17FB9

        //getWindowHandles
       Set<String> allAddress= driver.getWindowHandles();
       System.out.println(allAddress);
//                    0                                1
       //[1BC67DED95279E5D761DAE2252A10EEA, A6622DCF52CAE004044E5206E6EB80C9]

       List<String> address=new ArrayList<String>(allAddress);

       String childAddress=address.get(1);

       driver.switchTo().window(childAddress);
       
      //String childTitle=driver.getTitle();
     
       //close
       driver.close();
       //driver.quit();
       driver.switchTo().window(address.get(0));
       String title=driver.getTitle();

    }
}
