package org.pageobbject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pageobbject.common.elements.Header;

public class OracleApplications extends BasePage {
    public OracleApplications(WebDriver driver) {
        super(driver);
        Header header = new Header(driver);
    }
    @FindBy(xpath = "//h1")
    WebElement title;

    public String getTitle() {
        return title.getText();
    }
}
