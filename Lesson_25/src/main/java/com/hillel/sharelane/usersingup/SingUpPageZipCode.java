package com.hillel.sharelane.usersingup;

import org.openqa.selenium.By;

public class SingUpPageZipCode {
    protected  By ZipCodeField(){
        By ZipCodeField = By.xpath("//input[@name='zip_code']");
        return ZipCodeField;
    }
    protected By ContinueButtonZipCode (){
        By ContinueButtonZipCode = By.xpath("//input[@value='Continue']");
        return ContinueButtonZipCode;
    }
    protected By ZipWarningMessage (){
        By ZipWarningMessage = By.xpath("//span[@class='error_message']");
        return ZipWarningMessage;
    }
}
