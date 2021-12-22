
package com.pomanager;

import org.openqa.selenium.WebDriver;

import com.pom.Booking_Confirm_Page;
import com.pom.Booking_Page;
import com.pom.Hotel_Search;
import com.pom.Login_Page;
import com.pom.Select_Hotel;

public class Page_Object_Manager{
	
	private WebDriver driver;
	private Login_Page lp;
	private Hotel_Search hs;
	private Select_Hotel sh;
	private Booking_Page bp;
	private Booking_Confirm_Page bcp;

	public Page_Object_Manager (WebDriver driver2)
	{
		this.driver = driver2;
	}
	
	public Login_Page getInstanceLp() {
		
		if (lp == null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}
	
	public Hotel_Search getInstanceHs() {
		
		if (hs == null) {
			hs = new Hotel_Search(driver);
		}
		return hs;
	}
	
	public Select_Hotel getInstanceSh() {
		
		if (sh == null) {
			sh = new Select_Hotel(driver);
		}
		return sh;
	}
	
	public Booking_Page getInstanceBp() {
		
		if (bp == null) {
			bp = new Booking_Page(driver);
		}
		return bp;
	}
	public Booking_Confirm_Page getInstanceBcp() {
		
		if (bcp == null) {
			bcp = new Booking_Confirm_Page(driver);
		}
		return bcp;
	}
}




