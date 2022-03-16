package seleniumna;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.ie.driver", "Resourses/iedriverserver.exe");
InternetExplorerDriver obj=new InternetExplorerDriver();
obj.navigate().to("https://www.amazon.in/");
System.out.println(obj.getTitle());
obj.manage().window().maximize();
	}

}
