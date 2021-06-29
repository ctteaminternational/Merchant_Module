package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMethods {
    static WebDriver driver;


    public BaseMethods(WebDriver driver) {
        this.driver = driver;
    }


    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Teams\\IdeaProjects\\Merchant_Test\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigateBrowser()
    {

        driver.get("http://qaper-secure.safetypay.com/merchantportal/en/");
    }

    public void goToAmazon()
    {

        driver.get("http://www.amazon.com.mx");
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public void WaitForElementToBeClickeable(By by)
    {
        try
        {
            Thread.sleep(5000);
            driver.findElement(by).click();
        }
    catch (Exception e)
        {
            System.out.println("Element not present and not able to click it.");
        }

    }
    public void WaitForElementToSendKeys(By by, String text)
    {
        try
        {
            Thread.sleep(5000);
            driver.findElement(by).sendKeys(text);
        }
        catch (Exception e)
        {
            System.out.println("Element not present and not able to send text");
        }
    }
    public boolean WaitForElementToBeVisible(By by)
    {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean element_visible = driver.findElement(by).isDisplayed();
        return element_visible;
    }

    public String GetElementText(By by)
    {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String element_text = driver.findElement(by).getText();
        return element_text;
    }

    public void scrollWindowDown()
    {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,250)");
    }
}
