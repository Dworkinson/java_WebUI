package org.pageobbject.common.elements;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pageobbject.BasePage;

public class Header extends BasePage {
    public HeaderMenu headerMenu;

    public Header(WebDriver driver) {
        super(driver);
        this.headerMenu = new HeaderMenu(driver);
    }

    @FindBy(css = "[href=\"https://www.oracle.com\"]")
    private WebElement oracleLogo;

    @FindBy(css = "[href=\"#main-menu\"]")
    private WebElement menuBtn;

    @FindBy(css = "[data-trackas=\"header\"][href=\"/\"]")
    private WebElement helpCenter;

    @FindBy(css = "[id=\"search-bar-input\"]")
    private WebElement searchBarInput;

    @FindBy(css = "[id=\"search-bar-scope\"]")
    private WebElement searchItem;

    @FindBy(css = "[id=\"search-bar-scope-close-icon\"]")
    private WebElement closeSearchItem;

    @FindBy(css = "[href=\"#usermenu\"]")
    private WebElement userMenu;

    public void clickOnOracleLogo() {
        oracleLogo.click();
    }

    public void moveToMenu() {
        waitFor(ExpectedConditions.elementToBeClickable(menuBtn));
        actions.moveToElement(menuBtn).perform();
    }

    public void clickOnHelpCenter() {
        helpCenter.click();
    }

    public void moveToUserMenu() {
        actions.moveToElement(userMenu).perform();
    }

    public String getSearchItem() {
        return searchItem.getText();
    }

    public void removeSearchItem() {
        closeSearchItem.click();
    }

    public Boolean isSearchItemDisplayed() {
        return searchItem.isDisplayed();
    }
}
