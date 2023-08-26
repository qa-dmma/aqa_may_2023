package com.hillel.sharelane.usersingup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testSingUpPageZipCode {
    private static WebDriver driver;
    private SingUpPageZipCode SingUpZipPage = new SingUpPageZipCode();
    private By ZipCodeField = SingUpZipPage.ZipCodeField();
    private By ContinueButtonZipCode = SingUpZipPage.ContinueButtonZipCode();
    private By ZipWarningMessage = SingUpZipPage.ZipWarningMessage();

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/edgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test(groups = {"Zip Code Validation Message"}, priority = 1)
    public void testZipCodeMessegeEmpty() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement continueButtonZipCode = driver.findElement(ContinueButtonZipCode);
        continueButtonZipCode.click();
        WebElement zipWarningMessage = driver.findElement(ZipWarningMessage);
        Assert.assertEquals(zipWarningMessage.getText(), "Oops, error on page. " +
                "ZIP code should have 5 digits");
    }

    @Test(groups = {"Zip Code Validation Message"}, priority = 2)
    public void testZipCodeMessageOneValue() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(ZipCodeField);
        WebElement continueButtonZipCode = driver.findElement(ContinueButtonZipCode);
        zipCodeField.click();
        zipCodeField.sendKeys("1");
        continueButtonZipCode.click();
        WebElement zipWarningMessage = driver.findElement(ZipWarningMessage);
        Assert.assertEquals(zipWarningMessage.getText(), "Oops, error on page. " +
                "ZIP code should have 5 digits");
    }

    @Test(groups = {"Zip Code Validation Message"}, priority = 3)
    void testZipCodeMessageMoreThanValues() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(ZipCodeField);
        WebElement continueButtonZipCode = driver.findElement(ContinueButtonZipCode);
        zipCodeField.click();
        zipCodeField.sendKeys("123456");
        continueButtonZipCode.click();
        WebElement zipWarningMessage = driver.findElement(ZipWarningMessage);
        Assert.assertEquals(zipWarningMessage.getText(), "Oops, error on page. " +
                "ZIP code should have 5 digits");
    }

    @AfterTest
    void endOfTests() {
        driver.quit();
    }
}
