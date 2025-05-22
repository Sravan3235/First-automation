
package Pageobjectclass;

import basepage.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Registration extends Basepage {



    // constructor
    public Registration(WebDriver driver)
    {
        super(driver);
    }
    //locators
    @FindBy(xpath ="//input[@id='input-firstname']")
    WebElement firstname;

    @FindBy (xpath = "//input[@id='input-lastname']")
    WebElement lastname;

    @FindBy(xpath ="//input[@id='input-email']")
    WebElement email;

    @FindBy(xpath ="//input[@id='input-telephone']")
    WebElement telephone;

    @FindBy(xpath ="//input[@id='input-password']")
    WebElement password;

    @FindBy(xpath ="//input[@id='input-confirm']")
    WebElement confirm;

    @FindBy(xpath ="//input[@name='agree']")
    WebElement agree;

    @FindBy(xpath ="//input[@type='submit']")
    WebElement Submit;







    //Methods

    public void  firstname()
    {
        firstname.sendKeys("sravan");
    }
    public void lastname()
    {
        lastname.sendKeys("reddy");
    }
    public void email()
    {
        email.sendKeys("psravan7989@gmail.com");
    }
    public void telephone()
    {
        telephone.sendKeys("9885103235");
    }
    public void password()
    {
        password.sendKeys("Sravan@3235");
    }
    public void confirm()
    {
        confirm.sendKeys("Sravan@3235");
    }
    public void Agree()
    {
        agree .click();
    }
    public void submit()
    {
        Submit .click();
    }

}


