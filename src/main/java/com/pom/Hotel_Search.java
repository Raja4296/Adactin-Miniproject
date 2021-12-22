package com.pom;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {
	
	public WebDriver driver;
	
	public Hotel_Search (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (tagName="select")
	private List<WebElement> alldd;

	public List<WebElement> getAlldd() {
		return alldd;
	}	
	
	@FindBy (css="#datepick_in")
	private WebElement din;
	
	public WebElement getDin() {
		return din;
	}
	@FindBy (css="#datepick_out")
	private WebElement dout;
	
	public WebElement getDout() {
		return dout;
	}
	
	@FindBy (xpath="//input[@id='Submit']")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	
	
}
