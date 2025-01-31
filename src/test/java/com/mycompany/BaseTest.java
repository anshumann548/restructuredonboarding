package com.mycompany;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;
    protected static omniapp omniapper;

    @BeforeMethod
    public void setUp() {
        if (omniapper == null) {
            omniapper = new omniapp();
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
