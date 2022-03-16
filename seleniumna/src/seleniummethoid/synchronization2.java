package seleniummethoid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/dynamic-properties"); //it is dynamic property element web
		WebDriverWait obj1=new WebDriverWait(obj, Duration.ofMillis(6));
		obj1.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
		//elementToBeClickable here we have use this method because we have to click after 6 second
		//ExpectedConditions class has such type of methods to perfor various operation
		obj.findElement(By.id("enableAfter")).click();
		
	}

}
