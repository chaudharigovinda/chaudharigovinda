package scrolbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		//obj.get("https://opensource-demo.orangehrmlive.com/");
		obj.get("https://demoqa.com/text-box");
		
		//approch 1
		JavascriptExecutor scrol = (JavascriptExecutor) obj;// JavascriptExecutor is interface use for scrol up and down 
		//obj.executeScript("window.scrollBy(0,100)");// this is direct readymade cod for scrol 
		//(0,100)---> is x ,y .y is up and down,x is horizantal movement
		
		//approch 2--> scroll upto webelement--> hwwere we have takekn webelement submit
		WebElement submit=obj.findElement(By.id("submit"));
	//scrol.executeScript("arguments[0].scrollIntoView();", submit);// this is direct readymade cod for scrol 
	//arguments[0]---? it is always [0]
		
		scrol.executeScript("window.scrollTo(0,document.body.scrollHeight)");// this is direct readymade cod for scrol 
	// above code will scrroll upto whole height
		
	
	}

}
