package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
	WebDriver driver;
	public DropDownPage(WebDriver driver) { 
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void rt() {
Select ac =new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")))	;
ac.selectByVisibleText("Baby");
ac.getFirstSelectedOption();
	
}	
 
}
