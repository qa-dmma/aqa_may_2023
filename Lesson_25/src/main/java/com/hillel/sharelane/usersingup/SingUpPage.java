package com.hillel.sharelane.usersingup;

import com.hillel.sharelane.core.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.hillel.sharelane.configuration.WebDriverInit.driver;

public class SingUpPage extends BaseMethods {
    public final By pageZipCodeField = By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/" +
            "tr[2]/td/table/tbody/tr[2]/td[2]/input");

    public final By pageContinueButtonZipCode = By.xpath("/html/body/center/table/tbody/tr[5]/td/table/" +
            "tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input");
    public final By pageZipWarningMessage = By.xpath("/html/body/center/table/tbody/tr[4]/td/span");

    public final By pageFirstName = By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]" +
            "/td/table/tbody/tr[1]/td[2]/input");

    public final By pageLastName = By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]" +
            "/td/table/tbody/tr[2]/td[2]/input");
    public final By pageEmail = By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]" +
            "/td/table/tbody/tr[3]/td[2]/input");
    public final By pagePass = By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]" +
            "/td/table/tbody/tr[4]/td[2]/input");
    public final By pageConfPass = By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]" +
            "/td/table/tbody/tr[5]/td[2]/input");
    public final By pageRegisterButton = By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody" +
            "/tr[2]/td/table/tbody/tr[6]/td[2]/input");

    public final By pageSingUpWarningMessage = By.xpath("/html/body/center/table/tbody/tr[4]/td/span");
    public final By pageConfirmationMessage = By.xpath("/html/body/center/table/tbody/tr[4]/td/span");

    public static void preconditionForSingUp() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        SingUpPage page = new SingUpPage();
        WebElement zipCodeField = driver.findElement(page.pageZipCodeField);
        WebElement continueButtonZipCode = driver.findElement(page.pageContinueButtonZipCode);
        zipCodeField.click();
        zipCodeField.sendKeys("12345");
        continueButtonZipCode.click();
    }

    public String getTextMessage(By message) {
        return getTextFromElement(message);
    }
}
