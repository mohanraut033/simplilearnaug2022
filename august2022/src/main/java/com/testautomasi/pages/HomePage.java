package com.testautomasi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

		PageFactory.initElements(driver, this);

	}

	// page elements
	By loginMenuElement = By.xpath(
			"//a[contains(text(),'Log In') or contains(text(),'LogIn') or contains(text(),'Login') or contains(text(),'login')]");

	public void clickLoginMenu() {

		clickElement(loginMenuElement);

	}
}
