package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotel {
	static WebDriver driver;



	@FindBy(xpath = "//input[@type='text' and @id='hotel_name_0']")
	private WebElement checkTheHotelName;

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement checkTheLocation;

	@FindBy(xpath = "(//input[@class='select_text'])[3]")
	private WebElement checkTheroom;

	@FindBy(xpath = "//input[@type='text' and @id='arr_date_0']")
	private WebElement checkTheArrivalDate;

	@FindBy(xpath = "//input[@type='text' and @id='dep_date_0']")
	private WebElement checkTheDepatureDate;

	@FindBy(xpath = "//input[@type='text' and @id='no_days_0']")
	private WebElement CheckTheNumberOfDays;

	@FindBy(xpath = "(//input[@class='select_text'])[7]")
	private WebElement checkTheRoomType;

	@FindBy(xpath = "(//input[@class='select_text'])[8]")
	private WebElement pricePerNight;

	@FindBy(xpath = "(//input[@class='select_text'])[9]")
	private WebElement totalPrice;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement submitTheContinueButton;


	public WebElement getCheckTheHotelName() {
		return checkTheHotelName;
	}

	public WebElement getCheckTheLocation() {
		return checkTheLocation;
	}

	public WebElement getCheckTheroom() {
		return checkTheroom;
	}

	public WebElement getCheckTheArrivalDate() {
		return checkTheArrivalDate;
	}

	public WebElement getCheckTheDepatureDate() {
		return checkTheDepatureDate;
	}

	public WebElement getCheckTheNumberOfDays() {
		return CheckTheNumberOfDays;
	}

	public WebElement getCheckTheRoomType() {
		return checkTheRoomType;
	}

	public WebElement getPricePerNight() {
		return pricePerNight;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getSubmitTheContinueButton() {
		return submitTheContinueButton;
	}

	public selectHotel(WebDriver Idriver) {
		driver = Idriver;
		PageFactory.initElements(driver, this);

	}

}
