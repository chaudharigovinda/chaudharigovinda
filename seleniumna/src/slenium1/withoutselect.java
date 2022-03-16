package slenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://demoqa.com/select-menu");
		// below we have not use webelement word so we can call click method directly
	driver.findElement(By.xpath("//div[@class=\" css-2b097c-container\"]//div[@class=\" css-tlfecz-indicatorContainer\"]")).click();
	//above first loctor is whole select box id and after"//" locator is arow box loactor in select box it is not the arow locator 
	//above element is parent child relation but parent is not close previous element is is long distance previous elementin html so 
	//-we have taken // line we can take / line if parent eleemnt is close previous in html
	// we have taken this parentchild relation because after every refresh the arow box class atributre get changes 
	//-so to fix it we have use this relation so we can write child locator as like in contain method //div[contains(@class,"-indicatorContainer")]
	// -above we have remove changing value from this attribute value
	driver.findElement(By.id("react-select-2-option-0-0")).click(); // it is id of after select expand then those  option id 
	
	}

}
