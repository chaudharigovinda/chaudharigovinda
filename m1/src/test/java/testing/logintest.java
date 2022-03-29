package testing;

import com.f1.bro;
import com.orm.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.orm.*;
public class logintest extends bro{
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass(alwaysRun = true)
	public static void result() {
		report=new ExtentReports("Result/Result.html",true);// it is common path name we have to write it
		
	}
	@Test(description = "verify login is succsesful with valid credential",priority = 1)
	public void tc1() {
		test=report.startTest("verify login is succsesful with valid credential");
		loginpage log1=new loginpage(driver);
		log1.login("Admin", "admin123");
		if(new dashboard(driver).dashboardtext().isDisplayed()) {
			test.log(LogStatus.PASS, "user able to login");
		}else {
			test.log(LogStatus.FAIL, "user nat able to login");
		}
	}
	
	@Test(description = "verify invalid credential messabe is display",priority = 2)
	public void tc2() {
		test=report.startTest("verify invalid credential messabe is display");
		loginpage log2=new loginpage(driver);
		log2.nologin("admine", "admin");
		if(log2.invalidmessage().isDisplayed()) {//if(log2.invalidmessage().isDisplayed()
			test.log(LogStatus.PASS, "user not able to login"+log2.invalidmessage().getText());// it is log method to get report
		}else {
			test.log(LogStatus.FAIL, "user is able to login");
		}
		
	}
	
		
	
	
	
	
	
	// below method is important for getting result html
	@AfterClass(alwaysRun = true)
	public static void endtest() {
		report.endTest(test);
		report.flush();
	}
		
		
	}
	




