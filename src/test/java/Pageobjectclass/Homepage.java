package Pageobjectclass;

import basepage.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Homepage extends Basepage {
    // constructor
    public Homepage(WebDriver driver) {
        super(driver);
    }

    //locators
    @FindBy(xpath = "//a[@title='My Account']")
    WebElement MyAccount;

    @FindBy(xpath = "//a[text () ='Register']")
    WebElement Register;


    //Methods

    public void myaccount() {
        MyAccount.click();
    }

    public void Register() {
        Register.click();
    }
}


