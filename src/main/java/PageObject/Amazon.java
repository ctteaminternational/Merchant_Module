package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon extends BaseMethods{
    static WebDriver driver;

    public Amazon(WebDriver driver)
    {
        super(driver);

        this.driver=driver;


    }


    /******************  Object Elements ********************/
    private By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
    private By itemSearched = By.xpath("//span[text()='Dell DELL-DA300 Portable Docking']");
    private By itemPrice = By.xpath("//span[@id='priceblock_ourprice']");
    private By searchButton = By.xpath("//input[@id='nav-search-submit-button']");

    /*************************** Page Methods ************************/
    public void searchElement()
    {
        WaitForElementToSendKeys(searchBox, "Dell DELL-DA300 Portable Docking");
    }

    public void clickSearch()
    {
        WaitForElementToBeClickeable(searchButton);
    }
    public void clickItem()
    {
        scrollWindowDown();
        WaitForElementToBeClickeable(itemSearched);
    }

    public void validatePrice()
    {

        String priceItem_text = GetElementText(itemPrice);
        Assert.assertEquals(priceItem_text, "$1,704.04");

    }


}

