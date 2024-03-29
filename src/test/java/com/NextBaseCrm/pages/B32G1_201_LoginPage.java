package com.NextBaseCrm.pages;


import com.NextBaseCrm.utilities.ConfigurationReader;
import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B32G1_201_LoginPage {

    public B32G1_201_LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    public void login(String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginBtn.click();
    }

    public void login (){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        this.username.sendKeys(ConfigurationReader.getProperty("helpDesk_username"));
        this.password.sendKeys(ConfigurationReader.getProperty("helpDesk_password"));
        this.loginBtn.click();
    }


    @FindBy(xpath = "//div[contains(@class, 'errortext')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement checkbox;


    public void logInAs (String userType){
        if (userType.equals("hr")){
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            username.sendKeys(ConfigurationReader.getProperty("hr_username"));
            password.sendKeys(ConfigurationReader.getProperty("hr_password"));
            loginBtn.click();
        }
        if (userType.equals("marketing")){
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            username.sendKeys(ConfigurationReader.getProperty("marketing_username"));
            password.sendKeys(ConfigurationReader.getProperty("marketing_password"));
            loginBtn.click();
        }
        if (userType.equals("helpDesk")){
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            username.sendKeys(ConfigurationReader.getProperty("helpDesk_username"));
            password.sendKeys(ConfigurationReader.getProperty("helpDesk_password"));
            loginBtn.click();
        }
    }


}
