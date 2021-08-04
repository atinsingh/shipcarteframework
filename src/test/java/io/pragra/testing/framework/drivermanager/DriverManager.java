package io.pragra.testing.framework.drivermanager;

import io.pragra.testing.framework.conf.FrameWorkConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static DriverManager diverManager;
    private WebDriver driver;

    public DriverManager() {

        if(Browsers.CHROME== FrameWorkConfig.getProperty("browser.type")){
            System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/chromedriver");
            driver = new ChromeDriver();
        }else if(Browsers.FIREFOX==FrameWorkConfig.getProperty("browser.type")){
            System.setProperty("webdriver.gecko.driver", "/Users/atinsingh/Downloads/geckodriver");
            driver = new FirefoxDriver();
        }else {
            System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/chromedriver");
            driver = new ChromeDriver();
        }

    }

    public static WebDriver getInstance() {
        if(diverManager == null) {
            diverManager = new DriverManager();
        }
        return diverManager.driver;
    }
}
