package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

    public MyProfilePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "General")
    public WebElement generalBtn;

    @FindBy(id="pagetitle")
    public WebElement userEmail;

}
