package com.mycompany;

import org.testng.Assert;
import org.testng.annotations.Test;

public class cynthia_onboardTest extends BaseTest {
    
    @Test(priority = 4, description = "Verify Cynthia onboarding flow works correctly")
    public void test3_cynthiaOnboard() throws InterruptedException {
        cynthia cynthiaOnboarder = new cynthia();
        boolean result = cynthiaOnboarder.cynthia_onboard();
        Assert.assertTrue(result);
        driver = cynthiaOnboarder.driver;
    }
}
