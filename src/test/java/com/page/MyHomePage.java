package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage {
WebDriver driver;//WebDriver Is a selenium interface
public MyHomePage(WebDriver driver) {//constractor
this.driver=driver;//this is a keyword of constractor
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@type='text']")
WebElement Tbox_search;
public WebElement getTbox_search() {
	return Tbox_search;
}
@FindBy(xpath="//input[@type='submit']")
WebElement Tbox_click;
public WebElement getTbox_click() {
	return Tbox_click;
}









}







