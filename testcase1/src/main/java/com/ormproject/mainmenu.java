package com.ormproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainmenu {

	WebDriver driver;
	public mainmenu(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement main() {
		return driver.findElement(By.id("menu_pim_viewMyDetails"));
	}
	public WebElement edit() {
		return driver.findElement(By.id("btnSave"));
		
	}
	
}
