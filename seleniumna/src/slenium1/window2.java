package slenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/browser-windows");
		
		
		String a=driver.getWindowHandle();// it is because we compare ii with string below
		System.out.println(a);
		// if we have more window then we use getwindowhandels method and 
		
		// return type of getwindowhandles is set
		WebElement one=driver.findElement(By.id("tabButton"));// here we write without"//"
		one.click();
		Set<String> two=driver.getWindowHandles();
		System.out.println(two.size());
		
		Iterator<String> three=two.iterator();
		while(three.hasNext()) {
			String p=three.next().toString();
		
		 if(p.equalsIgnoreCase(a)) {
			 
			System.out.println("same window");
		}else {
			System.out.println("different window");
			driver.switchTo().window(p);// switch to method use for gect acess of window means it will perform the opreation of this window
			WebElement now=driver.findElement(By.tagName("h1"));  //it is locator of "This is a sample page"
			System.out.println(now.getText());
			
		}
		 
		}
		
	}

}
