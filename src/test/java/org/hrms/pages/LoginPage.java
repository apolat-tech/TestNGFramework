package org.hrms.pages;

import org.hrms.utils.CommonMethods;
import org.hrms.utils.ConfigsReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signIn;
    @FindBy(xpath="//*[@id=\"username\"]")
    public WebElement usernameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement LoginButton;
    @FindBy(id="error")//attim bunu
    public WebElement errorMsg;


    //Constructors to initialize the variables
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void login(String username, String password){
        sendText(usernameBox, username);
        sendText(passwordBox, password);
        click(LoginButton);
    }

}
