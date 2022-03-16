package orm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
ChromeDriver obj=new ChromeDriver();
obj.get("https://opensource-demo.orangehrmlive.com/");
System.out.println(obj.getTitle());
WebElement obj1=obj.findElement(By.id("txtUsername"));
WebElement obj2=obj.findElement(By.id("txtPassword"));
obj1.sendKeys("Admin");
obj2.sendKeys("admin123");
WebElement obj3=obj.findElement(By.id("btnLogin"));
obj3.click();
WebElement obj4=obj.findElement(By.tagName("h1"));
System.out.println(obj4.getText());
WebElement obj5=obj.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
obj5.click();
	}

}
