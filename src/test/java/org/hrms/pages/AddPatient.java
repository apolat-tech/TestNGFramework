package org.hrms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatient {
    @FindBy(xpath = "//*[@id=\"admin-menu\"]/a/span")
    public WebElement administrationLink;
    @FindBy(xpath = "//*[@id=\"admin-menu\"]/div/a/span")
    public WebElement userManagement;
    @FindBy(xpath = "//*[@id=\"user-management-page-heading\"]/a/span")
    public WebElement newUserButton;
    @FindBy(id="login")
    public WebElement loginTextBox;
    @FindBy(id="firstName")
    public WebElement firstNameTextBox;
    @FindBy(id="lastName")
    public WebElement lastNameTextBox;
    @FindBy(id="email")
    public WebElement emailTextBox;
    @FindBy(id="ssn")
    public WebElement ssnTextBox;
    @FindBy(xpath = "//*[@id=\"authorities\"]/option[3]")
    public WebElement profilesPatientTextBox;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;


   public AddPatient(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
