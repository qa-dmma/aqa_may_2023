package com.hillel.sharelane.usersingup;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testSingUpPageForm {
    private static WebDriver driver;
    private SingUpPageForm SingUpFormPage = new SingUpPageForm();
    private By FirstName = SingUpFormPage.FirstName();
    private By LastName = SingUpFormPage.LastName();
    private By ConfPass = SingUpFormPage.ConfPass();
    private By Email = SingUpFormPage.Email();
    private By Pass = SingUpFormPage.Pass();
    private By RegisterButton = SingUpFormPage.RegisterButton();
    private By SingUpWarningMessage = SingUpFormPage.SingUpWarningMessage();
    private By ConfirmationMessage = SingUpFormPage.ConfirmationMessage();


    @BeforeClass
    public void profileSetup() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/edgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test(groups = {"Sign Validation Message"}, priority = 1)
    public void registrationMessage() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        WebElement firstNameField = driver.findElement(FirstName);
        WebElement lastNameField = driver.findElement(LastName);
        WebElement emailField = driver.findElement(Email);
        WebElement passField = driver.findElement(Pass);
        WebElement passConf = driver.findElement(ConfPass);
        WebElement registerButton = driver.findElement(RegisterButton);
        firstNameField.sendKeys("Tester");
        lastNameField.sendKeys("WebDriwer");
        emailField.sendKeys("qa@test.com");
        passField.sendKeys("12345");
        passConf.sendKeys("654321");
        registerButton.click();
        WebElement singUpWarningMessage = driver.findElement(SingUpWarningMessage);
        Assert.assertEquals(singUpWarningMessage.getText(), "Oops, error on page. " +
                "Some of your fields have invalid data or email was previously used");
    }

    @Test(groups = {"Sign Validation Message"}, priority = 2)
    public void emptyFieldsMessage() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        WebElement registerButton = driver.findElement(RegisterButton);
        registerButton.click();
        WebElement singUpWarningMessage = driver.findElement(By.xpath("//span[@class='error_message']"));
        Assert.assertEquals(singUpWarningMessage.getText(), "Oops, error on page. " +
                "Some of your fields have invalid data or email was previously used");
    }

    @Test(groups = {"Sign Validation Message"}, priority = 3)
    public void registrationConfirmationMessage() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        WebElement firstNameField = driver.findElement(FirstName);
        WebElement lastNameField = driver.findElement(LastName);
        WebElement emailField = driver.findElement(Email);
        WebElement passField = driver.findElement(Pass);
        WebElement passConf = driver.findElement(ConfPass);
        WebElement registerButton = driver.findElement(RegisterButton);
        firstNameField.sendKeys("Tester");
        lastNameField.sendKeys("WebDriver");
        emailField.sendKeys("qa@test.com");
        passField.sendKeys("123456");
        passConf.sendKeys("123456");
        registerButton.click();
        WebElement confirmationMessage = driver.findElement(ConfirmationMessage);
        Assert.assertEquals(confirmationMessage.getText(), "Account is created!");
    }

    @AfterTest
    void endOfTests() {
        driver.quit();
    }
}

