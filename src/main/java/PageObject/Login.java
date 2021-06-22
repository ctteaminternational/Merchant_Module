package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login extends BaseMethods{
     static WebDriver driver;

    public Login(WebDriver driver)
    {
        super(driver);

        this.driver=driver;


    }


    /******************  Object Elements ********************/
    private By login_Button = By.xpath("//button[text()='Log In']");
    private By username_Field = By.xpath("//input[@id='emailInput']");
    private By password_Field = By.xpath("//input[@id='passwordInput']");
    private By continue_Button = By.xpath("//button[text()='Continue']");
    private By loginUsername_Text = By.xpath("//span[text()='Name Surname']");


    /*************************** Page Methods ************************/
    public void clickLogin()
    {
        WaitForElementToBeClickeable(login_Button);
    }

    public void enterUserName(String username)
    {
        WaitForElementToSendKeys(username_Field, username);
    }

    public void enterPassword(String password)
    {
        WaitForElementToSendKeys(password_Field, password);
    }

    public void clickContinue()
    {
        WaitForElementToBeClickeable(continue_Button);
    }

    public void validateLogin(){
        boolean username_text = WaitForElementToBeVisible(loginUsername_Text);
        assert username_text;
    }
}


