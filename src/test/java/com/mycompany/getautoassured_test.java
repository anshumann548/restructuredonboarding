package com.mycompany;

import org.testng.annotations.Test;

public class getautoassured_test {

    getautoassured assure = new getautoassured();

    @Test
    public void testlogin_assure() {
        assure.login_assured();
    }
}
