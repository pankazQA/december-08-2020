package com.stepdef;

import com.common.Base;
import com.common.ScreenShot;
import com.page.DropDownPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DdStepDef extends Base {
	
	DropDownPage ddp;
	
	
	@Given("^User able to go homepage$")
	public void user_able_to_go_homepage() throws Throwable {
	 driver=getdriver();   
	   
	}

	@When("^User click on  all categories$")
	public void user_click_on_all_categories() throws Throwable {
	 ddp=new DropDownPage(driver);
	 ddp.rt();
	   
	}

	@When("^click baby Category$")
	public void click_baby_Category() throws Throwable {
		ScreenShot.ss(driver, "baby");   
	   
	}

	@When("^Click search$")
	public void click_search() throws Throwable {
	    
	   
	}

	@Then("^User able to go baby category successfully$")
	public void user_able_to_go_baby_category_successfully() throws Throwable {
	    
	   
	}	

}
