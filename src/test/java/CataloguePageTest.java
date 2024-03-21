import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CataloguePageTest extends BaseTest {

    public final String EXPECTED_PRODUCT_TITLE = "Ботинки мужские";

    @Test
    @DisplayName("Check Product (Boots) title")
    public void openProductCard() {
        HomePage homePage = new HomePage(driver);
        homePage.closeQuizWindow();
        CataloguePage cataloguePage = new CataloguePage(driver);
        homePage.acceptCookies();
        cataloguePage.openMenSection();
        cataloguePage.openBootsSection();
        cataloguePage.openBootsCard();
        Assertions.assertEquals(EXPECTED_PRODUCT_TITLE, cataloguePage.getProductTitle());
    }
}
