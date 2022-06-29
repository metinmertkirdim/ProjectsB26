package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.VyTrack_Utilities;

public class BusraAC3 {
    @Test
    public void odometer() throws InterruptedException {

        Driver.getDriver().get("https://qa2.vytrack.com/user/login");

        VyTrack_Utilities.vyTrack();

        WebElement fleet=Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        Thread.sleep(2000);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();
        Thread.sleep(2000);
        //  2. Verify that truck driver should be able to see all vehicle odometer informations  on the grid.
        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Odometer']")).click();

        //3.Verify that Truck driver should be able to create Vehicle odometer or cancel it.
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();

        // 4.Verify that truck driver should be able to delete or edit Vehicle odometer.
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//div[@class='controls']//input[@type='text'])[1]")).sendKeys("36");
        Thread.sleep(2000);

        WebElement odo = Driver.getDriver().findElement(By.xpath("//div[@class='control-group control-group-date']"));
        Thread.sleep(2000);
        odo.click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//div[@class='ui-datepicker-buttonpane ui-widget-content']//button[.='Today']")).click();

        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//div[@class='controls']//input[@name='custom_entity_type[Driver]']")).sendKeys("Busra");
        Thread.sleep(2000);

        //save and close button
        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();

        // delete button
        Driver.getDriver().findElement(By.xpath("//a[@class=' btn icons-holder-text no-hash remove-button']")).click();
        Driver.getDriver().findElement(By.xpath("//a[.='Yes, Delete']")).click();

        //5.Verify that truck driver should be able to reset grid by click on grid setting"
        Thread.sleep(2000);
        //Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//i[@class='fa-cog hide-text']")).click(),"Didnt work");
        Driver.getDriver().findElement(By.xpath("//i[@class='fa-cog hide-text']")).click();

        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//td[@class='select-row-cell renderable grid-cell grid-body-cell grid-body-cell-massAction']//input[@tabindex='-1'])[14]")).click();






    }
}
