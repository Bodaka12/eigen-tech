package com.eigentech.cucumber.steps;

import com.eigentech.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I mousehover on resources$")
    public void iMousehoverOnResources() {
        new HomePage().clickOnAcceptCookies();
        new HomePage().mouseHoverOnResources();
    }

    @And("^I click on events$")
    public void iClickOnEvents() {
        new HomePage().clickOnEvents();
    }

    @Then("^I click on innovate finance$")
    public void iClickOnInnovateFinance() {
        new HomePage().clickOnInnoventFinance();
    }
}
