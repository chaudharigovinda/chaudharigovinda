package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ckeckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/checkbox");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		WebElement home=obj.findElement(By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']"));// parent child relation
		//label is parent span is child tag
		home.click();
		WebElement result=obj.findElement(By.xpath("//div[@id='result']")); // it is use to print result statment after check box click 
		System.out.println(result.getText()); // it is use to print result statment on console
		
		
		

	}

}
