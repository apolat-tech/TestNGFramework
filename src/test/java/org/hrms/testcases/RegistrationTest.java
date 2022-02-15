package org.hrms.testcases;

import org.hrms.pages.Registration;
import org.hrms.utils.CommonMethods;
import org.testng.annotations.Test;

public class RegistrationTest extends CommonMethods {
    @Test(groups = "smoke")
    public void registration() throws InterruptedException {
        Registration registration = new Registration();
        //registration.SignInRegister.click();
        //click(registration.SignInRegister);
        jsClick(registration.register);
        Thread.sleep(2000);
        jsClick(registration.registerSubmit);



    }
}
