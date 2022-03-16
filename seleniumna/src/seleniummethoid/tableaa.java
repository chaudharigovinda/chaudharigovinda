package seleniummethoid;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/webtables");
		List<WebElement> lln=obj.findElements(By.xpath("//div[text()='Gentry']"));
		
		WebElement nm=obj.findElement(By.xpath("//div[@class='action-buttons']/span[@class='mr-2']"));
		WebElement in=obj.findElement(By.xpath("//div[text()='Insurance']"));
		if(in.isDisplayed()) {
			nm.click();
		}
	
		WebElement to=obj.findElement(By.xpath("//div[@class='rt-tr -odd']/div[text()=10000]"));
		System.out.println(to.getText());
		}
		
	}


