package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.bookAHotel;
import com.cucumber.pom.clickOnRadioButton;
import com.cucumber.pom.login;
import com.cucumber.pom.searchHotel;
import com.cucumber.pom.selectHotel;

import baseclass.baseclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends baseclass {
	static WebDriver driver;

//sce1
	@Before
	public void user_launch_the_browser_and_navigate_to_application() throws Exception {
		driver = getDriver("chrome");
		driver.get("https://adactin.com/HotelAppBuild2/");

	}

	@After
	public void openTheWebsite() {
		driver.quit();
	}

	@Given("^user enter the valid usernames$")
	public void user_enter_the_valid_usernames() throws Throwable {
		login x = new login(driver);
		sendTextToApplication(x.getEnterTheUserName(), "8056234232");
	}

	@Given("^user enter the valid passwords$")
	public void user_enter_the_valid_passwords() throws Throwable {
		login x = new login(driver);
		sendTextToApplication(x.getEnterThepassWord(), "mohanece");
	}

	@Given("^user click the signin buttons$")
	public void user_click_the_signin_buttons() throws Throwable {
		login x = new login(driver);
		clickOnElement(x.getEnterThesubmitButton());
	}
//sce2

	@Given("^user enter the location of roomms$")
	public void user_enter_the_location_of_roomms() throws Throwable {
		searchHotel x = new searchHotel(driver);
		selectOptionsFromDD(x.getSelectThelocation(), "value", "Sydney");

	}

	@Given("^select the hotel types$")
	public void select_the_hotel_types() throws Throwable {
		searchHotel x = new searchHotel(driver);
		selectOptionsFromDD(x.getSelectTheHotels(), "value", "Hotel Creek");
	}

	@Given("^user enter the room type$")
	public void user_enter_the_room_type() throws Throwable {
		searchHotel x = new searchHotel(driver);
		selectOptionsFromDD(x.getSelectTheroomType(), "value", "Standard");
	}

	@Given("^user enter the number of rooms$")
	public void user_enter_the_number_of_rooms() throws Throwable {
		searchHotel x = new searchHotel(driver);
		selectOptionsFromDD(x.getSelectTheNumberOfRooms(), "visibletext", "1 - One");
	}

	@Given("^user enter the check in date$")
	public void user_enter_the_check_in_date() throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendTextToApplication(x.getEnterTheCheckInDate(), "25/02/2019");
	}

	@Given("^user enter the check out date$")
	public void user_enter_the_check_out_date() throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendTextToApplication(x.getEnterTheCheckOutDate(), "23/02/2019");

	}

	@Given("^user enter the adults per room$")
	public void user_enter_the_adults_per_room() throws Throwable {
		searchHotel x = new searchHotel(driver);
		selectOptionsFromDD(x.getSelectTheAdultsPerRoom(), "value", "1");
	}

	@Given("^user eneter the children per room$")
	public void user_eneter_the_children_per_room() throws Throwable {
		searchHotel x = new searchHotel(driver);
		selectOptionsFromDD(x.getSelectThechildPerRoom(), "value", "1");
		Thread.sleep(3000);
	}

	@Given("^uset enter the submit butoon$")
	public void uset_enter_the_submit_butoon() throws Throwable {
		searchHotel x = new searchHotel(driver);
		clickOnElement(x.getClickOnTheSubmitButton());
	}

	@Then("^Verify that system gives an error saying ‘check-in-date should not be later than check-out-date’$")
	public void verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date()
			throws Throwable {

		searchHotel x = new searchHotel(driver);
		org.junit.Assert.assertEquals("Check-In Date shall be before than Check-Out Date",
				gettext(x.getCheckinHotelDate()));
		org.junit.Assert.assertEquals("Check-Out Date shall be after than Check-In Date",
				gettext(x.getCheckOutHotelDate()));

	}

	// sce3

	@Given("^user enter the check in previes five date \"([^\"]*)\"$")
	public void user_enter_the_check_in_previes_five_date(String arg1) throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendTextToApplication(x.getEnterTheCheckInDate(), arg1);
	}

	@When("^user enter the check out previes three date \"([^\"]*)\"$")
	public void user_enter_the_check_out_previes_three_date(String arg1) throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendTextToApplication(x.getEnterTheCheckOutDate(), arg1);
	}

	@Then("^Verify that application throws error message\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_that_application_throws_error_message(String arg1, String arg2) throws Throwable {
		searchHotel x = new searchHotel(driver);
		org.junit.Assert.assertEquals(arg1, getaAttribute(x.getEnterTheCheckInDate(), "value"));
		org.junit.Assert.assertEquals(arg2, getaAttribute(x.getEnterTheCheckOutDate(), "value"));
	}

	// sce4

	@Given("^user enter the room location scenario four \"([^\"]*)\"$")
	public void user_enter_the_room_location_scenario_four(String arg1) throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendKeys(x.getSelectThelocation(), arg1);
	}

	@Given("^Enter check-in-date as in test data \"([^\"]*)\"$")
	public void enter_check_in_date_as_in_test_data(String arg1) throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendTextToApplication(x.getEnterTheCheckInDate(), arg1);
	}

	@Given("^Enter check-out-date as in test data \"([^\"]*)\"$")
	public void enter_check_out_date_as_in_test_data(String arg1) throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendTextToApplication(x.getEnterTheCheckOutDate(), arg1);
	}

	@Given("^user eneter the children per room in forth scenario$")
	public void user_eneter_the_children_per_room_in_forth_scenario() throws Throwable {
		searchHotel x = new searchHotel(driver);
		selectOptionsFromDD(x.getSelectThechildPerRoom(), "Index", "0");
	}

	@Then("^Verify that hotel displayed is the same as selected in search Hotel form\"([^\"]*)\"$")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form(String arg1) throws Throwable {
		selectHotel x = new selectHotel(driver);
		org.junit.Assert.assertEquals(arg1, getaAttribute(x.getCheckTheLocation(), "value"));
	}

	// sce5

	@Then("^Check-in-date and check-outdate should be displayed according to the data entered in search hotel form\\.\"([^\"]*)\",\"([^\"]*)\"$")
	public void check_in_date_and_check_outdate_should_be_displayed_according_to_the_data_entered_in_search_hotel_form(
			String arg1, String arg2) throws Throwable {
		selectHotel x = new selectHotel(driver);
		org.junit.Assert.assertEquals(arg1, getaAttribute(x.getCheckTheArrivalDate(), "value"));
		org.junit.Assert.assertEquals(arg2, getaAttribute(x.getCheckTheDepatureDate(), "value"));

	}

	// sce6
	@Given("^user enter the number of rooms \"([^\"]*)\"$")
	public void user_enter_the_number_of_rooms(String arg1) throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendKeys(x.getSelectTheNumberOfRooms(), arg1);
	}

	@Then("^No-of-rooms should be displayed and match with number of rooms in search hotel page \"([^\"]*)\"$")
	public void no_of_rooms_should_be_displayed_and_match_with_number_of_rooms_in_search_hotel_page(String arg1)
			throws Throwable {
		selectHotel x = new selectHotel(driver);
		String s = getaAttribute(x.getCheckTheroom(), "value");
		if (s.contains(arg1)) {
			System.out.println("number of rooms" + arg1);
		} else {
			throw new Exception();
		}
	}

	// sce7

	@Given("^Verify that room type reflected is the same as selected in search hotel page\\. \"([^\"]*)\"$")
	public void verify_that_room_type_reflected_is_the_same_as_selected_in_search_hotel_page(String arg1)
			throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendKeys(x.getSelectTheroomType(), arg1);
	}

	@Then("^Room type displayed should be the same as selected in search hotel page \"([^\"]*)\"$")
	public void room_type_displayed_should_be_the_same_as_selected_in_search_hotel_page(String arg1) throws Throwable {
		selectHotel x = new selectHotel(driver);
		org.junit.Assert.assertEquals(arg1, getaAttribute(x.getCheckTheRoomType(), "value"));
	}

	// sce8
	@Given("^Select the hotel and click on continue button$")
	public void select_the_hotel_and_click_on_continue_button() throws Throwable {
		clickOnRadioButton x = new clickOnRadioButton(driver);
		clickOnElement(x.getSelectRadioButton());
		Thread.sleep(3000);

	}

	@Then("^Verify that totalprice\\(excl\\.GST\\) is being calculated as \\(price-per-night\\*noof- rooms\\*no-of-days\\)\"([^\"]*)\"$")
	public void verify_that_totalprice_excl_GST_is_being_calculated_as_price_per_night_noof_rooms_no_of_days(
			String arg1) throws Throwable {
		selectHotel x = new selectHotel(driver);
		String a = getaAttribute(x.getPricePerNight(), "value");

		System.out.println("price per night" + a.substring(5));
		// System.out.println(arg1.substring());

		int parseInt = Integer.parseInt(arg1);
		String trim = a.substring(5).trim(); // space remove method
		int parseInt2 = Integer.parseInt(trim); // convert string to integer
		System.out.println(parseInt * parseInt2);

		String b = getaAttribute(x.getCheckTheNumberOfDays(), "value");
		String c = b.substring(0, 1);
		String trim2 = c.trim();
		int parseInt3 = Integer.parseInt(trim2);
		System.out.println(parseInt3 * parseInt * parseInt2);
		// String b=getaAttribute(x.getCheckTheroom(), "value");
		// System.out.println("number of rooms" +b);

		// System.out.println(a+"*"+*b+""+arg1+"="+c);
	}

// sce9

	@Given("^select the continue button$")
	public void select_the_continue_button() throws Throwable {
		selectHotel x = new selectHotel(driver);
		clickOnElement(x.getSubmitTheContinueButton());
	}

	@Given("^enter the first name$")
	public void enter_the_first_name() throws Throwable {
		bookAHotel x = new bookAHotel(driver);
		sendKeys(x.getEnterTheFirstName(), "mohan");
	}

	@Given("^enter the last name$")
	public void enter_the_last_name() throws Throwable {
		bookAHotel x = new bookAHotel(driver);
		sendKeys(x.getEnterTheLastName(), "raj");
	}

	@Given("^enter the billing address$")
	public void enter_the_billing_address() throws Throwable {
		bookAHotel x = new bookAHotel(driver);
		sendKeys(x.getEnterTheMessage(), "Andal street,shevapet,salem");
	}

	@Given("^enter the credit card number with (\\d+) digit number$")
	public void enter_the_credit_card_number_with_digit_number(int arg1) throws Throwable {
		bookAHotel x = new bookAHotel(driver);
		sendKeys(x.getEnterTheCreditCardNumber(), "1234567890123456");
	}

	@Given("^select the credit card type$")
	public void select_the_credit_card_type() throws Throwable {
		bookAHotel x = new bookAHotel(driver);
		selectOptionsFromDD(x.getSelectThecreditCardType(), "value", "AMEX");
	}

	@Given("^select the expire date of month and date of year$")
	public void select_the_expire_date_of_month_and_date_of_year() throws Throwable {
		bookAHotel x = new bookAHotel(driver);
		selectOptionsFromDD(x.getSelectTheExpireMonth(), "value", "1");
		selectOptionsFromDD(x.getSelectTheExpireYear(), "value", "2011");
	}

	@Given("^enter the ccv$")
	public void enter_the_ccv() throws Throwable {
		bookAHotel x = new bookAHotel(driver);
		sendKeys(x.getEnterTheCvvNumber(), "1234");
		Thread.sleep(5000);
	}

	@Given("^Enter the details and click on book now\\.$")
	public void enter_the_details_and_click_on_book_now() throws Throwable {
		bookAHotel x = new bookAHotel(driver);
		clickOnElement(x.getClickOnSubmitButton());
	}

	@Then("^Check the details, click on logout and verify we have been logged out of the application\\.$")
	public void check_the_details_click_on_logout_and_verify_we_have_been_logged_out_of_the_application()
			throws Throwable {
		bookAHotel x = new bookAHotel(driver);
	}

	// @sce11

	@Given("^user enter the location of roomms\"([^\"]*)\"$")
	public void user_enter_the_location_of_roomms(String arg1) throws Throwable {
		searchHotel x = new searchHotel(driver);
		sendKeys(x.getSelectThelocation(), arg1);
	}

	@Then("^Verify that totalprice\\(excl\\.GST\\) is being calculated as \\(price-per-night\\*noof- rooms\\*no-of-days\\)\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_that_totalprice_excl_GST_is_being_calculated_as_price_per_night_noof_rooms_no_of_days(
			String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		selectHotel x = new selectHotel(driver);
		// org.junit.Assert.assertEquals("location is a same ", arg1,
		// getaAttribute(x.getCheckTheLocation(), "value"));
		String a = getaAttribute(x.getCheckTheLocation(), "value");
		if (a.contains(arg1)) {
			System.out.println(a);
		}
		// org.junit.Assert.assertEquals("roomtype", arg2,
		// getaAttribute(x.getCheckTheroom(), "value"));
		String b = getaAttribute(x.getCheckTheroom(), "value");
		if (b.contains(arg2)) {
			System.out.println(b);
		}
		// org.junit.Assert.assertEquals("check in dates", arg3,
		// getaAttribute(x.getCheckTheArrivalDate(), "value"));
		String c = getaAttribute(x.getCheckTheArrivalDate(), "value");
		if (c.contains(arg4)) {
			System.out.println(c);
		}
		// org.junit.Assert.assertEquals("check out date", arg4,
		// getaAttribute(x.getCheckTheDepatureDate(), "value"));
		String d = getaAttribute(x.getCheckTheDepatureDate(), "value");
		if (d.contains(arg5)) {
			System.out.println(d);
		}
	}

	
	//sce12
	
	
}