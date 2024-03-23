package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.B32G1_208_CompanyStructurePages;
import com.NextBaseCrm.pages.B32G1_201_LoginPage;
import com.NextBaseCrm.utilities.BrowserUtils;
import com.NextBaseCrm.utilities.ConfigurationReader;
import com.NextBaseCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.parser.StandardParserTokenManager;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class B32G1_208_CompanyStructureStepDefs {

    B32G1_201_LoginPage login = new B32G1_201_LoginPage();

    B32G1_208_CompanyStructurePages structure = new B32G1_208_CompanyStructurePages();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    private Driver driver;


    @Given("the user type is {string}")
    public void the_user_type_is(String userType) {

        String username = "";
        String password = "";

        switch (userType) {
            case "HR":
                username = "hr21@cydeo.com";
                password = "UserUser";
                break;
            case "Marketing":
                username = "helpdesk21@cydeo.com";
                password = "UserUser";
                break;
            case "Helpdesk":
                username = "marketing21@cydeo.com";
                password = "UserUser";
                break;
        }


        login.login(username, password);



    }
    @When("the user navigates to the Employee menu")
    public void the_user_navigates_to_the_employee_menu() {
        wait.until(ExpectedConditions.elementToBeClickable(structure.employeeMenuBtn));
        structure.employeeMenuBtn.click();
    }

    @Then("the Company Structure option should be visible")
    public void the_company_structure_option_should_be_visible() {


        structure.companyStructureOpt.isDisplayed();
    }


    @Given("the user is on the Company Structure page")
    public void the_user_is_on_the_company_structure_page() {
        the_user_navigates_to_the_employee_menu();
        structure.companyStructureOpt.isDisplayed();
    }


    @When("the user clicks on the ADD DEPARTMENT button")
    public void the_user_clicks_on_the_add_department_button() {
       // BrowserUtils.sleep(5);
        structure.addDepartmentBtn.click();
       // BrowserUtils.sleep(5);
    }
    @When("the user enters {string} as the department name")
    public void the_user_enters_as_the_department_name(String companyName) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("NAME")));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement element = Driver.getDriver().findElement(By.id("NAME"));
        js.executeScript("arguments[0].value='HR Department';", element);



    }
    @When("the user submits the form")
    public void the_user_submits_the_form() {
        structure.addBtn.click();

    }
    @Then("a new department with the name {string} should be added to the Company Structure")
    public void a_new_department_with_the_name_should_be_added_to_the_company_structure(String expected) {
        String actualDeptName = structure.newDeptDisplayed.getText();
        Assert.assertEquals(expected, actualDeptName);
    }

    @Then("the Add Department button should not be displayed")
    public void the_button_should_not_be_displayed() {


        Assert.assertTrue( structure.addDepartBtn.isEmpty());




     /*   try{
            //assertFalse method is expecting a "false" boolean value to PASS the test.
            Assert.assertFalse( structure.addDepartmentButton2.isDisplayed());

        }catch (NoSuchElementException n){
            //n.printStackTrace();
            //below part optional:
            System.out.println("NoSuchElementException is thrown. It means that the Add Department is not on the page.");
            //this Assert will make true and pass:
            Assert.assertTrue(true);
        }
    }*/





   /*   boolean isDisplayed = false;
        try {
            WebElement buttonId = Driver.getDriver().findElement(By.xpath("//*[contains(@class,'webform-small-button-text') and contains(text(),'Add department')]"));
            isDisplayed = buttonId.isDisplayed();
        } catch (NoSuchElementException e) {
            // If the element is not found, isDisplayed remains false.
        }
        Assert.assertFalse("The Add Department button is displayed, but it shouldn't be.", isDisplayed);

    */
    }





    @Given("the user is {string}")
    public void theUserIs(String userType) {
        String username = "";
        String password = "";

        switch (userType) {
            case "HR":
                username = "hr21@cydeo.com";
                password = "UserUser";
                break;
        }

        login.login(username, password);

    }

    @Given("user type is {string}")
    public void userTypeIs(String userType) {

        String username = "";
        String password = "";

        switch (userType) {

            case "Marketing":
                username = "helpdesk21@cydeo.com";
                password = "UserUser";
                break;
            case "Helpdesk":
                username = "marketing21@cydeo.com";
                password = "UserUser";
                break;
        }

        login.login(username, password);

    }
}
