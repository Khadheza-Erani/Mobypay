package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class BasePage {
    public WebDriverWait wait;
    //    I created a method (getElement) that will find the Web element with by type locator.And
    public WebElement getElement(By locator) {
        waitForElementPresence(locator);
        return getDriver().findElement(locator);
    }

    //    Click Method
    public void clickOnElement(By locator) {
        waitForElementToBeClickable(locator);
        getElement(locator).click();
    }
//      Element visible method
    // public boolean isElementVisible(By locator){
    //return getElement(locator).isDisplayed();
    // }

    public boolean isElementVisible(By locator){
        try {
            return getDriver().findElement(locator).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
    //    I created this method because I want to write something to an element. Although if you have to write something, you have to search and clear it sometimes
    public void writeOnElement(By locator, String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }
   public void type(WebElement ele, String data){
        try {
            webDriverWait4VisibilityOfEle(ele);
            ele.clear();
            ele.sendKeys(data);

        } catch (WebDriverException e){
            e.printStackTrace();
        }


   }

    private void webDriverWait4VisibilityOfEle(WebElement ele) {
    }

    //    I'm writing this method because I want to see if the method is visible first
    public void waitForElementPresence(By locator){
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
//    I'm writing this method because I want to see the method become clickable.Then I will click or not

    public void waitForElementToBeClickable(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    //   For,select
    public void selectWithVisibleText(By selectLocator, String visibleText){
        Select select = new Select(getElement(selectLocator));
        select.selectByVisibleText(visibleText);
    }

    //  For,getText
    public String getElementText(By locator) {
        return getElement(locator).getText();
    }




    //Screenshot
    public void addScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }



    public  String extractNumber(String text) {
        StringBuilder number = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            }
        }
        return number.toString();
    }
}
