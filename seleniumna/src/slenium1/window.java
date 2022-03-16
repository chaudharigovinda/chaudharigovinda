package slenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/browser-windows");
		
		//when we open window operating system generate id for that window
		//if we want to see this id we have on method in selenium is getwindowhandel methid
		System.out.println(driver.getWindowHandle());
		// if we have more window then we use getwindowhandels method and 
		
		// return type of getwindowhandles is set
		WebElement tab=driver.findElement(By.xpath("//button[@id='tabButton']"));
		tab.click();
		Set<String> obj=driver.getWindowHandles();// now it will print first website also again
		System.out.println(obj.size());
		Iterator<String> obj1=obj.iterator();
		while(obj1.hasNext()) {
			System.out.println(obj1.next().toString());
		}
		
		

	}

}
