package com.mycompany;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected omniapp omniapper;

    @BeforeClass // Initialize WebDriver once
    public void setUp() {
        // Set ChromeDriver path
        String chromeDriverPath = "/home/anshumann/Desktop/chromedriver/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        // Configure ChromeOptions for headless mode if needed
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");

        // Initialize a new WebDriver instance
        driver = new ChromeDriver(options);
        omniapper = new omniapp(driver); // Pass the driver instance
    }

    @AfterClass // Close WebDriver after all tests
    public void tearDown() {
        if (driver != null) {
            try {
                driver.quit();
            } finally {
                driver = null;
            }
        }
    }
}