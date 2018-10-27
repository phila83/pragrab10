package com.bulsoft.zoomautomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainNavigation {

    WebDriver driver;

    @FindBy(className = "top-contactsales")
    WebElement contactSalesLink;

    @FindBy(css = "li[class=signin]>a.link")
    WebElement singInLink;

    @FindBy(css = "#signupfree>a")
    WebElement singUpFreeBtn;

    public MainNavigation(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public ContactSalePage clickOnContactSalesLink(){
        this.contactSalesLink.click();
        return new ContactSalePage(driver);
    }

}
