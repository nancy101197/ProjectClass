package org.sample;

import java.time.Duration;

import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.base.BaseClass;
import org.test.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
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
//	LOGIN PAGE
	@Test
	public void test1()
	{
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Nancy456");;
		driver.findElement(By.id("password")).sendKeys("1011@123");;
		driver.findElement(By.id("login")).click();;

	}
//	HOTEL SEARCH PAGE
	@Test
	public void test2()
	{
	    driver.findElement(By.xpath("//option[text()='Melbourne']")).click();
	    driver.findElement(By.xpath("//option[text()='Hotel Hervey']")).click();
	    driver.findElement(By.xpath("//option[text()='Standard']")).click();
	    driver.findElement(By.xpath("(//option[text()='2 - Two'])[1]")).click();
	    driver.findElement(By.id("datepick_in")).sendKeys("10/11/2023");
	    driver.findElement(By.id("datepick_out")).sendKeys("15/11/2023");
	    driver.findElement(By.xpath("(//option[text()='2 - Two'])[2]")).click();
	    driver.findElement(By.xpath("//option[text()='0 - None']")).click();
	    driver.findElement(By.id("Submit")).click();
	    

	}
//	SELECT HOTEL PAGE
	@Test
	public void test3()
	{
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();;

	}
//	HOTEL BOOKING PAGE
	@Test
	public void test4() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='reg_input'])[1]")).sendKeys("Nancy");
		driver.findElement(By.id("last_name")).sendKeys("Williams");
		driver.findElement(By.id("address")).sendKeys("Anna Street,Kamarajapuram,Thekkady");;
		driver.findElement(By.id("cc_num")).sendKeys("1765347892130087");
		driver.findElement(By.xpath("//option[text()='VISA']")).click();
		driver.findElement(By.xpath("//option[text()='November']")).click();
		driver.findElement(By.xpath("//option[text()='2024']")).click();
		driver.findElement(By.id("cc_cvv")).sendKeys("345");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);

	}
	
	
	
	
	
	
	
	
	
	
	}

