package io.pragra.testing.framework.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utils {
    public static void takeScreenShot(WebDriver driver, String testCase){
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.createDirectories(Paths.get("target/screenshot"));
            Path targetFile = Paths.get("target/screenshot",testCase+".png");
            //Files.createFile(targetFile);
            Files.copy(screenshot.toPath(), targetFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
