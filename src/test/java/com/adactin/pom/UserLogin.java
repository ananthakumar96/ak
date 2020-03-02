package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogin {
	public WebDriver driver;

	public UserLogin(WebDriver idriver) {

		this.driver = idriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserlogin() {
		return userlogin;
	}

	public WebElement getUserpass() {
		return userpass;
	}

	@FindBy(id = "username")
	private WebElement userlogin;
	@FindBy(id = "password")
	private WebElement userpass;
	@FindBy(name = "login")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
}
