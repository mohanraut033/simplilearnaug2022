package org.simplilearn.august2022;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomasi.common.TestUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebGUITests {

	@Test
	public void test1() {

		// test data variables

		String baseUrl = "https://testautomasi.com/";
		String loginUrl = "https://testautomasi.com/profile/";
		String user = "simplilearnaug2022";
		String pass = "simplilearnaug2022";

		// element locators

		// homepage

		By loginMenuElement = By.xpath(
				"//a[contains(text(),'Log In') or contains(text(),'LogIn') or contains(text(),'Login') or contains(text(),'login')]");

		// loginpage

		By usernameElement = By.id("username");
		By passwordElement = By.id("password");

		By loginBtnElement = By.xpath("//button[normalize-space()='Login']");

		// profile page

		String profileXpath = "//strong[normalize-space()='%s']";
		// String profileXpath = "//strong[normalize-space()='"+user+"']";

		By profileNameElement = By.xpath(String.format(profileXpath, user));
		By logoutElement = By.xpath("//a[normalize-space()='Sign out']");

		// script starts here

		// set up chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();

		TestUtils.hardWait(1);

		// open homepage and verify page link

		assertEquals(driver.getCurrentUrl(), baseUrl);

		// open login page and verify page link

		driver.findElement(loginMenuElement).click();
		TestUtils.hardWait(1);

		assertEquals(driver.getCurrentUrl(), loginUrl);

		// enter user credentials and click on login button

		driver.findElement(usernameElement).sendKeys(user);
		driver.findElement(passwordElement).sendKeys(pass);
		driver.findElement(loginBtnElement).click();

		// veirfy username on profile dashboard
		TestUtils.hardWait(1);

		String actualUsername = driver.findElement(profileNameElement).getText();

		assertEquals(user, actualUsername);

		// logiut and veify that user is on homepage again
		driver.findElement(logoutElement).click();
		TestUtils.hardWait(1);

		assertEquals(driver.getCurrentUrl(), baseUrl);

		driver.quit();

	}
}
