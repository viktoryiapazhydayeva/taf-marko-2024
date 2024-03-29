import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void closeQuizWindow(){
        WebElement quizWindow = driver.findElement(By.xpath(HomePageXPath.quizCrossBtn));
        if (quizWindow.isDisplayed()){
            quizWindow.click();
        }
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

    public boolean getCopyRightText(String text) {
        WebElement copyRight = driver.findElement(By.xpath(HomePageXPath.copyRightXPath));
        String copyRightText= copyRight.getText();
        return copyRightText.contains(text);
    }
}
