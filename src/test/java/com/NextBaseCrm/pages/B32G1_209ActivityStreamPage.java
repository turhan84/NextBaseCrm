package com.NextBaseCrm.pages;

import com.NextBaseCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class B32G1_209ActivityStreamPage extends BasePage{

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']/span/span[1]")
    public List<WebElement> tabOptions;
    public void selectActivity(String activity) {
        String locator = "(//div[@class='microblog-top-tabs-visible']//span[contains(.,'" + activity + "')])[1]";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
    public static List<String> getElementsAttribute(String attributeName, List<WebElement> moreOptions) {
        List<String> list=new ArrayList<>();

        for (WebElement moreOption : moreOptions) {
            list.add(moreOption.getAttribute(attributeName));

        }
        return list;
    }
    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']/span[@class='feed-add-post-form-link']")
    public List<WebElement> moreOptions;
}

