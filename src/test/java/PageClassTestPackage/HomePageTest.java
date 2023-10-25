package PageClassTestPackage;

import BaseClassPackage.BaseClass;
import PageClassPackage.HomePageClass;
import PageClassPackage.LoginPageClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    HomePageClass hp;
    LoginPageClass lp;

    HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        hp=new HomePageClass(driver);

    }
    @AfterMethod
    public void teardown() {
        driver.close();

    }
    @Test
    public void HomePagetitletest() {
        String actual=hp.Checkhomepagetitle();
        String expected="";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testcategories() {
        boolean category=hp.CheckCategories();
        Assert.assertTrue(category);

    }

    @Test
    public void testdeals() {
        boolean deal=hp.CheckDeals();
        Assert.assertTrue(deal);

    }

    @Test
    public void testpickup() {
        boolean pickup=hp.Checkpickup();
        Assert.assertTrue(pickup);

    }
    @Test
    public void logintest() {
        lp=hp.clicklogin();
    }

}
