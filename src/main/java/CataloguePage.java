import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CataloguePage {

    ChromeDriver driver;

    public CataloguePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void openMenSection() {
        WebElement menSection = driver.findElement(By.xpath(CataloguePageXPath.menSectionXPath));
        // если при загрузке страницы Ботинки сместились в карусели
        if (menSection.isDisplayed()) {
            menSection.click();
        } else {
            WebElement switchItemsLeft = driver.findElement(By.xpath(CataloguePageXPath.switchItemsLeftBtn));
            while (!menSection.isDisplayed()) {
                switchItemsLeft.click();
            }
            menSection.click();
        }
    }
/*
    public void openSection(String sectionName) {                    // можно переиспользовать для любой секции с разными названиями
        WebElement menSection = driver.findElement(By.xpath(String.format(CataloguePageXPath.sectionXPath, sectionName)));
        menSection.click();
    }
 */

    public void openBootsSection() {
        WebElement bootsSection = driver.findElement(By.xpath(CataloguePageXPath.bootsCarouselItemXPath));
        bootsSection.click();
    }

    public void openBootsCard() {
        WebElement bootsCard = driver.findElement(By.xpath(CataloguePageXPath.bootsProductCardXPath));
        bootsCard.click();
    }

    public String getProductTitle() {
        WebElement productTitle = driver.findElement(By.xpath(CataloguePageXPath.productTitleXpath));
        return productTitle.getText();
    }
}
