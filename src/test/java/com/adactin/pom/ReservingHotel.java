package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservingHotel {

	public WebDriver driver;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getName() {
		return getName();
	}

	public ReservingHotel(WebDriver gdriver) {

		this.driver = gdriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radio;

	@FindBy(id = "continue")
	private WebElement continuebtn;

}
