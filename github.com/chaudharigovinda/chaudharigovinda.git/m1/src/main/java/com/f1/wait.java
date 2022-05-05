package com.f1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait extends bro {
	public static FluentWait<WebDriver> wait1;
	public wait() {
		wait1=new WebDriverWait(driver,10).ignoring(TimeoutException.class,NoSuchElementException.class);
	}
public void isdisplay(final WebElement element) {
	wait1.until(new ExpectedCondition<Boolean>(){

		public Boolean apply(WebDriver input) {
			// TODO Auto-generated method stub
			return  element.isDisplayed();
		}
	});
	
}
public void waitforclickable(WebElement element) {
	wait1.until(ExpectedConditions.elementToBeClickable(element));
}
public boolean waitfornavigation(String url) {
	return wait1.until(ExpectedConditions.urlContains(url));
	
}
public WebElement isvisible(WebElement webelement,WebDriver driver) {
	return wait1.until(ExpectedConditions.visibilityOf(webelement));
	
}
}
