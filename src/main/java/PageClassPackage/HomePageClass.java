package PageClassPackage;

import BaseClassPackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass extends BaseClass {


    @FindBy(xpath="]//a[@aria-label=\"Categories\"]")
    WebElement categories;

    @FindBy(xpath="//a[@aria-label=\"Deals\"]")
    WebElement deals;

    @FindBy(xpath="//a[@aria-label=\"pickup and delivery\"]")
    WebElement pickupndelivery;

    @FindBy(xpath="//span[@class=\"styles__LinkText-sc-1e1g60c-3 dZfgoT h-margin-r-x3\"]")
    WebElement signin ;

    public HomePageClass(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public String Checkhomepagetitle() {
        //System.out.println(driver.getTitle());
        return driver.getTitle();

    }

    public boolean CheckCategories() {
        return categories.isDisplayed();

    }

    public boolean CheckDeals() {
        return deals.isDisplayed();

    }

    public boolean Checkpickup() {
        return pickupndelivery.isDisplayed();

    }

    public LoginPageClass clicklogin() {
        signin.click();
        return new LoginPageClass();

    }
}
