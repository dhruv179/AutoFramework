package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public final class ScreenshotUtil {
    private ScreenshotUtil() {
    }

    public static String capture(WebDriver driver, String testName) {
        Path screenshotsDir = Paths.get("screenshots");

        try {
            Files.createDirectories(screenshotsDir);
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path destination = screenshotsDir.resolve(testName + ".png");
            FileUtils.copyFile(source, destination.toFile());
            return destination.toString();
        } catch (IOException exception) {
            throw new IllegalStateException("Unable to capture screenshot for " + testName, exception);
        }
    }
}
