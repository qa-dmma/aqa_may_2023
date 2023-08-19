package com.hillel.sharelane.usersingup;

import com.hillel.sharelane.configuration.WebDriverInit;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.hillel.sharelane.configuration.WebDriverInit.driver;

public class testSingUpPageZipCode {
    @BeforeClass
    public void setup() {
        WebDriverInit.getDriver();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test(groups = {"Zip Code Validation Message"}, priority = 1)
    public void testZipCodeMessegeEmpty() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        SingUpPage page = new SingUpPage();
        WebElement continueButtonZipCode = driver.findElement(page.pageContinueButtonZipCode);
        continueButtonZipCode.click();
        try {
            Assert.assertEquals(page.getTextMessage(page.pageZipWarningMessage), "Oops, error on page. " +
                    "ZIP code should have 5 digits");
        } catch (TimeoutException e) {
            Assert.fail("Fail test. Message is NOT found");
        }
    }

    @Test(groups = {"Zip Code Validation Message"}, priority = 2)
    public void testZipCodeMessageOneValue() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        SingUpPage page = new SingUpPage();
        WebElement zipCodeField = driver.findElement(page.pageZipCodeField);
        WebElement continueButtonZipCode = driver.findElement(page.pageContinueButtonZipCode);
        zipCodeField.click();
        zipCodeField.sendKeys("1");
        continueButtonZipCode.click();
        try {
            Assert.assertEquals(page.getTextMessage(page.pageZipWarningMessage), "Oops, error on page. " +
                    "ZIP code should have 5 digits");
        } catch (TimeoutException e) {
            Assert.fail("Fail test. Message is NOT found");
        }
    }

    @Test(groups = {"Zip Code Validation Message"}, priority = 3)
    void testZipCodeMessageMoreThanValues() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        SingUpPage page = new SingUpPage();
        WebElement zipCodeField = driver.findElement(page.pageZipCodeField);
        WebElement continueButtonZipCode = driver.findElement(page.pageContinueButtonZipCode);
        zipCodeField.click();
        zipCodeField.sendKeys("123456");
        continueButtonZipCode.click();
        try {
            Assert.assertEquals(page.getTextMessage(page.pageZipWarningMessage), "Oops, error on page. " +
                    "ZIP code should have 5 digits");
        } catch (TimeoutException e) {
            Assert.fail("Fail test. Message is NOT found");
        }
    }

    @AfterTest
    void endOfTests() {
        driver.quit();
    }
}
