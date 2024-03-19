import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchPageTest extends BaseTest{

    @Test
    @DisplayName("Check title of the searched item")
    public void searchItem(){
        SearchPage searchPage = new SearchPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        searchPage.enterSearchData("туфли");
        searchPage.clickSearch();
        searchPage.openSearchedItemCard();
        Assertions.assertTrue(searchPage.checkSearchedTextInItemTitle("Туфли"));    // ЕСЛИ НЕ УЧИТЫВАТЬ РЕГИСТР ??
    }
}
