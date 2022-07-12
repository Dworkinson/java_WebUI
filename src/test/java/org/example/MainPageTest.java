package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobbject.CloudApplications;
import org.pageobbject.MainPage;


import java.time.Duration;

public class MainPageTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static MainPage mainPage;
    public static CloudApplications cloudApplications;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "D:/andrew/programs/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        mainPage = new MainPage(driver);
        cloudApplications = new CloudApplications(driver);
    }

    @Test
    public void headerMenuIsFunctional() {
        mainPage.open();
        Assert.assertEquals(mainPage.getTitle(), "Documentation");
        mainPage.moveToTitle();
        mainPage.header.moveToMenu();
        mainPage.header.headerMenu.moveToCloudApplications();
        mainPage.header.headerMenu.clickOnFusionApplications();
        Assert.assertEquals(cloudApplications.getTitle(), "Oracle Fusion Cloud Applications Suite");
        Assert.assertEquals(mainPage.header.getSearchItem(), "Cloud Applications");

        cloudApplications.header.removeSearchItem();
        Assert.assertFalse(cloudApplications.header.isSearchItemDisplayed());
    }

    @AfterClass
    public static void endTest() {
        driver.quit();
    }
}
