package org.pageobbject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pageobbject.common.elements.Header;

public class CloudApplications extends BasePage {
    public Header header;
    public CloudApplications(WebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }
    @FindBy(xpath = "//*[@class=\"cloud-title\"]")
    private WebElement title;

    public String getTitle() {
        waitFor(ExpectedConditions.visibilityOf(title));
        return title.getText();
    }
}
