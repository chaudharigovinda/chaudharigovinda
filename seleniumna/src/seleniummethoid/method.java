package seleniummethoid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
//below is object creation
//when you create object then browser automatically launch the web
ChromeDriver obj=new ChromeDriver();
obj.get("https://demoqa.com/text-box");// here webaddress should be  upto main module such as textbox is main module
obj.manage().window().maximize();
System.out.println(obj.getTitle());
//find the address and perform the operation
//enter the value of full name element which is x path or css
//adress of elementr is called as locator there are 8 types of locator adress finding
WebElement fullname =obj.findElement(By.xpath("//input[@placeholder='Full Name']"));// it is finding of adress 
//here //input[@placeholder="Full Name"] but we write it in eclips as //input[@placeholder='Full Name']
fullname.sendKeys("testing");// it is value entering.
WebElement email=obj.findElement(By.xpath("//input[@placeholder='name@example.com']"));
email.sendKeys("email@123");
//WebElement home=obj.findElement(By.cssSelector("span[class='rct-title']")); for this we have to replace webadress of check box in obj.get method
fullname.clear(); // this method clear the value
fullname.sendKeys("rename");
WebElement permanantadress=obj.findElement(By.cssSelector("textarea[placeholder='Current Address']")) ;
permanantadress.sendKeys("jhgf");

WebElement submit=obj.findElement(By.xpath("//iframe[@frameborder=\"0\"]")); // for submit first click on submit to inspect then it shou iframe 
                                                                //-so search bi iframe not button
submit.click();// if there is button then we use click method
//if there is error to find locator cosol also suggest locator in rroe line

}
}
