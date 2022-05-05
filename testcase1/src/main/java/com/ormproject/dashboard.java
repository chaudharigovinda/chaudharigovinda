package com.ormproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboard {
WebDriver driver;

public dashboard (WebDriver driver) {
	
	this.driver=driver;
}

public WebElement dashboardtext() {
	
	
	return driver.findElement(By.tagName("h1"));
}
}
