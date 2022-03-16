package seleniummethoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ckeckbox2 {
// AAPROCH 2-SELECTING HOME PAGE CHECKBOXIF NOT SELECTED AND READ THE RESULT
	// MEANS WE NOT USE CLICK METHOD
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/checkbox");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		WebElement home=obj.findElement(By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']"));// parent child relation
		// Above locator label is parent span is child tag
		// if check the home check box is not already selected then------it is condition we assumed
		if(!home.isSelected()) {// means we assumed  home ckeck box is not selected then ismethod result is false but we use ! so it means -
			//-homecheck box is not selected is not so it print result true
			home.click();
		}
		
		WebElement result=obj.findElement(By.xpath("//div[@id='result']")); // it is use to print result statment after check box click 
		System.out.println(result.getText()); // it is use to print result statment on console
		
		if (result.isDisplayed()) {// means is result display then print text
			System.out.println(result.getText());
		}
		
		
		
	}

}
