package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.B32G1_201_LoginPage;
import com.NextBaseCrm.pages.B32G1_234_MyProfilePage;
import com.NextBaseCrm.pages.B32G1_234_PortalPage;
import com.NextBaseCrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class B32G1_234_MyProfileStepDefs {
    B32G1_234_PortalPage b32G1234PortalPage =new B32G1_234_PortalPage();
    B32G1_234_MyProfilePage b32G1234MyProfilePage =new B32G1_234_MyProfilePage();

    @When("the user logs in with {string} and {string}")
    public void theUserLogsInWithAnd(String username, String password) {

        new B32G1_201_LoginPage().login(username, password);
    }

    @Then("the user navigates to  My Profile on the user page")
    public void theUserNavigatesToTheMyProfilePage() {
       b32G1234PortalPage.userBlock.click();

    }

    @And("the user should see the following options")
    public void theUserShouldSeeTheFollowingOptions(List<String> expectedTopModules) {
       // BrowserUtils.waitForTitleContains("Dashboard");
        List<String> actualTopModules= new ArrayList<>();

        for (WebElement eachTopModule : b32G1234PortalPage.myProfileList) {
            actualTopModules.add(eachTopModule.getText());
        }
        BrowserUtils.sleep(5);
        Assert.assertEquals("failed",actualTopModules,expectedTopModules);

    }




    @Then("The user selects {string} tab from the list")
    public void theUserSelectsTabFromTheList(String myProfile) {
        b32G1234PortalPage.myProfileBtn.click();
        
    }
    @Then("the user's email should be displayed under the General tab")
    public void theUserSEmailShouldBeDisplayedUnderTheGeneralTab() {
        Assert.assertTrue(b32G1234MyProfilePage.userEmail.isDisplayed());


    }

    @And("the displayed email should match {string}")
    public void theDisplayedEmailShouldMatch(String username) {

        String actualEmailText = b32G1234MyProfilePage.userEmail.getText();
        Assert.assertEquals("failed email",actualEmailText,username);
    }

    @When("the user selects the General tab")
    public void theUserSelectsTheGeneralTab() {

            b32G1234MyProfilePage.generalBtn.click();
        }
    }

