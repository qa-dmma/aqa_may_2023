package com.hillel.sharelane.usersingup;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testSingUpPageForm {
    private static WebDriver driver;
    private SingUpPageForm singUpFormPage;

    @BeforeClass
    public void profileSetup() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/edgedriver.exe");
        driver = new EdgeDriver();
        singUpFormPage = new SingUpPageForm(driver);
        driver.manage().window().maximize();
    }

    @Test(groups = {"Sign Validation Message"}, priority = 1)
    public void registrationMessage() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        WebElement firstNameField = singUpFormPage.getFirstName();
        WebElement lastNameField = singUpFormPage.getLastName();
        WebElement emailField = singUpFormPage.getEmail();
        WebElement passField = singUpFormPage.getPass();
        WebElement passConf = singUpFormPage.getConfPass();
        WebElement registerButton = singUpFormPage.getRegistrationButton();
        firstNameField.sendKeys("Tester");
        lastNameField.sendKeys("WebDriwer");
        emailField.sendKeys("qa@test.com");
        passField.sendKeys("12345");
        passConf.sendKeys("654321");
        registerButton.click();
        WebElement singUpWarningMessage = singUpFormPage.getSingUpWarningMessage();
        Assert.assertEquals(singUpWarningMessage.getText(), "Oops, error on page. " +
                "Some of your fields have invalid data or email was previously used");
    }

    @Test(groups = {"Sign Validation Message"}, priority = 2)
    public void emptyFieldsMessage() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        WebElement registerButton = singUpFormPage.getRegistrationButton();
        registerButton.click();
        WebElement singUpWarningMessage = singUpFormPage.getSingUpWarningMessage();
        Assert.assertEquals(singUpWarningMessage.getText(), "Oops, error on page. " +
                "Some of your fields have invalid data or email was previously used");
    }

    @Test(groups = {"Sign Validation Message"}, priority = 3)
    public void registrationConfirmationMessage() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        WebElement firstNameField = singUpFormPage.getFirstName();
        WebElement lastNameField = singUpFormPage.getLastName();
        WebElement emailField = singUpFormPage.getEmail();
        WebElement passField = singUpFormPage.getPass();
        WebElement passConf = singUpFormPage.getConfPass();
        WebElement registerButton = singUpFormPage.getRegistrationButton();
        firstNameField.sendKeys("Tester");
        lastNameField.sendKeys("WebDriver");
        emailField.sendKeys("qa@test.com");
        passField.sendKeys("123456");
        passConf.sendKeys("123456");
        registerButton.click();
        WebElement confirmationMessage = singUpFormPage.getConfirmationMessage();
        Assert.assertEquals(confirmationMessage.getText(), "Account is created!");
    }

    @AfterTest
    void endOfTests() {
        driver.quit();
    }
}

