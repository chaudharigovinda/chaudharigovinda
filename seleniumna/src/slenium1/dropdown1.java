package slenium1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement obj=driver.findElement(By.id("oldSelectMenu"));
		Select obj1=new Select(obj); // select method use only if there is slelect method present in locator
		obj1.selectByIndex(2);
		//obj1.selectByValue();// valu given in html code
		//obj1.selectByVisibleText("yellow");
		//get all option--
		List<WebElement> obj2=obj1.getOptions();
		Iterator<WebElement> all=obj2.iterator();
		while(all.hasNext()) {
			System.out.println(all.next().getText());
		}
		if(obj1.getFirstSelectedOption().getText().equalsIgnoreCase("yellow")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
		
	}

}
