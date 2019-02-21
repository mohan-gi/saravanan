package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	static WebDriver driver;

	
	@FindBy(id = "username")
	private WebElement enterTheUserName;

	@FindBy(id = "password")
	private WebElement enterThepassWord;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement enterThesubmitButton;

	public WebElement getEnterTheUserName() {
		return enterTheUserName;
	}

	public WebElement getEnterThepassWord() {
		return enterThepassWord;
	}

	public WebElement getEnterThesubmitButton() {
		return enterThesubmitButton;
		}

	public login(WebDriver Idriver) {
		driver = Idriver;
		PageFactory.initElements(driver, this);
	}

}
