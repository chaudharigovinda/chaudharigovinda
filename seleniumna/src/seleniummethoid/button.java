package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		//below is object creation
		//when you create object then browser automatically launch the web
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/buttons");// here webaddress should be  upto main module such as textbox is main module
		obj.manage().window().maximize();
		WebElement but=obj.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		but.click();
		
	}

}
