package com.mycompany;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class omniapp_test {
boolean result ;
    omniapp omniapper = new omniapp();

    @Test
    public void onboard_test() throws InterruptedException {
         result = omniapper.onboard("Ad12min@omniengage.co", "defaultPassword");
        Assert.assertTrue(result);
    }

    @Test
    public void invalid_onborad_test()throws InterruptedException
    {
      //correct username , incorrect password
         result = omniapper.onboard("Ad12min@omniengage.co", "defcfgaultPassword");
        Assert.assertFalse(result);
    }

    @AfterTest
    public void driver_quit() {
        omniapper.driver_control();
    }

}
