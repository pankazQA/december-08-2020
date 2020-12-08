package com.stepdef;

import org.testng.Assert;

import com.common.Base;
import com.common.ScreenShot;
import com.page.MyHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	MyHomePage mhp;
	@Given("^User on Ebay home Page$")
	public void user_on_Ebay_home_Page() throws Throwable {
	  driver=getdriver();  
	   
	}

	@When("^User select the text box$")
	public void user_select_the_text_box() throws Throwable {
	mhp=new MyHomePage(driver);    
	   
	}

	@When("^Type iphone$")
	public void type_iphone() throws Throwable {
	mhp.getTbox_search().sendKeys("iphone");    
	ScreenShot.ss(driver, "iphone");  
	}

	@When("^Click Enter$")
	public void click_Enter() throws Throwable {
	 mhp.getTbox_click().click();   
	   
	}

	@Then("^User able to go iphone cetagory successfully$")
	public void user_able_to_go_iphone_cetagory_successfully() throws Throwable {
	Assert.assertEquals(driver.getTitle(),"iphone | eBay");
	System.out.println(driver.getTitle());
	driver.quit();
	}	

}
