package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.base.basepage;
import com.cucumber.base.basetest;

public class leadpage extends basepage{
	 static WebDriver driver;
	public leadpage() {
		super(driver=basetest.getDriver("chrome"));
		addObject("leads",By.xpath("//a[@title='Leads Tab']"));
		addObject("lead_dropdown",By.xpath("//Select[@id='fcf']"));
		addObject("go",By.xpath("//input[@title='Go!']"));
		addObject("usermenus",By.id("userNavLabel"));
		addObject("logout",By.xpath("//a[@title='Logout']"));
		addObject("new_button",By.xpath("//input[@title='New']"));
		addObject("lastname",By.xpath("//input[@id='name_lastlea2']"));
		addObject("company_name",By.xpath("//input[@id='lea3']"));
		addObject("lead_status_dropdown",By.xpath("//Select[@id='lea13']"));
		addObject("save",By.xpath("//input[@title='Save']"));
		
	}

}
