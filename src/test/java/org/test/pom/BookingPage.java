package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class BookingPage extends BaseClass{
	 public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(id="first_name")
	 private WebElement firstname;
	 
	 @FindBy(id="last_name")
	 private WebElement lastname;
	 
	 @FindBy(id="address")
	 private WebElement billingaddress;
	 
	 @FindBy(id="cc_num")
	 private WebElement ccnumber;
	 
	 @FindBy(id="cc_type")
	 private WebElement cardtype;
	 
	 @FindBy(id="cc_exp_month")
	 private WebElement duemonth;
	 
	 @FindBy(id="cc_exp_year")
	 private WebElement dueyear;
	 
	 @FindBy(id="cc_cvv")
	 private WebElement cvvnum;
	 
	 @FindBy(id="book_now")
	 private WebElement bookingbtn;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getDuemonth() {
		return duemonth;
	}

	public WebElement getDueyear() {
		return dueyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBookingbtn() {
		return bookingbtn;
	}



}
