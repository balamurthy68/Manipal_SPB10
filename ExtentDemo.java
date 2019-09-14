package code;

import java.util.NoSuchElementException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo {

static ExtentTest test;
static ExtentReports report;

@BeforeClass

public static void startTest()
{
   report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
   test = report.startTest("ExtentDemo");
   System.out.println (System.getProperty("user.dir"));
}
@Test
public void extentReportsDemo()
{
System.setProperty("webdriver.chrome.driver", "D:\\Seleniu\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in");
if(driver.getTitle().equals("Google"))
{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
}
else
{
	test.log(LogStatus.FAIL, "Test Failed");

}

try {
WebElement myelement = driver.findElement(By.name("xyz"));
}
catch (Exception NoSuchElementException)
{
	test.log(LogStatus.WARNING, "Cannot find the element by name xyz");
}
     

}
@AfterClass
public static void endTest()
{
	report.endTest(test);
	report.flush();
}
}