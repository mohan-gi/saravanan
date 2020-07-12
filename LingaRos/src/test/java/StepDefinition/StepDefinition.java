package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class StepDefinition extends BaseClass {
	
	public static WebDriver driver;
	
	@Given("^user navigates to the application$")
	public void user_navigates_to_the_application() throws Throwable {
		BaseClass.browserLaunch("chrome");
		BaseClass.geturl("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement signup=driver.findElement(By.xpath("((//button[@class=\"btn btn-linga btn-demo-request\"])[1])"));
		signup.click();
		Thread.sleep(1000);
		driver.close();
		
		throw new PendingException();
	}

	@Given("^user enter the valid usernames$")
	public void user_enter_the_valid_usernames() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^user enter the valid passwords$")
	public void user_enter_the_valid_passwords() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^user click the signin buttons$")
	public void user_click_the_signin_buttons() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
