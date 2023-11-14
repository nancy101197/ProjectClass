package org.test.base;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	public static WebDriver driver;

	// BROWSER LAUNCH
	public static WebDriver chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	// URL LAUNCH
	public static String urlLaunch(String url) {
		driver.get(url);
		return url;

	}

	// IMPLICIT WAIT
	public static void impwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	// CURRENT URL
	public static String getCurrentUrl() {
		String url=driver.getCurrentUrl();
		return url;

	}

	// GET TITLE
	public static void getTitle() {
		driver.getTitle();

	}
	
//	QUIT
	public static void quit() {
		driver.quit();

	}

	// Facebook login using sendkeys
	public static void sendkeys(WebElement w, String data) {
		w.sendKeys(data);
	}

	public static void pass(WebElement w, String data) {
		w.sendKeys(data);

	}

	public static void click(WebElement e) {
		e.click();

	}
	
//	GET TEXT
	public static String getText(WebElement e) {
		String s=e.getText();
		return s;
	}
	
//	GET ATTRIBUTE
	public static String getAttribute(WebElement e) {
	    String s= e.getAttribute("value");
	    return s;

	}

	// NEW ACCOUNT
	public static void clickbtn(WebElement e) {
		e.click();

	}

	public static void firstname(WebElement e, String data) {
		e.sendKeys(data);

	}

	public static void lastname(WebElement e, String data) {
		e.sendKeys(data);

	}

	public static void mobilenum(WebElement e, String data) {
		e.sendKeys(data);

	}

	public static void password(WebElement e, String data) {
		e.sendKeys(data);

	}

	public static void date(WebElement t) {
		Actions a = new Actions(driver);
		a.moveToElement(t).perform();
		a.click(t).perform();

	}

	public static void month(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		a.click(e).perform();
	}

	public static void year(WebElement o) {
		Actions a = new Actions(driver);
		a.moveToElement(o).perform();
		a.click(o).perform();
	}
	// BY using Actions

	public static void gender(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		a.click(target).perform();
	}

	// To print years By GetAttribute
	public static String select(WebElement e, String v) {
		Select s = new Select(e);
		List<WebElement> opt = s.getOptions();
		for (WebElement x : opt) {
			System.out.println(x.getAttribute("value"));
		}
		return v;

	}

	// To print dates using GetText
	public static String dates(WebElement e, String v) {
		Select s = new Select(e);
		List<WebElement> w = s.getOptions();
		for (int i = 1; i < w.size(); i = i + 2) {
			System.out.println(w.get(i).getText());

		}
		return v;
	}

	// Greens technologies(Actions tasks)

	public static void action(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	// FACEBOOK ROBOTS
	public static void action1(WebElement e) throws AWTException {
		Actions a = new Actions(driver);
		a.doubleClick(e).click().perform();
		a.contextClick(e).perform();

		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	

	// FRAMES by index
	public static void switchByIndex(int index) {
		driver.switchTo().frame(index);

	}

	// FRAMES BY NAME
	public static void switchByName(String s) {
		driver.switchTo().frame(s);

	}

	// FRAMES BY WEBELEMENT
	public static void switchByWebElement(WebElement w) {
		driver.switchTo().frame(w);

	}

	// PARENT FRAME
	public static void parentframe(WebElement e) {
		driver.switchTo().parentFrame();

	}

	// BACK TO MAIN FRAME
	public static void mainframe(WebElement e) {
		driver.switchTo().defaultContent();

	}
//	SELECT
	
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);

	}
	
	public static void selectByValue(WebElement e,String ss) {
		Select s=new Select(e);
		s.selectByValue(ss);
		}
	
	public static void selectByVisibleText(WebElement e,String ss) {
		
		Select s=new Select(e);
		s.selectByVisibleText(ss);
		
	}

	
//	DESELECT
	public static void deselectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);

	}
	
	public static void deselctByValue(WebElement e,String ss) {
		Select s=new Select(e);
		s.deselectByValue(ss);

	}
	
	public static void deselectByVisibleText(WebElement e,String ss) {
		Select s=new Select(e);
		s.deselectByVisibleText(ss);

	}
	
	public static  void deselectAll(WebElement e) {
		
		Select s=new Select(e);
		s.deselectAll();
	}
	
	
	// SIMPLE ALERT
	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	// CONFIRM ALERT
	public static void confirmAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	// PROMPT ALERT
	public static void promptAlert(String v) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(v);
		a.accept();

	}

	// WINDOW HANDLING
	public static void windowHandle() {
		driver.getWindowHandle();

	}

	// SET OF WINDOWS
	public static void windowHandles() {
		driver.getWindowHandles();

	}

	public static String excelRead(String fileloc,String sheetname,int ro,int cel) throws IOException {

		File f = new File(fileloc);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(ro);
		Cell cell = r.getCell(cel);

		int type = cell.getCellType(); // STRING---->TYPE 1
		 							   // NUMBER,DATE---=->TYPE 0

		String value=null;
		if (type == 1) {
			 value = cell.getStringCellValue();	
		} else {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat ss = new SimpleDateFormat();
				 value = ss.format(d);		
			} else {
				double db = cell.getNumericCellValue();
				long ln = (long) db;
				 value = String.valueOf(ln);		
			}
		}
		return value;

	}


}
