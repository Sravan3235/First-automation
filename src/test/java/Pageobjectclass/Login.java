package Pageobjectclass;

import basepage.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Basepage {

    public Login(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='My Account']")
    WebElement MyAccount;

    @FindBy(xpath = "//a[text () ='Login']")
    WebElement btnlogin;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement  enteremail;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement  enterpasswordl;


    @FindBy(xpath = " //input[@type='submit']")
    WebElement  submitlogin;



    //methods

    public void setMyAccount()
    {
        MyAccount.click();
    }

    public void Btnlogin()
    {
        btnlogin.click();
    }

    public void enteremail()
        {
            enteremail.sendKeys("psravan7989@gmail.com");
        }

    public void enterpasswordl ()
    {
        enterpasswordl.sendKeys("Sravan@3235");
    }



    public void submitlogin()
    {
        submitlogin.click();
    }
}
