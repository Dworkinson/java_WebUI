package org.pageobbject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pageobbject.common.elements.Header;

public class MainPage extends BasePage {
    public Header header = new Header(this.driver);
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://docs.oracle.com/en/");
    }

    @FindBy(xpath = "//h1[@class=\"ohc-header-text\"]")
    WebElement title;

    public String getTitle() {
        return title.getText();
    }

    public void moveToTitle() {
        actions.moveToElement(title).perform();
    }
}
