package org.pageobbject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sidebar {
    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/cloud/\"]")
    private WebElement cloud;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/applications/\"]")
    private WebElement applications;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/middleware/\"]")
    private WebElement middleware;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/database/\"]")
    private WebElement database;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/bigdata/\"]")
    private WebElement bigData;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/enterprise-manager/\"]")
    private WebElement enterpriseManager;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/engineered-systems/\"]")
    private WebElement engineeredSystems;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"index.html\"]")
    private WebElement java;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/servers/\"]")
    private WebElement servers;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/networking/\"]")
    private WebElement networking;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/virtualization/\"]")
    private WebElement virtualization;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/storage/\"]")
    private WebElement storage;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/operating-systems/\"]")
    private WebElement operatingSystems;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/industries/\"]")
    private WebElement industries;

    @FindBy(css = "[class*=\"ohc-sidebar\"] [href=\"/en/browseall.html\"]")
    private WebElement browseAllProducts;

    public void clickCloud() {
        cloud.click();
    }

    public void clickApplications() {
        applications.click();
    }

    public void clickMiddleware() {
        middleware.click();
    }

    public void clickDatabase() {
        database.click();
    }

    public void clickBigData() {
        bigData.click();
    }

    public void clickEnterpriseManager() {
        enterpriseManager.click();
    }

    public void clickJava() {
        java.click();
    }

    public void clickServers() {
        servers.click();
    }

    public void clickNetworking() {
        networking.click();
    }

    public void clickVirtualization() {
        virtualization.click();
    }

    public void clickStorage() {
        storage.click();
    }

    public void clickOperatingSystems() {
        operatingSystems.click();
    }

    public void clickIndustries() {
        industries.click();
    }

    public void clickBrowseAllProducts() {
        browseAllProducts.click();
    }
}
