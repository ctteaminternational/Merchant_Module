package StepsDefinitions;

import PageObject.Login;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;




public class LoginSteps {

    static WebDriver driver;
    Login login = new Login(driver);

    @Given("Login to Merchant Application using user {string} and password {string}")
    public void login_to_merchant_application_using_user_and_password(String username, String password) {
        login.openBrowser();
        login.navigateBrowser();
        login.clickLogin();
        login.enterUserName(username);
        login.enterPassword(password);
        login.clickContinue();
    }

    @Then("Validate Login Successful")
    public void validate_login_successful()
    {
        login.validateLogin();
    }

    @And("Exit Application")
    public void exit_application()
    {
        login.closeBrowser();
    }

}
