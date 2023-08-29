package com.hillel.sharelane.usersingup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPageZipCode {
    @FindBy(xpath = "//input[@name='zip_code']")
    private WebElement zipCodeField;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButtonZipCode;

    @FindBy(xpath = "//span[@class='error_message']")
    private WebElement zipWarningMessage;

    public SingUpPageZipCode(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getZipCodeField() {
        return zipCodeField;
    }

    public WebElement getContinueButtonZipCode() {
        return continueButtonZipCode;
    }

    public WebElement getZipWarningMessage() {
        return zipWarningMessage;
    }
}
