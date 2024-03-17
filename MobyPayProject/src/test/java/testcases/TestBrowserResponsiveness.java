package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowserResponsiveness {
// Create the object of web driver for different browsers
    WebDriver driver;
    ChromeOptions chromeOptions = new ChromeOptions();
    EdgeOptions edgeOptions = new EdgeOptions();
    FirefoxOptions firefoxOptions =new FirefoxOptions();


//generate before annotation and initializing the browser driver
@Parameters("browser")
 @BeforeTest
 public  void initialize(String browser){

     if(browser.equalsIgnoreCase("chrome")){
         //initializing web driver manager and chrome driver.
         WebDriverManager.chromedriver().setup();
         // driver will be initialized this web driver and different  reference variables will be initialized in the chrome driver;
          driver = new ChromeDriver();
         System.out.println("chrome is opened");
     }
     else if(browser.equalsIgnoreCase("edge")){
         //initializing web driver manager and chrome driver.
         WebDriverManager.edgedriver().setup();
         // driver will be initialized this web driver and different  reference variables will be initialized in the chrome driver;
         driver = new EdgeDriver();
         System.out.println("edge is opened");
     }
     else if(browser.equalsIgnoreCase("firefox")){
         //initializing web driver manager and chrome driver.
         WebDriverManager.firefoxdriver().setup();
         // driver will be initialized this web driver and different  reference variables will be initialized in the chrome driver;
         driver = new FirefoxDriver();
         System.out.println("firefox is opened");
     }

 }
 //browser testing test case
 @Test
     public void mobyPayHomePage(){
     driver.get("https://demoqa.com/automation-practice-form");
     String actual = driver.getTitle();
     String expect = "Practice Form";
    // Assert.assertTrue(actual.contains("Practice Form"));

     }

//quit the browser
   @AfterTest
     public void quitBrowser(){
     driver.quit();
   }


}//main class
