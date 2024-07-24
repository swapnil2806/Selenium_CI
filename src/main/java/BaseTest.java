import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void beforeTests() {
//        WebDriverManager.chromedriver().clearDriverCache().setup();
        ChromeOptions options=new ChromeOptions();
//        options.setHeadless(true);

        options.addArguments("window-size=1920,1200");
        driver=new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterMethod
    public void afterTests() {
        driver.quit();
    }

}