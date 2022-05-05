package com.abc.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
// in maven  we dont call main method when creating class
	// we create package and class in this folder-->src/main/java
	// in maven we creat file in this folder--->
	// here we have created file in src/main/resources to get common for all and 
	public static WebDriver driver; // we created this to get driver common to all
	public static Properties property;// it is for getting from Property prop=new Properties(); to common  for all test cases
	
	public void browser_initialozation() {
		//above  '_' this sign is impoartant
		ReadProperty();
		String browsername1=property.getProperty("browser"); //it is in file text
		
		if (browsername1.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");//chromedriver.exe path
			driver =new ChromeDriver();       // it was ChromeDriver obj=new ChromeDriver();--> here chromedrivwe is webdriver -
			                                     //-so to common webdriver to all we created this webdriver as -->public static WebDriver driver;
			// -it is because we can execute test case to any webdriver 
		}else if(browsername1.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "resourse path");
	         driver =new FirefoxDriver();   //it was  FirefoxDriver obj1=new FirefoxDriver();--> here FirefoxDriver is webdriver -
            //-so to common webdriver to all we created this webdriver as -->public static WebDriver driver;
			// -it is because we can execute test case to any webdriver 
			
		}else {
			System.setProperty("webdriver.edge.driver", "resourse path");
		driver =new EdgeDriver();   // it was EdgeDriver obj2=new EdgeDriver();--> here EdgeDriver is webdriver -
            //-so to common webdriver to all we created this webdriver as -->public static WebDriver driver;
			// -it is because we can execute test case to any webdriver 
			
		}
		driver.get(property.getProperty("url1")); // it is in file text
		
		
			}
		
		public static void ReadProperty() {
		// TODO Auto-generated method stub
		try {
			
			property=new Properties();
			property.load(new FileInputStream(".\\src\\main\\resources\\config.propertise"));//config.propertise path
			
		}catch(FileNotFoundException m){
			
		}catch(IOException n) {
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
