package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/h5/a")
    WebElement selectItem;
    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
    WebElement clickAddToCart;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div[3]/div/div/div[3]/div/a")
    //@FindBy(xpath = "/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/span")
    WebElement clickOnCart;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
    WebElement womenTab;

    @CacheLookup
    @FindBy (xpath = "/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[3]/a")
    WebElement summerDresses;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[2]/h1/span[1]")
    WebElement viewSummerDresses;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[10]/ul/div/div/a[2]")
    WebElement priceRangeSlider;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a")
    WebElement verifySummerDress;







    public void clickOnItem() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick(selectItem);
    }

    public void setClickAddToCart() {
        clickOnElement(clickAddToCart);

    }
    public void setClickOnCart () {
        //driver.switchTo().alert().dismiss();
        mouseHoverToElementAndClick(clickOnCart);
        dismissAlert();
    }

    public void setWomenTab() {
        mouseHoverToElement(womenTab);
    }

    public void setSummerDresses () {
        clickOnElement(summerDresses);
    }

    public String setViewSummerDresses () {
        String message = getTextFromElement(viewSummerDresses);
        return message;
    }

    public void setPriceRangeSlider () {
        //clickOnElement(priceRangeSlider);
        //mouseHoverToElementAndClick(priceRangeSlider); Not Working, Needs to review.
    }

    public String setVerifySummerDress () {
        String message2 = getTextFromElement(verifySummerDress);
        return message2;

    }



}