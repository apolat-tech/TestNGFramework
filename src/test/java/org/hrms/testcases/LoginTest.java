package org.hrms.testcases;

import org.hrms.pages.LoginPage;
import org.hrms.utils.CommonMethods;
import org.hrms.utils.ConfigsReader;
import org.testng.annotations.Test;

public class LoginTest extends CommonMethods {
    @Test
    public void adminLogin() {
        LoginPage login = new LoginPage();
        //login.signIn.click();
        //click(login.signIn);
        sendText(login.username, ConfigsReader.getPropertyValue("username"));
        sendText(login.passwordBox, ConfigsReader.getPropertyValue("password"));
        click(login.LoginButton);
        
    }


}
