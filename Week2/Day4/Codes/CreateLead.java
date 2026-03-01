package org.kumaransystems.week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("guest");
        //Launch the Browser
        ChromeDriver driver=new ChromeDriver(options);

        //Load the url  -get()
        driver.get("http://leaftaps.com/opentaps/control/main");

        //Maximiize the browser
        driver.manage().window().maximize();

        //locateElement - findElement
        //passing the value - sendKeys
        //Enter the username
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

        //Enter Password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        //Click on the Login button
        WebElement clickButton=driver.findElement(By.className("decorativeSubmit"));

        clickButton.click();

        //Click on the CRMSFA link
        //driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.partialLinkText("M/SF")).click();

        //Clcik on Leads link
        driver.findElement(By.linkText("Leads")).click();

        //Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        //Enter the Companyname
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Kumaran Systems");

        //Enter the firstname
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaviya");

        //Enter the Lastname
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");

     //Select
     //Step1: Find the element
     WebElement sourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));

    //Create Object for Select Class
    Select opt=new Select(sourceDD);
     opt.selectByIndex(5);
     opt.selectByValue("LEAD_EMPLOYEE");

        //Click Create Lead button
        //driver.findElement(By.name("submitButton")).click();
    }

}
