package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/radio-button");
		obj.manage().window().maximize();
		WebElement yb=obj.findElement(By.xpath("//label[@class='custom-control-label']"));
		
		yb.click();
		WebElement nb=obj.findElement(By.xpath("//label[@class='custom-control-label disabled']"));
	
		System.out.println(nb.isEnabled());
		if(!nb.isEnabled()) {// means nb is enable was false but due to ! these false statment become false means it will true condition
			System.out.println("no button is disable");
		}
		else {
			System.out.println("no button enable");
		}

		

	}

}
