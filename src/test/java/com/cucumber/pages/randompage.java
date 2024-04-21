package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.basepage;
import com.cucumber.base.basetest;

public class randompage extends basepage{
	static WebDriver driver;
	public randompage() {
		super(driver=basetest.getDriver("chrome"));
		addObject("home",By.xpath("//a[@title='Home Tab']"));
		addObject("recent_items",By.xpath("//div[@class='recentItemModule sidebarModule']"));
		addObject("user_link",By.xpath("(//a[@href='/005bm0000009fT3'])[1]"));
		addObject("edit_profile",By.xpath("//a[@class='contactInfoLaunch editLink']"));
		addObject("about",By.xpath("//a[contains(text(),'About')]"));
		addObject("lastname",By.xpath("//input[@id='lastName']"));
		addObject("saveall",By.xpath("//input[@value='Save All']"));
		addObject("all_tab",By.xpath("//li[@id='AllTab_Tab']"));
		addObject("customize_tab",By.xpath("//input[@class='btnImportant']"));
		addObject("selected_tab",By.xpath("//Select[@id='duel_select_1']"));
		addObject("arrow_remove",By.xpath("//img[@title='Remove']"));
		addObject("save",By.xpath("//input[@title='Save']"));
		addObject("currentdate_link",By.xpath("//a[@href='/00U/c?md3=110&md0=2024']"));
		addObject("time_frame",By.xpath("//div[@id='p:f:j_id25']"));
		addObject("time_4",By.xpath("//div[@id='p:f:j_id25:j_id61:20:j_id64']"));	
		addObject("combobox",By.xpath("//img[@class='comboboxIcon']"));
		addObject("body",By.xpath("/html"));
		addObject("selectfromList",By.xpath("//a[@href='javascript:pickValue(4);']"));
		addObject("time",By.xpath("//input[@id='EndDateTime_time']"));
		addObject("select_recurence",By.xpath("//input[@id='IsRecurrence']"));
		addObject("weekly",By.xpath("//input[@id='rectypeftw']"));
		addObject("recur_endDate",By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		addObject("save_recurrence",By.xpath("(//input[@title='Save'])[1]"));
		addObject("month_view",By.xpath("//img[@class='monthViewIcon']"));
		addObject("time_6",By.xpath("//div[@id='p:f:j_id25:j_id61:24:j_id64']"));
		addObject("save_timeframe",By.xpath("(//input[@title='Save'])[1]"));	
	}

}
