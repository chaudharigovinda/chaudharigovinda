package seleniummethoid;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/droppable");
		Actions obj1=new Actions(obj);
	WebElement source=obj.findElement(By.id("draggable"));// it is source which is element which have to drag
		WebElement targer=obj.findElement(By.id("droppable"));// it is target which is element in which we drag source elemet
	obj1.dragAndDrop(source, targer).perform();
	//threre are two method of synchronization-->1) implicite wait  2)explicite wait
	//synchronization means wait foe next step
	// below is implicite wait
	obj.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);// it is old version method
	obj.manage().timeouts().implicitlyWait(Duration.ofMillis(5));// it is current version method
	// below is explicite wait
	//WebDriverWait is class use foe explicite method
	WebDriverWait wait=new WebDriverWait(obj, Duration.ofMillis(6));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	// here ExpectedConditions is class which call elementToBeClickable which is static method
	//ExpectedCondition is interface
	}
	}



