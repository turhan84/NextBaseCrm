package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.B32G1_201_LoginPage;
import com.NextBaseCrm.pages.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutStepDefs {

    B32G1_201_LoginPage loginPage = new B32G1_201_LoginPage();
    LogoutPage logoutPage=new LogoutPage();
    @Given("the user is logged in to the app")
    public void theUserIsLoggedInToTheApp() {
      loginPage.login();

    }

    @When("the user can see logout button under the profile name.")
    public void theUserCanSeeLogoutButtonUnderTheProfileName() {
        logoutPage.profileName.click();

    }

    @Then("the user should click logout button")
    public void theUserShouldClickLogoutButton() {
        logoutPage.logoutButton.click();

    }
    @Then("verify user successfully logout")
    public void verifyUserSuccessfullyLogout() {

        String authPage=  logoutPage.loginPageAuth.getText();

        Assert.assertEquals("Authorization",authPage);
    }
}
