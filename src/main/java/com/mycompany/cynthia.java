package com.mycompany;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cynthia {
    private WebDriver driver;
    private omniapp omniapper;

    public cynthia(WebDriver driver) {
        this.driver = driver;
        this.omniapper = new omniapp(driver); // Pass the driver instance to omniapp
    }

    public boolean cynthia_onboard() throws InterruptedException {
        try {
            omniapper.onboard("Ad12min@omniengage.co", "defaultPassword");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement tryNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tryNowBtn")));

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tryNowButton);

            return driver.getCurrentUrl().equals("https://app.omniengage.co/agent/cynthia");
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
