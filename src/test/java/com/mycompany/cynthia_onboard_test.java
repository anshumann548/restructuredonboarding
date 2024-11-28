package com.mycompany;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class cynthia_onboard_test {

    boolean result;
    cynthia cynthia_onboarder = new cynthia();

    @Test
    public void cynthia_onboard_success() throws InterruptedException {

        result = cynthia_onboarder.cynthia_onboard();
        Assert.assertTrue(result);
    }

    @AfterTest
    public void driver_quit() {
        cynthia_onboarder.driver_control();
    }

}
