package seleniummethoid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//APPROCH 3- WHAT HAPPEN IF CHECK BOX IS NOT SELECTED THEN WHAT HAPPEN
		// here we use webelements not webelement
		//returntype of webelemnets is listwebelement
		// we use webelements for to not get nosuchelement exception means by using this we dont get any exception whether is no element found
		// means we can execute programme whether there is any exception
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
		
		// 
	List<WebElement> result = obj .findElements(By.xpath("//label[@for='tree-node-home']/span[@class='rct-title']"));
		if(result.size()>0) {// here we use webelements means there are more element than 1
			//so the indexing of  webelements start from 0 so result.size()>0) means elements greater more than 1
			
			System.out.println(result.get(0).getText());
		}
		
		
		
		
	}

}
