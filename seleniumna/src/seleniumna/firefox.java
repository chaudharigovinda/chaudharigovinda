package seleniumna;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in fire fox the driver name is gecko so we register as below 
		//-but to creat object we use "Firefox" name as below
		System.setProperty("webdriver.gecko.driver", "Resourses/geckodriver.exe");

FirefoxDriver obj=new FirefoxDriver();
obj.navigate().to("https://www.amazon.in/");
System.out.println(obj.getTitle());
//below are types of navigate methods we can call them one by one
System.out.println(obj.getTitle()); //this method use to get tilte of website on console

// below are types of navigate methods we can call them one by one
//obj.navigate().back();

obj.navigate().forward();

//obj.navigate().refresh();
obj.manage().window().maximize();
//obj.manage().window().minimize();
//obj.close();// this method use to close current window in website
obj.quit();// this method use to close whole website this method use mostly

	

	}

}
