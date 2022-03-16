package slenium1;

import java.net.http.HttpClient;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpResponse;

public class brokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");// it is (key ,path of webdriver)
		ChromeDriver driver=new ChromeDriver(); 
		Navigation obj1=driver.navigate();
		obj1.to("https://demoqa.com/broken");
		List<WebElement> link=driver.findElements(By.tagName("a")); // generaly "a" tag for all abroken link but in this web they use "p" so use P also
		Iterator<WebElement> it=link.iterator();
		while (it.hasNext()) {
			WebElement nem=it.next();
			if(nem.getAttribute("href")==null || nem.getAttribute("href").isEmpty()){
				System.out.println("link is broken" +nem.getText());
				continue;// it is use as break the programme
			}
			
			// Below also use for get broken link but it requierd Http jar files
			/*HttpClient cl=HttpClientBuilder.creat().build();
			Httpget req=new HttpGet (cl.getAttribute("href"));
			HttpResponse re= cl.execute(req);
			if(re.getStatusLine().getStatusCode()  !=200) {
				
				System.out.println("broken"  + cl.getText());
			}
		*/  
			
		}
	}

}
