package NextBaseCRM;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AC7_Finished extends TestBase {

    @Test
    public void start() throws InterruptedException {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk55@cybertekschool.com");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


        //6. Like the post on dashboard
        driver.findElement(By.className("bx-ilike-text")).click();

        //7.Follow button
        driver.findElement(By.xpath("(//span[@class='feed-inform-follow']/a)[1]")).click();

        //8.View the posts
        driver.findElement(By.id("feed-post-contentview-cnt-BLOG_POST-783")).click();


        //9.Click more options
        driver.findElement(By.id("feed-post-more-783")).click();


        //10.Add to favorites
        driver.findElement(By.xpath("(//span[@class='menu-popup-item-text'])[1]")).click();
        driver.findElement(By.id("feed-post-more-783")).click();

        //11.Send comment or cancel

        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        driver.findElement(By.tagName("body")).sendKeys("Hello World!");

        driver.findElement(By.id("lhe_button_submit_blogCommentFormy4PU")).click();


    }
}
