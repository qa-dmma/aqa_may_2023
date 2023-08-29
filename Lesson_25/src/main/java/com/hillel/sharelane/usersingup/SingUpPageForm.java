package com.hillel.sharelane.usersingup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPageForm {
    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@name='password1']")
    private WebElement pass;
    @FindBy(xpath = "//input[@name='password2']")
    private WebElement confPass;

    @FindBy(xpath = "//input[@value='Register'] ")
    private WebElement registrationButton;

    @FindBy(xpath = "//span[@class='error_message']")
    private WebElement singUpWarningMessage;

    @FindBy(xpath = "//span[@class='confirmation_message']")
    private WebElement confirmationMessage;

    public SingUpPageForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPass() {
        return pass;
    }

    public WebElement getConfPass() {
        return confPass;
    }

    public WebElement getRegistrationButton() {
        return registrationButton;
    }

    public WebElement getSingUpWarningMessage() {
        return singUpWarningMessage;
    }

    public WebElement getConfirmationMessage() {
        return confirmationMessage;
    }
}
