package org.sample;

import java.time.Duration;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void afterClass() 
	{
		driver.quit();

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
//	SEARCH PAGE
	@Test
	public void test1() {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	
//  LIST OF PRODUCTS
	@Test
	public void test2() {
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(int i=0;i<li.size();i++) 
		{
		  
				WebElement w=li.get(i);
				String s=w.getText();
				
				System.out.println(s);
			

		}
		System.out.println("..............................................");
	}
	
//	PRICE LIST
	@Test
	public void test3() {
		List<WebElement> l = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0;i<l.size();i++) 
		{
		  
				WebElement w=l.get(i);
				String s=w.getText();
				
				System.out.println(s);
//	  TO PRINT MAXIMUM PRICE	
				if(s.contains("₹"))
				{
					s=s.replace("₹", "");
//					System.out.println(s);
				}
				if(s.contains(","))
				{
					s=s.replace(",", "");
//					System.out.println(s);
				}
				int ii=Integer.parseInt(s);
				System.out.println(ii);
//				System.out.println(l);
//				Collections.sort(l);
				 
      }
		System.out.println(l);
//		System.out.println("max: "+Collections.max(l));
		System.out.println(".............................................");
	}	
	

	
	
//	MATCH THE PRODUCTS WITH PRICE
	@Test
	public void test6() {
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> l = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0;i<li.size();i++)
		{
				String w=li.get(i).getText();
				String r=l.get(i).getText();
				System.out.println("product with price :"+w+r);
				
			
		}

	}
	
	
	}

