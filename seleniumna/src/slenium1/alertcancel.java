package slenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertcancel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement cancel=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		System.out.println(cancel.getText());
		cancel.click();
		Alert obj=driver.switchTo().alert();
		Thread.sleep(200);
		System.out.println(obj.getText());
		obj.accept();
	}

}
