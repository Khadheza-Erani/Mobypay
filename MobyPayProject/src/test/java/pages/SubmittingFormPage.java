package pages;

import org.openqa.selenium.By;

public class SubmittingFormPage extends BasePage{
    public String mobyPayUrl ="https://demoqa.com/automation-practice-form";
    public By firstName =By.xpath("//input[@id='firstName']");
    public By lastName =By.xpath("//input[@id='lastName']");
    public By email =By.xpath("//input[@id='userEmail']");
    public By gender =By.xpath("//label[@for='gender-radio-2']");
    public By mobileNumber =By.xpath("//input[@id='userNumber']");
    public By dateOfBirth =By.xpath("//input[@id='dateOfBirthInput']");
    public By twoThousandTwentyFive =By.xpath("//select[@class='react-datepicker__year-select']");
    public By november =By.xpath("//select[@class='react-datepicker__month-select']");
    public By twentySeven =By.xpath("//div[@aria-label='Choose Sunday, November 27th, 2005']");
    public By subject =By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']");
    public By hobbies =By.xpath("//label[@for='hobbies-checkbox-2']");
    public By selectPicture =By.xpath("//input[@id='uploadPicture']");
    public By currentAddress =By.xpath("//textarea[@id='currentAddress']");
    public By stateAndCity =By.xpath("//div[contains(text(),'Select State')]");
    public By selectCity =By.xpath("//div[contains(text(),'Select City')]");
    public By submitButton =By.xpath("//button[@id='submit']");
    public By closeButton =By.xpath("//button[@id='closeLargeModal']");

}
