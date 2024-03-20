package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.LoginPage;
import com.NextBaseCrm.utilities.ConfigurationReader;
import com.NextBaseCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDefs {
    LoginPage login = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @Given("The login page is displayed")
    public void the_login_page_is_displayed() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("The user enters valid username {string} and password {string}")
    public void the_user_enters_valid_username_and_password(String username, String password) {

        login.username.sendKeys(username);
        login.password.sendKeys(password);

    }

    @When("The user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {

        login.loginBtn.click();

    }

    @Then("The user is redirected to the HR home page")
    public void the_user_is_redirected_to_the_hr_home_page() {

        String expectedInTitle = "Portal";
        String actualTitle = Driver.getDriver().getTitle();

        wait.until(ExpectedConditions.titleContains("Portal"));
        Assert.assertTrue("Title should contain 'Portal'", actualTitle.contains(expectedInTitle));

    }

    @Given("A Marketing user navigates to the login page")
    public void a_marketing_user_navigates_to_the_login_page() {

        String expectedInTitle = "Portal";
        String actualTitle = Driver.getDriver().getTitle();

        wait.until(ExpectedConditions.titleContains("Portal"));
        Assert.assertTrue("Title should contain 'Portal'", actualTitle.contains(expectedInTitle));

    }

    @Then("The user is redirected to the Marketing home page")
    public void the_user_is_redirected_to_the_marketing_home_page() {

        String expectedInTitle = "Portal";
        String actualTitle = Driver.getDriver().getTitle();

        wait.until(ExpectedConditions.titleContains("Portal"));
        Assert.assertTrue("Title should contain 'Portal'", actualTitle.contains(expectedInTitle));

    }

    @Then("The user is redirected to the Helpdesk home page")
    public void the_user_is_redirected_to_the_helpdesk_home_page() {

        String expectedInTitle = "Portal";
        String actualTitle = Driver.getDriver().getTitle();

        wait.until(ExpectedConditions.titleContains("Portal"));
        Assert.assertTrue("Title should contain 'Portal'", actualTitle.contains(expectedInTitle));

    }

    @When("The user enters an invalid username {string} and an invalid password {string}")
    public void the_user_enters_an_invalid_username_and_an_invalid_password(String invalidUserName, String invalidPassword) {

        login.username.sendKeys(ConfigurationReader.getProperty("invalidUsername"));
        login.password.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
        login.loginBtn.click();


    }

    @Then("An {string} error message is displayed")
    public void an_error_message_is_displayed(String expectedErrorMessage) {
        login.username.sendKeys(ConfigurationReader.getProperty("invalidUsername"));
        login.password.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
        login.loginBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("errortext")));
        String actualErrorMessage = login.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @When("The user enters a valid username {string} and an invalid password {string}")
    public void the_user_enters_a_valid_username_and_an_invalid_password(String userName, String password) {

        login.username.sendKeys(ConfigurationReader.getProperty("hr_username"));
        login.password.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
        login.loginBtn.click();

    }

    @When("The user attempts to login with an empty username or password")
    public void the_user_attempts_to_login_with_an_empty_username_or_password() {

        login.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        login.loginBtn.click();

    }

    @Then("A {string} error message is displayed for the empty field")
    public void a_error_message_is_displayed_for_the_empty_field(String expectedErrorMessage) {

        login.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        login.loginBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("errortext")));
        String actualErrorMessage = login.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @Then("The {string} option is visible and clickable")
    public void the_option_is_visible_and_clickable(String string) {

        login.checkbox.isDisplayed();

    }


    @Then("The password is displayed in bullet signs")
    public void the_password_is_displayed_in_bullet_signs() {

        WebElement passwordField = Driver.getDriver().findElement(By.cssSelector(".login-item input[type='password']"));
        String inputType = passwordField.getAttribute("type");
        Assert.assertEquals("password", inputType.toLowerCase());

    }


}
