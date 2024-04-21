package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.basepage;
import com.cucumber.base.basetest;

public class usermenu_page extends basepage{
	static WebDriver driver;
    public usermenu_page() {
		super(driver=basetest.getDriver("chrome"));
		addObject("username",By.id("username"));
		addObject("password",By.id("password"));
		addObject("Login",By.id("Login"));
		addObject("usermenus",By.id("userNavLabel"));
		addObject("Error1",By.id("userNavLabel"));
		addObject("logout",By.xpath("//a[@title='Logout']"));
		addObject("dev_Console",By.xpath("//a[contains(text(),'Developer Console')]"));
		addObject("mysettings",By.xpath("//a[contains(text(),'My Settings')]"));
		addObject("personal_link",By.id("PersonalInfo_font"));
		addObject("login_history",By.id("LoginHistory_font"));
		addObject("downloads",By.xpath(("//a[contains(text(),'Download')]")));
		addObject("display_layout",By.xpath("//span[@id='DisplayAndLayout_font']"));
		addObject("customize_my_tabs",By.xpath("//span[@id='CustomizeTabs_font']"));
		addObject("content_dropdown",By.xpath("//select[@id='p4']"));
		addObject("report",By.xpath("//option[@value='report']"));
		addObject("add_button",By.xpath("//img[@class='rightArrowIcon']"));
		addObject("save_button",By.xpath("//input[@name='save']"));
		addObject("Email",By.id("EmailSetup_font"));
		addObject("my_email_settings",By.id("EmailSettings_font"));
		addObject("email_name",By.id("sender_name"));
		addObject("email_address",By.id("sender_email"));
		addObject("automatic",By.id("auto_bcc1"));
		addObject("calendar_reminders",By.xpath("//span[@id='CalendarAndReminders_font']"));
		addObject("activity_reminders",By.xpath("//span[@id='Reminders_font']"));
		addObject("open_a_testreminder",By.xpath("//input[@id='testbtn']"));
	
	
	
	}
	

}
