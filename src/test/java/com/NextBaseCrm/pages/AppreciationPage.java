package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {
    public AppreciationPage(){
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

    @FindBy (xpath = "(//span[.='Appreciation'])[2]")
    public WebElement appreciationOption;

    @FindBy (css = "#bx-b-uploadfile-blogPostForm")
    public WebElement uploadButton;

    @FindBy (xpath = "(//*[.='Drag files here to upload'])[3]")
    public WebElement upload;

    @FindBy (xpath = "//span[@class='f-wrap']")
    public WebElement uploadedFileOrPicture;



public void navigateAprrecitionMpodule(){
    moreDropdown.click();
    appreciationOption.click();

}

public void clickUButton(String button) {
    if (button.equals("upload")) {
        uploadButton.click();
    }
}

public void uploadFileOrPictureIsUploaded(){

    String path = "C:\\Users\\bani_\\Desktop\\ca bone.txt";
    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(upload).perform();
   // upload.click();
    upload.sendKeys(path);
    BrowserUtils.sleep(5);
    Assert.assertTrue(uploadedFileOrPicture.isDisplayed());

}










}
