import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LoginPage extends BaseTest{

    @Test
    public void validCredentials() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        String newPageText = driver.findElement(By.xpath("//header[@class='oxd-topbar']/div/div[1]/span/h6")).getText();
        System.out.println("newPageText :" + newPageText);
        Assert.assertEquals(newPageText,"Dashboard");

    }

}