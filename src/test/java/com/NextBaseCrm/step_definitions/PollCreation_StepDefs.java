package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.ActivityStreamPage;
import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PollCreation_StepDefs {

    ActivityStreamPage streamPage = new ActivityStreamPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    int randomNumber = ThreadLocalRandom.current().nextInt(1, 999);

    String question = "";

    //B32G1-210_pollCreation.feature

    @Given("the user is logged in to the app as user {string}")
    public void the_user_is_logged_in_to_the_app_as_user(String userType) {

        streamPage.login(userType);
        wait.until(ExpectedConditions.titleContains("Portal"));

    }


    @When("the user navigates to the Poll tab under Activity Stream")
    public void the_user_navigates_to_the_poll_tab_under_activity_stream() {
        //  wait.until(ExpectedConditions.titleContains("Portal"));

        //make sure is on Activity Stream page
        streamPage.activityStreamBtn.click();

        //Click Poll Button
        streamPage.pollBtn.click();

        //   Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));

    }

    @Then("the default delivery option should be {string}")
    public void the_default_delivery_option_should_be(String expected) {

        if (streamPage.allEmployees.isDisplayed()) {
            Assert.assertEquals(expected, streamPage.allEmployees.getText());
        }

    }

    @When("the user creates a poll with title {string}, question {string}, and answers {string}, {string}, {string}")
    public void the_user_creates_a_poll_with_title_question_and_answers(String messageText, String questionText, String answerText_1, String answerText_2, String answerText_3) {


        Driver.getDriver().switchTo().frame(streamPage.iframe);
        streamPage.messageBox.sendKeys(messageText + " (" + randomNumber + ")");
        Driver.getDriver().switchTo().defaultContent();


        question = questionText + " (" + randomNumber + ")";
        streamPage.questionBox.sendKeys(question);

        streamPage.answerBox_1.sendKeys(answerText_1);
        streamPage.answerBox_2.sendKeys(answerText_2);
        streamPage.answerBox_3.sendKeys(answerText_3);


    }

    @When("the user submits the poll")
    public void the_user_submits_the_poll() {

        streamPage.submitPollBtn.click();
        BrowserUtils.waitForInvisibilityOf(streamPage.submitPollBtn);

    }

    @Then("the poll with question {string} should be visible in the Activity Stream")
    public void the_poll_with_question_should_be_visible_in_the_activity_stream(String expectedVisibleText) {
    expectedVisibleText = expectedVisibleText + " (" + randomNumber + ")";
        for (WebElement eachQuestion : streamPage.questions) {
            if (eachQuestion.getText().equals(expectedVisibleText)) {
                Assert.assertTrue(eachQuestion.isDisplayed());
            }
        }

    }

    @When("the user creates a poll with the {string} option enabled")
    public void the_user_creates_a_poll_with_the_option_enabled(String string) {

        Assert.assertTrue(streamPage.multipleChoiceChkBox.isEnabled());
        streamPage.multipleChoiceChkBox.click();

    }

    @Then("the poll should allow multiple selections")
    public void the_poll_should_allow_multiple_selections() {

        streamPage.check_poll_is_allow_multiple_selections();


    }


    @When("the user attempts to create a poll with {string} missing")
    public void the_user_attempts_to_create_a_poll_with_missing(String field) {

        switch (field) {
            case "message title":
                Driver.getDriver().switchTo().frame(streamPage.iframe);
                streamPage.messageBox.clear();
                Driver.getDriver().switchTo().defaultContent();
                break;
            case "recipient":
                streamPage.allEmployeesDelBtn.click();
                break;
            case "question text":
                streamPage.questionBox.clear();

                break;
            case "question answer":

                streamPage.answerBox_1.clear();
                streamPage.answerBox_2.clear();
                streamPage.answerBox_3.clear();
                break;

        }


    }

    @Then("the error message {string} should be displayed")
    public void the_error_message_should_be_displayed(String expectedErrorMessageText) {

        Assert.assertEquals(expectedErrorMessageText,streamPage.feedAddInfoText.getText());


    }

    @Then("the error message {string}...{string} should be displayed")
    public void the_error_message_should_be_displayed(String errorText_1, String errorText_2) {

        wait.until(ExpectedConditions.visibilityOf(streamPage.feedAddInfoText));

        String expectedErrorText = errorText_1 + "\"" + question + "\"" + errorText_2;

        Assert.assertEquals(expectedErrorText,streamPage.feedAddInfoText.getText());

    }


}
