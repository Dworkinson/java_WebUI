package org.pageobbject.common.elements;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pageobbject.BasePage;


public class HeaderMenu extends BasePage {
    public HeaderMenu(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@aria-label=\"Cloud Applications\"]")
    private WebElement cloudApplications;

    @FindBy(xpath = "//a[@aria-label=\"Fusion Applications Suite\"]")
    private WebElement fusionApplications;

    @FindBy(xpath = "//a[@aria-label=\"Cloud infrastructure\"]")
    private WebElement cloudInfrastructure;

    @FindBy(xpath = "//a[@aria-label=\"On-premise applications\"]")
    private WebElement onPremiseApplications;

    @FindBy(xpath = "//a[@aria-label=\"Middleware\"]")
    private WebElement middleware;

    @FindBy(xpath = "//a[@aria-label=\"Database\"]")
    private WebElement database;

    @FindBy(xpath = "//a[@aria-label=\"Engineered systems\"]")
    private WebElement engineeredSystems;

    @FindBy(xpath = "//a[@aria-label=\"Java\"]")
    private WebElement java;

    @FindBy(xpath = "//a[@aria-label=\"Hardware\"]")
    private WebElement hardware;

    @FindBy(xpath = "//a[@aria-label=\"Operating systems\"]")
    private WebElement operatingSystems;

    @FindBy(xpath = "//a[@aria-label=\"Virtualization\"]")
    private WebElement virtualization;

    @FindBy(xpath = "//a[@aria-label=\"Industries\"]")
    private WebElement industries;

    @FindBy(xpath = "//a[@aria-label=\"Architecture Center\"]")
    private WebElement architectureCenter;

    @FindBy(xpath = "//a[@href=\"/learn/\"]")
    private WebElement tutorialsAndLabs;

    @FindBy(xpath = "//*[@id=\"menubar1\"]//a[@href=\"/en/browseall.html\"]")
    private WebElement productsAZ;

    @FindBy(xpath = "//a[@aria-label=\"help center home\"]")
    private WebElement helpCenter;

    @FindBy(xpath = "//a[@aria-label=\"oracle.com home\"]")
    private WebElement oracleHome;

    @FindBy(xpath = "//a[@href=\"/en/cloud/index.html\"]")
    private WebElement getStarted;

    public void moveToCloudApplications() {
        waitFor(ExpectedConditions.elementToBeClickable(cloudApplications));
        actions.moveToElement(cloudApplications).perform();
    }

    public void clickOnFusionApplications() {
        fusionApplications.click();
    }

    public void moveToFusionApplications() {
        actions.moveToElement(fusionApplications).perform();
    }
}
