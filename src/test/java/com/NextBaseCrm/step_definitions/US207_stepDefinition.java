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

        }
        BrowserUtils.sleep(2);
        Assert.assertEquals(actualOptions,expectedOptions);
    }

    @Then("user sees the Company Structure should be displayed by default")
    public void userSeesTheCompanyStructureShouldBeDisplayedByDefault() {

        us207Page.companyStructure.isDisplayed();
    }
}

