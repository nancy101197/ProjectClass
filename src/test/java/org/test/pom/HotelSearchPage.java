package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class HotelSearchPage extends BaseClass {
	public HotelSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;

	@FindBy(id="room_nos")
	private WebElement numofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultcount;
	
	@FindBy(id="child_room")
	private WebElement childcount;
	
	@FindBy(id="Submit")
	private WebElement searchbtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumofrooms() {
		return numofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultcount() {
		return adultcount;
	}

	public WebElement getChildcount() {
		return childcount;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}










}
