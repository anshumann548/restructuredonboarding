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

    public static void main(String[] args) throws InterruptedException {
        cynthia maininstance = new cynthia();
        maininstance.cynthia_onboard();

    }

    WebDriver driver;
    omniapp omniapper = new omniapp();

    public boolean cynthia_onboard() throws InterruptedException {
        try {
            omniapper.onboard("Ad12min@omniengage.co", "defaultPassword");
            this.driver = omniapper.driver;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement tryNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tryNowBtn")));

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tryNowButton);

            return driver.getCurrentUrl().equals("https://app.omniengage.co/agent/cynthia");
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void driver_control() {
        driver.quit();
    }

}
