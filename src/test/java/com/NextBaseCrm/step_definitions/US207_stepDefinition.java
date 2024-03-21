package com.NextBaseCrm.step_definitions;
import com.NextBaseCrm.pages.LoginPage;
import com.NextBaseCrm.pages.US207Page;
import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.ConfigurationReader;
import com.NextBaseCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US207_stepDefinition {



    LoginPage login = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    US207Page us207Page = new US207Page();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        login.login();
    }


    @When("user sees Employees option and click it.")
    public void user_sees_employees_option_and_click_it() {
        us207Page.employeesLink.click();
    }


    @Then("user sees the following modules")
    public void user_sees_the_following_modules(List<String> expectedOptions) {
      //  BrowserUtils.waitForTitleContains("Employees");
        List<String>actualOptions = new ArrayList<>();
        for(WebElement eachTopModule : us207Page.allTopModules){
            actualOptions.add(eachTopModule.getText());
            //eachTopModule.isDisplayed();
        }
        BrowserUtils.sleep(2);
        Assert.assertEquals(actualOptions,expectedOptions);
    }



    @Given("the user is logged in to the Employees Module")
    public void the_user_is_logged_in_to_the_employees_module() {

    }
    @When("the user clicks on the Employees Module")
    public void the_user_clicks_on_the_employees_module() {

    }
    @Then("the Company Structure view should be displayed by default")
    public void the_company_structure_view_should_be_displayed_by_default() {

    }

}

