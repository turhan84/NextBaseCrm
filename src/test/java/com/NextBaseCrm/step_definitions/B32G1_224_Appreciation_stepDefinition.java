package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.B32G1_224_AppreciationPage;
import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class B32G1_224_Appreciation_stepDefinition {


    B32G1_224_AppreciationPage appreciationPage = new B32G1_224_AppreciationPage();

    @Given("user is on the Appreciation page")
    public void user_is_on_the_appreciation_page() {
        Driver.getDriver().get("https://login1.nextbasecrm.com/");

//----------------------Authorization--------------------------------
        Driver.getDriver().findElement(By.name("USER_LOGIN"))
                .sendKeys("marketing101@cydeo.com");
        Driver.getDriver().findElement(By.name("USER_PASSWORD"))
                .sendKeys("UserUser");
        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();

        appreciationPage.moreDropdown.click();
        appreciationPage.appreciationLink.click();

    }

    //-----------------------All Employees by default----------------------------
    @Then("user should verify the delivery is All employees by default")
    public void user_should_verify_the_delivery_is_all_employees_by_default() {
        Assert.assertTrue(appreciationPage.allEmployees.isDisplayed());
    }

    //----------------------Error messages--------------------------------------
    @When("user should to see Error messages for mandatory fields {string} and {string}")
    public void user_should_to_see_error_messages_for_mandatory_fields_and(String ErrMessageTitle, String ErrSpecifyPerson) {
        appreciationPage.allEmployeesCloseBtn.click();
        appreciationPage.sendBtn.click();

        Assert.assertEquals(ErrSpecifyPerson,appreciationPage.errSpecify.getText());

        appreciationPage.sendBtn.click();

        Assert.assertEquals(ErrMessageTitle,appreciationPage.errMessage.getText());


    }


    @When("user can send an appreciation by filling in the mandatory fields")
    public void user_can_send_an_appreciation_by_filling_in_the_mandatory_fields() {
        WebElement iframe = Driver.getDriver().findElement(By.className("bx-editor-iframe"));
        Driver.getDriver().switchTo().frame(iframe);

        appreciationPage.appreciationText.sendKeys("Hello");
        Driver.getDriver().switchTo().parentFrame();
        appreciationPage.sendBtn.click();

        BrowserUtils.sleep(1);

    }

    @When("user should to see Mandatory fields: Message content & To")
    public void user_should_to_see_mandatory_fields_message_content_to() {

    }


    @Then("verify that the user can cancel sending appreciation at any time before sending")
    public void verify_that_the_user_can_cancel_sending_appreciation_at_any_time_before_sending() {

    }
}
