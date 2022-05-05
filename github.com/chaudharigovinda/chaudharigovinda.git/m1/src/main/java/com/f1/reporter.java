package com.f1;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;

public class reporter extends bro {
public static ExtentTest test;
public static String filepath;


	@BeforeTest(alwaysRun = true)
	public static void reporter() {
		Date now =new Date();// this will give current time in date aand time format
		String Timestamp=now.toString().replace(":", "-");// it is replace : with -
		File fi=new File("Result/"+Timestamp);// this will be folder path
		fi.mkdir();// it is java method which create new folder
	 filepath = fi.getPath();		
		
		report=new ExtentReports(fi.getPath()+"/Result.html",true);
		
	}
	public static void stattest(String testcase) {
		test=report.startTest("testcase");
	}
	public static void passtest(String teststep) {
		test.log(LogStatus .PASS, teststep);
	}
	
	@AfterTest(alwaysRun = true)
	public static void endtest() {
		
		System.out.println("after test");
		report.endTest(test);
		report.flush();
		
	}
}
