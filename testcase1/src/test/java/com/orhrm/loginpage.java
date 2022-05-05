package com.orhrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abc.common.browser;
import com.ormproject.dashboard;
import com.ormproject.login1;
import com.ormproject.mainmenu;

public class loginpage extends browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
browser bro=new browser();
bro.browser_initialozation();
loginpage log=new loginpage();
//login1 obj=new login1();// it is class of com.ormproject--->  login1 class
//log.login_insuusessful1("admin","admine");// it is ->String username, String pasword)
log.Login_Sucsessful("Admin","admin123")  ;// it is-->String username, String pasword)
	}

public void Login_Sucsessful(String username, String password) throws InterruptedException {
		// TODO Auto-generated method stub
	//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//driver.findElement(By.id("btnLogin")).click();
	
	// above all three drivers we have called as return in login1
	//so to call methods in login1 we will creat login1 object in this method because this method is Login_Sucsessful method
login1 obj=new login1(driver);// we have created constuctor of this method so (driver) called here
obj.getUsernametext().sendKeys("Admin");
obj.getpassword().sendKeys("admin123");
obj.getlogin().click();
dashboard obj1=new dashboard(driver);// object od dashboard class

WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
wait.until(new ExpectedCondition<Boolean>() {

	public Boolean apply(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.tagName("h1")).isDisplayed();
	}
});
mainmenu main=new mainmenu(driver);
main.main().click();
main.edit().click();

	if(obj1.dashboardtext().isDisplayed()) {
		System.out.println("able to login");
	}else {
		System.out.println("not abl eto login");
	}
		}
 //or run blelow we have to change in username and passwoed in loginpage log=new loginpage(); above
/*public void login_insuusessful1(String username, String pasword) {
	// TODO Auto-generated method stub
	login1 obj=new login1(driver);// we have created constuctor of this method so (driver) called here
	obj.getUsernametext().sendKeys(username);
	obj.getpassword().sendKeys(pasword);
	obj.getlogin().click();
	if(obj.invalidmessage().isDisplayed()) {
		System.out.println("unable to login");
	}
}
*/
	}



