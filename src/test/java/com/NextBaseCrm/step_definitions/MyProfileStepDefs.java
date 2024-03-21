package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.LoginPage;
import com.NextBaseCrm.pages.MyProfilePage;
import com.NextBaseCrm.pages.PortalPage;
import com.NextBaseCrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MyProfileStepDefs {
    PortalPage portalPage =new PortalPage();
    MyProfilePage myProfilePage=new MyProfilePage();

    @When("the user logs in with {string} and {string}")
    public void theUserLogsInWithAnd(String username, String password) {

        new LoginPage().login(username, password);
    }

    @Then("the user navigates to  My Profile on the user page")
    public void theUserNavigatesToTheMyProfilePage() {
       portalPage.userBlock.click();

    }

    @And("the user should see the following options")
    public void theUserShouldSeeTheFollowingOptions(List<String> expectedTopModules) {
       // BrowserUtils.waitForTitleContains("Dashboard");
        List<String> actualTopModules= new ArrayList<>();

        for (WebElement eachTopModule : portalPage.myProfileList) {
            actualTopModules.add(eachTopModule.getText());
        }
        BrowserUtils.sleep(5);
        Assert.assertEquals("failed",actualTopModules,expectedTopModules);

    }




    @Then("The user selects {string} tab from the list")
    public void theUserSelectsTabFromTheList(String myProfile) {
        portalPage.myProfileBtn.click();
        
    }
    @Then("the user's email should be displayed under the General tab")
    public void theUserSEmailShouldBeDisplayedUnderTheGeneralTab() {
        Assert.assertTrue(myProfilePage.userEmail.isDisplayed());


    }

    @And("the displayed email should match {string}")
    public void theDisplayedEmailShouldMatch(String username) {

        String actualEmailText = myProfilePage.userEmail.getText();
        Assert.assertEquals("failed email",actualEmailText,username);
    }

    @When("the user selects the General tab")
    public void theUserSelectsTheGeneralTab() {

            myProfilePage.generalBtn.click();
        }
    }

