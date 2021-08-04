package io.pragra.testing.framework.listerner;

import io.pragra.testing.framework.drivermanager.DriverManager;
import io.pragra.testing.framework.utils.Utils;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenShotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        Utils.takeScreenShot(DriverManager.getInstance(), result.getName());
    }
}
