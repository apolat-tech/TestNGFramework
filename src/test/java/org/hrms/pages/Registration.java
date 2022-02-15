package org.hrms.pages;

import org.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration extends CommonMethods {
    @FindBy(id = "account-menu")
    public WebElement SignInRegister;

    @FindBy (xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement register;

    @FindBy (id = "register-submit")
    public WebElement registerSubmit;


    public Registration(){
        PageFactory.initElements(driver,this);
    }
}
