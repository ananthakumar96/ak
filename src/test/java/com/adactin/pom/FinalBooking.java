package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalBooking {

	public WebDriver driver;

	public FinalBooking(WebDriver jdriver) {

		this.driver = jdriver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditnumber() {
		return creditnumber;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(name = "first_name")
	private WebElement firstname;

	@FindBy(name = "last_name")
	private WebElement lastname;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement creditnumber;

	@FindBy(id = "cc_type")
	private WebElement credittype;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(name = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement booknow;

	@FindBy(linkText = "Logout")
	private WebElement logout;

}
