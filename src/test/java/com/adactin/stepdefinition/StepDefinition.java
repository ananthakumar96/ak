package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.Adactin.baseclass.BaseClass1;
import com.adactin.pom.FinalBooking;
import com.adactin.pom.HotelBooking;
import com.adactin.pom.RegisterationDetails;
import com.adactin.pom.ReservingHotel;
import com.adactin.pom.UserLogin;
import com.adactin.readers.FileReaderManager;
import com.adactin.readers.TotalObject;
import com.adactin.runner.Runner;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass1 {
	public static WebDriver driver = Runner.driver;

	public static TotalObject to = new TotalObject(driver);

	@Given("User enter the adactic application")
	public void user_enter_the_adactic_application() throws IOException {
		String url = FileReaderManager.getObject().ObjectCR().getUrl();
		geturl(url);
	}

	@When("user enter the Registered username {string} is username")
	public void user_enter_the_Registered_username_is_username1(String string) {
		sendKeys(to.logIn().getUserlogin(), string);

	}

	@When("user enter the Registered Password {string} is password")
	public void user_enter_the_Registered_Password_is_password1(String string) {
		sendKeys(to.logIn().getUserpass(), string);
	}

	/*
	 * @Given("user enter the Registered username") public void
	 * user_enter_the_Registered_username() { sendKeys(to.logIn().getUserlogin(),
	 * "ananthamechkumar");
	 * 
	 * }
	 * 
	 * @Given("user enter the Registered Password") public void
	 * user_enter_the_Registered_Password() { sendKeys(to.logIn().getUserpass(),
	 * "ananth123");
	 * 
	 * }
	 */

	@When("user click the Login button")
	public void user_click_the_Login_button() {
		clickElement(to.logIn().getSubmit());

	}

	@Given("user select the location of hotel")
	public void user_select_the_location_of_hotel() {
		dropDown(to.hotelBook().getLocation(), "byvalue", "Melbourne");

	}

	@Given("user select the hotel name")
	public void user_select_the_hotel_name() {
		dropDown(to.hotelBook().getHotel(), "byvalue", "Hotel Sunshine");

	}

	@Given("user select the Room type")
	public void user_select_the_Room_type() {
		dropDown(to.hotelBook().getRoom(), "byVisibleText", "Standard");
	}

	@Given("user select the number of rooms")
	public void user_select_the_number_of_rooms() {
		dropDown(to.hotelBook().getRoomno(), "byvalue", "2");
	}

	@Given("user selecting the checkin date")
	public void user_selecting_the_checkin_date() {
		to.hotelBook().getStartdate().clear();
		sendKeys(to.hotelBook().getStartdate(), "29/02/2020");
	}

	@Then("user select the checkout date")
	public void user_select_the_checkout_date() {
		to.hotelBook().getEnddate().clear();
		sendKeys(to.hotelBook().getEnddate(), "01/03/2020");
	}

	@Then("user select the Adults room")
	public void user_select_the_Adults_room() {
		dropDown(to.hotelBook().getAdultroom(), "byvalue", "2");
	}

	@Then("user select the children room")
	public void user_select_the_children_room() {

		dropDown(to.hotelBook().getChildroom(), "byvalue", "2");
	}

	@Then("user select the search operation for hotel")
	public void user_select_the_search_operation_for_hotel() {
		clickElement(to.hotelBook().getSubmit());

	}

	@When("User select the hotel")
	public void user_select_the_hotel() {
		clickElement(to.reserveHotel().getRadio());

	}

	@Then("user Confirm the hotel")
	public void user_Confirm_the_hotel() {
		clickElement(to.reserveHotel().getContinuebtn());

	}

	@When("user enter the firstname")
	public void user_enter_the_firstname() {
		sendKeys(to.finalBook().getFirstname(), "anantha");

	}

	@When("user enter the lastname")
	public void user_enter_the_lastname() {
		sendKeys(to.finalBook().getLastname(), "kumar");

	}

	@When("user enter the billing address and details")
	public void user_enter_the_billing_address_and_details() {

		sendKeys(to.finalBook().getAddress(), "london,england,paris,switzerland");

	}

	@When("user enter the credit card sixteen digit number")
	public void user_enter_the_credit_card_sixteen_digit_number() {
		sendKeys(to.finalBook().getCreditnumber(), "1234 5678 9123 4546");

	}

	@When("user select the credit card type")
	public void user_select_the_credit_card_type() {
		dropDown(to.finalBook().getCredittype(), "byvalue", "AMEX");
	}

	@When("User select the credit card Expiry month")
	public void user_select_the_credit_card_Expiry_month() {

		dropDown(to.finalBook().getMonth(), "byvalue", "4");
	}

	@When("user select the credit card expiry year")
	public void user_select_the_credit_card_expiry_year() {
		dropDown(to.finalBook().getYear(), "byvalue", "2022");
	}

	@When("user enter the cvv number")
	public void user_enter_the_cvv_number() {

		sendKeys(to.finalBook().getCvv(), "999");
	}

	@Then("user click the booking function")
	public void user_click_the_booking_function() {
		clickElement(to.finalBook().getBooknow());
	}

	@Then("user logout in the adactin application")
	public void user_logout_in_the_adactin_application() {
		clickElement(to.finalBook().getLogout());
	}

	@Given("User launch the adactic application")
	public void user_launch_the_adactic_application() {
		System.out.println("Anand");
	}

	@Then("user logout thr current scenerio")
	public void user_logout_thr_current_scenerio() {
		System.out.println("Vinoth");
	}

	@After
	public void scenarioss(Scenario Scene) {
		Status status = Scene.getStatus();
		String scenarioname = Scene.getName();
		System.out.print(scenarioname + "  " + status);

	}
}
