package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VyTrack_Utilities {

    public static void vyTrack(){

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("user174");

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser123");

        WebElement login = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        login.click();

    }

}
