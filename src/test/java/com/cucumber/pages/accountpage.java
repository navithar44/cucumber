package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.basepage;
import com.cucumber.base.basetest;

public class accountpage extends basepage{
	static WebDriver driver;
	
	public accountpage() throws InterruptedException {
		super(driver=basetest.getDriver("chrome"));
		
		addObject("accounts_tab",By.xpath("//a[text()='Accounts']"));
		addObject("create_view",By.xpath("//a[contains(text(),'Create New View')]"));
		addObject("view_name",By.xpath("//input[@id='fname']"));
		addObject("unique_name",By.xpath("//input[@id='devname']"));
		addObject("save",By.xpath("//input[@title='Save']"));
		addObject("calendar_btn",By.xpath("//img[@id='ext-gen152']"));
		addObject("today_btn",By.xpath("//button[@id='ext-gen276']"));
		addObject("save_run",By.xpath("//table[@id='dlgSaveAndRun']"));
		addObject("report_uniqname",By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
		addObject("report_name",By.xpath("//input[@id='saveReportDlg_reportNameField']"));
		addObject("activity_link",By.xpath("//a[contains(text(),'last activity')]"));
		addObject("report_save",By.xpath("//button[@id='ext-gen49']"));
        addObject("Merge_button",By.xpath("//a[contains(text(),'Merge Accounts')]"));
        addObject("content",By.xpath("//div[@class='toolsContentRight']"));
        addObject("search_box",By.xpath("//input[@id='srch']"));
        addObject("search_btn",By.xpath("//input[@name='srchbutton']"));
        addObject("next_btn",By.xpath("//input[@title='Next']"));
        addObject("merge",By.xpath("//input[@title='Merge']"));
        addObject("save_run_report",By.xpath("//td[@id='ext-gen300']"));
        addObject("new_button",By.xpath("//input[@name='new']"));
        addObject("account_name",By.xpath("//input[@id='acc2']"));
        addObject("type_dropdown",By.xpath("//select[@id='acc6']"));
        addObject("customer_priority_dropdown",By.xpath("//select[@id='00Nbm0000005B9K']"));
        addObject("save_button",By.xpath("//input[@title='Save & New']"));
        addObject("new_account",By.xpath("//div[@id='mru001bm000005IzoY']"));
        addObject("list_view",By.xpath("//select[@title='View:']"));
        addObject("edit",By.xpath("//a[contains(text(),'Edit')]"));
        addObject("edit_view_name",By.xpath("//input[@id='fname']"));
        addObject("filters",By.xpath("//select[@id='fcol1']"));
        addObject("operators",By.xpath("//select[@id='fop1']"));
        addObject("value",By.xpath("//input[@id='fval1']"));
        addObject("select_fields_list",By.xpath("//select[@id='colselector_select_0']"));
        addObject("add",By.xpath("//a[@id='colselector_select_0_right']"));

		
	}

}
