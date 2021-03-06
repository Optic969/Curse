package pageObjects;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class Cart {

    /*WebDriver driver;

    public Cart (WebDriver driver) {
        this.driver = driver;
    }*/
    private SelenideElement getCartBtn = $x("//b[contains(text(), \"Cart\")]/..");
    private SelenideElement getCartProductDeleteX = $x("//dt[1]//a[@class=\"ajax_cart_block_remove_link\"]");
    private SelenideElement getWomenProductAttribute = $x("//dt[@class='first_item']//a[@class='cart_block_product_name'][contains(text(),'Blouse')]");
    private SelenideElement getDressesProductAttribute = $x("//dt[@class='item']//a[@class='cart_block_product_name'][contains(text(),'Printed Dress')]");
    private SelenideElement getTShirtsProductAttribute = $x("//dt[@class='last_item']//a[@class='cart_block_product_name'][contains(text(),'Faded Shor...')]");

    /*public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }*/
    public void checkCartItems() {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getCartBtn.hover();
        getWomenProductAttribute.shouldHave(text("Blouse"));
        getDressesProductAttribute.shouldHave(text("Printed Dress"));
        getTShirtsProductAttribute.shouldHave(text("Faded Shor..."));
        getCartProductDeleteX.click();
    }

}
