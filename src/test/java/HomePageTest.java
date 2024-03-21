import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    public final String COPY_RIGHT_TEXT = "© ООО \"Марко-Сервис\", 2011-2024"; // ?? ВЫНОСИТЬ ОТДЕЛЬНОЙ ПЕРЕМЕНнОЙ  в pageXPath или в тестовом классе или сразу в ассерте

    @Test
    @DisplayName("Home page rendering")
    public void openHomePage() {
        HomePage homePage = new HomePage(driver);
        //homePage.acceptCookies();
        //homePage.closeBanner();
        homePage.closeQuizWindow();
        //Assertions.assertEquals(COPY_RIGHT_TEXT, homePage.getCopyRightText());
        Assertions.assertTrue(homePage.getCopyRightText(COPY_RIGHT_TEXT));
    }
}
