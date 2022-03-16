package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/tool-tips");
		Actions act=new Actions(obj);
		act.clickAndHold(obj.findElement(By.id("toolTipButton"))).perform();// here use perform to operate
		Thread.sleep(1000);
		System.out.println(obj.findElement(By.xpath("//div[@class='tooltip-inner']")).getText());
		
	}

}
