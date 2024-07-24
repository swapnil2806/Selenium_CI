import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ForgetPasswordPage extends BaseTest{

    @Test
    public void getHeading() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
        Thread.sleep(1000);
        String heading = driver.findElement(By.xpath("//form[@class='oxd-form']/h6")).getText();
        System.out.println("Title : "+ heading );
        Assert.assertEquals(heading, "Reset Password");
    }

}