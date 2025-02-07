package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class omniapp {

    private WebDriver driver;

    public omniapp(WebDriver driver) {
        this.driver = driver;
    }

    public boolean onboard(String Username, String Password) throws InterruptedException {
        try {
            // Use the WebDriver instance passed to the constructor
            driver.get("https://app.omniengage.co");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/div[2]/div/input")).sendKeys(Username);
            driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/div[3]/div[1]/input")).sendKeys(Password);
            driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/div[4]/button[1]")).click();
            Thread.sleep(3000);

            String bannerText = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/main/div/div/div[1]/div[1]")).getText();
            return bannerText.contains("Cutting-Edge AI Workflow Builder");
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
