package slenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement click=driver.findElement(By.xpath("//button[@id='alertButton']"));
		click.click();
		//after click pop up window opwe 
		//so we have to go alert method which is use for alert
		Alert obj=driver.switchTo().alert();
		//after alert window display  we have to do ok or cancel 
		
		Thread.sleep(5000);// it is use for guve some time for processing steps in militime
		obj.accept(); // it is method for press ok button on pop up window
		
		
	}

}
