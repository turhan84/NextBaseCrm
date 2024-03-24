package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B32G1_214Page {
    public B32G1_214Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="sitemap-menu")
    public WebElement crm24MenuButton;

    @FindBy(xpath = "//a[.='Company']//..//div//a")
    public List<WebElement> CompanySubMenuItems;




}
