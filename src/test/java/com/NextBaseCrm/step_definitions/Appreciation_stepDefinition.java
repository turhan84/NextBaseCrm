package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.ActivityStreamPage;
import com.NextBaseCrm.pages.AppreciationPage;
import com.NextBaseCrm.pages.B32G1_201_LoginPage;
import com.NextBaseCrm.pages.LogoutPage;
import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.ConfigurationReader;
import com.NextBaseCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Appreciation_stepDefinition {


    AppreciationPage appreciationPage=new AppreciationPage();


    @When("User is on the Activity Stream page as {string}")
    public void user_is_on_the_activity_stream_page_as(String userType) {
        new B32G1_201_LoginPage().logInAs(userType);
    }

    @When("user is on the Activity Stream page and navigates to the Appreciation module")
    public void user_is_on_the_activity_stream_page_and_navigates_to_the_appreciation_module() {
        new AppreciationPage().navigateAprrecitionMpodule();
    }

    @Then("user is able to see and clicks {string} files button")
    public void user_is_able_to_see_and_clicks_files_button(String upload) {

        appreciationPage.clickUButton(upload);
    }

    @Then("user is able to upload the file")
    public void user_is_able_to_upload_the_file() {
        appreciationPage.uploadFileOrPictureIsUploaded();
        new LogoutPage().logOut();
    }

    @Then("user is able to insert files into texting mode")
    public void user_is_able_to_insert_files_into_texting_mode() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user can see the file into the text")
    public void user_can_see_the_file_into_the_text() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user have inserted files and images into the text")
    public void user_have_inserted_files_and_images_into_the_text() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user is able to remove any file or picture before sending")
    public void user_is_able_to_remove_any_file_or_picture_before_sending() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
