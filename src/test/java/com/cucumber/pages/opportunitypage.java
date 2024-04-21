package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.basepage;
import com.cucumber.base.basetest;

public class opportunitypage extends basepage{
 static WebDriver driver;
	public opportunitypage() throws InterruptedException {
		super(driver=basetest.getDriver("chrome"));
	
	addObject("opportunities",By.xpath("//li[@id='Opportunity_Tab']"));
	addObject("opportunities_list",By.xpath("//select[@id='fcf']"));
	addObject("new_button",By.xpath("//input[@title='New']"));
	addObject("op_name",By.xpath("//input[@id='opp3']"));
	addObject("opportunity_pipeline",By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
	addObject("close_date",By.xpath("//span[@class='dateFormat']"));
	addObject("qtrly_interval",By.xpath("//select[@id='quarter_q']"));
	addObject("stage",By.xpath("//Select[@id='opp11']"));
	addObject("stuck_opp",By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
	addObject("qtrly_include",By.xpath("//select[@id='open']"));
	addObject("leadsource",By.xpath("//Select[@id='opp6']"));
	addObject("run_report",By.xpath("//input[@title='Run Report']"));
	addObject("probability",By.xpath("//input[@id='opp12']"));
	
	addObject("save",By.xpath("//input[@title='Save']"));
	
	
	}
}
