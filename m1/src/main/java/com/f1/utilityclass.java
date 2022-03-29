package com.f1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class utilityclass extends reporter {

	
	public static String captureScreen(){
		
		// convert webdriver object to takescreenshort
		String datename=new SimpleDateFormat("yymmddhhmmss").format( new Date());
		TakesScreenshot scr=((TakesScreenshot)driver);
		//call get screen short method to creat image file
		File scrFile=scr.getScreenshotAs(OutputType.FILE);
		String destination=filepath+"/"+datename+".png";
		System.out.println("filepath"+filepath);
		System.out.println("destination"+destination);
		File destfile =new File(destination);
		try {
			FileUtils.copyFile(scrFile, destfile);
		}catch(IOException m) {
			m.printStackTrace();
		}
		
		
	}	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
}
