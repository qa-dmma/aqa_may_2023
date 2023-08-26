package com.hillel.sharelane.usersingup;

import org.openqa.selenium.By;

public class SingUpPageForm {
    protected By FirstName() {
        By FirstName = By.xpath("//input[@name='first_name']");
        return FirstName;
    }

    protected By LastName() {
        By LastName = By.xpath("//input[@name='last_name']");
        return LastName;
    }

    protected By Email() {
        By Email = By.xpath("//input[@name='email']");
        return Email;
    }

    protected By Pass() {
        By Pass = By.xpath("//input[@name='password1']");
        return Pass;
    }

    protected By ConfPass() {
        By ConfPass = By.xpath("//input[@name='password2']");
        return ConfPass;
    }

    protected By RegisterButton() {
        By RegisterButton = By.xpath("//input[@value='Register']");
        return RegisterButton;
    }

    protected By SingUpWarningMessage() {
        By SingUpWarningMessage = By.xpath("//span[@class='error_message']");
        return SingUpWarningMessage;
    }

    protected By ConfirmationMessage() {
        By ConfirmationMessage = By.xpath("//span[@class='confirmation_message']");
        return ConfirmationMessage;
    }
}
