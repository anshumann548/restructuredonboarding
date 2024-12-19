package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;          // WebDriver interface
import org.openqa.selenium.chrome.ChromeOptions; // ChromeDriver 

public class omniapp {

    WebDriver driver;

    // public static void main(String[] args) throws InterruptedException {
    //     omniapp maininstance = new omniapp();
    //     maininstance.onboard("Ad12min@omniengage.co", "defaultPassword");
    // } * to run this program individually without test class*
    public boolean onboard(String Username, String Password) throws InterruptedException {
        try {

            System.setProperty("webdriver.chrome.driver", "/home/anshumann/Desktop/chromedriver/chromedriver");
            ChromeOptions chOptions = new ChromeOptions();
            chOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chOptions);

            driver.get("https://app.omniengage.co");
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

    public void driver_control() {
        driver.quit();
    }
}
