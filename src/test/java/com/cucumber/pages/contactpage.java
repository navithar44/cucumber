package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.basepage;
import com.cucumber.base.basetest;

public class contactpage extends basepage{
	static WebDriver driver;
	public contactpage() {
		super(driver=basetest.getDriver("chrome"));
		
		addObject("contacts",By.xpath("//a[@title='Contacts Tab']"));
		addObject("my_contact",By.xpath("//Select[@id='fcf']"));
		addObject("create_view",By.xpath("//a[contains(text(),'Create New View')]"));
		addObject("name",By.xpath("//input[@id='fname']"));
		addObject("devname",By.xpath("//input[@id='devname']"));
		addObject("save",By.xpath("//input[@title='Save']"));
		addObject("recent_created",By.xpath("//Select[@id='hotlist_mode']"));
		addObject("error_msg",By.xpath("(//div[@class='errorMsg'])[1]"));
		addObject("cancel",By.xpath("//input[@title='Cancel']"));
		addObject("new",By.xpath("//input[@title='New']"));
		addObject("last_name",By.xpath("//input[@id='name_lastcon2']"));
		addObject("account_name",By.xpath("//input[@id='con4']"));
		addObject("save_new",By.xpath("//input[@title='Save & New']"));
		addObject("account_lookup",By.xpath("//img[@title='Account Name Lookup (New Window)']"));
		addObject("frame",By.xpath("//frame[@id='searchFrame']"));
		addObject("text_box",By.xpath("//input[@placeholder='Search...']"));
		addObject("go",By.xpath("//input[@title='Go!']"));
		addObject("frame1",By.xpath("//frame[@id='resultsFrame']"));
		addObject("row_id",By.xpath("//a[@class=' dataCell ']"));
		addObject("text",By.xpath("//a[contains(text(),'n')]"));
	}

}
