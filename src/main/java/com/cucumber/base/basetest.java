package com.cucumber.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.utilities.propertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {
	  public static WebDriver driver;
	static propertiesFile prop= new propertiesFile();
	public static void launchapplication(String browsername) {
		driver=getDriver(browsername);
		String applicationurl=prop.getproperties("url");
		driver.get(applicationurl);
		}
	
	public static WebDriver getDriver(String browsername) {
		if(driver==null) {
			if(browsername.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
		}
		return driver;
	}
	
}
