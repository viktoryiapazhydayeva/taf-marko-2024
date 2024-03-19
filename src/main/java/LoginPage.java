import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    ChromeDriver driver;

    public LoginPage(ChromeDriver driver){
        this.driver = driver;
    }

    public void clickLoginIcon(){
        WebElement loginIcon = driver.findElement(By.xpath(LoginPageXPath.loginIconXPath));
        loginIcon.click();
    }

    public void openAuthorizationLink(){
        WebElement authorizationLink = driver.findElement(By.xpath(LoginPageXPath.authorizationLinkXpath));
        authorizationLink.click();
    }

    public String getAuthorizationFormTitle(){
        WebElement authorizationFormTitle = driver.findElement(By.xpath(LoginPageXPath.authorizationFormTitle));
        return authorizationFormTitle.getText();
    }

    public void enterPhoneNumber(String phone){
        WebElement phoneNumberField = driver.findElement(By.xpath(LoginPageXPath.phoneNumberFieldXPath));
        phoneNumberField.click();
        phoneNumberField.sendKeys(phone);
    }

    public void enterPassword(String pass){
        WebElement passwordField = driver.findElement(By.xpath(LoginPageXPath.passwordFieldXPath));
        passwordField.sendKeys(pass);
    }

    public void confirmLogin(){
        WebElement loginBtn = driver.findElement(By.xpath(LoginPageXPath.loginBtnXPath));
        loginBtn.click();
    }
    /**
     * тест комментария- этот метод возвращает тескт ошибки
     * @return
     */
    public String getWrongCredsError(){
        WebElement errorMsgWrongCreds = driver.findElement(By.xpath(LoginPageXPath.errorMsgWrongCredsXPath));
        // TODO add wait здесь вместо тестового метода
        return errorMsgWrongCreds.getText();
    }
}
