package com.eigentech.pages;

import com.eigentech.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    WebElement acceptcookies;

    @CacheLookup
    @FindBy(xpath = "//span[@class='navigation__list__label']//span[contains(text(),'Resources')]")
    WebElement resources;

    @CacheLookup
    @FindBy(linkText = "Events")
    WebElement events;


    @CacheLookup
    @FindBy(xpath = "//div[@class='section section--featured section--dash-btm section--dash-side section--thirds']//a[normalize-space()='Innovate Finance Global Summit']")
    WebElement innovatefinance;

    public void clickOnAcceptCookies() {
        log.info("clicking on acceptcookies button : " + acceptcookies.toString());
        clickOnElement(acceptcookies);
    }

    public void mouseHoverOnResources() {
        log.info("mousehover on Resources : " + resources.toString());
        mouseHoverToElement(resources);

    }
    public void clickOnEvents(){
        log.info("click on events : " + events.toString());
        clickOnElement(events);
    }
    public void clickOnInnoventFinance(){
        log.info("clicking on innovatefinance : " + innovatefinance.toString());
        clickOnElement(innovatefinance);
    }




}
