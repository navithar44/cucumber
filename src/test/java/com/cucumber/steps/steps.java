package com.cucumber.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.basepage;
import com.cucumber.base.basetest;
import com.cucumber.pagefactory.pagefactory;
import com.cucumber.pages.contactpage;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps extends basetest{
	basepage bpage;
	pagefactory page=new pagefactory();
	String parentwindow;
	

@Given("user launch the application {string}")
public void user_launch_the_application(String browsername) {
    launchapplication(browsername);
}
@Given("user is on {string}")
public void user_is_on(String pageName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
    bpage = page.initialize(pageName);
}
@Then("user waits for Element {string}")
public void user_waits_for_element(String logicalName) {
    bpage.waitforElement(logicalName);
}
@Then("user switch to frame {string}")
public void user_switch_to_frame_id(String frameid) {
	bpage.framewithId(frameid);
}

@Then("user switch to first frame {string}")
public void user_switch_to_first_frame(String frameId) {
	bpage.waitforElement(frameId);
	bpage.switch_to_frame(frameId);
}
@Then("user switch to another frame {string}")
public void user_switch_to_another_frame(String logicalName) {
	bpage.waitforElement(logicalName);
	 bpage.switch_to_anotherframe(logicalName); 
}

@Then("user clears the textbox {string}")
public void user_clears_the_textbox(String logicalName) {
	bpage.waitforElement(logicalName);
    bpage.clearTextbox(logicalName);
}




@Then("user enter into the textbox {string} {string}")
public void user_enter_into_the_textbox(String logicalName, String value) {
	bpage.waitforElement(logicalName);
    bpage.enterIntoTextbox(logicalName, value);
}
@When("user clicks on the link {string}")
public void user_clicks_on_the_link(String logicalName) {
	bpage.waitforElement(logicalName);
    bpage.clickonLink(logicalName);
}
@Then("user switch to default content")
public void user_switch_to_default_content() {
    bpage.switchtodefault();
}
@Then("click on the button {string}")
public void click_on_the_button(String logicalName) {
	bpage.waitforElement(logicalName);
    bpage.clickonButton(logicalName);
}



@Then("user switch to alert page {string}")
public void user_switch_to_alert_page(String logicalName) {
    bpage.clickonAlert(logicalName);
}
@Then("user waits for page")
public void user_waits_for_page() throws InterruptedException {
   bpage.waitforThread();
}
@Then("user start to parent window")
public void user_start_to_parent_window() {
	 parentwindow=bpage.getparentwindow();
}
@Then("user switch to child window")
public void user_switch_to_child_window() {
    bpage.switchtoChild();
}
@Then("user switch to parent window")
public void user_switch_to_parent_window() {
	bpage.switchtoParentwindow(parentwindow);
}
@Then("click on the button {string} {string}")
public void click_on_the_button(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@When("user select from the dropdown {string} {string}")
public void user_select_from_the_dropdown(String logicalName, String option) {
    bpage.selectfromDropdown(logicalName,option);
}

@Then("user verifies the message {string} {string}")
public void user_verifies_the_message(String logicalName, String expectedText) {
	bpage.waitforElement(logicalName);
	bpage.validateText(logicalName,expectedText);
}

@After
public void teardown(Scenario scenario) {
	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot, "image/png", scenario.getName());
	//driver.close();
	//driver=null;
}

	

	
}


