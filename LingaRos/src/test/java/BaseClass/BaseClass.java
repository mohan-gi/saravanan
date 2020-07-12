package BaseClass;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "src\\Driver\\chromedriver.exe");
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "src\\Driver\\IEDriverServer.exe");
			} else if (browserName.equalsIgnoreCase("fire fox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "src\\Driver\\geckodriver.exe");
			} else {
				throw new Exception("Browser name id not valid");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		} catch (Exception e) {
			/*
			 * printStackTrace() helps the programmer to understand where the actual problem
			 * occurred. It helps to trace the exception. it is printStackTrace() method of
			 * Throwable class inherited by every exception class. This method prints the
			 * same message of e object and also the line number where the exception
			 * occurred.
			 */
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void sendkeys(WebElement element, String values) {
		try {
			element.sendKeys(values);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void waitForVisibilityOfElement(WebElement element) {
		WebDriverWait wb = new WebDriverWait(driver, 50);
		wb.until(ExpectedConditions.visibilityOf(element));
	}

	public static boolean elementisdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean elementisEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	public static void navigateToBackward() {
           driver.navigate().back();
	}
	
	public static void navigateToForward() {
           driver.navigate().forward();
	}
	
	public static void navegateToRefresh() {
             driver.navigate().refresh();
	}
}
