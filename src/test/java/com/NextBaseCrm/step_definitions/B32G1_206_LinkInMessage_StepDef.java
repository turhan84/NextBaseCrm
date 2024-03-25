package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.B32G1_206_LinkInMessagePage;
import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class B32G1_206_LinkInMessage_StepDef {
    B32G1_206_LinkInMessagePage linkInMessagePage = new B32G1_206_LinkInMessagePage();

    @When("user clicks the message section")
    public void user_clicks_the_message_section() {
        linkInMessagePage.messageSection.click();
    }

    @Then("user should be able to click the link button")
    public void user_should_be_able_to_click_the_link_button() {
        linkInMessagePage.linkBtn.click();
    }

    @Then("user should be able to fill {string} and {string} section")
    public void user_should_be_able_to_fill_and_section(String text, String link) {
        linkInMessagePage.textBox.sendKeys(text);
        linkInMessagePage.linkBox.sendKeys(link);
    }

    @Then("user should be able to click save button")
    public void user_should_be_able_to_click_save_button() {
        linkInMessagePage.saveBtn.click();
    }

    @Then("user clicks send button")
    public void user_clicks_send_button() {
        linkInMessagePage.sendBtn.click();
        BrowserUtils.sleep(1);
    }

    @When("user clicks the text")
    public void userClicksTheText() {
        BrowserUtils.sleep(1);

        linkInMessagePage.textLink.click();

    }


    @Then("user should navigate to the correct {string}")
    public void user_should_navigate_to_the_correct(String text) {
        BrowserUtils.sleep(2);
        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);

        }
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.contains(text));

    }


    @And("verify the link opened in a new tab {string}")
    public void verifyTheLinkOpenedInANewTab(String text) {
        Set<String> browserTabs = Driver.getDriver().getWindowHandles();
        for (String each : browserTabs) {

            Driver.getDriver().switchTo().window(each);
            System.out.println(each);

            if (Driver.getDriver().getCurrentUrl().contains(text)){
                break;

            }
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

        }
        BrowserUtils.sleep(3);



    }
}
