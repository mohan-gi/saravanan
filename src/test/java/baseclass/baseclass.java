package baseclass;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass {

	public static WebDriver driver;
	private static WebElement element;

	public static WebDriver getDriver(String browserName) throws Exception {
		try {
			if (browserName == "chrome") {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\HP\\eclipse-workspace\\selenium1\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} else if (browserName == "ie") {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\HP\\eclipse-workspace\\selenium1\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} else {
				System.out.println("please enter the valid Driver Name");
				throw new RuntimeException("please enter the valid browser name");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("please enter the valid Browser name");
		}
		return driver;
	}

	public static WebDriver geturl(String url) {
		driver.get(url);
		return driver;

	}

	public static void clickOnElement(WebElement element) throws Exception {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendKeys(WebElement element, String values) throws Exception {
		try {
			element.sendKeys(values);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void mouseover(WebElement element) throws Exception {
		try {
			waitforvisibilityofElement(element);
			Actions ac = new Actions(driver);
			if (elementIsDisplayed(element) && elementIsEnabled(element)) {
				ac.moveToElement(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void getcurrenturl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println("currenturl is " + currenturl);
	}

	public static void navigatebackward() {
		driver.navigate().back();
	}

	public static void navigateforward() {
		driver.navigate().forward();
	}

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	public static void waitforvisibilityofElement(WebElement element) {
		WebDriverWait wb = new WebDriverWait(driver, 50);
		wb.until(ExpectedConditions.visibilityOf(element));
	}

	public static Boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static void sendTextToApplication(WebElement element, String value) throws Exception {

		try {
			waitforvisibilityofElement(element);
			if (elementIsDisplayed(element) && elementIsEnabled(element)) {
				element.clear();
				element.sendKeys(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static String gettext(WebElement element) throws Exception {
		String text = null;
		try {
			text = element.getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("not getter");
		}
		return text;

	}

	public static String getaAttribute(WebElement element, String value) throws Exception {
		String attribute = null;

		try {
			attribute = element.getAttribute(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		return attribute;
	}

	public static void selectOptionsFromDD(WebElement element, String Options, String value) throws Exception {
		try {
			Select sc = new Select(element);
			if (Options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (Options.equalsIgnoreCase("VisibleText")) {
				sc.selectByVisibleText(value);
			} else if (Options.equalsIgnoreCase("Index")) {
				sc.selectByIndex(Integer.parseInt(value));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("unable to select");
		}

	}

	public static void scrollDown(WebElement element) throws Exception {
		try {

			JavascriptExecutor jc = (JavascriptExecutor) driver;
			jc.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void scrollup(WebElement element) throws Exception {
		try {
			JavascriptExecutor jc = (JavascriptExecutor) driver;
			jc.executeScript("arguments[0].scrollIntoView(true);", element);

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void takeScreenShot(String filename) throws Exception {
		try {
			TakesScreenshot y = (TakesScreenshot) driver;
			File Screenshot = y.getScreenshotAs(OutputType.FILE);
			File saveFile = new File(
					"C:\\Users\\HP\\eclipse-workspace\\cucumberproject\\src\\commons-io-2.6-tests.png");
			FileUtils.copyFile(Screenshot, saveFile);
		} catch (WebDriverException e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void justclick() throws Exception {
		try {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void doubleclick(WebElement element) throws Exception {
		try {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void rightclick(WebElement element) throws Exception {
		try {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void dragAndDrop(WebElement source, WebElement target) throws Exception {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void waitUntilAlertPresent() throws Exception {
		try {
			WebDriverWait w = new WebDriverWait(driver, 30);
			w.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void acceptAlert() throws Exception {
		try {
			Alert a = driver.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void dismissAlert() {
		try {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		driver = getDriver("chrome");
		geturl("https://www.toolsqa.com/automation-practice-table");
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		for (WebElement x : tr) {
			List<WebElement> tdata = x.findElements(By.tagName("td"));
			for (WebElement y : tdata) {
				System.out.println(y.getText());
			}
		}
	}
}
