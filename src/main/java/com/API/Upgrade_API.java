package com.API;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;


public class Upgrade_API {

    @Test
    public void PostRequest() {

        //Validation for correct credentials provided


        RequestSpecification request = RestAssured.given();

        //header
        request.header("x-cf-source-id", "coding-challenge");
        request.header("x-cf-corr-id", "34c16f53-38c4-461a-bd14-11fa748d2663");
        request.header("Content-Type", "application/json");
//
        JSONObject json = new JSONObject();

        json.put("username", "coding.challenge.login@upgrade.com");
        json.put("password", "On$3XcgsW#9q");

        //

        request.body(json.toJSONString());

        Response response = request.post("https://credapi.credify.tech/api/brportorch/v2/login");

        int code = response.getStatusCode();


        Assert.assertEquals(code, 200);

        System.out.println("Status code is: " + code);

    }

    @Test

    public void ValidateAttribute() {

        RequestSpecification request1 = RestAssured.given();

        //header
        request1.header("x-cf-source-id", "coding-challenge");
        request1.header("x-cf-corr-id", "34c16f53-38c4-461a-bd14-11fa748d2663");
        request1.header("Content-Type", "application/json");
//
        JSONObject json1 = new JSONObject();

        json1.put("username", "coding.challenge.login@upgrade.com");
        json1.put("password", "On$3XcgsW#9q");

        //

        request1.body(json1.toJSONString());

        Response response1 = request1.post("https://credapi.credify.tech/api/brportorch/v2/login");

        String str1 = response1.getContentType();

        System.out.println(str1);

        //Validation of the attibute( PERSONAL_LOAN)

        Assert.assertTrue(response1.asString().contains("PERSONAL_LOAN"));

// Print whole response body

        System.out.println(response1.asString());

    }

    @Test
    public void ValiodateValue() {


        RequestSpecification request2 = RestAssured.given();

        //header

        request2.header("x-cf-source-id", "coding-challenge");
        request2.header("x-cf-corr-id", "34c16f53-38c4-461a-bd14-11fa748d2663");
        request2.header("Content-Type", "application/json");

        JSONObject json2 = new JSONObject();

        json2.put("username", "Yarkantriver@upgrade.com");
        json2.put("password", "On$3XcgsW#9q");


        request2.body(json2.toJSONString());

        Response response2 = request2.post("https://credapi.credify.tech/api/brportorch/v2/login");

        int code2 = response2.getStatusCode();

// validate the response code

        Assert.assertEquals(code2, 401);

        System.out.println("Status code is: " + code2);


    }
}