package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {
    //Here I take a variable(browser name) which is static and the access modifier is private
//I want to take the browser name from console by the help of system dot get property.And sets the chrome as default browser

    private static String browserName = System.getProperty("browser","chrome");

    //By protecting the driver, surely someone would access from outside without proper access
//So that each one is saved in thread locally and does not affect one another, I made the driver a driver of thread local type.I took the variable(Local_Driver) and created an object of thread local class
    private static final ThreadLocal<WebDriver> local_Driver = new ThreadLocal<>();


    //I will set the value of the local driver variable with Setter method.I gave the value of type of web driver which is called driver
    public static void setDriver(WebDriver driver){
        DriverSetup.local_Driver.set(driver);
    }
    //I will get the value from the local driver by using getter method.
    public static WebDriver getDriver(){
        return local_Driver.get();
    }


    //Create a method which returns WebDriver according to my wish.
    public static WebDriver createBrowser(String browserName){
//Apply conditions for different browser

        if (browserName.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }
//If it was not chrome,is it firefox?/
        if (browserName.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }
//If it was not firefox,is it edge?
        if (browserName.equalsIgnoreCase("edge")){
            return new EdgeDriver();
        }
//If any of them are not, then throw the error
        else{
            throw new RuntimeException("Browser not found:" +browserName);
        }
    }//end




    @BeforeSuite
//To set the browser and call the setter method I take the createBrowser method.Static for the first accessing benefits
    public static synchronized void  createBrowser(){
//To set the browser, a browser was needed, which I called the getBrowser method to get. The call requires the browser name which is obtained from the browser name. It returns WebDriver.
        WebDriver driver=  createBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//I call.ed the Set Driver to distribute the driver for a different test case. I passed the driver in set driver.
        setDriver(driver);
    }


    @AfterSuite
//For quit the get Driver;
    public static synchronized void quitBrowser(){
        getDriver().quit();
    }

}//driver setup class
