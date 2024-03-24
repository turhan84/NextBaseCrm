package com.NextBaseCrm.step_definitions;

import com.NextBaseCrm.pages.B32G1_214Page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class B32G1_214_StepDefinition {
    B32G1_214Page mainPage=new B32G1_214Page();

    @When("user clicks on CRM24 Menu Button")
    public void user_clicks_on_crm24_menu_button() {

        mainPage.crm24MenuButton.click();

    }
    @Then("user verifies that company menu contains the options below")
    public void user_verifies_that_company_menu_contains_the_options_below(DataTable dataTable) {
        List<WebElement> companySubMenuItems = mainPage.CompanySubMenuItems;
        List<String> menuItemsFromFeatureFile = dataTable.column(0);
        for(int i=0; i<companySubMenuItems.size();i++){
            String CurrentMenuItemText = companySubMenuItems.get(i).getText();

            String CurrentFeatureFileTableText = menuItemsFromFeatureFile.get(i);
            Assert.assertEquals(CurrentMenuItemText,CurrentFeatureFileTableText);
            System.out.println("CurrentMenuItemText = " + CurrentMenuItemText);
            System.out.println("CurrentFeatureFileTableText = " + CurrentFeatureFileTableText);

        }

    }

}
