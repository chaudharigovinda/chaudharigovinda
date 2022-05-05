package testing;

import com.f1.bro;
import com.f1.readexcel;
import com.orm.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.orm.*;
public class logintest extends readexcel{
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
		//log1.login(readexcel.getStringCellData("tc1","username"),readexcel.getStringCellData("tc1","password"));
		if(new dashboard(driver).dashboardtext().isDisplayed()) {
			test.log(LogStatus.PASS, "user able to login");
		}else {
			test.log(LogStatus.FAIL, "user nat able to login");
		}
		
	}
	
	
	
	
	
	// below method is important for getting result html
	@AfterClass(alwaysRun = true)
	public static void endtest() {
		report.endTest(test);
		report.flush();
	}
		
		
	}
	




