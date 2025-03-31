package BasePackage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class BaseClass {
    protected static AndroidDriver driver;
    protected DesiredCapabilities caps;
    protected FileInputStream inputStream;
    protected Properties prop;

    @Parameters({"DeviceName", "PlatformName"})
    @BeforeClass
    public void beforeClass(String DeviceName, String PlatformName) throws IOException {
        File file = new File("D:\\ToDoAppiumProject\\src\\main\\resources\\Config.properties");
        inputStream = new FileInputStream(file);
        prop = new Properties();
        caps = new DesiredCapabilities();
        prop.load(inputStream);
        if (PlatformName.equalsIgnoreCase("Android")) {
            caps.setCapability("appium:platformName", PlatformName);
            caps.setCapability("appium:deviceName", DeviceName);
            caps.setCapability("appium:appPackage", prop.getProperty("AppPackage"));
            caps.setCapability("appium:appActivity", prop.getProperty("AppActivity"));
            driver = new AndroidDriver(new URL(prop.getProperty("AppiumServerLink")), caps);
        } else if (PlatformName.equalsIgnoreCase("ios")) {
            caps.setCapability("appium:platformName", PlatformName);
            caps.setCapability("appium:deviceName", DeviceName);
            caps.setCapability("appium:appPackage", prop.getProperty("AppPackage"));
            caps.setCapability("appium:appActivity", prop.getProperty("AppActivity"));
            driver = new AndroidDriver(new URL(prop.getProperty("AppiumServerLink")), caps);
        }
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
