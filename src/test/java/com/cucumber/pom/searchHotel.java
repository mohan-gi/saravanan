package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.baseclass;

public class searchHotel extends baseclass {

	@FindBy(id = "location")
	private WebElement selectThelocation;

	@FindBy(id = "hotels")
	private WebElement selectTheHotels;

	@FindBy(id = "room_type")
	private WebElement selectTheroomType;

	@FindBy(id = "room_nos")
	private WebElement selectTheNumberOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement enterTheCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement enterTheCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement selectTheAdultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement selectThechildPerRoom;

	@FindBy(id = "Submit")
	private WebElement clickOnTheSubmitButton;

	@FindBy(id = "checkin_span")
	private WebElement checkinHotelDate;

	@FindBy(id = "checkout_span")
	private WebElement checkOutHotelDate;

	public WebElement getSelectThelocation() {
		return selectThelocation;
	}

	public WebElement getSelectTheHotels() {
		return selectTheHotels;
	}

	public WebElement getSelectTheroomType() {
		return selectTheroomType;
	}

	public WebElement getSelectTheNumberOfRooms() {
		return selectTheNumberOfRooms;
	}

	public WebElement getEnterTheCheckInDate() {
		return enterTheCheckInDate;
	}

	public WebElement getEnterTheCheckOutDate() {
		return enterTheCheckOutDate;
	}

	public WebElement getSelectTheAdultsPerRoom() {
		return selectTheAdultsPerRoom;
	}

	public WebElement getSelectThechildPerRoom() {
		return selectThechildPerRoom;
	}

	public WebElement getSelectTheSubmitButton() {
		return clickOnTheSubmitButton;
	}

	public WebElement getClickOnTheSubmitButton() {
		return clickOnTheSubmitButton;
	}

	public WebElement getCheckinHotelDate() {
		return checkinHotelDate;
	}

	public WebElement getCheckOutHotelDate() {
		return checkOutHotelDate;
	}

	public searchHotel(WebDriver Idriver) {
		driver = Idriver;
		PageFactory.initElements(driver, this);

	}
}
