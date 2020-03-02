package com.adactin.readers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.FinalBooking;
import com.adactin.pom.HotelBooking;
import com.adactin.pom.ReservingHotel;
import com.adactin.pom.UserLogin;

public class TotalObject {
	private WebDriver driver;
	private UserLogin ul;
	private HotelBooking hb;
	private ReservingHotel rh;
	private FinalBooking fb;

	public TotalObject(WebDriver jdriver) {
		this.driver = jdriver;
		PageFactory.initElements(driver, this);

	}

	public UserLogin logIn() {
		ul = new UserLogin(driver);
		return ul;
	}

	public HotelBooking hotelBook() {
		hb = new HotelBooking(driver);
		return hb;

	}

	public ReservingHotel reserveHotel() {
		rh = new ReservingHotel(driver);
		return rh;

	}

	public FinalBooking finalBook() {
		fb = new FinalBooking(driver);
		return fb;

	}

}
