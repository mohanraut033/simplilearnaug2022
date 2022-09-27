package com.testautomasi.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomasi.common.Constants;
import com.testautomasi.pages.GlobalPage;
import com.testautomasi.pages.HomePage;
import com.testautomasi.pages.LoginPage;
import com.testautomasi.pages.ProfilePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseWebGUITest {
	protected WebDriver driver = null;
	HomePage homePage;
	LoginPage loginPage;
	ProfilePage profilePage;
	GlobalPage globalPage;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Constants.baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		intilizePageObjects();
	}

	private void intilizePageObjects() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		profilePage = new ProfilePage(driver);
		globalPage = new GlobalPage(driver);

	}

	@After
	public void tearDown() {
		takeScreenshot();
		driver.quit();

	}

	private void takeScreenshot() {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("/home/jmschandangmail/screenshot" + file.getName() + "png");

		try {
			FileUtils.copyFile(file, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
