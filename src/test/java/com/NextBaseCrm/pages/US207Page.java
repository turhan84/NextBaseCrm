package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US207Page {

    public US207Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesLink;

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement>allTopModules;
}
