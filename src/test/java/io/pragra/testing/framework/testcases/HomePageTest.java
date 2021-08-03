package io.pragra.testing.framework.testcases;

import io.pragra.testing.framework.pages.home.TopBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/chromedriver");

    }

    @Test
    public void testName() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://zoom.us/");
        TopBar topBar = new TopBar(driver);
        topBar.clickRequestDemo();
        driver.quit();
    }


}
