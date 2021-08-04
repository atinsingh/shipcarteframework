package io.pragra.testing.framework.testcases;

import io.pragra.testing.framework.drivermanager.DriverManager;
import io.pragra.testing.framework.listerner.ScreenShotListener;
import io.pragra.testing.framework.pages.home.TopBar;

import io.pragra.testing.framework.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ScreenShotListener.class})
public class HomePageTest {

    @Test
    public void testName() {
        WebDriver driver = DriverManager.getInstance();
        driver.get("https://zoom.us/");
        TopBar topBar = new TopBar(driver);
        topBar.clickRequestDemo();
        Assert.fail();
        driver.quit();
    }


}
