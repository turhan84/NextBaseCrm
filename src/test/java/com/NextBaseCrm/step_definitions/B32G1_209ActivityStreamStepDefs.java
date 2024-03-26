package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.B32G1_201_LoginPage;
import com.NextBaseCrm.pages.B32G1_209ActivityStreamPage;
import com.NextBaseCrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.NextBaseCrm.utilities.BrowserUtils.sleep;

public class B32G1_209ActivityStreamStepDefs {
    B32G1_201_LoginPage login = new B32G1_201_LoginPage();
    B32G1_209ActivityStreamPage activityStreamPage = new B32G1_209ActivityStreamPage();

    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        String username = "";
        String password = "";

        // | hr        |
        //      | helpdesk  |
        //      | marketing |

        switch (userType) {
            case "HR":
            case "hr":
                username = "hr21@cydeo.com";
                password = "UserUser";
                break;
            case "Helpdesk":
            case "helpdesk":
                username = "helpdesk21@cydeo.com";
                password = "UserUser";
                break;
            case "Marketing":
            case "marketing":
                username = "marketing21@cydeo.com";
                password = "UserUser";
                break;
        }

        login.login(username, password);
    }

    @When("user clicks {string}")
    public void user_clicks(String option) {

        activityStreamPage.selectOption(option);
        sleep(2);
    }

    @Then("user should be able to see the following options on the Activity Stream page")
    public void user_should_be_able_to_see_the_following_options_on_the_activity_stream_page(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.getElementsText(activityStreamPage.tabOptions);

        Assert.assertEquals(expectedOptions, actualOptions);


    }

    @When("user clicks {string} in activity stream")
    public void user_clicks_in_activity_stream(String activity) {

        activityStreamPage.selectActivity(activity);
    }

    @Then("user should be able to see the following options under more tab on the Activity Stream page")
    public void user_should_be_able_to_see_the_following_options_under_more_tab_on_the_activity_stream_page(List<String> expectedMoreOptions) {


        List<String> actualMoreOptions = activityStreamPage.getElementsAttribute("data-name", activityStreamPage.moreOptions);

        Assert.assertEquals(expectedMoreOptions, actualMoreOptions);
    }

}






