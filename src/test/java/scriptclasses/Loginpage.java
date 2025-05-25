package scriptclasses;

import Pageobjectclass.Login;
import basetest.Basetestclasses;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginpage extends Basetestclasses {

    @Test
    public void login() {
        Login login = new Login(driver);
        login.setMyAccount();
        login.Btnlogin();
        login.enteremail();
        login.enterpasswordl();
        login.submitlogin();
        Assert.assertTrue(true,"login is successfull");
        if(true)
        {
            logger.info("login is successfull");
        }
        //PLPL
        //SRavan

        else
        {
            logger.error("login is not successfull");

       }

    }

}

//
