import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest{
    public final String EXPECTED_AUTHORIZATION_FORM_TITLE = "АВТОРИЗАЦИЯ";
    public final String EXPECTED_ERROR_MESSAGE_TEXT = "Неверный телефон или пароль";

    @Test
    @DisplayName("Check login form title")
    public void openLoginForm(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.closeQuizWindow();
        loginPage.clickLoginIcon();
        loginPage.openAuthorizationLink();
        Assertions.assertEquals(EXPECTED_AUTHORIZATION_FORM_TITLE, loginPage.getAuthorizationFormTitle());
    }

    @Test
    @DisplayName("Error message: wrong credentials")
    public void login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);           //// МОЖНО ВЫНЕСТИ ПОТОМ В BASE PAGE ??
        homePage.acceptCookies();
        homePage.closeQuizWindow();
        loginPage.clickLoginIcon();
        loginPage.openAuthorizationLink();
        loginPage.enterPhoneNumber("44-565-11-64");
        loginPage.enterPassword("1020115");
        loginPage.confirmLogin();
        Thread.sleep(1000);                           /// ЗАМЕНИТЬ НА WAIT-- ВЫНЕСТИ ЕГО В МЕТОД ??
        Assertions.assertEquals(EXPECTED_ERROR_MESSAGE_TEXT, loginPage.getWrongCredsError());
    }
}
