package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionresizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/resizable");
		Actions obj1=new Actions(obj);// actions is class so we create object of it
		WebElement a=obj.findElement(By.id("resizableBoxWithRestriction"));
		obj1.clickAndHold(a).moveByOffset(200, 300).release().build().perform();
		// above first we have to clickand hold the cursor of bottom of window which hs to expand then give dimention by move method then relese it
	}

}
