

package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager  implements ITestListener {
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extentReports;
    public ExtentTest test;
    public String reportName;

    public void onStart(ITestContext testContext) {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        reportName = "Automation TestReport" + timeStamp + ".html";
        sparkReporter =new ExtentSparkReporter(".\\reports\\"+reportName);
        sparkReporter.config().setDocumentTitle("Amazon Automation Test Report");
        sparkReporter.config().setReportName("Amazon Regression Testing");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
        extentReports.setSystemInfo("Host Name", "localhost");
        extentReports.setSystemInfo("Application Name","OpenCart");
        extentReports.setSystemInfo("Environment","Test");
        String browserName = testContext.getCurrentXmlTest().getParameter("browser");
        extentReports.setSystemInfo("browser", browserName);


    }

    // Teat001_VerifySwctionsinLandingPage()
    public void onTestSuccess(ITestResult result){

        test = extentReports.createTest(result.getMethod().getMethodName());
        test.log(Status.PASS, "Test Case Passed is "+result.getName());

    }

    public void onTestFailure(ITestResult result){
        test = extentReports.createTest(result.getMethod().getMethodName());
        test.log(Status.FAIL, "Test Case Failed is "+result.getName());
        test.log(Status.INFO, "Test Case Failed is "+result.getThrowable());
        //take screenshot
    }

    public void onTestSkipped(ITestResult result){
        test = extentReports.createTest(result.getMethod().getMethodName());
        test.log(Status.SKIP, "Test Case Skipped is "+result.getName());
        test.log(Status.INFO, "Test Case Skipped is "+result.getThrowable());
    }

    public void OnFinish(ITestContext testContext){

        extentReports.flush();
    }
}