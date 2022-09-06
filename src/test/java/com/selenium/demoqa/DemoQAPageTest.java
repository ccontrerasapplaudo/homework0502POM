package com.selenium.demoqa;

import com.selenium.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoQAPageTest extends BaseTest {

    private SoftAssert softAssert;

    @Test
    public void demoQAWorkflow() throws InterruptedException{
        DemoQAPage demoQAPage = new DemoQAPage(driver);
        String expectedURL="https://demoqa.com/forms";
        softAssert = new SoftAssert();

        System.out.println("\n ********** Results Step 1 **********");
        demoQAPage.navigateTo();
        waitTime();

        System.out.println("\n ********** Results Step 2 **********");
        demoQAPage.clickOnFormsButton();
        softAssert.assertEquals(expectedURL,driver.getCurrentUrl(),"Step 2: The URL is not https://demoqa.com/forms");
        waitTime();

//        System.out.println("\n ********** Results Step 3 **********");
//        demoQAPage.clickOnFormsButton();
//        waitTime();

    }

    public void waitTime() throws InterruptedException {
        synchronized (driver){
            driver.wait(2000);
        }
    }
}
