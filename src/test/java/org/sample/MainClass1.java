package org.sample;

import java.util.Date;


import org.test.base.BaseClass;
import org.test.pom.BookingPage;
import org.test.pom.HotelSearchPage;
import org.test.pom.LoginPage;
import org.test.pom.SelectHotelPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainClass1 extends BaseClass{

	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() 
	{
		chromeLaunch();
		impwait();
	}
	

	@AfterClass
	public static void afterClass() 
	{
		quit();

	}
	@Before
	public void before() {
	 Date d=new Date();
	 System.out.println("Before......"+d);

	}
	
	@After
	public void after() {
		Date d= new Date();
		System.out.println("After......"+d);

	}
//	LOGIN PAGE
	@Test
	public void test1()
	{
		urlLaunch("https://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		
		sendkeys(l.getTxtusr(), "Nancy456");
		sendkeys(l.getTxtpass(), "1011@123");
		click(l.getLoginbtn());
	}
//	HOTEL SEARCH
	@Test
	public void test2() throws InterruptedException {
		
		HotelSearchPage h=new HotelSearchPage();
		sendkeys(h.getLocation(), "Melbourne");
		Assert.assertEquals("Melbourne", getAttribute(h.getLocation()));
		sendkeys(h.getHotels(), "Hotel Hervey");
		sendkeys(h.getRoomtype(), "Standard");
		sendkeys(h.getNumofrooms(), "2");
		WebElement c = h.getCheckin();
		c.clear();
		sendkeys(h.getCheckin(), "27/11/2023");
		WebElement cc = h.getCheckout();
		cc.clear();
		sendkeys(h.getCheckout(), "28/11/2023");
//		Thread.sleep(5000);
		sendkeys(h.getAdultcount(), "2");
		sendkeys(h.getChildcount(), "0");
		click(h.getSearchbtn());

	}
//	SELECT HOTEL PAGE
	@Test
	public void test3() {
		SelectHotelPage s=new SelectHotelPage();
		click(s.getClickbtn());
		click(s.getContinuebtn());

	}
//	BOOKING PAGE
	@Test
	public void test4() throws InterruptedException {
// 		Assert.assertTrue(getCurrentUrl().contains("BookingConfirm"));
		BookingPage b=new BookingPage();
//		Assert.assertTrue(getCurrentUrl().contains("BookingConfirm"));
		sendkeys(b.getFirstname(), "Nancy");
		sendkeys(b.getLastname(), "Williams");
		sendkeys(b.getBillingaddress(), "Anna Street,Kamarajapuram,Thekkady");
		Assert.assertEquals("Anna Street,Kamarajapuram,Thekkady", getAttribute(b.getBillingaddress()));
		sendkeys(b.getCcnumber(), "1765347892130087");
		sendkeys(b.getCardtype(), "VISA");
		sendkeys(b.getDuemonth(), "November");
		sendkeys(b.getDueyear(), "2024");
		sendkeys(b.getCvvnum(), "345");
		click(b.getBookingbtn());
		

	}
}
