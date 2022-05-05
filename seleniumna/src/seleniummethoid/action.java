package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Action is interface 
//Actions is class which has only one constructor and it is use for double click, right click and mouse right click
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/buttons");
	obj.navigate().refresh();
	obj.manage().window().maximize();
		Actions obj1=new Actions(obj);// actions is class so we create object of it
		obj1.doubleClick(obj.findElement(By.id("doubleClickBtn"))).perform(); // here use perform to operate
		obj1.contextClick(obj.findElement(By.id("rightClickBtn"))).perform();
	}

}
