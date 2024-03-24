package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.ConfigurationReader;
import com.NextBaseCrm.utilities.Driver;
import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.SortedMap;
import java.util.stream.Stream;

public class ActivityStreamPage {

    public ActivityStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Activity Stream")
    public WebElement activityStreamBtn;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollBtn;

    @FindBy(tagName = "body")
    public WebElement messageBox;
    @FindBy(id = "question_0")
    public WebElement questionBox;


    @FindBy(id = "answer_0__0_")
    public WebElement answerBox_1;
    @FindBy(id = "answer_0__1_")
    public WebElement answerBox_2;
    @FindBy(id = "answer_0__2_")
    public WebElement answerBox_3;
    @FindBy(id = "answer_0__3_")
    public WebElement answerBox_4;
    @FindBy(id = "answer_0__4_")
    public WebElement answerBox_5;
    @FindBy(id = "answer_0__5_")
    public WebElement answerBox_6;
    @FindBy(id = "answer_0__6_")
    public WebElement answerBox_7;
    @FindBy(id = "answer_0__7_")
    public WebElement answerBox_8;


    @FindBy(id = "blog-submit-button-save")
    public WebElement submitPollBtn;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelBtn;


    @FindBy(className = "bx-editor-iframe")
    public WebElement iframe;

    @FindBy(id = "blogPostForm")
    public WebElement blogPostFormBox;

    @FindBy(xpath = "//span[text()='Send message …']")
    public WebElement sendMessageText;

    @FindBy(css = "div[id^='blg-post']")
    public WebElement pollFoundID;


    @FindBy(css = "span[data-id='UA']")
    public WebElement allEmployees;

    @FindBy(css = "span[data-id='UA']>span[class='feed-add-post-del-but']")
    public WebElement allEmployeesDelBtn;


    @FindBy(xpath = "(//li[starts-with(@id, 'question')])[1]//div[@class='bx-vote-question-title']")
    public WebElement lastQuestionBox;


    @FindBy(xpath = "//li[starts-with(@id, 'question')]//div[@class='bx-vote-question-title']")
    public List<WebElement> questions;


    @FindBy(css = "div[id^='blg-post']")
    public List<WebElement> elements;


    @FindBy(className = "feed-add-info-text")
    public WebElement feedAddInfoText;

    @FindBy(id = "multi_0")
    public WebElement multipleChoiceChkBox;

    @FindBy(xpath = "(//div[starts-with(@id, 'blg-post')])[1]//span[@class='bx-vote-block-inp-substitute']")
    public List<WebElement> checkBoxesBtn;

    @FindBy(xpath = "(//div[starts-with(@id, 'blg-post')])[1]//input[starts-with(@id,'vote_checkbox')]")
    public List<WebElement> checkBoxesBtnCheckOpt;

    ////input[starts-with(@id,'vote_checkbox')]

    @FindBy(xpath = "(//div[starts-with(@id, 'blg-post')])[1]//button[text()='Vote']")
    public WebElement voteBtn;

    public void check_poll_is_allow_multiple_selections() {

//  (//div[starts-with(@id, 'blg-post')])[1]//label[@class='bx-vote-block-input-wrap-inner']
/*
        for (WebElement eachCheckBox : checkBoxesBtn) {
            eachCheckBox.click();
            System.out.println("eachCheckBox.getAttribute = " + eachCheckBox.getTagName());
        }
*/


        if (checkBoxesBtnCheckOpt.isEmpty()) {
            Assert.assertTrue(checkBoxesBtnCheckOpt.size() != 0 );
        } else {
            Assert.assertTrue(checkBoxesBtnCheckOpt.size() > 0);
        }


    }


}
