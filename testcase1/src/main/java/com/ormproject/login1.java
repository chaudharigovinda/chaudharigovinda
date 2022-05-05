package com.ormproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login1 {// here we cannot call main method when creating class
	
	
//this class created for login page test case as like we will create each java class seperately of each module test case
	
WebDriver driver; //lt is driver from->public static WebDriver driver;	from---> browser.java class

public login1(WebDriver driver) { // it is costructor of login1
	this. driver=driver;
}
public WebElement getUsernametext() {
	return driver.findElement(By.id("txtUsername"));
}
public WebElement getpassword() {
	
	return driver.findElement(By.id("txtPassword"));
}
public WebElement getlogin() {
	return driver.findElement(By.id("btnLogin"));
}
public WebElement invalidmessage() {
	return driver.findElement(By.id("spanMessage"));
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
