package com.mycompany;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class omniapp_test {

    omniapp omniapper = new omniapp();

    @Test
    public void onboard_test() throws InterruptedException {
        boolean result = omniapper.onboard("Ad12min@omniengage.co", "defaultPassword");
        Assert.assertTrue(result);
    }

    @AfterTest
    public void driver_quit() {
        omniapper.driver_control();
    }

}
