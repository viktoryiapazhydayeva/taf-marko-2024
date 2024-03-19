import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {

        WebElement cookiesBtn = driver.findElement(By.xpath(HomePageXPath.acceptCookiesBtnXPath));  // used by demand if cookies appear
        if (cookiesBtn.isDisplayed()) {
            cookiesBtn.click();
        }
    }

    public void closeBanner() {
        WebElement banner = driver.findElement(By.xpath(HomePageXPath.bannerCrossBtnXPath));       // used by demand if banner appears
        if (banner.isDisplayed()) {
            banner.click();
        }
    }

    public String getCopyRightText() {
        WebElement copyRight = driver.findElement(By.xpath(HomePageXPath.copyRightXPath));
        return copyRight.getText();
    }
}
