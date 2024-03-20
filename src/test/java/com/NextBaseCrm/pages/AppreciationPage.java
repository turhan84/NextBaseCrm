package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {
    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy()
    public WebElement a;

    @FindBy()
    public WebElement b;

    @FindBy()
    public WebElement c;


    @FindBy()
    public WebElement d;










}
