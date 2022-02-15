package org.hrms.pages;

import org.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    //@FindBy (id="welcome")
    //WebElement welcomeMessage;
    public DashboardPage(){
        PageFactory.initElements(CommonMethods.driver,this);
    }
}
