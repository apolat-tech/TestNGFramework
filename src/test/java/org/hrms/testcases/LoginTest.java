package org.hrms.testcases;

import org.hrms.pages.DashboardPage;
import org.hrms.pages.LoginPage;
import org.hrms.utils.CommonMethods;
import org.hrms.utils.ConfigsReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends CommonMethods {
    @Test(groups = "regression")
    public void adminLogin() {
        LoginPage login = new LoginPage();
        //login.signIn.click();
        //click(login.signIn);
        sendText(login.usernameBox, ConfigsReader.getPropertyValue("username"));
        sendText(login.passwordBox, ConfigsReader.getPropertyValue("password"));
        click(login.LoginButton);
        //validation
        DashboardPage dashboardPage = new DashboardPage();
        //Assert.assertTrue(dashboardPage.welcomeMessage);
    }

    @Test(dataProvider = "invalidData", groups = "regression")
    public void invalidLoginErrorMessageValidation(String username, String password, String message) {
        LoginPage loginPage = new LoginPage();
        sendText(loginPage.usernameBox, username);
        sendText(loginPage.passwordBox, password);
        click(loginPage.LoginButton);
        String actualError = loginPage.errorMsg.getText();
        Assert.assertEquals(actualError, message, "Error message text is not matched");
    }


    @DataProvider
    public Object[][] invalidData() {

        Object[][] data = {
                {"James", "123!", "Invalid Credentials"},
                {"Admin1", "Syntax123!", "Invalid Credentials"},
                {"James", "", "Password can not be empty"},
                {"", "Syntax123!", "Username can not be empty"}
        };
        return data;
    }


}

