package Screens;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddTaskScreen extends BaseClass {

    // Declaring elements using By locators
    private By AllowNotificationBtn = By.id("com.android.permissioncontroller:id/permission_allow_button");
    private By AddNewTaskBtn = By.id("com.splendapps.splendo:id/fabAddTask");
    private By TaskNameField = By.id("com.splendapps.splendo:id/edtTaskName");
    private By SetDateBtn = By.id("com.splendapps.splendo:id/btnSetD");
    private By DateBtn = By.id("android:id/button1");
    private By RepeatSpinner = By.id("com.splendapps.splendo:id/spinnerRepeat");
    private By  NoRepeatBtn = By.xpath("//android.widget.TextView[@text=\"No repeat\"]");
    private By AddNewListBtn = By.id("com.splendapps.splendo:id/btnAddList");
    private By GroupField = By.className("android.widget.EditText");
    private By GroupOkField = By.id("android:id/button1");
    private By SaveTaskBtn = By.id("com.splendapps.splendo:id/fabSaveTask");
    private By AddQuickTaskField = By.id("com.splendapps.splendo:id/etQuickTask");
    private By AddBtn = By.id("com.splendapps.splendo:id/ivAddQuickTask");

    public void AddNewTask(String TaskName , String GroupName){
        driver.findElement(AllowNotificationBtn).click();
        driver.findElement(AddNewTaskBtn).click();
        driver.findElement(TaskNameField).sendKeys(TaskName);
        driver.findElement(SetDateBtn).click();
        driver.findElement(DateBtn).click();
        driver.findElement(RepeatSpinner).click();
        driver.findElement(NoRepeatBtn).click();
        driver.findElement(AddNewListBtn).click();
        // Wait for the element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
        driver.findElement(GroupField).sendKeys(GroupName);
        driver.findElement(GroupOkField).click();
        driver.findElement(SaveTaskBtn).click();
    }

    public void addQuickTask (String TaskName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.splendapps.splendo:id/etQuickTask")));
        driver.findElement(AddQuickTaskField).sendKeys(TaskName);
        driver.findElement(AddBtn).click();
    }




}
