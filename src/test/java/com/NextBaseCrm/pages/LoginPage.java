package com.NextBaseCrm.pages;


import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.ConfigurationReader;
import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    @FindBy(className = "errortext")
    public WebElement loginErrMsg;

    @FindBy(className = "menu-item-link")
    public WebElement menuItemLink;

    //CheckBox Control

    @FindBy(id = "USER_REMEMBER")
    public WebElement checkBox;

    @FindBy(className = "login-link-forgot-pass")
    public WebElement forgotPasswordLink;

    public void login(String username, String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        BrowserUtils.waitForTitleContains("Portal");
    }

    public void login(){
        usernameInput.sendKeys(ConfigurationReader.getProperty("hr_username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("hr_password"));
        loginBtn.click();
        BrowserUtils.waitForTitleContains("Portal");

    }

}
