package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B32G1_208_CompanyStructurePages {

    public B32G1_208_CompanyStructurePages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement EmployeeBtn;

    @FindBy(xpath= "(//a[@class='main-buttons-item-link'])[1]")
    public WebElement companyStructureOpt;




}
