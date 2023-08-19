package com.hillel.sharelane.configuration;

import org.openqa.selenium.WebDriver;


public class WebDriverInit {
    public static volatile WebDriver driver;

    public static synchronized WebDriver getDriver() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/edgedriver.exe");
        return driver;
    }
}
