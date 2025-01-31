package com.mycompany;

import org.testng.Assert;
import org.testng.annotations.Test;

public class omniappTest extends BaseTest {

    @Test(priority = 2, description = "Verify login fails with invalid credentials")
    public void test2_invalidLogin() throws InterruptedException {
        boolean result = omniapper.onboard("Ad12min@omniengage.co", "defaultPasswxcvdfgdgord");
        Assert.assertFalse(result);
        driver = omniapper.driver;
    }

    @Test(priority = 3, description = "Verify login with valid credentials")
    public void test1_validLogin() throws InterruptedException {
        boolean result = omniapper.onboard("Ad12min@omniengage.co", "defaultPassword");
        Assert.assertTrue(result);
        driver = omniapper.driver;
    }
}
