package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/tabs");
		obj.findElement(By.id("demo-tab-origin")).click();
		System.out.println(obj.findElement(By.id("demo-tabpane-origin")).getText());
		
		
	}

}
