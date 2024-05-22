package com.unac.stepsdefinitions;

import com.unac.apis.GoRestApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PutGoRestStepsdefinitions {
    @Given("se establece la base url {string}")
    public void seEstableceLaBaseUrl(String baseUrl) {
        GoRestApi.setBaseUrl(baseUrl);
    }

    @When("The name on the endpoint {string} is updated by id {string} with the name {string} and the email {string}")
    public void seActulizaElEndPoint(String endPoint, String idUser, String name, String email) {
        GoRestApi.executionPutToken(endPoint, idUser, name, email);
    }

    @Then("It is validated that the status code is {int} and that the name is {string} and the email is {string}")
    public void seValidaElStatusCode(Integer statusCode, String name, String email) {
        GoRestApi.validatePutResponse(statusCode, name, email);
    }
}
