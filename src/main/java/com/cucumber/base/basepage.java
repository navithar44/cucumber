package com.cucumber.base;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class basepage {
	WebDriver driver;
	HashMap<String,By> ObjectRepo = new HashMap<String,By>();
	
	public basepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void enterIntoTextbox(String logicalName, String value) {
		WebElement element=getElement(logicalName);
		element.sendKeys(value);
	}
	
	public void addObject(String logicalName,By by) {
		ObjectRepo.put(logicalName,by);
		
	}

	public WebElement getElement(String logicalName) {
		// TODO Auto-generated method stub

		By by =ObjectRepo.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
	}
	public void clickonButton(String logicalName) {
		waitforElement(logicalName);
		WebElement element=getElement(logicalName);
		element.click();
	}

	public void waitforElement(String logicalName) {
		// TODO Auto-generated method stub
		WebElement element=getElement(logicalName);
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	public void validateText(String logicalName, String expectedText) {
		// TODO Auto-generated method stub
		WebElement element=getElement(logicalName);
		waitforElement(logicalName);
		String ActualText=element.getText();
		Assert.assertEquals(ActualText, expectedText);
	}

	public void clickonLink(String logicalName) {
		waitforElement(logicalName);
		WebElement element=getElement(logicalName);
		element.click();
		
	}

	public void selectfromDropdown(String logicalName, String option) {
		waitforElement(logicalName);
		WebElement element=getElement(logicalName);
		Select value = new Select(element);
		value.selectByVisibleText(option);	
	}

	public void clearTextbox(String logicalName) {
		waitforElement(logicalName);
		WebElement element=getElement(logicalName);
		element.clear();
	
		
		
	}

	public void framewithId(String frameid) {
		driver.switchTo().frame(frameid);
		
	}

	public void switchtodefault() {
		
	driver.switchTo().defaultContent();		
	}

	public void clickonAlert(String logicalName) {
		waitforElement(logicalName);
		WebElement alert=getElement(logicalName);
		alert.click();
		driver.switchTo().alert().accept();
		
	}

	public void waitforThread() throws InterruptedException {
	Thread.sleep(6000);
		
	}	
	public String getparentwindow() {
		String parentwindow=driver.getWindowHandle();
		return parentwindow;
		
		
	}

	public void switchtoChild() {
		String parent=driver.getWindowHandle();
		Set<String> handle_of_2windows=driver.getWindowHandles();
		for(String handle:handle_of_2windows) {
			if(!handle.equals(parent)) 
			{
				driver.switchTo().window(handle);
			}}
		
	}

	public void switchtoParentwindow(String parent) {
		driver.switchTo().window(parent);
		
	}

	public String getParentwindow() {
		String parent=driver.getWindowHandle();
		return parent;
	}

	public String switchtoParent() {
		String parent=driver.getWindowHandle();
		//driver.switchTo().window(parent);
		return parent;
		
		
	}
	public void switch_to_anotherframe(String logicalName) {
		waitforElement(logicalName);
		driver.switchTo().frame(logicalName);
		
	}

	public void switch_to_frame(String frameId) {
		driver.switchTo().frame(frameId);
		
	}
		
	}

		
		
		
		
	
	
