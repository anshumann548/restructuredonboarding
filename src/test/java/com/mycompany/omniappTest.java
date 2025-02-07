package com.mycompany;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class omniappTest extends BaseTest {

    @Test(priority = 2, description = "Verify login fails with invalid credentials")
    public void invalidLogin() throws InterruptedException {
        boolean result = omniapper.onboard("Ad12min@omniengage.co", "defaultPasswxcvdfgdgord");
        Assert.assertFalse(result);
    }

    @Test(priority = 3, description = "Verify login with valid credentials")
    public void validLogin() throws InterruptedException {
        boolean result = omniapper.onboard("Ad12min@omniengage.co", "defaultPassword");
        Assert.assertTrue(result);
    }

    @AfterMethod
    public void tearDown() {
        driver.navigate().to("about:blank"); // Clear the page or refresh before the next test
    }
}