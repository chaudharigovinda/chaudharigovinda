package keys;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/");
		//there are two types of kys in actions cla ss-->keyup and keydown ,theses are types of key also
		WebElement un=obj.findElement(By.id("txtUsername"));
		WebElement pa=obj.findElement(By.id("txtPassword"));
		WebElement lo=obj.findElement(By.id("btnLogin"));
		un.sendKeys("Admin");// we have not comment it for use in approch2 and 3
		//pa.sendKeys("admin123"); // for performing actions class approch we have comment it
		//approch1)when we want to press key for enter then as follow
		//lo.sendKeys(Keys.ENTER);// for performing actions class approch we have comment it
		
		
		//approch2) use of actions class keys
		//there are two types of kys in actions cla ss-->keyup and keydown
		/*Actions obj1=new  Actions(obj);
		// we perform operation of key with actions class only ctrl,shift,alt
		 //for select we use cltr A, for copy cltr c, for past cltr v
		obj1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();// first we press key down "a" then for release we use keyup
		// here it will select lin no 23
		obj1.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();// first we press key down "c" then for release we use keyup
		// here it will copy lin no 23
		un.click();//or we can use pa.click();
     	obj1.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();// first we press key down "v" then for release we use keyup
     	// here it will past lin no 23 
     	 * .build().perform(); use because we hvae use more methods in actions class
		*/
     	
     	//approch3)use of sendkeys chord for cltrA,cltrC,cltrV
		
		
     	String select=Keys.chord(Keys.CONTROL, "a");// here it will select lin no 23
     	String copy =Keys.chord(Keys.CONTROL, "c");// here it will copy lin no 23
     	String past=Keys.chord(Keys.CONTROL,"v");// here it will past lin no 23
     	un.sendKeys(select);
     	un.sendKeys(copy);
     	pa.click();
     	pa.sendKeys(past);
     	
     	
     	
     	
     	
     	
		
		
	}

}
