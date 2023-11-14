package org.sample;

import java.util.Date;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.test.base.BaseClass;
import org.test.pom.CaptchaHandling;


public class MainClass2 extends BaseClass {
	static WebDriver driver;
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
	
	@Test
	public void test1() {
	  urlLaunch("https://adactinhotelapp.com/");
	  CaptchaHandling c=new CaptchaHandling();
	  click(c.getReg());
	
	} 
}
