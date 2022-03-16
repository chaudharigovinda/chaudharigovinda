package slenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("http://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().defaultContent();
		WebElement org=driver.findElement(By.xpath("//frame[@name='navbar']"));
				//here above we can use this tag //a[@target="_top"] also but it give three locator so we choose its parent tag
		driver.switchTo().frame(org);	// or we can write as .frame("navbar") navbar is name attribute value
		WebElement noframe=driver.findElement(By.xpath("//a[text()='No frames']"));
		System.out.println(noframe.getText());
	}

}
