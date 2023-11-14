package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement clickbtn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;

	public WebElement getClickbtn() {
		return clickbtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
}
