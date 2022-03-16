package slenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/nestedframes");
		WebElement org=driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(org);
		driver.switchTo().frame(0);
		
	
//WebElement org2=driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(org.getText());
		driver.switchTo().parentFrame();
		System.out.println(driver.getPageSource());
		driver.switchTo().defaultContent();
	}

}
