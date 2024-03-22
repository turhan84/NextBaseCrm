package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B32G1_223_AppreciationPage {
    public B32G1_223_AppreciationPage(){
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














}
