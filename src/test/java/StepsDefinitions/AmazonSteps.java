package StepsDefinitions;

import PageObject.Amazon;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    static WebDriver driver;
    Amazon amazon = new Amazon(driver);

    @Given("Open Browser")
    public void open_browser()
    {
        amazon.openBrowser();
    }
    @Then("Navigate to Amazon Web Page")
    public void navigate_to_amazon_web_page()
    {
        amazon.goToAmazon();
    }
    @Then("Search for item")
    public void search_for_item()
    {
       amazon.searchElement();
       amazon.clickSearch();
    }
    @When("Results appear open item")
    public void results_appear_open_item()
    {
        amazon.clickItem();
    }
    @Then("Check Price")
    public void check_price()
    {
        amazon.validatePrice();
    }
    @Then("Close Browser")
    public void close_browser()
    {
       amazon.closeBrowser();
    }
}
