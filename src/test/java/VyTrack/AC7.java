package VyTrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.Sleep;
import utilities.VyTrack_Utilities;

public class AC7 {

    @Test
    public void start(){

        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        VyTrack_Utilities.vyTrack();

       WebElement fleet =  Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));

        Actions actions = new Actions(Driver.getDriver());
        // hover over method is moveToElement()
        Sleep.sleep(2);
       actions.moveToElement(fleet).perform();
        Sleep.sleep(2);

        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Contracts']")).click();

    }



}
