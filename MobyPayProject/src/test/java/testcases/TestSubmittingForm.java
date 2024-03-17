package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.SubmittingFormPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestSubmittingForm extends DriverSetup {
    SubmittingFormPage submittingFormPage =new SubmittingFormPage();
    @Test
    public void mobyPayHomeFormPageLogInWithValidCredentials() throws InterruptedException {
        getDriver().get(submittingFormPage.mobyPayUrl);

        submittingFormPage.writeOnElement(submittingFormPage.firstName,"Mst.Khadheza Sultana");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.lastName,"Erani");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.email,"khadhezazaman@gmail.com");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.gender).click();
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.mobileNumber,"01795015917");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.dateOfBirth).click();
        Thread.sleep(500);
        //Thread.sleep(5000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.twoThousandTwentyFive,"2005");
        Thread.sleep(1000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.november,"November");
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.twentySeven).click();
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.subject).click();
        Thread.sleep(1000);

        submittingFormPage.getElement(submittingFormPage.hobbies).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.selectPicture).sendKeys("C:\\Users\\Tech Land\\Downloads\\Anis.online_300x300_image.jpg");
        Thread.sleep(1000);
        submittingFormPage.writeOnElement(submittingFormPage.currentAddress,"Kuril chowrasta Dhaka");
        Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.submitButton).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.closeButton).click();
        Thread.sleep(5000);

    }
    @Test
    public void mobyPayHomeFormPageLogInWithoutLastName() throws InterruptedException {
        getDriver().get(submittingFormPage.mobyPayUrl);

        submittingFormPage.writeOnElement(submittingFormPage.firstName,"Mst.Khadheza Sultana");
        //Thread.sleep(500);
        //submittingFormPage.writeOnElement(submittingFormPage.lastName,"Erani");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.email,"khadhezazaman@gmail.com");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.gender).click();
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.mobileNumber,"01795015917");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.dateOfBirth).click();
        Thread.sleep(500);
        //Thread.sleep(5000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.twoThousandTwentyFive,"2005");
        Thread.sleep(1000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.november,"November");
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.twentySeven).click();
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.subject).click();
        Thread.sleep(1000);

        submittingFormPage.getElement(submittingFormPage.hobbies).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.selectPicture).sendKeys("C:\\Users\\Tech Land\\Downloads\\Anis.online_300x300_image.jpg");
        Thread.sleep(1000);
        submittingFormPage.writeOnElement(submittingFormPage.currentAddress,"Kuril chowrasta Dhaka");
        Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.submitButton).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.closeButton).click();
        Thread.sleep(5000);

    }


    @Test
    public void mobyPayHomeFormPageLogInWithoutFirstName() throws InterruptedException {
        getDriver().get(submittingFormPage.mobyPayUrl);

        //submittingFormPage.writeOnElement(submittingFormPage.firstName,"Mst.Khadheza Sultana");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.lastName,"Erani");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.email,"khadhezazaman@gmail.com");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.gender).click();
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.mobileNumber,"01795015917");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.dateOfBirth).click();
        Thread.sleep(500);
        //Thread.sleep(5000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.twoThousandTwentyFive,"2005");
        Thread.sleep(1000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.november,"November");
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.twentySeven).click();
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.subject).click();
        Thread.sleep(1000);

        submittingFormPage.getElement(submittingFormPage.hobbies).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.selectPicture).sendKeys("C:\\Users\\Tech Land\\Downloads\\Anis.online_300x300_image.jpg");
        Thread.sleep(1000);
        submittingFormPage.writeOnElement(submittingFormPage.currentAddress,"Kuril chowrasta Dhaka");
        Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.submitButton).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.closeButton).click();
        Thread.sleep(5000);

    }

    @Test
    public void mobyPayHomeFormPageLogInWithoutEmail() throws InterruptedException {
        getDriver().get(submittingFormPage.mobyPayUrl);

        submittingFormPage.writeOnElement(submittingFormPage.firstName,"Mst.Khadheza Sultana");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.lastName,"Erani");
        //Thread.sleep(500);
        //submittingFormPage.writeOnElement(submittingFormPage.email,"khadhezazaman@gmail.com");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.gender).click();
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.mobileNumber,"01795015917");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.dateOfBirth).click();
        Thread.sleep(500);
        //Thread.sleep(5000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.twoThousandTwentyFive,"2005");
        Thread.sleep(1000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.november,"November");
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.twentySeven).click();
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.subject).click();
        Thread.sleep(1000);

        submittingFormPage.getElement(submittingFormPage.hobbies).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.selectPicture).sendKeys("C:\\Users\\Tech Land\\Downloads\\Anis.online_300x300_image.jpg");
        Thread.sleep(1000);
        submittingFormPage.writeOnElement(submittingFormPage.currentAddress,"Kuril chowrasta Dhaka");
        Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.submitButton).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.closeButton).click();
        Thread.sleep(5000);

    }
    @Test
    public void mobyPayHomeFormPageLogInWithoutPhoneNumber() throws InterruptedException {
        getDriver().get(submittingFormPage.mobyPayUrl);

        submittingFormPage.writeOnElement(submittingFormPage.firstName,"Mst.Khadheza Sultana");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.lastName,"Erani");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.email,"khadhezazaman@gmail.com");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.gender).click();
        //Thread.sleep(500);
        //submittingFormPage.writeOnElement(submittingFormPage.mobileNumber,"01795015917");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.dateOfBirth).click();
        Thread.sleep(500);
        //Thread.sleep(5000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.twoThousandTwentyFive,"2005");
        Thread.sleep(1000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.november,"November");
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.twentySeven).click();
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.subject).click();
        Thread.sleep(1000);

        submittingFormPage.getElement(submittingFormPage.hobbies).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.selectPicture).sendKeys("C:\\Users\\Tech Land\\Downloads\\Anis.online_300x300_image.jpg");
        Thread.sleep(1000);
        submittingFormPage.writeOnElement(submittingFormPage.currentAddress,"Kuril chowrasta Dhaka");
        Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.submitButton).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.closeButton).click();
        Thread.sleep(5000);

    }

    @Test
    public void mobyPayHomeFormPageLogInWithoutGenderSelection() throws InterruptedException {
        getDriver().get(submittingFormPage.mobyPayUrl);

        submittingFormPage.writeOnElement(submittingFormPage.firstName,"Mst.Khadheza Sultana");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.lastName,"Erani");
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.email,"khadhezazaman@gmail.com");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.gender).click();
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.mobileNumber,"01795015917");
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.dateOfBirth).click();
        Thread.sleep(500);
        //Thread.sleep(5000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.twoThousandTwentyFive,"2005");
        Thread.sleep(1000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.november,"November");
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.twentySeven).click();
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.subject).click();
        Thread.sleep(1000);

        submittingFormPage.getElement(submittingFormPage.hobbies).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.selectPicture).sendKeys("C:\\Users\\Tech Land\\Downloads\\Anis.online_300x300_image.jpg");
        Thread.sleep(1000);
        submittingFormPage.writeOnElement(submittingFormPage.currentAddress,"Kuril chowrasta Dhaka");
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.submitButton).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.closeButton).click();
        Thread.sleep(5000);

    }

    @Test(dataProvider = "invalidCredentials", dataProviderClass = DataSet.class)
    public void mobyPayHomeFormPageLogInWithInvalid(String firstName,String lastName, String email, String mobileNumber) throws InterruptedException {
        getDriver().get(submittingFormPage.mobyPayUrl);

        submittingFormPage.writeOnElement(submittingFormPage.firstName,firstName);
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.lastName,lastName);
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.email,email);
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.gender).click();
        //Thread.sleep(500);
        submittingFormPage.writeOnElement(submittingFormPage.mobileNumber,mobileNumber);
        //Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.dateOfBirth).click();
        Thread.sleep(500);
        //Thread.sleep(5000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.twoThousandTwentyFive,"2005");
        Thread.sleep(1000);
        submittingFormPage.selectWithVisibleText(submittingFormPage.november,"November");
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.twentySeven).click();
        Thread.sleep(1000);
        submittingFormPage.getElement(submittingFormPage.subject).click();
        Thread.sleep(1000);

        submittingFormPage.getElement(submittingFormPage.hobbies).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.selectPicture).sendKeys("C:\\Users\\Tech Land\\Downloads\\Anis.online_300x300_image.jpg");
        Thread.sleep(1000);
        submittingFormPage.writeOnElement(submittingFormPage.currentAddress,"Kuril chowrasta Dhaka");
        Thread.sleep(500);
        submittingFormPage.getElement(submittingFormPage.submitButton).click();
        Thread.sleep(5000);
        submittingFormPage.getElement(submittingFormPage.closeButton).click();
        Thread.sleep(5000);

    }









}
