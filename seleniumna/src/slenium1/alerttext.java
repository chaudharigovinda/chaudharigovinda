package slenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerttext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement obj=driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		obj.click();
		Alert obj1=driver.switchTo().alert();
		
		obj1.sendKeys("accept");
		Thread.sleep(5000);
		System.out.println(obj1.getText());
		obj1.accept();
		
		
		
		
	}

}
