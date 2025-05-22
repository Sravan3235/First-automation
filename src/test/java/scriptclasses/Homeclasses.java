package scriptclasses;

import Pageobjectclass.Homepage;
import Pageobjectclass.Registration;
import basetest.Basetestclasses;
import org.testng.annotations.Test;

public class Homeclasses extends Basetestclasses {

    @Test
    public void homepage()
    {
        Homepage homepage= new Homepage(driver);
        homepage.myaccount();
        homepage.Register();

        Registration registration =new Registration (driver);
        registration.firstname();
        registration.lastname();
        registration.email();
        registration.telephone();
        registration.password();
        registration.confirm();
        registration.Agree();
        registration.submit();
    }
}
