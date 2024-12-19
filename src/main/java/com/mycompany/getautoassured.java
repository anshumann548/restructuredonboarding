package com.mycompany;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;

public class getautoassured {

    

  //  public static void main(String[] args) {

       // login_assured(); create login assured static for a while to run it in main class 
   // }

    public void login_assured() {
        given()
                .header("origin", "app.omniengage.co/")
                .when()
                .get("https://app.omniengage.co/login")
                .then()
                .statusCode(404)
                .header("Content-type", equalTo("text/html"));
    }
}
