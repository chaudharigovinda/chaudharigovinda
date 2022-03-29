package com.f1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class bro {
	
	public static WebDriver driver;
	public static Properties property;
	public static ExtentReports report;// for that we have to add extend reprorts java file in pom.xml file in dependency from net
	@BeforeSuite // it is because it will run first means browser open first
	public void browser_initia() {
		ReadProperty();
		String browser = property.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System .setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		driver.get(property.getProperty("url"));
	}

	public static  void ReadProperty() {
		// TODO Auto-generated method stub
		try {
			property =new Properties();
			property.load(new FileInputStream(".\\src\\main\\resources\\prop.pro"));
		}catch(FileNotFoundException m) {}
		catch(IOException n) {}
	}
	@AfterSuite(alwaysRun=true)
	public void teardown() {
		driver.quit();
	}

}
