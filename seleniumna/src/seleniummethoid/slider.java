package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/slider");
		Actions obj1=new Actions(obj);// actions is class so we create object of it
		WebElement a1=obj.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		int x=a1.getLocation().getX();
		int y=a1.getLocation().getY();
		obj1.clickAndHold(a1).moveByOffset(40, y).release().build().perform();// here we no need to give valu of y 
	}

}
