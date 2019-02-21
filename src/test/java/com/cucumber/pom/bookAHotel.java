package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookAHotel {
	static WebDriver driver;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement enterTheFirstName;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement enterTheLastName;

	@FindBy(xpath = "//textarea[@class='txtarea']")
	private WebElement enterTheMessage;

	@FindBy(xpath = "(//input[@class='reg_input'])[3]")
	private WebElement enterTheCreditCardNumber;

	@FindBy(xpath = "//select[@class='select_combobox']")
	private WebElement selectThecreditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement selectTheExpireMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement selectTheExpireYear;

	@FindBy(id = "cc_cvv")
	private WebElement enterTheCvvNumber;

	@FindBy(id = "book_now")
	private WebElement clickOnSubmitButton;
	public WebElement getEnterTheFirstName() {
		return enterTheFirstName;
	}

	public WebElement getEnterTheLastName() {
		return enterTheLastName;
	}

	public WebElement getEnterTheMessage() {
		return enterTheMessage;
	}

	public WebElement getEnterTheCreditCardNumber() {
		return enterTheCreditCardNumber;
	}

	public WebElement getSelectThecreditCardType() {
		return selectThecreditCardType;
	}

	public WebElement getSelectTheExpireMonth() {
		return selectTheExpireMonth;
	}

	public WebElement getSelectTheExpireYear() {
		return selectTheExpireYear;
	}

	public WebElement getEnterTheCvvNumber() {
		return enterTheCvvNumber;
	}

	public WebElement getClickOnSubmitButton() {
		return clickOnSubmitButton;
	}
	
	
	public bookAHotel(WebDriver Idriver) {
		driver = Idriver;
		PageFactory.initElements(driver, this);

	}
}
