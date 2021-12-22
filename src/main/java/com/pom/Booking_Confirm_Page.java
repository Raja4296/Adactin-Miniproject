package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm_Page {
	private WebDriver driver;
	
	public Booking_Confirm_Page (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath="//input[@id='my_itinerary']")
	private WebElement myit;
	
	public WebElement getMyItenary() {
		return myit;
	}
}
