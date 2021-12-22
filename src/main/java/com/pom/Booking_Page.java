package com.pom;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
public WebDriver driver;
	
	public Booking_Page (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//input[@id='first_name']")
	private WebElement fname;
	
	public WebElement getFirstName() {
		return fname;
	}
	@FindBy (xpath="//input[@id='last_name']")
	private WebElement lname;
	
	public WebElement getLastName() {
		return lname;
	}
	@FindBy (xpath="//textarea[@id='address']")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}
	@FindBy (xpath="//input[@id='cc_num']")
	private WebElement ccnum;
	
	public WebElement getCardNumber() {
		return ccnum;
	}
	@FindBy (tagName="select")
	private List<WebElement> alldd;

	public List<WebElement> getAlldd() {
		return alldd;
	}
	@FindBy (xpath="//input[@id='cc_cvv']")
	private WebElement cccvv;
	
	public WebElement getCardCVV() {
		return cccvv;
	}
	
	@FindBy (css="#book_now")
	private WebElement book;
	
	public WebElement getBookNow() {
		return book;
	}
}
