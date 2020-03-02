package com.Adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class BaseClass1 {
	public static WebDriver driver;

	public static WebDriver getDriver(String BrowserName) {
		try {
			if (BrowserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (BrowserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			}

			else {
				System.out.println("browser name is invalid");
			}
		} catch (Exception e) {
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void currenturl() {
		driver.getCurrentUrl();
	}

	public static void scrollup(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void scrolldown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void quit() {
		driver.quit();
	}

	public static void actions(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.contextClick(Element).build().perform();
	}

	public static void drogDrop(WebElement source, WebElement target) {
		try {
			Actions ad = new Actions(driver);
			ad.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void robotclass() throws Throwable {
		try {
			Robot rc = new Robot();
			rc.keyPress(KeyEvent.VK_DOWN);
			rc.keyPress(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		driver.close();
	}

	private static void screenshot(String pathname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File(pathname);
		FileUtils.copyFile(source, desti);

	}

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	private static void navigateBack(String url) {
		driver.navigate().back();
	}

	private static void refresh() {
		driver.navigate().refresh();

	}

	private static void clear(WebElement element) {
		element.clear();
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void sendKeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	public static void simpleAlert() {
		driver.switchTo().alert().accept();

	}

	public static void confirmAlert(String ok, String cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}

		else if (cancel.equalsIgnoreCase("cancel")) {

			driver.switchTo().alert().dismiss();

		}

	}

	public static void promptAlert(String ok, String cancel, String key) {
		if (ok.equalsIgnoreCase("ok")) {
			try {
				driver.switchTo().alert().sendKeys(key);
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (cancel.equalsIgnoreCase("cancel")) {
			try {
				driver.switchTo().alert().sendKeys(key);
				driver.switchTo().alert().dismiss();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("invalid key");

		}
	}

	public static void implicitWait(int sec) {
		try {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dropDown(WebElement element, String option, String value) {
		Select ss = new Select(element);
		try {
			if (option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				ss.selectByIndex(parseInt);
			} else if (option.equalsIgnoreCase("byvalue")) {
				ss.selectByValue(value);

			} else if (option.equalsIgnoreCase("byVisibleText")) {
				ss.selectByVisibleText(value);

			} else {
				System.out.println("invalid selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
