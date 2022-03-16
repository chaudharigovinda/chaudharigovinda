package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/menu");
		obj.manage().window().maximize();
		Actions act=new Actions(obj);
		
		act.clickAndHold(obj.findElement(By.xpath("//a[text()='Main Item 2']"))).perform();// here use perform to operate
		System.out.println(obj.findElement(By.xpath("//a[text()='Main Item 2']")).getText());
		
		act.clickAndHold(obj.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))).perform();// here use perform to operate
		act.click(obj.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))).perform();// here use perform to operate
		
		
		
		
		

	}

}
