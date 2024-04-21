package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.basepage;
import com.cucumber.base.basetest;

public class loginpage extends basepage{
	
	static WebDriver driver;
	
	public loginpage() {
		super(driver=basetest.getDriver("chrome"));
		addObject("username",By.id("username"));
		addObject("password",By.id("password"));
		addObject("Login",By.id("Login"));
		addObject("usermenus",By.id("userNavLabel"));
		addObject("logout",By.xpath("//a[@title='Logout']"));
		addObject("Error",By.xpath("//span[@id='idcard-identity']"));
		addObject("checkbox",By.id("rememberUn"));
		addObject("forgot_pwd",By.xpath("//a[@id='forgot_password_link']"));
		//accounts tab
		addObject("accounts_tab",By.xpath("//a[text()='Accounts']"));
		addObject("create_view",By.xpath("//a[contains(text(),'Create New View')]"));
		addObject("view_name",By.xpath("//input[@id='fname']"));
		addObject("unique_name",By.xpath("//input[@id='devname']"));
		addObject("save",By.xpath("//input[@title='Save']"));
		
		
		
	}

}
