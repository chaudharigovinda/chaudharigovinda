package slenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/select-menu");
		Select obj=new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		obj.selectByIndex(0);
		obj.selectByIndex(1);
		System.out.println(obj.isMultiple());
	}

}
