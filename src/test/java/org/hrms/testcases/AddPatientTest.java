package org.hrms.testcases;

import org.hrms.pages.AddPatient;
import org.hrms.pages.LoginPage;
import org.hrms.utils.CommonMethods;
import org.hrms.utils.ConfigsReader;
import org.testng.annotations.Test;

public class AddPatientTest extends CommonMethods {
    @Test(groups = "regression")
    public void addPatient() throws InterruptedException {
        //Login to Medunna
        LoginPage login = new LoginPage();
        login.login(ConfigsReader.getPropertyValue("username"), ConfigsReader.getPropertyValue("password"));
        //Navigate to add user page
        AddPatient addPatient = new AddPatient(driver);
        addPatient.administrationLink.click();
        addPatient.userManagement.click();
        click(addPatient.newUserButton);
        //add patient
        sendText(addPatient.loginTextBox, "email@email.com");
        sendText(addPatient.firstNameTextBox, "John");
        sendText(addPatient.lastNameTextBox, "Doe");

        sendText(addPatient.ssnTextBox, "333-33-3333");
        addPatient.profilesPatientTextBox.click();
        sendText(addPatient.emailTextBox, "email@email.com");
        //Thread.sleep(2000);
        jsClick(addPatient.saveButton);
        //click(addPatient.saveButton);
        //addPatient.saveButton.click();
        //Thread.sleep(2000);

        //validation

        //assertion


    }
    @Test
    public void addMultiplePatients(){


    }
}
