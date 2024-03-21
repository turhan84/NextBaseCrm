package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PortalPage {
    public PortalPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "#user-block")
    public WebElement userBlock;

    @FindBy(xpath ="//span[@class='menu-popup-item-text']")
    public List<WebElement> myProfileList;

    @FindBy(linkText ="My Profile")
    public WebElement myProfileBtn;
}