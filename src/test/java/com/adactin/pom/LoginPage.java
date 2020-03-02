package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver pdriver) {

	
	this.driver =pdriver;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getRegister() {
		return register;
	}

	@FindBy(linkText="New User Register Here")
	private WebElement register;
}