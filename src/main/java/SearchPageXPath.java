public class SearchPageXPath {

    public static String searchFieldXpath = "//input[@class='search-form__input field-effects-js']";
    public static String searchIconXPath = "//input[@type='submit']";
    public static String searchResulItemCardXPath = "//section[@class='products__list']/div[1]"; // XPath for the first item in the search results // ОДИНАКОВЫЕ В СТРУКТУРЕ- МОЖНО 1 РАЗ УКАЗАТЬ?
    public static String searchedItemTitleXPath = "//h3[@class='product__heading']";  // ПОВТОРЯЕТСЯ СЕТКА ЭЛЕМ-ОВ: ПЕРВЫЙ ?? ПЕРЕИСПОЛЬЗОВПТЬ КАК CONST-- DRY
}
