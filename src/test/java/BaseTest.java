import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    ChromeDriver driver;

    @BeforeEach
    public void openBrowser() {
        driver = new ChromeDriver();
        String url = "https://www.marko.by/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
}
