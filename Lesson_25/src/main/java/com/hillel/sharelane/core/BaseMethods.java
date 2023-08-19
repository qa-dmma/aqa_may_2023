package com.hillel.sharelane.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.hillel.sharelane.configuration.WebDriverInit.getDriver;

public class BaseMethods {
    public static WebDriverWait getWait(int time) {
        return new WebDriverWait(getDriver(), time);
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), 15);
    }

    protected String getTextFromElement(By locator) {
        return getWait().until(d -> d.findElement(locator)).getText();
    }

}
