package seleniummethoid;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we can find each locator in table by text method as -----//div[text()='First Name']
		// we can find element by common locator for coloumn and use iterator method --// div[@role="columnheader"]
		//abov eapproch is same for row also as likae-------//div[@role='gridcell']
		//above role="columnheader" is common attribute to all header in table so we can use this approch also
		// here there are number of elements in row and coloumn of table so we use list webelemnt method
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/webtables");
		List<WebElement> colom =obj.findElements(By.xpath("// div[@role='columnheader']"));
		System.out.println(colom.size());
		//to get all coloumn header name we use iterator method
		Iterator<WebElement> name=colom .iterator();
		while(name.hasNext()) {
			System.out.println(name.next().getText());
			List<WebElement> row=obj.findElements(By.xpath("//div[@role='gridcell']"));
			System.out.println(row.size());
			Iterator<WebElement> name1=row.iterator();
			while(name1.hasNext()) {
				System.out.println(name1.next().getText());
			}
		}
		
		
		
		
	}

}
