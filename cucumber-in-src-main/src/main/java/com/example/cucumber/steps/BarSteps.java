package com.example.cucumber.steps;

import com.example.cucumber.clients.BarClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class BarSteps {

    @Autowired
    private BarClient barClient;

    @Given("^Bar does not exist$")
    public void givenBarDoesNotExist() {
        Assert.isTrue(barClient.notExistsBar(), "Bar exists");
    }

    @Given("^Scenario fails$")
    public void givenScenarioFails() {
        throw new UnsupportedOperationException();
    }

    @When("Moe creates Bar")
    public void whenBarIsCreated() {
        barClient.createBar();
    }

    @Then("^Bar exists$")
    public void thenBarExists() {
        Assert.isTrue(barClient.existsBar(), "Bar does not exist");
    }
}
