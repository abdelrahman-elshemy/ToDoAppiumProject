package TestCases;

import BasePackage.BaseClass;
import Screens.AddTaskScreen;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddTaskTest extends BaseClass {

    AddTaskScreen hs;
    @Test
    public void addNewTask(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        hs = new AddTaskScreen();
        hs.AddNewTask("To-Do-Appium-Task","Automation Study");
        Assert.assertEquals(driver.findElement(By.id("com.splendapps.splendo:id/snackbar_text")).getText(),"Task Added");
    }
    @Test(dependsOnMethods = "addNewTask")
    public void addQuickTask(){
        hs.addQuickTask("Automation Appium");
       // Assert.assertEquals(driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.splendapps.splendo:id/layAdBanner\"]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.TextView[2]")).getText(),"Task Added");
    }
}
