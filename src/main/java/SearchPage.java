import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage {
    ChromeDriver driver;
    public SearchPage(ChromeDriver driver){
        this.driver = driver;
    }

    public void enterSearchData(String product){
        WebElement searchField = driver.findElement(By.xpath(SearchPageXPath.searchFieldXpath));
        searchField.sendKeys(product);
    }

    public void clickSearch(){
        WebElement searchIcon = driver.findElement(By.xpath(SearchPageXPath.searchIconXPath));
        searchIcon.click();
    }

    public void openSearchedItemCard(){
        WebElement searchedItemCard = driver.findElement(By.xpath(SearchPageXPath.searchResulItemCardXPath));
        searchedItemCard.click();
    }

    public boolean checkSearchedTextInItemTitle(String text){
        WebElement searchedItemTitle = driver.findElement(By.xpath(SearchPageXPath.searchedItemTitleXPath));
        String fullItemTitle = searchedItemTitle.getText();
        return fullItemTitle.contains(text);
    }
}
