package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterationDetails {
	private WebDriver driver;

	public RegisterationDetails(WebDriver rdriver) {

		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(name = "username")
	private WebElement username;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRepass() {
		return repass;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getCaptacha() {
		return captacha;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(name = "password")
	private WebElement password;
	@FindBy(name = "re_password")
	private WebElement repass;
	@FindBy(name = "full_name")
	private WebElement fullname;
	@FindBy(name = "email_add")
	private WebElement mail;
	@FindBy(name = "captcha")
	private WebElement captacha;
	@FindBy(name = "tnc_box")
	private WebElement radio;
	@FindBy(name = "Submit")
	private WebElement submit;

}
