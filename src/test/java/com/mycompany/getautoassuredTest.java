package com.mycompany;

import org.testng.annotations.Test;

public class getautoassuredTest extends BaseTest {

    @Test(priority = 1, description = "Verify auto assured login functionality")
    public void test4_autoAssuredLogin() {
        getautoassured assure = new getautoassured();
        assure.login_assured();
        // No driver assignment needed as this is an API test
    }
}
