package com.select;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class SelectPojo extends Base {
	
	public SelectPojo() {
    PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="radiobutton_0")
	private WebElement hotelSelect;
	
	@FindBy(id="continue")
	private WebElement continu;

	public WebElement getContinu() {
		return continu;
	}

	public WebElement getHotelSelect() {
		return hotelSelect;
	}
		

	}


