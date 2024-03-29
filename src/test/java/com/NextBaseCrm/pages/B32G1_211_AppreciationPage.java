package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B32G1_211_AppreciationPage {
    public B32G1_211_AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreDropdown;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationLink;


    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement appreciationText;

    @FindBy(css = "button[id='blog-submit-button-save']")
    public WebElement sendBtn;


    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement allEmployees;

    @FindBy(css = "span[class='feed-add-post-del-but']")
    public WebElement allEmployeesCloseBtn;

    @FindBy(xpath = "//span[text()='Please specify at least one person.']")
    public WebElement errSpecify;

    @FindBy(xpath = "//span[text()='The message title is not specified']")
    public WebElement errMessage;


    @FindBy(css = "button[id='blog-submit-button-cancel']")
    public WebElement cancelBtn;



    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon ']//*[text()='Delete']")
    public WebElement deleteComment;


    @FindBy(xpath = "//div[@class='feed-post-title-block']//*[text()='marketing101@cydeo.com']")
    public WebElement checkComment;


    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[1]")
    public WebElement moreLink;









}
