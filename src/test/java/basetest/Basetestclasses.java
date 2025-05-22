package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.Properties;
import static java.util.logging.LogManager.getLogManager;

public class Basetestclasses {

    public WebDriver driver;
    public Logger logger;
   public Properties propobject;
    @BeforeClass
    @Parameters( {"browser","testName"})
    public void setUp(String browserName, String testName) throws IOException {


       FileReader File=new FileReader(".//src//test//resources//conig.properties");
        propobject=new Properties();
        propobject.load(File);
        logger = LogManager.getLogger(this.getClass());
        switch (browserName.toUpperCase())
        {
            case "CHROME":
            driver = new ChromeDriver();
            break;
            case "EDGE":
            driver = new EdgeDriver();
             break;
        }

        driver.manage().deleteAllCookies();
       driver.get(propobject.getProperty("url"));
       driver.manage().window().maximize();


    }
    @AfterClass
    public void teardown()
    {
        driver.quit();
    }
}
