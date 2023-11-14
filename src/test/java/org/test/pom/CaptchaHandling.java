package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class CaptchaHandling extends BaseClass {

	public CaptchaHandling() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement reg;

	@FindBy(id="captcha")
	private WebElement cap;
	
	
	
	public WebElement getCap() {
		return cap;
	}


    public WebElement getReg() {
		return reg;
	}


	
}
