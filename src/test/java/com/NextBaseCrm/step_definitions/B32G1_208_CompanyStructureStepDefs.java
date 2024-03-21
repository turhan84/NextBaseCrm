package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.B32G1_208_CompanyStructurePages;
import com.NextBaseCrm.pages.B32G1_201_LoginPage;
import com.NextBaseCrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B32G1_208_CompanyStructureStepDefs {

    B32G1_201_LoginPage login = new B32G1_201_LoginPage();

    B32G1_208_CompanyStructurePages structure = new B32G1_208_CompanyStructurePages();

    @Given("User is logged in")
    public void user_is_logged_in() {
        login.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
    }

    @When("the user navigates to the Employee menu")
    public void the_user_navigates_to_the_employee_menu() {
     structure.EmployeeBtn.click();
    }

    @Then("the Company Structure option should be visible")
    public void the_company_structure_option_should_be_visible() {
    structure.companyStructureOpt.isDisplayed();
    }

    @Given("the user type is {string}")
    public void the_user_type_is(String string) {

    }

    @Given("the user is on the Company Structure page")
    public void the_user_is_on_the_company_structure_page() {

    }

    @When("the user clicks on the ADD DEPARTMENT button")
    public void the_user_clicks_on_the_add_department_button() {

    }

    @When("the user enters {string} as the department name")
    public void the_user_enters_as_the_department_name(String string) {

    }

    @When("the user submits the form")
    public void the_user_submits_the_form() {

    }

    @Then("a new department with the name {string} should be added to the Company Structure")
    public void a_new_department_with_the_name_should_be_added_to_the_company_structure(String string) {

    }

    @Then("the {string} button should not be displayed")
    public void the_button_should_not_be_displayed(String string) {

    }



}
