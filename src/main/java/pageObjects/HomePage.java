package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    /*WebDriver driver;
    public HomePage (WebDriver driver) {
        this.driver = driver;
    }*/

    private SelenideElement getSearchField = $x("//input[@name='search_query']");
    private SelenideElement getSearchItem = $x("//button[@name='submit_search']");
    private SelenideElement getCheckbox = $x("//input[@name='layered_category_4']");
    private SelenideElement getBreadcrumbWoman = $x("//div[@class='breadcrumb clearfix']//a[contains(text(),'Women')]");
    private SelenideElement getWomenBtn1 = $x("//*[@id=\"block_top_menu\"]/ul/li[1]");

    /*public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }*/
    public void searchItem() {
        //scrollToElement(getSearchField);
        getSearchItem.hover();
        getSearchField.sendKeys("Blouse");
        getSearchItem.click();
    }
    public void clickCheckBox(){
        getWomenBtn1.click();
        getCheckbox.click();

    }
}
