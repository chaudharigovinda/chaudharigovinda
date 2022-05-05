package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// DROPPABLE 
		
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/droppable");
		Actions obj1=new Actions(obj);
/*	WebElement source=obj.findElement(By.id("draggable"));// it is source which is element which have to drag
		WebElement targer=obj.findElement(By.id("droppable"));// it is target which is element in which we drag source elemet
	obj1.dragAndDrop(source, targer).perform();
	WebElement source1=obj.findElement(By.id("acceptable"));// it is source which is element which have to drag
	WebElement targer1=obj.findElement(By.id("droppable"));
	WebElement source3=obj.findElement(By.id("notAcceptable"));
	*/
	Actions obj2=new Actions(obj);
	obj2.click(obj.findElement(By.id("droppableExample-tab-accept"))).perform();
	WebElement source1=obj.findElement(By.id("acceptable"));// it is source which is element which have to drag
WebElement source2=obj.findElement(By.id("dragBox"));
	WebElement targer1=obj.findElement(By.xpath("//div[@class=\"accept-drop-container\"]//div[@id=\"droppable\"]"));
	obj2.dragAndDrop(source2, targer1).perform();
	}

}

