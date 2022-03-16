package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/dragabble");
		Actions obj1=new Actions(obj);// actions is class so we create object of it
		WebElement source=obj.findElement(By.id("dragBox"));
		int x=source.getLocation().getX();
		int y=source.getLocation().getY();
		obj1.dragAndDropBy(source, 10, 20).perform();
		
		// or we can move as below without do above int x=source.getLocation().getX();
		//-int y=source.getLocation().getY();
		//-obj1.dragAndDropBy(source, 10, 20).perform();
		obj1.moveToElement(source).dragAndDropBy(source, 100, 50).build().perform();
		WebElement s1=obj.findElement(By.id("draggableExample-tab-axisRestriction"));
		s1.click();
		
		
	}

}
