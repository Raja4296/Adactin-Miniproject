package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
public WebDriver driver;
	
	public Select_Hotel (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (css="#radiobutton_0")
	private WebElement sel_hot;
	
	public WebElement getSelHotel() {
		return sel_hot;
	}
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement cont;
	
	public WebElement getContinue() {
		return cont;
	}
}

