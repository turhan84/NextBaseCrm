package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B32G1_208_CompanyStructurePages {

    public B32G1_208_CompanyStructurePages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Employees")
    public WebElement employeeMenuBtn;

   // @FindBy(xpath = "//div[@id='top_menu_id_company_3271504278']//a[contains(@href, '/company/vis_structure.php')]")

    @FindBy(xpath = "//a[contains(text(), 'Company Structure')]")
    public WebElement companyStructureOpt;

    @FindBy(xpath = "//div[@id='pagetitle-menu']//a[@href='javascript:void(0)']")

    public WebElement addDepartmentBtn;


    @FindBy(xpath = "//div[@id='pagetitle-menu']//a[@href='javascript:void(0)']")
    public List<WebElement> addDepartBtn;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement DepartmentNameBox;

    @FindBy(css = ".popup-window-button.popup-window-button-accept")
    public WebElement addBtn;

    @FindBy(xpath = "//a[@title='HR Department']")
    public WebElement newDeptDisplayed;

    @FindBy(id = "user-block")
    public WebElement userID;

    /*@FindBy(xpath = "//a[@class='webform-small-button webform-small-button-blue webform-small-button-add']")
    public WebElement addDepartmentButton2; */



}
