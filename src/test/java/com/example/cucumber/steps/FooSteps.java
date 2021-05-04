package com.example.cucumber.steps;

import com.example.cucumber.clients.FooClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class FooSteps {

    @Autowired
    private FooClient fooClient;

    @Given("^Foo does not exist$")
    public void givenFooDoesNotExist() {
        Assert.isTrue(fooClient.notExistsFoo(), "Foo exists");
    }

    @Given("^Scenario fails$")
    public void givenScenarioFails() {
        throw new UnsupportedOperationException();
    }

    @When("Moe creates Foo")
    public void whenFooIsCreated() {
        fooClient.createFoo();
    }

    @Then("^Foo exists$")
    public void thenFooExists() {
        Assert.isTrue(fooClient.existsFoo(), "Foo does not exist");
    }
}
