package com.hillel.sharelane.usersingup;

import com.hillel.sharelane.configuration.WebDriverInit;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static com.hillel.sharelane.configuration.WebDriverInit.driver;


public class testSingUpPageForm {

    @BeforeClass
    public void profileSetup() {
        WebDriverInit.getDriver();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test(groups = {"Sign Validation Message"}, priority = 1)
    public void registrationMessage() {
        SingUpPage.preconditionForSingUp();
        SingUpPage page = new SingUpPage();
        WebElement firstNameField = driver.findElement(page.pageFirstName);
        WebElement lastNameField = driver.findElement(page.pageLastName);
        WebElement emailField = driver.findElement(page.pageEmail);
        WebElement passField = driver.findElement(page.pagePass);
        WebElement passConf = driver.findElement(page.pageConfPass);
        WebElement registerButton = driver.findElement(page.pageRegisterButton);
        firstNameField.sendKeys("Tester");
        lastNameField.sendKeys("WebDriwer");
        emailField.sendKeys("qa@test.com");
        passField.sendKeys("12345");
        passConf.sendKeys("654321");
        registerButton.click();
        try {
            Assert.assertEquals(page.getTextMessage(page.pageSingUpWarningMessage), "Oops, error on page. " +
                    "Some of your fields have invalid data or email was previously used");
        } catch (TimeoutException e) {
            Assert.fail("Fail test. Message is NOT found");
        }
    }

    @Test(groups = {"Sign Validation Message"}, priority = 2)
    public void emptyFieldsMessage() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        SingUpPage.preconditionForSingUp();
        SingUpPage page = new SingUpPage();
        WebElement registerButton = driver.findElement(page.pageRegisterButton);
        registerButton.click();
        try {
            Assert.assertEquals(page.getTextMessage(page.pageSingUpWarningMessage), "Oops, error on page. " +
                    "Some of your fields have invalid data or email was previously used");
        } catch (TimeoutException e) {
            Assert.fail("Fail test. Message is NOT found");
        }
    }

    @Test(groups = {"Sign Validation Message"}, priority = 1)
    public void registrationConfirmationMessage() {
        SingUpPage.preconditionForSingUp();
        SingUpPage page = new SingUpPage();
        WebElement firstNameField = driver.findElement(page.pageFirstName);
        WebElement lastNameField = driver.findElement(page.pageLastName);
        WebElement emailField = driver.findElement(page.pageEmail);
        WebElement passField = driver.findElement(page.pagePass);
        WebElement passConf = driver.findElement(page.pageConfPass);
        WebElement registerButton = driver.findElement(page.pageRegisterButton);
        firstNameField.sendKeys("Tester");
        lastNameField.sendKeys("WebDriwer");
        emailField.sendKeys("qa@test.com");
        passField.sendKeys("123456");
        passConf.sendKeys("123456");
        registerButton.click();
        try {
            Assert.assertEquals(page.getTextMessage(page.pageConfirmationMessage), "Account is created!");
        } catch (TimeoutException e) {
            Assert.fail("Fail test. Message is NOT found");
        }
    }

    @AfterTest
    void endOfTests() {
        driver.quit();
    }

}

