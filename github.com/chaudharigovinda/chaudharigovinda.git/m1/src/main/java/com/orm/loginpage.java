package com.orm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage  {

	WebDriver driver; //lt is driver from->public static WebDriver driver;	from---> browser.java class
    @FindBy(id ="txtUsername" )
     WebElement username;
      @FindBy(id = "txtPassword")
 WebElement password;
	public loginpage(WebDriver driver) { // it is costructor of login1
		this. driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsernametext() {
		return username;
		//return driver.findElement(By.id("txtUsername"));// we wrte it as abve by using pagefactory and @findby anotation
	}
	public WebElement getpassword() {
		return password;
		//return driver.findElement(By.id("txtPassword"));
	}
	public WebElement getlogin() {
		return driver.findElement(By.id("btnLogin"));
	}
	public WebElement invalidmessage() {
		return driver.findElement(By.id("spanMessage"));
	}
		public void login(String username ,String password) {
			getUsernametext().sendKeys(username);
			getpassword().sendKeys(password);
			getlogin().click();
		}
		
		/*public  void nologin(String username,String password) {
			getUsernametext().sendKeys(username);
			getpassword().sendKeys(password);
			getlogin().click();
			System.out.println(invalidmessage().isDisplayed());
		}*/
}
