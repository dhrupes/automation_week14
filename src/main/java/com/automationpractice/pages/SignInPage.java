package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {


    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")
    WebElement signIn;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"email_create\"]")
    WebElement emailField;

    @CacheLookup
    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span")
    WebElement createButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"customer_firstname\"]")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = " //*[@id=\"customer_lastname\"]")
    WebElement lastName;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"email\"]")
    WebElement emailID;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement password;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"address1\"]")
    WebElement address;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"city\"]")
    WebElement city;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"id_state\"]")
    WebElement state;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"postcode\"]")
    WebElement postCode;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"phone_mobile\"]")
    WebElement mobilePhone;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"alias\"]")
    WebElement alias;

    @CacheLookup
    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[4]/button/span")
    WebElement registerButton;













    public void clickOnSignInLink(){
        clickOnElement(signIn);
    }

    public void clickOnEmailField (String email) {
        sendTextToElement(emailField,email);
    }

    public void clickOnCreateButton (){
        clickOnElement(createButton);
    }

    public void clickOnFirstnameField (String firstName1) {
        sendTextToElement(firstName,firstName1);
    }

    public void clickOnLastnameField (String lastName1) {
        sendTextToElement(lastName, lastName1);

    }
    public void clickOnEmailIdField (String emailID1) {
        sendTextToElement(emailID, emailID1);
    }

    public void clickOnPasswordField (String password1) {
        sendTextToElement(password, password1);
    }

    public void clickOnAddressField (String address1) {
        sendTextToElement(address, address1);
    }
    public void clickOnCityField (String city1) {
        sendTextToElement(city,city1);
    }
    public void clickOnStateField (String state1) {
        selectByVisibleTextFromDropDown(state, state1);

    }

    public void clickOnPostCodeField (String postCode1) {
        sendTextToElement(postCode,postCode1);
    }
    public void clickOnMobileField (String mobile1) {
        sendTextToElement(mobilePhone,mobile1);
    }

    public void clickOnAliasField (String alias1) {
        sendTextToElement(alias, alias1);
    }
    public void clickOnregisterButton () {
        clickOnElement(registerButton);
    }

}