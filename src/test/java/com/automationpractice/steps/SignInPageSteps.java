package com.automationpractice.steps;

import com.automationpractice.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ro.Si;

public class SignInPageSteps {


    @When("^I click on the \"([^\"]*)\" tab$")
    public void iClickOnTheTab(String arg0) {
        new SignInPage().clickOnSignInLink();
    }

    @And("^I enter Email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        new SignInPage().clickOnEmailField(email);
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) {
        new SignInPage().clickOnCreateButton();
    }


    @And("^I enter my first name \"([^\"]*)\"$")
    public void iEnterMyFirstName(String firstName1) {
        new SignInPage().clickOnFirstnameField(firstName1);
    }

    @And("^I enter my last name\"([^\"]*)\"$")
    public void iEnterMyLastName(String lastName1){
        new SignInPage().clickOnLastnameField(lastName1);
    }

    @And("^I enter my Email address in personal information \"([^\"]*)\"$")
    public void iEnterMyEmailAddressInPersonalInformation(String email1){
        new SignInPage().clickOnEmailIdField(email1);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password1) {
        new SignInPage().clickOnPasswordField(password1);
    }

    @And("^I enter my address as \"([^\"]*)\"$")
    public void iEnterMyAddressAs(String address1) {
        new SignInPage().clickOnAddressField(address1);
    }

    @And("^I enter my city as \"([^\"]*)\"$")
    public void iEnterMyCityAs(String city1) {
        new SignInPage().clickOnCityField(city1);
    }

    @And("^I select state from the dropdown menu as \"([^\"]*)\"$")
    public void iSelectStateFromTheDropdownMenuAs(String state1){
        new SignInPage().clickOnStateField(state1);
    }

    @And("^I enter my Zip/Postal Code as \"([^\"]*)\"$")
    public void iEnterMyZipPostalCodeAs(String postCode1) {
        new SignInPage().clickOnPostCodeField(postCode1);
    }

    @And("^I enter my mobile phone number as \"([^\"]*)\"$")
    public void iEnterMyMobilePhoneNumberAs(String mobile1) {
        new SignInPage().clickOnMobileField(mobile1);
    }

    @And("^I enter my alias name as \"([^\"]*)\"$")
    public void iEnterMyAliasNameAs(String alias1) {
        new SignInPage().clickOnAliasField(alias1);
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new SignInPage().clickOnregisterButton();
    }

    @Then("^I should be able to see my account name on top right$")
    public void iShouldBeAbleToSeeMyAccountNameOnTopRight() {
    }
}