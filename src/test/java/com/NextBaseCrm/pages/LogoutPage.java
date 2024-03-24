package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user-block")
    public WebElement profileName;

    @FindBy(xpath= "//span[text()='Log out']")
    public WebElement logoutButton;


  @FindBy(xpath= "//*[@id=\"login-popup\"]/div[1]")
   public WebElement loginPageAuth;



  public void logOut(){
      profileName.click();
      logoutButton.click();
  }



}


