package com.mycompany;

import org.testng.annotations.Test;
import org.testng.Assert;

public class cynthia_onboardTest extends BaseTest {

    @Test(priority=4, description = "Cynthia onboarding test")
    public void testCynthiaOnboard() throws InterruptedException {
        cynthia cynthiaOnboarder = new cynthia(driver); // Pass the driver instance
        boolean result = cynthiaOnboarder.cynthia_onboard();
        Assert.assertTrue(result, "Cynthia onboarding failed!");
        // Clear the page or refresh after the test
        driver.navigate().to("about:blank"); // Example of clearing the page
    }
}
