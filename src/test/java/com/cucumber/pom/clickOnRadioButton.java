package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickOnRadioButton {
	static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement selectRadioButton;

	public WebElement getSelectRadioButton() {
		return selectRadioButton;
	}

	public clickOnRadioButton(WebDriver Idriver) {
		driver = Idriver;
		PageFactory.initElements(driver, this);
	}
}
