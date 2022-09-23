package com.automationpractice.steps;

import com.automationpractice.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePageSteps {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {

    }

    @When("^I mouse hover on the product and add to the cart$")
    public void iMouseHoverOnTheProductAndAddToTheCart() throws InterruptedException {
        new HomePage().clickOnItem();
    }

    @Then("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new HomePage().setClickAddToCart();
    }

    @Then("^I mouse hover on the cart tab$")
    public void iMouseHoverOnTheCartTab() {
        new HomePage().setClickAddToCart();

    }

    @When("^I mouse hover on the Women tab$")
    public void iMouseHoverOnTheWomenTab() {
        new HomePage().setWomenTab();

    }

    @And("^I click on \"([^\"]*)\" option$")
    public void iClickOnOption(String arg0)  {
        new HomePage().setSummerDresses();

    }

    @Then("^I can view Summer Dress items$")
    public void iCanViewSummerDressItems(String message) {
        String message1 = new HomePage().setViewSummerDresses();
        Assert.assertEquals(message, message1, "Summer Dresses ");
    }

    @And("^I should be able to click and drag the price range slider to \\$(\\d+)$")
    public void iShouldBeAbleToClickAndDragThePriceRangeSliderTo$(int arg0) {
        new HomePage().setPriceRangeSlider();
    }

    @Then("^I should be able to see the search result updated within price range$")
    public void iShouldBeAbleToSeeTheSearchResultUpdatedWithinPriceRange( String message2) {
        String message3 = new HomePage().setVerifySummerDress();
        Assert.assertEquals(message3,message2, "Printed Chiffon Dress");

    }
}