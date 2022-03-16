package seleniumna;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// below is registration of driver
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); // it is cromedriver class object creation
		driver.navigate().to("https://www.myntra.com/login");// it is navigate method to open website
		//navigate method use to call address without any time period 
		//-means it will not wait for run the wrbsite adress
		//driver.get("https://www.myntra.com/login");// it is get method to call website
		// get method wait for run the website
		
		System.out.println(driver.getTitle()); //this method use to get tilte of website on console
		
		// below are types of navigate methods we can call them one by one
		//driver.navigate().back();
	
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();// this method use to close current window in website
		//driver.quit();// this method use to close whole website this method use mostly
		
		
		
		
		//Below is the detail of navigate method 
		//Navigation is interface and navigate method returns navigation interface
		//Navigation ram=driver.navigate(); // it is implicite non premitive casting
		//ram.to("https://www.myntra.com/login");
		//System.out.println(ram);
		
		
		
		
		

	}

}
