package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SmartBearUtils {

    public static void LoginToSmartBear(WebDriver driver){
        WebElement userName =  driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        userName.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();

        Assert.assertEquals(driver.getTitle(),"Web Orders", "Failed to login to smart bear");
    }

}