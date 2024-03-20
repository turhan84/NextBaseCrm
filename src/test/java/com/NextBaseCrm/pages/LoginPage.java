package com.NextBaseCrm.pages;


import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginBtn.click();
    }

    @FindBy(xpath = "//div[contains(@class, 'errortext')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement checkbox;



}
