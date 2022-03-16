package slenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("http://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame("content");// we have use attribute in frame tag in html tag and it i name attribut 
		//for frame activation we use switch .iframe maethod and always take attribute in frame tag
		WebElement tag=driver.findElement(By.tagName("h1")); //tag name element write directly without'//"
				//above element is sub tag of frame tag 
		System.out.println(tag.getText());
		
	}

}
