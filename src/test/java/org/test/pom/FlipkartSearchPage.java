package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class FlipkartSearchPage extends BaseClass {
	public FlipkartSearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='_30XB9F']")
	private WebElement close;
	
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;
}
