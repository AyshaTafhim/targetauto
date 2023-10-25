package BaseClassPackage;

import UtilityPackage.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
   public static  Properties prop;



   public BaseClass(){

       try{
           prop=new Properties();
           FileInputStream fis=new FileInputStream("C:\\Users\\Aysha_Tafheem\\TargetAutomation\\src\\main\\java\\ConfigPackage\\config.properties");
           prop.load(fis);

       }
       catch(FileNotFoundException e)
       {
           e.printStackTrace();
       }
       catch(IOException e)
       {
           e.printStackTrace();
       }
   }


    public void initialization() {
    //    WebDriverManager.chromedriver().setup();
        System.setProperty( "webdriver.chrome.driver","C:\\Users\\Aysha_Tafheem\\TargetAutomation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("baseurl"));
    }

}
